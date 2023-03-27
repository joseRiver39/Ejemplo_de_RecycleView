package com.example.reciclerviewejemplo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.R
import com.example.reciclerviewejemplo.SuperHero

class SuperHeroAdapter(private val superheroList : List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
         val layoutInflater = LayoutInflater.from(parent.context)
          return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }



    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item =superheroList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroList.size

}