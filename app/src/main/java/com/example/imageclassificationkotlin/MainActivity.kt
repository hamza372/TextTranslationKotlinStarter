package com.example.imageclassificationkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var inputEd: EditText? = null
    var resultTv: TextView? = null
    var translateBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputEd = findViewById(R.id.editTextTextPersonName)
        resultTv = findViewById(R.id.textView3)
        translateBtn = findViewById(R.id.button)
        translateBtn?.setOnClickListener(View.OnClickListener {

        })

        // Create an English-urdu translator:
    }


    //TODO perform translation
    fun doTextTranslation(text: String?) {}

    override fun onDestroy() {
        super.onDestroy()
    }
}