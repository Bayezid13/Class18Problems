package com.example.navigration.class17.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigration.R
import com.example.navigration.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    binding= FragmentHomeBinding.inflate(inflater,container,false)

    binding.Profile.setOnClickListener {
        findNavController().navigate(R.id.action_homeFragment_to_profileFragment)

    }

    binding.User.setOnClickListener {
        findNavController().navigate(R.id.action_homeFragment_to_userFragment)
    }
    return binding.root
}

}