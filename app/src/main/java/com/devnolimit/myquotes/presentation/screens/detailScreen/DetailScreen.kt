package com.devnolimit.myquotes.presentation.screens.detailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.devnolimit.myquotes.network.NetworkUIState
import com.devnolimit.myquotes.presentation.components.AppProgressBar
import com.devnolimit.myquotes.presentation.components.ToolBarComponent
import com.devnolimit.myquotes.presentation.screens.detailScreen.components.DetailQuote

@Composable
fun DetailScreen(
    detailVM: DetailVM = hiltViewModel(),
    onBackPress: () -> Unit
) {

    val state = detailVM.singleQuoteData.collectAsStateWithLifecycle().value

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ToolBarComponent(
                showBackButton = true,
                title = "Detail",
                onBackPress = onBackPress
            )
        }
    ) { paddingValue ->
        Box(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            when(state){
                is NetworkUIState.LOADING -> {
                    AppProgressBar()
                }
                is NetworkUIState.SUCCESS -> {
                    DetailQuote(state.data)
                }
                else -> Unit
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DetailScreenPreview(){
    DetailScreen{}
}