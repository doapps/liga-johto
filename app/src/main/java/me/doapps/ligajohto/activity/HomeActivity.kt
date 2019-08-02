package me.doapps.ligajohto.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import me.doapps.ligajohto.R
import me.doapps.ligajohto.adapter.HomeAdapter
import me.doapps.ligajohto.config.Setting
import me.doapps.ligajohto.util.StatusBarUtil

class HomeActivity : AppCompatActivity() {

    lateinit var homeAdapter: HomeAdapter
    lateinit var listHome: MutableList<Pair<String, String>>
    private var listHomeFilter = mutableListOf<Pair<String, String>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        StatusBarUtil.statusBarChange(window)
        listHome = Setting.listHome()
        listHomeFilter = listHome
        homeAdapter = HomeAdapter(listHome = listHome, listHomeFilter = listHomeFilter)
        recycler_home.adapter = homeAdapter
        recycler_home.layoutManager = GridLayoutManager(this, 2)

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                homeAdapter.filter.filter(s)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
