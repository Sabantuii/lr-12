package com.example.lr_12_jetcom.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes") // Имя таблицы в БД
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) // Первичный ключ, создается автоматически
    val id: Long = 0,
    val title: String,
    val content: String,
    val createdAt: Long = System.currentTimeMillis()
)