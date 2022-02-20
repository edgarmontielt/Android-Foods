package com.ap.andoridfoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class FoodsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_foods, container, false)
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)

        val arrayValues = arrayListOf<Food>(Food("Pasta", 2), Food("Pollo", 5))
        val thisActivity =  activity as AppCompatActivity
        val listView = view.findViewById<ListView>(R.id.listView)
        val adapter = MyAdapter(thisActivity, arrayValues)
        listView.adapter = adapter

        return view
    }
}