package com.harsh.bottombarnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.harsh.bottombarnavigation.databinding.ActivityMainBinding

var controller : NavController?= null
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        controller = findNavController(R.id.navController)
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuHome -> controller!!.navigate(R.id.homeFragment)
                R.id.menuChat -> controller!!.navigate(R.id.chatFragment)
                R.id.menuSettings -> controller!!.navigate(R.id.settingsFragment)
            }
            return@setOnItemSelectedListener true
        }
    }
}