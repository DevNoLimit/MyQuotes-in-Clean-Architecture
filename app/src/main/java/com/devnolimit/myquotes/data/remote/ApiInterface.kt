package com.devnolimit.myquotes.data.remote

import com.devnolimit.myquotes.domain.models.AllQuotesDC
import com.devnolimit.myquotes.network.ALL_QUOTES
import com.devnolimit.myquotes.network.GET_SINGLE_QUOTE
import com.devnolimit.myquotes.network.RANDOM_QUOTE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDC>


    @GET(RANDOM_QUOTE)
    suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC>

    @GET(GET_SINGLE_QUOTE)
    suspend fun getSingleQuotes(
        @Path("id") id: String
    ): Response<AllQuotesDC.QuoteDC>

}