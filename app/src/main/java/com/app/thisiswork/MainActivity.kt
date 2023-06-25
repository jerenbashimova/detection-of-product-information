package com.app.thisiswork

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnFruit: Button
    lateinit var btnQR: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun toQr(view: View){
        startActivity(Intent(this,QRActivity::class.java))
    }

    fun toFruit(view: View){
        startActivity(Intent(this,FruitActivity::class.java))
    }

}