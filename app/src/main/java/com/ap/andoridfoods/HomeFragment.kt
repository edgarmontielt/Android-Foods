package com.ap.andoridfoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val goFood = view.findViewById<Button>(R.id.go_food)
        val goPostres = view.findViewById<Button>(R.id.go_postres)

        goFood.setOnClickListener {
            // Hacer la navegacion
            view.findNavController().navigate(R.id.action_homeFragment_to_foodsFragment)
        }

        goPostres.setOnClickListener {
            // Hacer la navegacion
            view.findNavController().navigate(R.id.action_homeFragment_to_firstFragment)
        }

        return view
    }

}