package com.stefan.tbdbclient.data.repository.datasource

import com.stefan.tbdbclient.data.models.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movies: List<Movie>)

}