package me.doapps.ligajohto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_evolution.view.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.model.Evolution

class EvolutionAdapter(var listEvolution: MutableList<Evolution>) :
    RecyclerView.Adapter<EvolutionAdapter.EvolutionHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EvolutionHolder {
        return EvolutionHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_evolution, parent, false))
    }

    override fun getItemCount(): Int {
        return listEvolution.size
    }

    override fun onBindViewHolder(holder: EvolutionHolder, position: Int) {
        holder.itemView.img_start.setImageResource(listEvolution[position].imageFirst)
        holder.itemView.img_end.setImageResource(listEvolution[position].imageSecond)
        holder.itemView.text_level.text = "Lvl ${listEvolution[position].level}"
        holder.itemView.text_first.text = listEvolution[position].first
        holder.itemView.text_second.text = listEvolution[position].second
    }

    inner class EvolutionHolder(v: View) : RecyclerView.ViewHolder(v) {
        init {

        }
    }
}