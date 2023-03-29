package com.example.navigration.class17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigration.R
import com.example.navigration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navcontroller: NavController
    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val drawerLayout = binding.drawerLayout
        val navView = binding.navigationView
        val navController = findNavController(R.id.fragmentContainerView)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.profileFragment,
                R.id.userFragment
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, drawerLayout)
        navView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {

        return navcontroller.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}