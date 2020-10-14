package com.stefan.tbdbclient.presentation.di

import com.stefan.tbdbclient.presentation.di.movie.MovieSubComponent

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent

}