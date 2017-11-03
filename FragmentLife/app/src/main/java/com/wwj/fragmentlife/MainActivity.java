package com.wwj.fragmentlife;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG=getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "==========MainActivity=onCreate==============");

        FragmentManager    fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        LifeFragment lifeFragment=new LifeFragment();
        Bundle bundle=new Bundle();
        bundle.putString("extra_test", "life_fragment");
        lifeFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.fragment_container, lifeFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG, "==========MainActivity=onAttachFragment==============");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(TAG, "==========MainActivity=onContentChanged==============");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "==========MainActivity=onConfigurationChanged=============="+newConfig.orientation);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "==========MainActivity=onRestoreInstanceState==============");
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.e(TAG, "==========MainActivity=onPostCreate==============");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "==========MainActivity=onRestart==============");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "==========MainActivity=onStart==============");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "==========MainActivity=onResume==============");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "==========MainActivity=onPostResume==============");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "==========MainActivity=onAttachedToWindow==============");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "==========MainActivity=onPause==============");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "==========MainActivity=onStop==============");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "==========MainActivity=onDestroy==============");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "==========MainActivity=onNewIntent==============");
    }
}
