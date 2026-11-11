package com.example.myapplication11

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class Dua : Fragment(R.layout.fragment_f_dua) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val namaDiterima = arguments?.getString("nama") ?: "Belum ada data"
        val alamatDiterima = arguments?.getString("alamat") ?: "Belum ada data"

        val txtHasil = view.findViewById<TextView>(R.id.txtHasil)
        txtHasil.text = "Nama: $namaDiterima\nAlamat: $alamatDiterima"

        val btnOpenDua = view.findViewById<Button>(R.id.btnOpenDua)
        btnOpenDua.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Satu())
                .addToBackStack(null)
                .commit()
        }
    }
}
