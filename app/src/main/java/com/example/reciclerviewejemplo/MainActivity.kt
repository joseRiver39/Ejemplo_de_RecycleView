package com.example.reciclerviewejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replacefragment(Fragment_Hero())
    }
     //se crea una funcion para  inicializar fragmento en main activity
    private fun replacefragment( fragmentHero: Fragment_Hero){
        // Obtiene una instancia del FragmentManager
        val fragmentManager = supportFragmentManager

        // Crea una transacción de Fragment
        val transaction = fragmentManager.beginTransaction()

        // Agrega el Fragment a la transacción
        val fragment = Fragment_Hero()
        transaction.add(R.id.fragmentContainer, fragment)

        // Confirma la transacción
        transaction.commit()
    }


    }


