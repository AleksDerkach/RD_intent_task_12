package com.example.task_12_hometask_sendemail

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.TextView

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val recipient: TextView = findViewById<TextView>(R.id.et_to_second)
        val subject: TextView = findViewById<TextView>(R.id.et_subject_second)
        val message: TextView = findViewById<TextView>(R.id.et_message_second)

        intent?.let {
            recipient.text = it.getStringArrayExtra(Intent.EXTRA_EMAIL)?.get(0).toString()
            subject.text   = it.getStringExtra(Intent.EXTRA_SUBJECT).toString()
            message.text   = it.getStringExtra(Intent.EXTRA_TEXT).toString()
        }
    }
}