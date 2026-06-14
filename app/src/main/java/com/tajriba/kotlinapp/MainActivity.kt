package com.tajriba.kotlinapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "تجربة"
            textSize = 48f
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }

        setContentView(textView)
    }
}
