package com.falcon.circlethreads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.falcon.circlethreads.databinding.FragmentBuySellBinding
import com.falcon.circlethreads.databinding.FragmentHomeBinding


class BuySellFragment : Fragment() {
    private var _binding: FragmentBuySellBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuySellBinding.inflate(inflater, container, false)
        binding.b1.setOnClickListener {
            findNavController().navigate(R.id.action_buySellFragment_to_FirstFragment)
        }
        binding.b2.setOnClickListener {
            findNavController().navigate(R.id.action_buySellFragment_to_SecondFragment)
        }






        return binding.root
    }


}