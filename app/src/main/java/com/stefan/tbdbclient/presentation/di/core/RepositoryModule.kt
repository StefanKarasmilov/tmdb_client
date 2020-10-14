package com.stefan.tbdbclient.presentation.di.core

import com.stefan.tbdbclient.data.repository.MovieRepositoryImpl
import com.stefan.tbdbclient.data.repository.datasource.MovieCacheDataSource
import com.stefan.tbdbclient.data.repository.datasource.MovieLocalDataSource
import com.stefan.tbdbclient.data.repository.datasource.MovieRemoteDataSource
import com.stefan.tbdbclient.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

}