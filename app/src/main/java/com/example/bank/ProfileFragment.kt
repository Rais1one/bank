package com.example.bank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.example.bank.historyscreen.DetailsFragment
import com.example.bank.historyscreen.IncomeFragment
import com.example.bank.historyscreen.SpendingFragment
import com.example.bank.profilescreen.ChangeFragment
import com.example.bank.profilescreen.DescriptionFragment
import com.example.bank.profilescreen.SettingDesignFragment


class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        val layout1 = view.findViewById<LinearLayout>(R.id.userDataButton)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ChangeFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout2 = view.findViewById<LinearLayout>(R.id.appearanceButton)
        layout2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SettingDesignFragment())
                .addToBackStack(null)
                .commit()
        }

        val layout3 = view.findViewById<LinearLayout>(R.id.aboutBankButton)
        layout3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, DescriptionFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}