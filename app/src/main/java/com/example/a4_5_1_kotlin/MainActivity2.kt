package com.example.a4_5_1_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initviews()
    }
    fun initviews(){
        var consul=findViewById<TextView>(R.id.tv_login_id)
        var login=intent.getStringExtra("login")

        Log.d(TAG,login.toString())

        consul.setText(login.toString())


    }
}