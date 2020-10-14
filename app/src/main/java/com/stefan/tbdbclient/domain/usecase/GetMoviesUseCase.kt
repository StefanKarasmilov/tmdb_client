package com.stefan.tbdbclient.domain.usecase

import com.stefan.tbdbclient.data.models.Movie
import com.stefan.tbdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}