package ir.mrjafari483.composeuiapplication

import android.app.Activity
import android.graphics.Color
import android.view.Window
import android.view.WindowManager

class SetNavColor {
    companion object{
        fun setcolor(activity : Activity , color : Int){
            val window : Window = activity.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.navigationBarColor = color

        }
    }

}