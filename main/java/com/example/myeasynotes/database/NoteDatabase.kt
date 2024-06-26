package com.example.myeasynotes.database

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class NoteDatabase : RoomDatabase() {

    @Database(entities = [Note::class], version = 1, exportSchema = false)
    abstract class NoteDatabase : RoomDatabase() {
        abstract val noteDatabaseDao: NoteDatabaseDao

        companion object {
            @Volatile
            private var INSTANCE: NoteDatabase? = null

            fun getInstance(context: Context): NoteDatabase{
                synchronized(this){
                    var instance = INSTANCE

                    if(instance==null){
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            NoteDatabase::class.java,
                            "my_notes_database"
                        )
                            .fallbackToDestructiveMigration()
                            .build()
                        INSTANCE=instance
                    }
                    return instance
        }
    }
}}

    companion object {
        fun getInstance(application: Application?): Application? {
            TODO("Not yet implemented")

            return application
        }
    }
}