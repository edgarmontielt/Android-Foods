package com.ap.andoridfoods

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.PackageManagerCompat.LOG_TAG
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.appbar.MaterialToolbar

class FoodsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_foods, container, false)

       // val foodItem =

        // val butt = foodItem.


        val food1 =  Food("Pasta", 2, "https://www.todoparaellas.com/u/fotografias/m/2021/1/13/f608x342-14127_43850_0.jpg")
        val food2 =  Food("Hamburguesa", 5, "https://cocinamia.com.mx/wp-content/uploads/2018/12/HAMBURGUESA-1100x500.png")
        val food3 = Food("Tacos", 10, "https://www.gdlgo.com/wp-content/uploads/2021/07/Los-Mejores-Tacos-de-Guadalajara-.jpg")
        val food4 = Food("Pizza", 7, "https://cdn.colombia.com/gastronomia/2011/08/25/pizza-margarita-3684.webp")

        val foodsLikes = arrayListOf<Food>(food1, food2, food3, food4)
        
        // BubleSort implementation
        bubbleSort(foodsLikes)

        val thisActivity =  activity as AppCompatActivity
        val listView = view.findViewById<ListView>(R.id.listView)
        val adapter = MyAdapter(thisActivity, foodsLikes)
        listView.adapter = adapter

        val refresh = view.findViewById<SwipeRefreshLayout>(R.id.refresh)

        refresh.setOnRefreshListener {
            val thisActivity =  activity as AppCompatActivity
            val listView = view.findViewById<ListView>(R.id.listView)
            val adapter = MyAdapter(thisActivity, foodsLikes)
            bubbleSort(foodsLikes)
            listView.adapter = adapter
            refresh.isRefreshing = false
        }

        return view
    }
}