package com.example.reciclerviewejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.example.reciclerviewejemplo.databinding.FragmentFragmenDetailHeroBinding

class FragmenDetailHero : Fragment() {

       var nameHero :String? =""
       var publisher: String? =""
       var realName: String? = ""
       var photo:String? = ""
       var description: String? =""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
         val view =inflater.inflate(R.layout.fragment_fragmen_detail_hero, container, false)
        //1.recibir toda la informacion
        nameHero = arguments?.getString("nameHero")
        publisher  = arguments?.getString("publisher")
        realName = arguments?.getString("realName")
        photo = arguments?.getString("photo")
        description = arguments?.getString("description")


       //2.llamar la funcion
        loadInfo(view)
       // return inflater.inflate(R.layout.fragment_fragmen_detail_hero, container, false)
        return view


    }

 fun loadInfo(view: View){
    // val textView : TextView?
     //3.setear cada una de la variables en la vista
    val binding = FragmentFragmenDetailHeroBinding.bind(view)
     binding.tvsuperHeroNamDetail.setText(nameHero)
     binding.tvPublisherDetail.setText(publisher)
     binding.tvdescriptionHero.setText(description)
     Glide.with(binding.ivSuperHeroDetail.context).load(photo)
         .into(binding.ivSuperHeroDetail)
 }

}