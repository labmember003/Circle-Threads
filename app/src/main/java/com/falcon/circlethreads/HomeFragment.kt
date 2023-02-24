package com.falcon.circlethreads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.falcon.circlethreads.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.year1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_buySellFragment)
        }
        binding.year3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_FirstFragment)
        }
        binding.year2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sustainableFragment)
        }
        //        findNavController().navigate(R.id.action_FirstFragment_to_buySellFragment)
        // Inflate the layout for this fragment
        return binding.root
    }


}