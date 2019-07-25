package me.doapps.ligajohto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home.view.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.config.Setting

class HomeAdapter(var listHome: MutableList<Pair<String, String>>) : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        return HomeHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))
    }

    override fun getItemCount(): Int {
        return listHome.size
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        holder.itemView.title_item.text = listHome[position].first
        when (listHome[position].second) {
            Setting.listHome()[0].second -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.green
                    )
                )
            }
            Setting.listHome()[1].second -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.red
                    )
                )

            }
            Setting.listHome()[2].second -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.sky_blue
                    )
                )
            }

            Setting.listHome()[4].second -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.yellow
                    )
                )
            }
            Setting.listHome()[5].second -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.purple
                    )
                )
            }
            else -> {
                holder.itemView.item_content.setCardBackgroundColor(
                    ContextCompat.getColor(
                        holder.itemView.context,
                        R.color.brown
                    )
                )
            }
        }
    }

    inner class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {

        }
    }
}