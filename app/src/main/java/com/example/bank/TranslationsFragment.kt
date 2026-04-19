package com.example.bank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.example.bank.historyscreen.DetailsFragment
import com.example.bank.profilescreen.ChangeFragment
import com.example.bank.profilescreen.SettingDesignFragment
import com.example.bank.translationscreen.TranslationBankFragment
import com.example.bank.translationscreen.TranslationCardFragment
import com.example.bank.translationscreen.TranslationPhoneFragment


class TranslationsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_translations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        val layout1 = view.findViewById<LinearLayout>(R.id.transtophone)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, TranslationPhoneFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.transtobank)
        layout2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, TranslationBankFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout3 = view.findViewById<LinearLayout>(R.id.transtocard)
        layout3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, TranslationCardFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}