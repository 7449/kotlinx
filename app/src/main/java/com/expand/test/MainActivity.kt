package com.expand.test

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.kotlin.expand.text.checkPwdRegexExpand
import androidx.kotlin.expand.util.encodeMD5Expand
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
    }
}
