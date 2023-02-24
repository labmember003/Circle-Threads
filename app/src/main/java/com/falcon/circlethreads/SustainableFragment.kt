package com.falcon.circlethreads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.falcon.circlethreads.databinding.FragmentHomeBinding
import com.falcon.circlethreads.databinding.FragmentSustainableBinding


class SustainableFragment : Fragment() {
    private var _binding: FragmentSustainableBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSustainableBinding.inflate(inflater, container, false)
        return binding.root
    }


}