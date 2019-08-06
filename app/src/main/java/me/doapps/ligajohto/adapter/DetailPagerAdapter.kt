package me.doapps.ligajohto.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import me.doapps.ligajohto.fragment.AboutFragment
import me.doapps.ligajohto.fragment.EvolutionFragment
import me.doapps.ligajohto.fragment.StatsFragment

class DetailPagerAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {
    override fun getItem(position: Int): Fragment {
        var fragment = Fragment()
        when (position) {
            0 -> fragment = AboutFragment()
            1 -> fragment = EvolutionFragment()
            2 -> fragment = StatsFragment()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "About"
            1 -> title = "Base Stats"
            2 -> title = "Evolution"
        }
        return title
    }
}