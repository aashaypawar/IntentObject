package com.aashay.intentobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myIntent = intent
        val derivedObject = myIntent.getSerializableExtra("object") as MyCustomObject

        val myTextView = findViewById<TextView>(R.id.tv1)
        myTextView.append(derivedObject.name + "\n")
        myTextView.append(derivedObject.id.toString() + "\n")
        myTextView.append(derivedObject.place + "\n")
    }
}