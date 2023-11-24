package com.hfad.bodyindex.resultbodyindex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.hfad.bodyindex.R
import com.hfad.bodyindex.databinding.FragmentResultBodyIndexBinding


class ResultBodyIndexFragment : Fragment() {

    private var _binding: FragmentResultBodyIndexBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModelFactory: ResultBodyIndexViewModelFactory
    private lateinit var viewModel: ResultBodyIndexViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentResultBodyIndexBinding.inflate(layoutInflater)

        val res =  ResultBodyIndexFragmentArgs.fromBundle(requireArguments()).result
        viewModelFactory = ResultBodyIndexViewModelFactory(res)
        viewModel = ViewModelProvider(this, viewModelFactory)[ResultBodyIndexViewModel::class.java]
        binding.resultText.text = viewModel.resultString()
        binding.rangeIdBody.text = viewModel.indexRange()





        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_resultBodyIndexFragment_to_calculationBodyIndexFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}