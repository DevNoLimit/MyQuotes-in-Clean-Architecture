package com.devnolimit.myquotes.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devnolimit.myquotes.presentation.navigation.AppNavController
import com.devnolimit.myquotes.presentation.screens.detailScreen.DetailScreen
import com.devnolimit.myquotes.presentation.screens.homeScreen.HomeScreen
import com.devnolimit.myquotes.presentation.ui.theme.MyQuotesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyQuotesTheme {
                AppNavController()
            }
        }
    }
}
