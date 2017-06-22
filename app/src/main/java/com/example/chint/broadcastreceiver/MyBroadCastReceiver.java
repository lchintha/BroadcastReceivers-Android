package com.example.chint.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by chint on 6/7/2017.
 */

public class MyBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context c, Intent i) {

        if(i.getAction().equals(Intent.ACTION_BATTERY_LOW))
            Toast.makeText(c,"BATTERY_LOW", Toast.LENGTH_LONG).show();
        if(i.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED))
            Toast.makeText(c,"AIRPLANE_MODE_CHANGED", Toast.LENGTH_LONG).show();
        if(i.getAction().equals("android.provider.Telephony.SMS_RECEIVED"))
            Toast.makeText(c, "SMS_RECEIVED", Toast.LENGTH_LONG).show();
    }
}
