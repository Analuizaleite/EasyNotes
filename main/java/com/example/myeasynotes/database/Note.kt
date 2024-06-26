package com.example.myeasynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_notes_database")
data class Note (

    @PrimaryKey(autoGenerate = true)
    var noteId: Long = 0L,

    @ColumnInfo(name = "noteTitle")
    val noteTitle: String = "",

    @ColumnInfo(name = "noteDescription")
    val noteDescription: String = ""
)