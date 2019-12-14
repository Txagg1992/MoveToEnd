package com.curiousca.movetoend

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var enteredText = entered_text.text

        button1.setOnClickListener {
            text_view1.text = enteredText
            entered_text.setSelection(entered_text.text.length)

            Toast.makeText(this, "Button Pressed", Toast.LENGTH_LONG).show()
        }
    }
}
