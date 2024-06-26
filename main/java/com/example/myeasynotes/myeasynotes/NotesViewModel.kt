package com.example.myeasynotes.myeasynotes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.myeasynotes.database.NoteDatabaseDao

class NotesViewModel (
    val database: NoteDatabaseDao,
    application: Application): AndroidViewModel(application){

    }
