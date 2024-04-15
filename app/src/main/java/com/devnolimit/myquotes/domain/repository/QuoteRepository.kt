package com.devnolimit.myquotes.domain.repository

import com.devnolimit.myquotes.domain.models.AllQuotesDC
import retrofit2.Response

interface QuoteRepository {

    suspend fun getAllQuotes(): Response<AllQuotesDC>

    suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC>

    suspend fun getSingleQuote(id: String): Response<AllQuotesDC.QuoteDC>

}