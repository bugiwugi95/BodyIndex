package com.hfad.bodyindex.calbodyindex

import androidx.lifecycle.ViewModel
import kotlin.math.pow

class CalculationBodyIndexViewModel : ViewModel() {
    fun formulaBodyIndex(weight: Int, height: Double): Double {
        return weight / height.pow(2)
    }
}