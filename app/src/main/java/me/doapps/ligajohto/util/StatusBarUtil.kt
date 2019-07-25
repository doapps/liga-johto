package me.doapps.ligajohto.util

import android.os.Build
import android.view.View
import android.view.Window

class StatusBarUtil {
    companion object {
        fun statusBarChange(window: Window) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val window = window
                window.apply {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                    }
                }
            }
        }
    }
}