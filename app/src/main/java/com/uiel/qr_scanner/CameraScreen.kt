package com.uiel.qr_scanner

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.LifecycleOwner

@Composable
fun CameraScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val lifecycleOwner = LocalContext.current as LifecycleOwner

    Box {

    }
}

private fun setupCamera(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    onQRCodeScanned: (String) -> Unit
) {
}
