package edu.uw.alihaugh.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("testing", "onCreate event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("testnig", "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("testing", "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("testing", "onPause event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("testing", "onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("testing", "We're going down Captain!");
    }

}
