package com.example.reciclerviewejemplo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewejemplo.R
import com.example.reciclerviewejemplo.SuperHero
/**
 * Autor: fjdlkfjl
 * Clase pra hacer tal cosa
 * Recibe parametros tal y tal**/
class SuperHeroAdapter(private val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>() {

    // Agregar el OnClick
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }


    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroList.size


    class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        val superHero = view.findViewById<TextView>(R.id.tvSuperheroName)
        val realName = view.findViewById<TextView>(R.id.tvRealName)
        val publisher = view.findViewById<TextView>(R.id.tvPublisher)
        val ImageHero = view.findViewById<ImageView>(R.id.ivSuperhero)

        fun render(superHeroModel: SuperHero) {

            superHero.text = superHeroModel.superHero
            realName.text = superHeroModel.realName
            publisher.text = superHeroModel.publisher
            Glide.with(ImageHero.context).load(superHeroModel.photo).into(ImageHero)
            ImageHero.setOnClickListener {
                Toast.makeText(
                    ImageHero.context, superHeroModel.realName,
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

    }
}