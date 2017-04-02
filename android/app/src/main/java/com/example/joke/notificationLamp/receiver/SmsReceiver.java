package com.example.joke.notificationLamp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;

import com.example.joke.notificationLamp.utils.LocalNotification;

/**
 * Created by Joke on 2/04/2017.
 */

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            new LocalNotification().send(context, "You received a text message!");
        }
    }
}
