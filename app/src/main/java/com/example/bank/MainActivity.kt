package com.example.bank

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        if (AccessibilityManager.isLargeTextMode(this)) {
            resources.configuration.fontScale = 1.3f
            resources.displayMetrics.scaledDensity = resources.displayMetrics.density * 1.3f
        }

        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            replaceRootFragment(MainFragment())
        }

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> replaceRootFragment(MainFragment())
                R.id.nav_transfers -> replaceRootFragment(TranslationsFragment())
                R.id.nav_history -> replaceRootFragment(HistoryFragment())
                R.id.nav_benefit -> replaceRootFragment(BenefitFragment())
                R.id.nav_profile -> replaceRootFragment(ProfileFragment())
                else -> false
            }
            true
        }
    }

    private fun replaceRootFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    fun hideBottomNavigation() {
        binding.bottomNav.visibility = View.GONE
    }

    fun showBottomNavigation() {
        binding.bottomNav.visibility = View.VISIBLE
    }
}