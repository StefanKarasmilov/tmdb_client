package com.stefan.tbdbclient.domain.repository

import com.stefan.tbdbclient.data.models.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?

    suspend fun updateMovies(): List<Movie>?

}