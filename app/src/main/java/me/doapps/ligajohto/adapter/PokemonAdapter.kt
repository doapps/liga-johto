package me.doapps.ligajohto.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_pokemon.view.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.activity.PokemonDetailActivity

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.PokemonHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        return PokemonHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon, parent, false))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: PokemonHolder, position: Int) {

    }

    inner class PokemonHolder(v: View) : RecyclerView.ViewHolder(v) {
        init {
            v.content_pokemon.setOnClickListener {
                v.context.startActivity(Intent(v.context, PokemonDetailActivity::class.java))
            }
        }
    }
}