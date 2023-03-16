package com.gaurav.notificationsandchannels

import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyService : FirebaseMessagingService() {



 override fun onNewToken(token: String) {
    Log.d("TAG", "Refreshed token: $token")

    // If you want to send messages to this application instance or
    // manage this apps subscriptions on the server side, send the
    // FCM registration token to your app server.

}
override fun onMessageReceived(remoteMessage: RemoteMessage) {
    // ...

    // TODO(developer): Handle FCM messages here.
    // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
    Log.d("TAG", "From: ${remoteMessage.from}")
    Log.d("TAG", "From${remoteMessage.notification?.body}")
    Log.d("TAG", "From${remoteMessage.notification?.title}")


    // Check if message contains a data payload.
    if (remoteMessage.data.isNotEmpty()) {
        remoteMessage.notification?.let{
            Log.d("TAG", "Message Notification Body: ${it.body}")
        }
      /*  val notificationManager:NotificationManager=getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager*/


        /*if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {

        }*/



    }

    // Check if message contains a notification payload.
    remoteMessage.notification?.let {
        Log.d("TAG", "Message Notification Body: ${it.body}")
    }

    // Also if you intend on generating your own notifications as a result of a received FCM
    // message, here is where that should be initiated. See sendNotification method below.
}


}