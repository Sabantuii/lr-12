package com.example.lr_12_jetcom

import android.app.Application
import androidx.room.Room
import com.example.lr_12_jetcom.data.local.AppDatabase


class NotesApp : Application() {
    val database: AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "notes_db"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}