package me.doapps.ligajohto.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home.view.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.activity.PokedexActivity
import me.doapps.ligajohto.config.Setting

class HomeAdapter(
    var listHome: MutableList<Pair<String, String>>,
    var listHomeFilter: MutableList<Pair<String, String>>
) : RecyclerView.Adapter<HomeAdapter.HomeHolder>(),
    Filterable {

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    listHomeFilter = listHome
                } else {
                    val filteredList = mutableListOf<Pair<String, String>>()
                    listHome.forEach {
                        if (it.first.toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(it)
                        }
                    }
                    listHomeFilter = filteredList
                }

                val filterResults = FilterResults()
                filterResults.values = listHomeFilter
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                listHomeFilter = filterResults.values as MutableList<Pair<String, String>>
                notifyDataSetChanged()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        return HomeHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))
    }

    override fun getItemCount(): Int {
        return listHomeFilter.size
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        holder.itemView.title_item.text = listHomeFilter[position].first
        when (listHomeFilter[position].second) {
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
            itemView.item_content.setOnClickListener {
                if (listHome[0].first == listHomeFilter[adapterPosition].first) {
                    itemView.context.startActivity(Intent(itemView.context, PokedexActivity::class.java))
                } else {
                    Toast.makeText(itemView.context, "No se encuentra actividad con ese nombre", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}