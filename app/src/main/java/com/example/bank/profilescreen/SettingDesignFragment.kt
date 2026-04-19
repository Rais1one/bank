package com.example.bank.profilescreen

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import com.example.bank.R
import com.example.bank.ThemeManager
import com.example.bank.AccessibilityManager

class SettingDesignFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting_design, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val switchDarkTheme = view.findViewById<SwitchCompat>(R.id.switchDarkTheme)
        switchDarkTheme.isChecked = ThemeManager.isDarkMode(requireContext())
        switchDarkTheme.setOnCheckedChangeListener { _, isChecked ->
            ThemeManager.setDarkMode(requireContext(), isChecked)
            requireActivity().recreate()
        }


        val layout1 = view.findViewById<LinearLayout>(R.id.settopro)
        layout1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, com.example.bank.ProfileFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    private fun applyLargeText() {
        resources.configuration.fontScale = 1.3f
        resources.displayMetrics.scaledDensity = resources.displayMetrics.density * 1.3f
    }

    private fun resetLargeText() {
        resources.configuration.fontScale = 1.0f
        resources.displayMetrics.scaledDensity = resources.displayMetrics.density
    }

    private fun applyHighContrast(enabled: Boolean) {
        val rootView = view
        if (rootView != null) {
            if (enabled) {
                rootView.setBackgroundColor(Color.WHITE)
                val textViews = findAllTextViews(rootView)
                for (tv in textViews) {
                    tv.setTextColor(Color.BLACK)
                }
            } else {
                rootView.setBackgroundResource(R.drawable.fon)
                val textViews = findAllTextViews(rootView)
                for (tv in textViews) {
                    tv.setTextColor(resources.getColor(R.color.color_text, null))
                }
            }
        }
    }

    private fun findAllTextViews(view: View): List<TextView> {
        val result = mutableListOf<TextView>()
        if (view is TextView) {
            result.add(view)
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                result.addAll(findAllTextViews(view.getChildAt(i)))
            }
        }
        return result
    }
}