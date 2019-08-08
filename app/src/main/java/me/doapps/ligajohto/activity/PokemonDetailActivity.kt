package me.doapps.ligajohto.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_pokemon_detail.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.DetailPagerAdapter
import me.doapps.ligajohto.util.StatusBarUtil

class PokemonDetailActivity : AppCompatActivity() {

    private lateinit var detailPagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)
        detailPagerAdapter = DetailPagerAdapter(supportFragmentManager)
        StatusBarUtil.statusBarChange(color = ContextCompat.getColor(this, R.color.red), window = window)
        onClick()
        viewPagerPokemon.adapter = detailPagerAdapter
        tabPager.setupWithViewPager(viewPagerPokemon)
    }

    private fun onClick() {
        back_pokemon.setOnClickListener {
            onBackPressed()
        }

    }
}