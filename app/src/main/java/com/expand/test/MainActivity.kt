package com.expand.test

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testFragment = TestFragment()

        supportFragmentManager.beginTransaction().add(android.R.id.content, testFragment).commit()
        TestJava.test(this)
        Log.i(
            "BundleExtras",
            bundleOrEmptyExpand().toString() + "\n" +
                    bundleStringOrDefault("") {
                        "bundle value == null or return defaultValue"
                    } + "\n" +
                    bundleBooleanExpand("").toString() + "\n" +
                    bundleByteExpand("").toString() + "\n" +
                    bundleCharExpand("").toString() + "\n" +
                    bundleShortExpand("").toString() + "\n" +
                    bundleIntExpand("").toString() + "\n" +
                    bundleLongExpand("").toString() + "\n" +
                    bundleFloatExpand("").toString() + "\n" +
                    bundleDoubleExpand("").toString() + "\n" +
                    bundleStringExpand("") + "\n" +
                    bundleCharSequenceExpand("").toString() + "\n" +
                    bundleIntArrayListExpand("").toString() + "\n" +
                    bundleStringArrayListExpand("").toString() + "\n" +
                    bundleCharSequenceArrayListExpand("").toString() + "\n" +
                    bundleBooleanArrayExpand("").toString() + "\n" +
                    bundleByteArrayExpand("").toString() + "\n" +
                    bundleShortArrayExpand("").toString() + "\n" +
                    bundleCharArrayExpand("").toString() + "\n" +
                    bundleIntArrayExpand("").toString() + "\n" +
                    bundleLongArrayExpand("").toString() + "\n" +
                    bundleFloatArrayExpand("").toString() + "\n" +
                    bundleDoubleArrayExpand("").toString() + "\n" +
                    bundleStringArrayExpand("").toString() + "\n" +
                    bundleCharSequenceArrayExpand("").toString() + "\n" +
                    bundleParcelableOrDefault<Intent>("", Intent()).toString() + "\n" +
                    bundleParcelableArrayExpand<Intent>("").toString() + "\n" +
                    bundleParcelableArrayListExpand<Intent>("").toString() + "\n" +
                    bundleSerializableOrDefault("", Test()).toString() + "\n" +
                    bundleBundleExpand("").toString()
        )

        Log.i(
            "IntentExtras",
            intentOrEmptyExpand().toString() + "\n" +
                    intentBooleanExpand("").toString() + "\n" +
                    intentByteExpand("").toString() + "\n" +
                    intentCharExpand("").toString() + "\n" +
                    intentShortExpand("").toString() + "\n" +
                    intentIntExpand("").toString() + "\n" +
                    intentLongExpand("").toString() + "\n" +
                    intentFloatExpand("").toString() + "\n" +
                    intentDoubleExpand("").toString() + "\n" +
                    intentStringExpand("") + "\n" +
                    intentCharSequenceExpand("").toString() + "\n" +
                    intentIntArrayListExpand("").toString() + "\n" +
                    intentStringArrayListExpand("").toString() + "\n" +
                    intentCharSequenceArrayListExpand("").toString() + "\n" +
                    intentBooleanArrayExpand("").toString() + "\n" +
                    intentByteArrayExpand("").toString() + "\n" +
                    intentShortArrayExpand("").toString() + "\n" +
                    intentCharArrayExpand("").toString() + "\n" +
                    intentIntArrayExpand("").toString() + "\n" +
                    intentLongArrayExpand("").toString() + "\n" +
                    intentFloatArrayExpand("").toString() + "\n" +
                    intentDoubleArrayExpand("").toString() + "\n" +
                    intentStringArrayExpand("").toString() + "\n" +
                    intentCharSequenceArrayExpand("").toString() + "\n" +
                    intentParcelableOrDefault<Intent>("", Intent()).toString() + "\n" +
                    intentParcelableArrayExpand<Intent>("").toString() + "\n" +
                    intentParcelableArrayListExpand<Intent>("").toString() + "\n" +
                    intentSerializableOrDefault("", Test()).toString() + "\n" +
                    intentBundleExpand("").toString()
        )

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
