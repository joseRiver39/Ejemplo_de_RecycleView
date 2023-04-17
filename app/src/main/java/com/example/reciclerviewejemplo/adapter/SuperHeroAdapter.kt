package com.example.reciclerviewejemplo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewejemplo.R
import com.example.reciclerviewejemplo.SuperHero
import com.example.reciclerviewejemplo.databinding.ItemSuperheroBinding

/**
 * Autor: Jose Rivera
 * Clase adaptador para mostar datos desde la clase data
 * Recibe parametros de la lisra de superheroProvider**/
  class SuperHeroAdapter(private val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>() {

    // Agregar el OnClick

private lateinit var  mListener : OnItemClickListener
    interface OnItemClickListener{
        fun onItemClick(position: Int)

        }
    fun setOnItemClickListener(listener: OnItemClickListener){
        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false),mListener)
    }


    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroList.size


    class SuperHeroViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view) {

     val binding = ItemSuperheroBinding.bind(view)

     init {
         view.setOnClickListener {
             listener.onItemClick(adapterPosition)
         }
     }
     fun render(superHeroModel: SuperHero) {

         binding.tvSuperheroName.text = superHeroModel.nameHero
         binding.tvRealName.text = superHeroModel.realName
         binding.tvPublisher.text = superHeroModel.publisher
         Glide.with(binding.ivSuperhero.context).load(superHeroModel.photo)
             .into(binding.ivSuperhero)
         //binding.ivSuperhero.setOnClickListener{ Toast.makeText(binding.ivSuperhero.context,superHeroModel.realName,Toast.LENGTH_SHORT).show()}

     }


 }

}