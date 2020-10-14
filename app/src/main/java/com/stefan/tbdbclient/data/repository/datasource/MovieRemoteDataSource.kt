package com.stefan.tbdbclient.data.repository.datasource

import com.stefan.tbdbclient.data.models.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>

}