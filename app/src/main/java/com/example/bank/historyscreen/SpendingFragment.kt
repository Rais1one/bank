package com.example.bank.historyscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.bank.BenefitFragment
import com.example.bank.HistoryFragment
import com.example.bank.R
import com.example.bank.TranslationsFragment


class SpendingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_spending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val product1 = view.findViewById<ImageView>(R.id.product1)
        product1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val restoran1 = view.findViewById<ImageView>(R.id.restoran1)
        restoran1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val product2 = view.findViewById<ImageView>(R.id.product2)
        product2.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val layout1 = view.findViewById<LinearLayout>(R.id.spentohis)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HistoryFragment())
                .addToBackStack(null)
                .commit()
        }


    }
}