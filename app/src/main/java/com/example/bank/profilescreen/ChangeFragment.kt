package com.example.bank.profilescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.bank.ProfileFragment
import com.example.bank.R


class ChangeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_change, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val profileImage1 = view.findViewById<ImageView>(R.id.profileImage1)
        profileImage1.setColorFilter(ContextCompat.getColor(requireContext(), R.color.color_text))

        val layout1 = view.findViewById<LinearLayout>(R.id.cahtopro)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }


    }
}