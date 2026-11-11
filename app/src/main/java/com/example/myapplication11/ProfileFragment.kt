package com.example.myapplication11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication11.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigasi dengan Bundle biasa (sesuai langkah 55–57 modul).
        binding.buttonOpen.setOnClickListener {
            val bundle = Bundle().apply {
                putString("param1", "AMBO")
            }
            findNavController().navigate(
                R.id.action_profileFragment_to_detailProfileFragment,
                bundle
            )
        }

        // Navigasi menggunakan Safe Args (sesuai langkah 68–72 modul).
        binding.buttonOpenSafe.setOnClickListener {
            val action = ProfileFragmentDirections
                .actionProfileFragmentToDetailProfileFragment(
                    dataSatu = "AMBO@gmail.com"
                )
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
