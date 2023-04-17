package com.example.reciclerviewejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.adapter.SuperHeroAdapter
import com.example.reciclerviewejemplo.databinding.FragmentHeroBinding



class FragmentHero : Fragment() {


   private lateinit var binding : FragmentHeroBinding
   private lateinit var superHeroAdapter: SuperHeroAdapter
   private  lateinit var superHeroProvider: SuperHeroProvider



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
                    //1.saber aque heroe hace referencia la posicion
                    val item = SuperHeroProvider.superHeroList[position]

                    //2.obtener del provider un objeto con la info del heroe
                    //3.setiar en el bundle la informacion ejemplo  bundle.putString("nombre",objeto herue.name)



                    val bundle = Bundle()

                    bundle.putString("nameHero", item.nameHero)
                    bundle.putString("publisher",item.publisher)
                    bundle.putString("realName",item.realName)
                    bundle.putString("photo",item.photo)
                    bundle.putString("description",item.description)
                    requireView().findNavController().navigate(
                        R.id.action_fragmentHero_to_fragmenDetailHero,bundle
                    )

                }

            })

        }
    }

}