package com.aashay.intentobject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnSend)

        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val passingObject = MyCustomObject()
            passingObject.name = "Geek"
            passingObject.id = 1
            passingObject.place = "India"
            intent.putExtra("object", passingObject)
            startActivity(intent)
        }
    }
}