package com.hfad.bodyindex.resultbodyindex

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ResultBodyIndexViewModelFactory(private val result: Float) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResultBodyIndexViewModel::class.java)) {
            return ResultBodyIndexViewModel(result) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")

    }
}