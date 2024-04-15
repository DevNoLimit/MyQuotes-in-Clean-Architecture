package com.devnolimit.myquotes.di

import com.devnolimit.myquotes.data.remote.ApiInterface
import com.devnolimit.myquotes.data.repositoryImpl.QuoteRepositoryImpl
import com.devnolimit.myquotes.domain.repository.QuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun getQuotesRepository(
        apiInterface: ApiInterface
    ): QuoteRepository = QuoteRepositoryImpl(apiInterface = apiInterface)

}