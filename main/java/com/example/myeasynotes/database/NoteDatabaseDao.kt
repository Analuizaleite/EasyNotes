package com.example.myeasynotes.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDatabaseDao {

    @Insert
    fun insert(note:Note)

    @Update
    fun update(note:Note)

    @Query("SELECT * from my_notes_database where noteId = :key")
    fun get(key:Long): Note

    @Query("SELECT * from my_notes_database order by noteId desc")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("SELECT * from my_notes_database order by noteId desc limit 1")
    fun getLastNote(): Note?

    @Query("DELETE from my_notes_database")
    fun clear()
}