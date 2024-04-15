package com.devnolimit.myquotes.domain.useCases

import com.devnolimit.myquotes.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetSingleQuoteUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository
) {

    operator fun invoke(id: String) = flow {
        quoteRepository.getSingleQuote(id = id).let {
            if (it.isSuccessful){
                emit(it.body())
            }
        }
    }

}