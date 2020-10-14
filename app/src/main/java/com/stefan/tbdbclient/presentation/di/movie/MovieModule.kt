package com.stefan.tbdbclient.presentation.di.movie

import com.stefan.tbdbclient.domain.usecase.GetMoviesUseCase
import com.stefan.tbdbclient.domain.usecase.UpdateMoviesUseCase
import com.stefan.tbdbclient.presentation.viewmodel.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }

}