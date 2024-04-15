package com.devnolimit.myquotes.domain.models


import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
data class AllQuotesDC(
    @SerializedName("quotes")
    val quotes: List<QuoteDC>? = null
) {
    @Keep
    data class QuoteDC(
        @SerializedName("author")
        val author: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("quote")
        val quote: String? = null
    )
}