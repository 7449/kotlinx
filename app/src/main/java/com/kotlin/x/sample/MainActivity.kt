package com.kotlin.x.sample

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kotlin.x.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testFragment = TestFragment()
        supportFragmentManager.beginTransaction().add(android.R.id.content, testFragment).commit()

        Log.i(
            "MainActivityIntent",
            intent.orEmptyExpand().toString() + "\n" +
                    intent.getBooleanExpand("").toString() + "\n" +
                    intent.getByteExpand("").toString() + "\n" +
                    intent.getCharExpand("").toString() + "\n" +
                    intent.getShortExpand("").toString() + "\n" +
                    intent.getIntExpand("").toString() + "\n" +
                    intent.getLongExpand("").toString() + "\n" +
                    intent.getFloatExpand("").toString() + "\n" +
                    intent.getDoubleExpand("").toString() + "\n" +
                    intent.getStringExpand("") + "\n" +
                    intent.getCharSequenceExpand("").toString() + "\n" +
                    intent.getIntArrayListExpand("").toString() + "\n" +
                    intent.getStringArrayListExpand("").toString() + "\n" +
                    intent.getCharSequenceArrayListExpand("").toString() + "\n" +
                    intent.getBooleanArrayExpand("").toString() + "\n" +
                    intent.getByteArrayExpand("").toString() + "\n" +
                    intent.getShortArrayExpand("").toString() + "\n" +
                    intent.getCharArrayExpand("").toString() + "\n" +
                    intent.getIntArrayExpand("").toString() + "\n" +
                    intent.getLongArrayExpand("").toString() + "\n" +
                    intent.getFloatArrayExpand("").toString() + "\n" +
                    intent.getDoubleArrayExpand("").toString() + "\n" +
                    intent.getStringArrayExpand("").toString() + "\n" +
                    intent.getCharSequenceArrayExpand("").toString() + "\n" +
                    intent.getParcelableOrDefault<Intent>("", Intent()).toString() + "\n" +
                    intent.getParcelableArrayExpand<Intent>("").toString() + "\n" +
                    intent.getParcelableArrayListExpand<Intent>("").toString() + "\n" +
                    intent.getSerializableOrDefault("", Test()).toString() + "\n" +
                    intent.getBundleExpand("").toString()
        )

    }

    class TestFragment : Fragment() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
            Log.i(
                "MainActivityBundle",
                "\n" +
                        bundleOrEmptyExpand().toString() + "\n" +
                        getExpand("").toString() + "\n" +
                        getBooleanExpand("").toString() + "\n" +
                        getByteExpand("").toString() + "\n" +
                        getCharExpand("").toString() + "\n" +
                        getShortExpand("").toString() + "\n" +
                        getIntExpand("").toString() + "\n" +
                        getLongExpand("").toString() + "\n" +
                        getFloatExpand("").toString() + "\n" +
                        getDoubleExpand("").toString() + "\n" +
                        getStringExpand("").toString() + "\n" +
                        getCharSequenceExpand("").toString() + "\n" +
                        getSizeExpand("").toString() + "\n" +
                        getSizeFExpand("").toString() + "\n" +
                        getIntArrayListExpand("").toString() + "\n" +
                        getStringArrayListExpand("").toString() + "\n" +
                        getCharSequenceArrayListExpand("").toString() + "\n" +
                        getBooleanArrayExpand("").toString() + "\n" +
                        getByteArrayExpand("").toString() + "\n" +
                        getShortArrayExpand("").toString() + "\n" +
                        getCharArrayExpand("").toString() + "\n" +
                        getIntArrayExpand("").toString() + "\n" +
                        getLongArrayExpand("").toString() + "\n" +
                        getFloatArrayExpand("").toString() + "\n" +
                        getDoubleArrayExpand("").toString() + "\n" +
                        getStringArrayExpand("").toString() + "\n" +
                        getCharSequenceArrayExpand("").toString() + "\n" +
                        getParcelableOrDefault<Intent>("", Intent()).toString() + "\n" +
                        getSerializableOrDefault("", Test()).toString() + "\n" +
                        getParcelableArrayExpand<Intent>("").toString() + "\n" +
                        getParcelableArrayListExpand<Intent>("").toString() + "\n" +
                        getSparseParcelableArrayExpand<Intent>("").toString() + "\n" +
                        getBundleExpand("").toString()
            )
        }
    }
}
