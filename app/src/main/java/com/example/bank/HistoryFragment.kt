package com.example.bank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.bank.historyscreen.DetailsFragment
import com.example.bank.historyscreen.IncomeFragment
import com.example.bank.historyscreen.SpendingFragment
import com.example.bank.mainscreen.CardFragment
import com.example.bank.mainscreen.CashbackFragment
import com.example.bank.translationscreen.TranslationPhoneFragment


class HistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val products1 = view.findViewById<ImageView>(R.id.products1)
        products1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val transfer = view.findViewById<ImageView>(R.id.transfer)
        transfer.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val restaurant = view.findViewById<ImageView>(R.id.restaurant)
        restaurant.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val products2 = view.findViewById<ImageView>(R.id.products2)
        products2.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))


        val layout1 = view.findViewById<LinearLayout>(R.id.outcome)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SpendingFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.income)
        layout2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, IncomeFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout3 = view.findViewById<LinearLayout>(R.id.itemProducts1)
        layout3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, DetailsFragment())
                .addToBackStack(null)
                .commit()
        }



    }


}