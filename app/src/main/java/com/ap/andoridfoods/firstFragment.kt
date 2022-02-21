package com.ap.andoridfoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class firstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_foods, container, false)


        val food1 =  Food("Pastel de chocolate", 20, "https://cdn.buenavibra.es/wp-content/uploads/2020/01/16191515/Webp.net-resizeimage-68-1170x600.jpg")
        val food2 =  Food("Tarta de manzana", 25, "https://www.splenda.com/wp-content/uploads/2020/08/perfect-homemade-apple-pie-1-1536x768.jpg")
        val food3 = Food("Pay de limón", 22, "https://cocinamia.com.mx/wp-content/uploads/2020/02/a-02-1100x500.png")


        val foodsLikes = arrayListOf<Food>(food1, food2, food3)

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