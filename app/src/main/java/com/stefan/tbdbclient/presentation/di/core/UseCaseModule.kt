package com.stefan.tbdbclient.presentation.di.core

import com.stefan.tbdbclient.domain.repository.MovieRepository
import com.stefan.tbdbclient.domain.usecase.GetMoviesUseCase
import com.stefan.tbdbclient.domain.usecase.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }

}