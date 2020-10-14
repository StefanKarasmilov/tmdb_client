package com.stefan.tbdbclient.presentation.di.core

import com.stefan.tbdbclient.data.db.MovieDao
import com.stefan.tbdbclient.data.repository.datasource.MovieLocalDataSource
import com.stefan.tbdbclient.data.repository.datasourceImpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

}