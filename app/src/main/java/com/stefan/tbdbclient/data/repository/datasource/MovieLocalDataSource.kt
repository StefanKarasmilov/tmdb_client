package com.stefan.tbdbclient.data.repository.datasource

import com.stefan.tbdbclient.data.models.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>

    suspend fun saveMoviesToDB(movies: List<Movie>)

    suspend fun clearAll()

}