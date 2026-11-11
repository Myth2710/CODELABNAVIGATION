package com.example.myapplication11

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Satu : Fragment(R.layout.fragment_f_satu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenSatu = view.findViewById<Button>(R.id.btnOpenSatu)
        btnOpenSatu.setOnClickListener {
            val fragmentDua = Dua()

            val dataKirim = Bundle().apply {
                putString("nama", "Satu")
                putString("alamat", "Sukamaju")
            }

            fragmentDua.arguments = dataKirim

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentDua)
                .addToBackStack(null)
                .commit()
        }
    }
}
