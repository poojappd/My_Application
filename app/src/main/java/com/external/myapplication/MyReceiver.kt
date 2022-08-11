package com.external.myapplication

import android.content.BroadcastReceiver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "External receiver - ${android.os.Process.myUid()}", Toast.LENGTH_SHORT).show()


    }
}