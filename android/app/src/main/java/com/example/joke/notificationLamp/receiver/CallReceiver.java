package com.example.joke.notificationLamp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.joke.notificationLamp.utils.LocalNotification;

/**
 * Created by Joke on 2/04/2017.
 */

public class CallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        new LocalNotification().send(context, "Someone is calling you!");
    }
}
