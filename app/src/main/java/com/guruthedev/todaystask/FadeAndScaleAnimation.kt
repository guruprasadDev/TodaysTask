package com.guruthedev.todaystask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.guruthedev.todaystask.databinding.ActivityFadeAndScaleAnimationBinding

class FadeAndScaleAnimation : AppCompatActivity() {
    private lateinit var binding: ActivityFadeAndScaleAnimationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fade_and_scale_animation)

        binding.scaleBtn.setOnClickListener {
            val scaleAnimation: Animation =
                AnimationUtils.loadAnimation(this@FadeAndScaleAnimation, R.anim.scale)
            binding.myImage.startAnimation(scaleAnimation)
        }
        binding.fadeBtn.setOnClickListener {
            val fadeAnimation: Animation =
                AnimationUtils.loadAnimation(this@FadeAndScaleAnimation, R.anim.fade)
            binding.myImage.startAnimation(fadeAnimation)
        }
        binding.viewBtn.setOnClickListener {
            val viewAnimation:Animation= AnimationUtils.loadAnimation(this@FadeAndScaleAnimation,R.anim.view_scale)
            binding.myText.startAnimation(viewAnimation)
        }

    }
}