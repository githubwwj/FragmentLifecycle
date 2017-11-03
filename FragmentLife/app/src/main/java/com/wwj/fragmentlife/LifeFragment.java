package com.wwj.fragmentlife;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class LifeFragment extends Fragment {

    private View mView;
    private TextView tvFragment;
    private String mWhichFragment;
    private String TAG=getClass().getSimpleName();

    /**
     * 和Activity 建立关联
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "==========LifeFragment========onAttach==============");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "==========LifeFragment========onCreate==============");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "==========LifeFragment========onCreateView==============");
        return mView=inflater.inflate(R.layout.fragment_life,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "==========LifeFragment========onViewCreated==============");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(null!=getArguments()){
            mWhichFragment=getArguments().getString("extra_test");
        }
        initView();
        initData();
        Log.e(TAG, "==========LifeFragment========onActivityCreated==============" + mWhichFragment);
    }

    private void initData() {
        if(null!=mWhichFragment){
            tvFragment.setText(mWhichFragment+"");
        }else{
            tvFragment.setText("没有收到数据");
        }

    }

    private void initView() {
        tvFragment=(TextView)mView.findViewById(R.id.tvFragment);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(TAG, "=========LifeFragment=========onViewStateRestored==============");
    }

    @Override
       public void onStart() {
        super.onStart();
        Log.e(TAG, "=========LifeFragment=========onStart==============");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "==========LifeFragment========onResume==============");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "==========LifeFragment========onPause==============");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "===========LifeFragment=======onStop==============");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "===========LifeFragment=======onDestroyView==============");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "=========LifeFragment=========onDestroy==============");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "==========LifeFragment========onDetach==============");
    }


}
