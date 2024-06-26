package com.example.myeasynotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.myeasynotes.database.NoteDatabase
import com.example.myeasynotes.database.NoteDatabaseDao
import com.example.myeasynotes.databinding.FragmentNotesBinding
import com.example.myeasynotes.myeasynotes.NotesViewModelFactory


class NotesFragment : Fragment() {

    lateinit var binding: FragmentNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_notes,container,false)


        binding.newNoteButton.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(R.id.action_notesFragment3_to_newNoteFragment)
        }

        val application = requireNotNull(this.activity).application

        val dataSource = NoteDatabase.getInstance(application).NoteDatabaseDao

        val viewModelFactory = NotesViewModelFactory(datasource,application)

        val notesViewModel= ViewModelProvider.of(this,viewModelFactory).get(NotesViewModel::class.java)

        binding.notesViewModel=notesViewModel

        binding.lifecycleOwner(this)

        return binding.root
    }
}