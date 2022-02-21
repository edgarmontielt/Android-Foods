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
        val textLikes = view.findViewById<TextView>(R.id.number_likes)

        val food1 =  Food("Pasta", 1, "https://www.todoparaellas.com/u/fotografias/m/2021/1/13/f608x342-14127_43850_0.jpg")
        val food2 =  Food("Hamburguesa", 30, "https://phantom-marca.unidadeditorial.es/9035f7221ff29e7d0742e8267bd3cd2d/resize/1320/f/jpg/assets/multimedia/imagenes/2021/05/28/16222231505841.jpg")
        val food3 = Food("Tacos", 2, "https://www.gdlgo.com/wp-content/uploads/2021/07/Los-Mejores-Tacos-de-Guadalajara-.jpg")
        val food4 = Food("Pizza", 23, "https://thevoxmobile.com/wp-content/uploads/2021/07/Pizza-de-pepperoni.jpg")

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