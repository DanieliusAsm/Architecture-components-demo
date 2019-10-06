package io.visiogen.architecturecomponents.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(UserDao::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}