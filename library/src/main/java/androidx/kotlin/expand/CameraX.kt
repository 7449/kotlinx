@file:JvmName("CameraUtils")

package androidx.kotlin.expand

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.fragment.app.Fragment

object CameraX {
    /**
     * 拍照的requestCode
     */
    const val CAMERA_REQUEST_CODE = 365
}

enum class CameraStatus {
    PERMISSION,
    SUCCESS,
    ERROR,
}

@JvmName("openCamera")
fun openCameraExpand(root: Any, fileUri: Uri, video: Boolean): CameraStatus {
    val activity = when (root) {
        is Activity -> root
        is Fragment -> root.requireActivity()
        else -> throw KotlinNullPointerException()
    }
    val intent =
        if (video) Intent(MediaStore.ACTION_VIDEO_CAPTURE) else Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    if (intent.resolveActivity(activity.packageManager) == null) {
        return CameraStatus.ERROR
    }
    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri)
    when (root) {
        is Activity -> root.startActivityForResult(
            intent,
            CameraX.CAMERA_REQUEST_CODE
        )
        is Fragment -> root.startActivityForResult(
            intent,
            CameraX.CAMERA_REQUEST_CODE
        )
    }
    return CameraStatus.SUCCESS
}