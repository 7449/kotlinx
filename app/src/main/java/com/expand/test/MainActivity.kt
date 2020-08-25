package com.expand.test

import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.kotlin.expand.content.queryDataExpand
import androidx.kotlin.expand.os.getIntOrDefault
import androidx.kotlin.expand.os.getStringOrDefault
import androidx.kotlin.expand.os.isApkDebugAbleExpand
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
            val apkDebugAbleExpand = this.isApkDebugAbleExpand("com.expand.test")
            Log.i("=====", apkDebugAbleExpand.toString())
        }

        val bundle = Bundle()

        bundle.putString("string", "string")
        bundle.putInt("int", 0)

        Log.i("=====", bundle.getStringOrDefault("string") { "null" })
        Log.i("=====", bundle.getIntOrDefault("int") { -1 }.toString())

        TestJava.test(this)
        Log.i("=====", "10398830@sss".checkPwdRegexExpand.toString())
        Log.i("=====", "---sjnsdkfhsdflsdjfopfnof".encodeMD5Expand())
        Log.i("=====", "123456".toIntExpand(0).toString())
        Log.i("=====", "ssss123456".toIntExpand(0).toString())
        Log.i("=====", "22222".toIntOrDefault { 0 }.toString())
        Log.i("=====", TextUtils.isEmpty(contentResolver.queryDataExpand(Uri.EMPTY)).toString())
    }
}
