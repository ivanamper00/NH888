package com.hunew.nh888.presentation

import com.hunew.nh888.R

class Utils {
    companion object{
        val colors = listOf(
            R.color.colorRed,
            R.color.colorBlue,
            R.color.colorPink,
            R.color.colorGreen,
            R.color.colorWhite,
        )
    }
}
fun getColor(position: Int): Int{
    var colorPosition = 0
    for (i in 1..position){
        colorPosition = if(i > Utils.colors.lastIndex){
            i - Utils.colors.lastIndex
        }else i
    }
    return Utils.colors[colorPosition]
}