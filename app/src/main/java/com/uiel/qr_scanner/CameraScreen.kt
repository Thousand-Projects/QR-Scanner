package com.uiel.qr_scanner

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner

@Composable
fun CameraScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val lifecycleOwner = LocalContext.current as LifecycleOwner

    Box {
        AndroidView(
            factory = { ctx ->
                
            },
            update = {

            }
        )
    }
}

private fun setupCamera(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    onQRCodeScanned: (String) -> Unit
) {
    val cameraProviderFuture = ProcessCa.getInstance
}
