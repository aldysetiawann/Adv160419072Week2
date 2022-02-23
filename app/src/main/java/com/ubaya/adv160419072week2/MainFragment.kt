package com.ubaya.adv160419072week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonStart.setOnClickListener {
            // Ambil nama pemain
            val playerName = editName.text.toString()
            // Dapatkan action yang akan dijalankan
            val action = MainFragmentDirections.actionGameFragment(playerName)
            // Jalankan action tersebut
            Navigation.findNavController(it).navigate(action)
        }
        // Untuk memunculkan dialog, tidak perlu AllertDialog, cukup panggil action nya saja
        buttonOption.setOnClickListener {
            val action = MainFragmentDirections.actionOptionsFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}