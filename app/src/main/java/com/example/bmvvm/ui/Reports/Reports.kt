package com.example.bmvvm.ui.Reports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bmvvm.R
import com.example.bmvvm.databinding.FragmentReportsBinding

class Reports : Fragment(R.layout.fragment_reports) {

    private var _binding : FragmentReportsBinding? =  null

    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // As the binding class will change, binding inflate method will also change from fragment to fragment
        _binding = FragmentReportsBinding.inflate(inflater, container, false)
        setTab()
        return binding.root
    }

    private fun setTab(){
        val adapter = getFragmentManager()?.let { ViewAdapt(it) }
        adapter?.addFragment(StatementFragment(),"Statement")
        adapter?.addFragment(AgingFragment(),"Aging")

        binding.pager.adapter = adapter
        binding.tabLa.setupWithViewPager(binding.pager)


    }



}