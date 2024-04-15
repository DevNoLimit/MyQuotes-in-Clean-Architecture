package com.devnolimit.myquotes.presentation.screens.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devnolimit.myquotes.domain.models.AllQuotesDC

@Composable
fun QuoteItem(
    quoteDC: AllQuotesDC.QuoteDC,
    color: Color = Color.White,
    textColor: Color = Color.Black,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = quoteDC.quote ?: "",
                modifier = Modifier.fillMaxWidth(),
                color = textColor,
                textAlign = TextAlign.Justify,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = quoteDC.author ?: "",
                modifier = Modifier.fillMaxWidth(),
                color = textColor,
                textAlign = TextAlign.End,
                fontSize = 12.sp,
                fontWeight = FontWeight.W300
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuoteItemPreview(){
    QuoteItem(quoteDC = AllQuotesDC.QuoteDC())
}

@Preview(showBackground = true)
@Composable
private fun RandomQuoteItemPreview(){
    QuoteItem(
        quoteDC = AllQuotesDC.QuoteDC(),
        color = Color.Red,
        textColor = Color.White
    )
}