package me.doapps.ligajohto.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_pokedex.*
import kotlinx.android.synthetic.main.app_bar.view.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.PokemonAdapter
import me.doapps.ligajohto.util.StatusBarUtil
import me.doapps.ligajohto.util.ToolbarUtil

class PokedexActivity : AppCompatActivity() {

    lateinit var pokemonAdapter: PokemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)
        StatusBarUtil.statusBarChange(window)
        ToolbarUtil.setUpToolbar(
            activity = this,
            drawable = R.drawable.ic_back,
            toolbar = toolbar_pokedex.toolbar
        )
        pokemonAdapter = PokemonAdapter()
        recycler_pokemon.adapter = pokemonAdapter
        recycler_pokemon.layoutManager = GridLayoutManager(this, 2)
    }
}
