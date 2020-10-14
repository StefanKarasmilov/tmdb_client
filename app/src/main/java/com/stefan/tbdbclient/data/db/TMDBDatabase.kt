package com.stefan.tbdbclient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stefan.tbdbclient.data.models.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase(){

    abstract fun movieDao(): MovieDao

}