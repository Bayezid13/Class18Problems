package com.example.navigration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigration.databinding.FragmentFinalBinding
import com.example.navigration.databinding.FragmentProfileBinding

class FinalFragment : Fragment() {
    lateinit var binding: FragmentFinalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentFinalBinding.inflate(layoutInflater,container,false)
        binding.GoHome.setOnClickListener {
            findNavController().navigate(R.id.action_finalFragment_to_homeFragment)
        }
        return binding.root
    }

}