package com.example.reciclerviewejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.adapter.SuperHeroAdapter
import com.example.reciclerviewejemplo.databinding.FragmentHeroBinding



class FragmentHero : Fragment() {


   private lateinit var binding : FragmentHeroBinding
   private lateinit var superHeroAdapter: SuperHeroAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHeroBinding.inflate(inflater,container,false)
        initRecyclerView()
        return binding.root

    }


    private fun initRecyclerView(){
        binding.recyclerSuperHero.apply {
            layoutManager = LinearLayoutManager(
                requireContext(),
                RecyclerView.VERTICAL,false
            )
            superHeroAdapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
            adapter = superHeroAdapter

            superHeroAdapter.setOnItemClickListener(object  : SuperHeroAdapter.OnItemClickListener{
                override fun onItemClick(position: Int) {
                    val toast : Unit = Toast.makeText(context,"el heroe que eljiste esta en la " +
                            "posición: ${(position + 1).toString()}",Toast.LENGTH_LONG).show()
                   /* val fragmetManager = requireActivity().supportFragmentManager
                    val fragment =  FragmenDetailHero()
                    val  transaction = fragmetManager.beginTransaction()
                    transaction.add(R.id.fragmentContainer,fragment)
                    transaction.commit()*/
                }

            })

        }
    }

}