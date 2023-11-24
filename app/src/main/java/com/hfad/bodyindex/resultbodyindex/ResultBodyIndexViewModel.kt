package com.hfad.bodyindex.resultbodyindex

import androidx.lifecycle.ViewModel


class ResultBodyIndexViewModel(result: Float) : ViewModel() {

    private val newResult = result
    fun resultString(): String = (String.format("%.2f", newResult))
    fun indexRange(): String {
        return when (newResult) {
            in 0.0..15.0 -> "Выраженный дефицит массы тела."
            in 16.0..18.0 -> "Недостаточная (дефицит) масса тела."
            in 19.0..25.0 -> "Норма."
            in 26.0..30.0 -> "Избыточная масса тела (предожирение)."
            in 31.0..35.0 -> "Ожирение первой степени."
            in 36.0..40.0 -> "Ожирение второй степени."
            else -> {
                "Ожирение третьей степени (морбидное)."
            }

        }
    }


}