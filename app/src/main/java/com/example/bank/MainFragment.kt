package com.example.bank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.bank.R
import com.example.bank.translationscreen.TranslationPhoneFragment
import com.example.bank.mainscreen.*
import android.widget.LinearLayout

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val layout1 = view.findViewById<LinearLayout>(R.id.maintophone)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, TranslationPhoneFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.maintocash)
        layout2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CashbackFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout3 = view.findViewById<LinearLayout>(R.id.maintocard)
        layout3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CardFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}