package com.example.reciclerviewejemplo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewejemplo.adapter.SuperHeroAdapter
import com.example.reciclerviewejemplo.databinding.FragentoHeroeBinding

class FragmentHero : Fragment() {

    private lateinit var binding: FragentoHeroeBinding
    private lateinit var superHeroAdapter: SuperHeroAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragentoHeroeBinding.inflate(
            inflater,
            container, false
        )
        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        binding.reciclerSuperHero.apply {
            layoutManager = LinearLayoutManager(
                requireContext(),
                RecyclerView.VERTICAL,
                false
            )
            superHeroAdapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
            adapter = superHeroAdapter

            //Se valida el click
            superHeroAdapter.setOnItemClickListener(object : SuperHeroAdapter.OnItemClickListener{
                override fun onItemClick(position: Int) {
                    // Se llama al fragmento y se le envia la info a mostrar
                    val fragmentManager = requireActivity().supportFragmentManager
                    val fragment = FragmentDetailHero()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.add(R.id.content_detail, fragment)
                    transaction.commit()
                }

            })

        }

    }
}