package com.stefan.tbdbclient.data.repository.datasourceImpl

import com.stefan.tbdbclient.data.api.TMDBService
import com.stefan.tbdbclient.data.models.MovieList
import com.stefan.tbdbclient.data.repository.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}