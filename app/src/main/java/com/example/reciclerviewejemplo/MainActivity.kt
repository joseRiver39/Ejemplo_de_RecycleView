package com.example.reciclerviewejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.adapter.SuperHeroAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }

    private fun initRecyclerView(){

        val recyclerView = findViewById<RecyclerView>(R.id.reciclerSuperHero)
        recyclerView.layoutManager  = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)

    }
}