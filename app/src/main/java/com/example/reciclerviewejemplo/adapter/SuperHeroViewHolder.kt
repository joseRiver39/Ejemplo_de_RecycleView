package com.example.reciclerviewejemplo.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewejemplo.R
import com.example.reciclerviewejemplo.SuperHero

class SuperHeroViewHolder(view: View) :RecyclerView.ViewHolder(view) {



    val superHero = view.findViewById<TextView>(R.id.tvSuperheroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val ImageHero = view.findViewById<ImageView>(R.id.ivSuperhero)

    fun render(superHeroModel : SuperHero){

        superHero.text = superHeroModel.superHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(ImageHero.context).load(superHeroModel.photo).into(ImageHero)
        ImageHero.setOnClickListener{Toast.makeText(ImageHero.context,superHeroModel.realName,Toast.LENGTH_SHORT).show()}

    }

}

