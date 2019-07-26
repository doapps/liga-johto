package me.doapps.ligajohto.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_pokemon_detail.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.util.StatusBarUtil

class PokemonDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)
        StatusBarUtil.statusBarChange(color = ContextCompat.getColor(this, R.color.red), window = window)
        onClick()
    }

    private fun onClick() {
        back_pokemon.setOnClickListener {
            onBackPressed()
        }
    }
}
