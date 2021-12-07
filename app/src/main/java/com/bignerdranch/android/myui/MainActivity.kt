package com.bignerdranch.android.myui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


           }

    fun onClick(view: android.view.View) {

        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

}







