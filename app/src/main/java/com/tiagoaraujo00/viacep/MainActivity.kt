package com.tiagoaraujo00.viacep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.tiagoaraujo00.viacep.features.form.screen.FormScreen
import com.tiagoaraujo00.viacep.ui.theme.ViaCEPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViaCEPTheme {
                FormScreen()
            }
        }
    }
}