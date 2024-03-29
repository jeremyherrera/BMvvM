package com.example.bmvvm.Reports

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.Person
import androidx.fragment.app.Fragment
import com.example.bmvvm.Doc
import com.example.bmvvm.Home
import com.example.bmvvm.R
import com.example.bmvvm.databinding.ActivityIdnBinding

class Idn :  AppCompatActivity(){

    private lateinit var binding: ActivityIdnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIdnBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())




        binding.bottomNavigationView.setOnItemSelectedListener {
            println("bottmmm")
            when (it.itemId) {
                R.id.home -> replaceFragment(Home())
                R.id.documents -> replaceFragment(Doc())
                R.id.reports -> replaceFragment(Reports())
                R.id.up -> replaceFragment(Backup())
                R.id.person -> replaceFragment(Person())


                else -> {

                }

            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()


    }
}