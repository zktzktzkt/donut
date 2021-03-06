package app.futured.donutsample.data.model

import androidx.annotation.ColorRes
import app.futured.donutsample.R

sealed class DataCategory(val name: String, @ColorRes val colorRes: Int)

object BlackCategory : DataCategory("black", R.color.process_black)
object GreenCategory : DataCategory("green", R.color.process_green)
object OrangeCategory : DataCategory("orange", R.color.strive_orange)
