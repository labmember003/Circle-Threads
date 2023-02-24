package com.falcon.circlethreads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.falcon.circlethreads.databinding.FragmentConnectBinding
import com.falcon.circlethreads.databinding.FragmentSustainabilityTrackingBinding
import com.falcon.circlethreads.databinding.FragmentSustainableBinding

class SustainabilityTrackingFragment : Fragment() {
    private var _binding: FragmentSustainabilityTrackingBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSustainabilityTrackingBinding.inflate(inflater, container, false)
        return binding.root
    }

}