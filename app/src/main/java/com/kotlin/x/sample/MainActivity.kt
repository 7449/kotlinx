package com.kotlin.x.sample

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kotlin.x.LogE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testFragment = TestFragment()
        supportFragmentManager.beginTransaction().add(android.R.id.content, testFragment).commit()
    }

    class TestFragment : Fragment() {
        override fun onAttach(context: Context) {
            super.onAttach(context)
            LogE()
        }
    }
}
