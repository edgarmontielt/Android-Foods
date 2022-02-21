package com.ap.andoridfoods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
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
        val buttLikes = view.findViewById<ImageButton>(R.id.butt_likes)
        val textLikes = view.findViewById<TextView>(R.id.number_likes)

        val food1 =  Food("Pasta", 1)
        val food2 =  Food("Pollo", 30)
        val food3 = Food("Tacos", 2)
        val food4 = Food("Pizza", 23)

        val foodsLikes = arrayListOf<Food>(food1, food2, food3, food4)
        
        // BubleSort implementation
        bubbleSort(foodsLikes)

        val thisActivity =  activity as AppCompatActivity
        val listView = view.findViewById<ListView>(R.id.listView)
        val adapter = MyAdapter(thisActivity, foodsLikes)
        listView.adapter = adapter



        return view
    }
}