package com.expand.test

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.kotlin.expand.os.drawableIdExpand
import androidx.kotlin.expand.os.layoutIdExpand
import androidx.kotlin.expand.text.checkPwdRegexExpand
import androidx.kotlin.expand.util.encodeMD5Expand
import androidx.kotlin.expand.util.toIntExpand
import androidx.kotlin.expand.util.toIntOrDefault
import androidx.kotlin.expand.view.postDelayedExpand

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<ImageView>(R.id.imageView)
        view.postDelayedExpand(3000) {
        }

        TestJava.test(this)
        TestApp.testCursor(this)
        Log.i("=====", "10398830@sss".checkPwdRegexExpand.toString())
        Log.i("=====", "---sjnsdkfhsdflsdjfopfnof".encodeMD5Expand())
        Log.i("=====", layoutIdExpand("activity_main", -1).toString())
        Log.i("=====", drawableIdExpand("ic_launcher_background", -1).toString())
        Log.i("=====", "123456".toIntExpand().toString())
        Log.i("=====", "ssss123456".toIntExpand().toString())
        Log.i("=====", "22222".toIntOrDefault { 0 }.toString())
    }
}
