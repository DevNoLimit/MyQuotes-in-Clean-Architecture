package com.devnolimit.myquotes.domain.useCases

import com.devnolimit.myquotes.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AllQuotesUseCase @Inject constructor(
    private val quotesRepository: QuoteRepository
){

    operator fun invoke() = flow {
        quotesRepository.getAllQuotes().let {
            if (it.isSuccessful){
                emit(it.body()?.quotes)
            }
        }
    }

}