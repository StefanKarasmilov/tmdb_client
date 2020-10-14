package com.stefan.tbdbclient.presentation.di.core

import com.stefan.tbdbclient.data.api.TMDBService
import com.stefan.tbdbclient.data.repository.datasource.MovieRemoteDataSource
import com.stefan.tbdbclient.data.repository.datasourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

}