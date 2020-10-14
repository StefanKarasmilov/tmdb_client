package com.stefan.tbdbclient.presentation

import android.app.Application
import com.stefan.tbdbclient.BuildConfig
import com.stefan.tbdbclient.presentation.di.Injector
import com.stefan.tbdbclient.presentation.di.core.*
import com.stefan.tbdbclient.presentation.di.movie.MovieSubComponent

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

}