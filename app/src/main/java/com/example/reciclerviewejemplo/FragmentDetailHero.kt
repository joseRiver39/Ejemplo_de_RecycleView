package com.example.reciclerviewejemplo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentDetailHero:Fragment() {

    //Crear el xml de la vista
    //Funcion para sklfdlsgkdfgl;k

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.description_super_hero, container, false)
    }
}