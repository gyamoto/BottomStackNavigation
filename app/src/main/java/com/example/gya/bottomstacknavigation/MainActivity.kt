package com.example.gya.bottomstacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val rootDestinations = listOf(R.id.timeline, R.id.favorite, R.id.setting)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = (container as NavHostFragment).navController

        NavigationUI.setupWithNavController(navigation, controller)
        NavigationUI.setupActionBarWithNavController(this, controller)

        controller.addOnNavigatedListener { _, destination ->
            val isRoot = rootDestinations.contains(destination.id)
            supportActionBar?.setDisplayShowHomeEnabled(!isRoot)
            supportActionBar?.setDisplayHomeAsUpEnabled(!isRoot)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.container).navigateUp()
    }

    override fun onBackPressed() {
        val destination = Navigation.findNavController(this, R.id.container).currentDestination
        val isRoot = rootDestinations.contains(destination?.id)
        if (isRoot) {
            finish()
        } else {
            super.onBackPressed()
        }
    }
}
