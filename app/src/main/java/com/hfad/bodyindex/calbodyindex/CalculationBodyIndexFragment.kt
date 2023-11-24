package com.hfad.bodyindex.calbodyindex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.hfad.bodyindex.databinding.CalculationBodyIndexFragmentBinding

class CalculationBodyIndexFragment : Fragment() {
    private var _binding: CalculationBodyIndexFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: CalculationBodyIndexViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CalculationBodyIndexFragmentBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CalculationBodyIndexViewModel::class.java]
        binding.btn.setOnClickListener {
            if (binding.ed1.text.isNotEmpty() && binding.ed2.text.isNotEmpty()) {
                val w = binding.ed1.text.toString().toInt()
                val h = binding.ed2.text.toString().toDouble()
                val display = viewModel.formulaBodyIndex(w, h)
                val action =
                    CalculationBodyIndexFragmentDirections.actionCalculationBodyIndexFragmentToResultBodyIndexFragment(
                        display.toFloat()
                    )
                findNavController().navigate(action)

            }

        }

        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}