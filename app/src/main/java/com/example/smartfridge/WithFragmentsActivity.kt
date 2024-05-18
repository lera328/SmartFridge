package com.example.smartfridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.ListFragment
import com.example.smartfridge.databinding.ActivityWithFragmentsBinding

class WithFragmentsActivity : AppCompatActivity() {

    val fragment=FridgeFragment()
    lateinit var binding:ActivityWithFragmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWithFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openMainFragment()
        supportActionBar?.hide()

        binding.bottomNavBar.setItemSelected(R.id.nav_fridge)
        binding.bottomNavBar.setOnItemSelectedListener {
            when (it) {

                R.id.nav_fridge -> {
                    openMainFragment()
                }
                R.id.nav_list -> {
                    val favoriteFragment = ShoppingListFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragContainerNav.id, favoriteFragment).commit()

                }
                R.id.nav_diary -> {
                    val profileFragment = FoodDiaryFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragContainerNav.id, profileFragment).commit()
                }
                R.id.nav_settings -> {
                    val profileFragment = SettingsFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragContainerNav.id, profileFragment).commit()
                }
            }
        }
    }

    private fun openMainFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragContainerNav.id, fragment)
        transaction.commit()
    }
}