package com.devnolimit.myquotes.data.repositoryImpl

import com.devnolimit.myquotes.data.remote.ApiInterface
import com.devnolimit.myquotes.domain.models.AllQuotesDC
import com.devnolimit.myquotes.domain.repository.QuoteRepository
import retrofit2.Response
import javax.inject.Inject

class QuoteRepositoryImpl @Inject constructor(
    private val apiInterface: ApiInterface
): QuoteRepository {

    override suspend fun getAllQuotes(): Response<AllQuotesDC> {
        return apiInterface.getAllQuotes()
    }

    override suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC> {
        return apiInterface.getRandomQuote()
    }

    override suspend fun getSingleQuote(id: String): Response<AllQuotesDC.QuoteDC> {
        return apiInterface.getSingleQuotes(id = id)
    }
}