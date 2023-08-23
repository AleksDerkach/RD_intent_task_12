package com.example.task_12_hometask_sendemail

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val etTo = findViewById<EditText>(R.id.et_to)
        val etSubject = findViewById<EditText>(R.id.et_subject)
        val etMessage = findViewById<EditText>(R.id.et_message)
        val btnExpl = findViewById<Button>(R.id.btn_send)

        btnExpl.setOnClickListener() {
            val arrayMail: Array<String> = arrayOf(etTo.text.toString());
            val intent = Intent(Intent.ACTION_VIEW)
            //ACTION_SEND
                intent.type = "*/*"
                intent.data = Uri.parse("mailto:")
                intent.putExtra(Intent.EXTRA_EMAIL, arrayMail)
                intent.putExtra(Intent.EXTRA_SUBJECT, etSubject.text.toString())
                intent.putExtra(Intent.EXTRA_TEXT, etMessage.text.toString())

            //if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            //}
        }
    }
}