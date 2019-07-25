package me.doapps.ligajohto.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.HomeAdapter
import me.doapps.ligajohto.config.Setting
import me.doapps.ligajohto.util.StatusBarUtil

class HomeActivity : AppCompatActivity() {

    lateinit var homeAdapter: HomeAdapter
    lateinit var listHome: MutableList<Pair<String, String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        StatusBarUtil.statusBarChange(window)
        listHome = Setting.listHome()
        homeAdapter = HomeAdapter(listHome)
        recycler_home.adapter = homeAdapter
        recycler_home.layoutManager = GridLayoutManager(this, 2)
    }
}
