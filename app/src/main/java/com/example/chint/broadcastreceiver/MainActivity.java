package com.example.chint.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = new MyBroadCastReceiver();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter i = new IntentFilter();
        i.addAction(Intent.ACTION_BATTERY_LOW);
        i.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        i.addAction("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(b,i);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(b);
    }
}

