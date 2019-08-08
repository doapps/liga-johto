package me.doapps.ligajohto.adapter

import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_stats.view.*
import me.doapps.ligajohto.R

class StatsAdapter(var listStats: MutableList<Pair<String, Int>>) : RecyclerView.Adapter<StatsAdapter.StatsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatsHolder {
        return StatsHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_stats, parent, false))
    }

    override fun getItemCount(): Int {
        return listStats.size
    }

    override fun onBindViewHolder(holder: StatsHolder, position: Int) {
        if (listStats[position].second < 50) {
            holder.itemView.progress_stats.progressDrawable.setColorFilter(ContextCompat.getColor(holder.itemView.context, R.color.red), PorterDuff.Mode.SRC_IN)
        } else {
            holder.itemView.progress_stats.progressDrawable.setColorFilter(ContextCompat.getColor(holder.itemView.context, R.color.green), PorterDuff.Mode.SRC_IN)
        }
        holder.itemView.text_stats.text = listStats[position].first
        holder.itemView.text_number_stats.text = listStats[position].second.toString()
        holder.itemView.progress_stats.progress = listStats[position].second
    }

    inner class StatsHolder(v: View) : RecyclerView.ViewHolder(v) {
        init {

        }
    }
}