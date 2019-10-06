package io.visiogen.architecturecomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import io.visiogen.architecturecomponents.database.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,AppDatabase::class.java,"database_name").build()
    }
}
