package com.stefan.tbdbclient.presentation.di.core

import com.stefan.tbdbclient.data.repository.datasource.MovieCacheDataSource
import com.stefan.tbdbclient.data.repository.datasourceImpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

}