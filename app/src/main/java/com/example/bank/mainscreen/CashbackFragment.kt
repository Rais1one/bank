package com.example.bank.mainscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.bank.MainFragment
import com.example.bank.R


class CashbackFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cashback, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val shopIcon1 = view.findViewById<ImageView>(R.id.shopIcon1)
        shopIcon1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val restaurantIcon = view.findViewById<ImageView>(R.id.restaurantIcon)
        restaurantIcon.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val shopIcon2 = view.findViewById<ImageView>(R.id.shopIcon2)
        shopIcon2.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val layout1 = view.findViewById<LinearLayout>(R.id.cashtomain)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.cashtocat)
        layout2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CategoryFragment())
                .addToBackStack(null)
                .commit()
        }


    }
}