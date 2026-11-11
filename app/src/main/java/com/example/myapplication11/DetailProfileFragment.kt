package com.example.myapplication11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.myapplication11.databinding.FragmentDetailProfileBinding

class DetailProfileFragment : Fragment() {
    private var _binding: FragmentDetailProfileBinding? = null
    private val binding get() = _binding!!
    private val safeArgs: DetailProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundleValue = arguments?.getString("param1").orEmpty()
        binding.tvParam.text = if (bundleValue.isNotBlank()) {
            bundleValue
        } else {
            "Tidak ada data Bundle"
        }

        val safeValue = safeArgs.dataSatu
        binding.tvParamSafeArgs.text = if (safeValue.isNotBlank()) {
            safeValue
        } else {
            "Tidak ada data Safe Args"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
