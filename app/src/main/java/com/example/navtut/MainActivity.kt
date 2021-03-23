package com.example.navtut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ربط المكونات
        val bottmNav=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        //Add controller from nav host
        val controller=findNavController(R.id.fragment)

        //Configuration options for NavigationUI methods that interact with implementations
        // of the app bar pattern such as Toolbar, CollapsingToolbarLayout, and ActionBar.
        val appBarConfiguration= AppBarConfiguration(setOf(
            R.id.firstFragment,  R.id.secondFragment,R.id.thirdFragment
        ))
        //By calling this method, the title in the action bar will automatically
        // be updated when the destination changes
        setupActionBarWithNavController(controller,appBarConfiguration)
        bottmNav.setupWithNavController(controller)
    }
}