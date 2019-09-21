package com.kotlin.x

import java.util.*

class HashMapUtils private constructor() {

    companion object {
        val instance by lazy { HashMapUtils() }
    }

    private val hashMap: LinkedHashMap<String, Any> = LinkedHashMap()

    fun put(key: String, value: Any) {
        hashMap[key] = value
    }

    fun <T> get(key: String): T = hashMap[key] as T

    fun containsKey(key: String): Boolean {
        return hashMap.containsKey(key)
    }

    fun remove(key: String) {
        hashMap.remove(key)
    }
}