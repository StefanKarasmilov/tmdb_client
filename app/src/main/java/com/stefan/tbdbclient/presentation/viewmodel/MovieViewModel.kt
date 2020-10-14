package com.stefan.tbdbclient.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.stefan.tbdbclient.domain.usecase.GetMoviesUseCase
import com.stefan.tbdbclient.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovie() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }

}