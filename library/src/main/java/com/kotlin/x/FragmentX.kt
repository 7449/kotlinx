package com.kotlin.x

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Fragment.startActivity(clz: Class<*>, code: Int, bundle: Bundle) {
    startActivityForResult(Intent(requireActivity(), clz).putExtras(bundle), code)
}

fun Fragment.openCamera(fileUri: Uri, video: Boolean) =
    if (!permissionCamera() || !permissionStorage()) CameraStatus.PERMISSION else openCamera(
        this,
        fileUri,
        video
    )

fun Fragment.runOnUiThread(action: () -> Unit) = requireActivity().runOnUiThread { action.invoke() }

fun Fragment.toast(any: Any) =
    activity?.let { Toast.makeText(it, any.toString(), Toast.LENGTH_SHORT).show() }

fun Fragment.color(@ColorRes id: Int) = ContextCompat.getColor(requireActivity(), id)

fun Fragment.drawable(@DrawableRes id: Int) = ContextCompat.getDrawable(requireActivity(), id)