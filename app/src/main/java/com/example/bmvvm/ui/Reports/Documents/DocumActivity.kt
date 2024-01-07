package com.example.bmvvm.ui.Reports.Documents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DocumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDocumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDocumBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }




}