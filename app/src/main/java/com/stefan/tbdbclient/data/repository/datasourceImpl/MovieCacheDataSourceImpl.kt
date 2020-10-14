package com.stefan.tbdbclient.data.repository.datasourceImpl

import com.stefan.tbdbclient.data.models.Movie
import com.stefan.tbdbclient.data.repository.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }

}