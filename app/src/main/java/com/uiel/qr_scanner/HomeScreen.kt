package com.uiel.qr_scanner

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController,
) {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "사진")
        }
        Button(onClick = { navController.navigate("scan") }) {
            Text(text = "카메라")
        }
    }
}