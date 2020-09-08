package androidx.kotlin.expand.util

import android.app.Activity
import androidx.fragment.app.Fragment

inline fun <reified T> Activity.bundle(key: String, defaultValue: T? = null): Lazy<T?> {
    return lazyValue { intent.extras?.get(key) as T? ?: defaultValue }
}

inline fun <reified T> Activity.bundleNotNull(key: String): Lazy<T> {
    return lazyValue { intent.extras?.get(key) as T }
}

inline fun <reified T> Fragment.bundle(key: String, defaultValue: T? = null): Lazy<T?> {
    return lazyValue { arguments?.get(key) as T? ?: defaultValue }
}

inline fun <reified T> Fragment.bundleNotNull(key: String): Lazy<T> {
    return lazyValue { arguments?.get(key) as T }
}

inline fun <reified T> lazyValue(crossinline action: () -> T): Lazy<T> {
    return object : Lazy<T> {

        private var cached: T? = null

        override val value: T
            get() {
                val values = cached
                return if (values == null) {
                    val invoke = action.invoke()
                    cached = invoke
                    invoke
                } else {
                    values
                }
            }

        override fun isInitialized(): Boolean = cached != null
    }
}