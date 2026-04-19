package com.example.bank.historyscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.bank.HistoryFragment
import com.example.bank.R


class DetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val product = view.findViewById<ImageView>(R.id.product)
        product.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val layout1 = view.findViewById<LinearLayout>(R.id.detaltohis)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HistoryFragment())
                .addToBackStack(null)
                .commit()
        }


    }
}