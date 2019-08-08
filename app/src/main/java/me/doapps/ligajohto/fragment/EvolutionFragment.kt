package me.doapps.ligajohto.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_evolution.view.*

import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.EvolutionAdapter
import me.doapps.ligajohto.config.Setting

class EvolutionFragment : Fragment() {

    private lateinit var evolutionAdapter: EvolutionAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_evolution, container, false)

        evolutionAdapter = EvolutionAdapter(listEvolution = Setting.listEvolution())
        view.recycler_evolution.layoutManager = LinearLayoutManager(activity)
        view.recycler_evolution.adapter = evolutionAdapter

        return view
    }
}