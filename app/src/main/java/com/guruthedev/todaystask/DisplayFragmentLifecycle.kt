package com.guruthedev.todaystask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.guruthedev.todaystask.databinding.ActivityDisplayFragmentLifecycleBinding
import com.guruthedev.todaystask.fragment.FragmentOne
import com.guruthedev.todaystask.fragment.FragmentTwo

class DisplayFragmentLifecycle : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayFragmentLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_display_fragment_lifecycle)

        binding.fragmentBtnOne.setOnClickListener {
            loadFragment(FragmentOne())
        }
        binding.fragmentBtnTwo.setOnClickListener {
            loadFragment(FragmentTwo())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        // create a fragmentManager
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        // replace the FrameLayout with new fragment
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}