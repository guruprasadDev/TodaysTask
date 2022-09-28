package com.guruthedev.todaystask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.guruthedev.todaystask.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_user)

        val name = intent.getStringExtra("EXTRA_NAME")
        val phone = intent.getStringExtra("EXTRA_PHONE")
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val imageId = intent.getIntExtra("EXTRA_IMAGE",R.drawable.a)


        binding.userName.text = name
        binding.phoneNumber.text =phone
        binding.userCountry.text = country
        binding.profilePic.setImageResource(imageId)

    }
}

