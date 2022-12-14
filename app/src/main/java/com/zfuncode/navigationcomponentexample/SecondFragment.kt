package com.zfuncode.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSimpan.setOnClickListener{
            val nama = etNama.text.toString()
            val bund = Bundle()
            bund.putString(NAMA, nama)
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment, bund)
        }
    }

    companion object
    {
        val NAMA = "nama"
    }

}