package com.falcon.circlethreads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.falcon.circlethreads.databinding.FragmentRentalBinding
import com.falcon.circlethreads.databinding.FragmentSustainableBinding

class RentalFragment : Fragment() {
    private var _binding: FragmentRentalBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRentalBinding.inflate(inflater, container, false)
        return binding.root
    }
}