package com.example.myeasynotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myeasynotes.databinding.FragmentNewNoteBinding


class NewNoteFragment : Fragment(){

    lateinit var binding: FragmentNewNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_new_note, container, false)


        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_new_note,container,false)

        return binding.root
    }
}