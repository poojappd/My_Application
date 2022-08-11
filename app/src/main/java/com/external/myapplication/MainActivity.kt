package com.external.myapplication

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonOnclick(view: View){
        Intent().also { intent ->
            intent.action = "com.example.broadcast.MY_NOTIFICATION"
            intent.putExtra("data", "Nothing to see here, move along.")
            Toast.makeText(this, "External app id-${android.os.Process.myUid()}",
            Toast.LENGTH_SHORT).show()
            sendBroadcast(intent)
        }
    }
}