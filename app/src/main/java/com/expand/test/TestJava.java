package com.expand.test;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;

import androidx.kotlin.expand.widget.TextViewUtils;
import androidx.kotlin.expand.widget.ViewPagerUtils;
import androidx.viewpager.widget.ViewPager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

public class TestJava {

    public static void test(Context context) {
        ViewPager viewPager = new ViewPager(context);
        ViewPagerUtils.addOnPageScrolled(viewPager, new Function3<Integer, Float, Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer, Float aFloat, Integer integer2) {
                return null;
            }
        });
        ViewPagerUtils.addOnPageScrollStateChanged(viewPager, new Function1<Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer) {
                return null;
            }
        });
        ViewPagerUtils.addOnPageSelected(viewPager, new Function1<Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer) {
                return null;
            }
        });
        EditText editText = new EditText(context);
        TextViewUtils.addOnAfterTextChanged(editText, new Function1<Editable, Unit>() {
            @Override
            public Unit invoke(Editable editable) {
                return null;
            }
        });
        TextViewUtils.addOnBeforeTextChanged(editText, new Function4<CharSequence, Integer, Integer, Integer, Unit>() {
            @Override
            public Unit invoke(CharSequence charSequence, Integer integer, Integer integer2, Integer integer3) {
                return null;
            }
        });
        TextViewUtils.addOnTextChanged(editText, new Function4<CharSequence, Integer, Integer, Integer, Unit>() {
            @Override
            public Unit invoke(CharSequence charSequence, Integer integer, Integer integer2, Integer integer3) {
                return null;
            }
        });
    }

}
