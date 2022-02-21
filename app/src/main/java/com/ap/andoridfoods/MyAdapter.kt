package com.ap.andoridfoods

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MyAdapter (private val context: Context, private val arrayList: ArrayList<Food>): BaseAdapter() {

    private lateinit var name: TextView
    private lateinit var numberLikes: TextView
    private lateinit var imageFood: ImageView

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView

        convertView = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false)

        name = convertView.findViewById(R.id.name)
        numberLikes = convertView.findViewById(R.id.number_likes)
        imageFood = convertView.findViewById(R.id.image_food)

        Glide
            .with(context)
            .load(arrayList[position].imgUrl)
            .into(imageFood)

        name.text = arrayList[position].name
        numberLikes.text = arrayList[position].numberLikes.toString()



        return convertView
    }
}