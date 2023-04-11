package com.example.reciclerviewejemplo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewejemplo.R
import com.example.reciclerviewejemplo.SuperHero
import com.example.reciclerviewejemplo.databinding.ItemSuperheroBinding

/**
 * Autor: Jose Rivera
 * Clase adaptador para mostar datos desde la clase data
 * Recibe parametros de la lisra de superheroProvider**/
class SuperHeroAdapter(private val superheroList: List<SuperHero>,
                       private  val listen : RecyclerViewOnclikc
                       ) :
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


   inner class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{

        val binding = ItemSuperheroBinding.bind(view)
       /*
        val superHero = view.findViewById<TextView>(R.id.tvSuperheroName)
        val realName = view.findViewById<TextView>(R.id.tvRealName)
        val publisher = view.findViewById<TextView>(R.id.tvPublisher)
        val ImageHero = view.findViewById<ImageView>(R.id.ivSuperhero)*/

        fun render(superHeroModel: SuperHero) {

            binding.tvSuperheroName.text = superHeroModel.superHero
            binding.tvRealName.text = superHeroModel.realName
            binding.tvPublisher.text = superHeroModel.publisher
            Glide.with(binding.ivSuperhero.context).load(superHeroModel.photo)
                .into(binding.ivSuperhero)


            itemView.setOnClickListener {



            }
        }


        override fun onClick(v: View?) {
            val position =  adapterPosition
            if(position != RecyclerView.NO_POSITION){
                listen.itemClickRecyclerView(position)
                

            }

        }


    }

    interface RecyclerViewOnclikc{
        fun itemClickRecyclerView(position: Int)

    }
}