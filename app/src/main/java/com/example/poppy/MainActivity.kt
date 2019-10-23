package com.example.poppy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        Button.setOnClickListener {  }
        if (EditEmail.text.isNotEmpty() && EditPassword.text.isNotEmpty()){
            Toast.makeText(this,"Log In Success", Toast.LENGTH_SHORT).show()}
        else {
            Toast.makeText(this,"Log In Failed", Toast.LENGTH_SHORT).show()
        }
    }
}