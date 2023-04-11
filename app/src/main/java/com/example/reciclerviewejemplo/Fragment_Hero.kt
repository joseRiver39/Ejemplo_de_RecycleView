package com.example.reciclerviewejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.adapter.SuperHeroAdapter

//Investigar
/* val recyclerView = findViewById<RecyclerView>(R.id.reciclerSuperHero
   recyclerView.layoutManager  = LinearLayoutManager(this)
   recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)*/

/*binding.contentDetail.rvImageRequestedProducts.apply {
layoutManager = LinearLayoutManager(
    requireContext(),
    RecyclerView.HORIZONTAL,
    false
)
imageProductAdapter = ImageProductAdapter(itemsReq, totalProducts)
adapter = imageProductAdapter

}*/

class Fragment_Hero : Fragment(), SuperHeroAdapter.RecyclerViewOnclikc {


    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //se inicialisa el recyclerview desde el oncreate
        val view : View =inflater.inflate(R.layout.fragment__hero, container, false)
        recyclerView = view.findViewById(R.id.RecyclerSuperHero)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList,this)
        // Inflate the layout for this fragment
        return view
    }

    override fun itemClickRecyclerView(position: Int) {
        TODO("Not yet implemented")
    }

}