package com.pickle.espressoreferenceproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val messageEditText = findViewById<EditText>(R.id.message_edit_text)
        val messageSendButton = findViewById<Button>(R.id.message_send_btn)

        messageSendButton.setOnClickListener({

            if (messageEditText.text.isEmpty()){
                return@setOnClickListener;
            }

            val message = messageEditText.text.toString()

            val intent :Intent = Intent(this,ActivityTwo::class.java)
             intent.putExtra("MYMESSAGE",message)
            startActivity(intent)
        })

    }
}
