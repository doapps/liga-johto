package me.doapps.ligajohto.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_stats.view.*

import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.StatsAdapter
import me.doapps.ligajohto.config.Setting

class StatsFragment : Fragment() {

    private lateinit var statsAdapter: StatsAdapter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stats, container, false)
        statsAdapter = StatsAdapter(Setting.listStats())
        view.recycler_stats.layoutManager = LinearLayoutManager(activity)
        view.recycler_stats.adapter = statsAdapter
        return view
    }
}
