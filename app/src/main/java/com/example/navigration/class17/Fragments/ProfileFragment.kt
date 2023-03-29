package com.example.navigration.class17.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigration.R
import com.example.navigration.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentProfileBinding.inflate(layoutInflater,container,false)

        binding.GoToFinalProfile.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_finalFragment)

        }
        return binding.root
    }

}