package com.ap.andoridfoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView( // When android need the Fragment, call to method inflate
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_welcome, container, false) // Accedemos a la vista raiz
        val goFormButton = rootView.findViewById<Button>(R.id.go_form)
        //val navController = rootView.findNavController()

        goFormButton.setOnClickListener {
            // Hacer la navegacion
            rootView.findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        }

        return rootView
    }
}