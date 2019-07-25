package me.doapps.ligajohto.util

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ToolbarUtil {
    companion object {
        fun setUpToolbar(activity: AppCompatActivity, toolbar: Toolbar, drawable: Int) {
            activity.apply {
                setSupportActionBar(toolbar)
                supportActionBar!!.setDisplayHomeAsUpEnabled(true)
                supportActionBar!!.setHomeAsUpIndicator(drawable)
                toolbar.setNavigationOnClickListener { onBackPressed() }
            }
        }
    }
}