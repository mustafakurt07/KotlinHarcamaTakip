package com.example.harcamatakip.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.harcamatakip.databinding.FragmentThirdBinding

//OnBoardScreen

class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferences = context?.getSharedPreferences(
            "com.example.harcamatakip",
            Context.MODE_PRIVATE
        )!!
        val editor = sharedPreferences?.edit()
        binding.buttonThird.setOnClickListener(View.OnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToGirisFragment()
            view.findNavController().navigate(action)
            editor.putString("showed", "yes")
            editor.apply()
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}