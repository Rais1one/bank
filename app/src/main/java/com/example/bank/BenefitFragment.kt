package com.example.bank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.bank.benefitscreen.CreditFragment
import com.example.bank.benefitscreen.PartnerFragment
import com.example.bank.benefitscreen.StockFragment


class BenefitFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_benefit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgStar1 = view.findViewById<ImageView>(R.id.imgStar1)
        imgStar1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val imgStar2 = view.findViewById<ImageView>(R.id.imgStar2)
        imgStar2.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val starIcon = view.findViewById<ImageView>(R.id.starIcon)
        starIcon.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val layout1 = view.findViewById<LinearLayout>(R.id.blockPromotions)
       layout1.setOnClickListener {
           parentFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, StockFragment())
               .addToBackStack(null)
               .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.blockCredit)
       layout2.setOnClickListener {
           parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CreditFragment())
               .addToBackStack(null)
               .commit()
        }

       val layout3 = view.findViewById<LinearLayout>(R.id.partnersBlock)
        layout3.setOnClickListener {
           parentFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, PartnerFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}