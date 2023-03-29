package com.example.reciclerviewejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initRecyclerView()

        // Obtiene una instancia del FragmentManager
        val fragmentManager = supportFragmentManager

        // Crea una transacción de Fragment
        val transaction = fragmentManager.beginTransaction()

        // Agrega el Fragment a la transacción
        val fragment = FragmentHero()
        transaction.add(R.id.content_heroe, fragment)

        // Confirma la transacción
        transaction.commit()

    }


}