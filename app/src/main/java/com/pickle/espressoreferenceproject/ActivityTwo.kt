package com.pickle.espressoreferenceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        val wasMessageRecievedTextview = findViewById<TextView>(R.id.activitytwo_wasrecieved_textview)
        val myMessageTextView = findViewById<TextView>(R.id.activitytwo_my_message_textview)
        val extras = getIntent().getExtras()
        if (null != extras) {
            val value = extras.getString("MYMESSAGE")
            if(value != null){
                wasMessageRecievedTextview.text = getResources().getString(R.string.was_message_recieved);

                myMessageTextView.text = value
            }
        }

    }
}
