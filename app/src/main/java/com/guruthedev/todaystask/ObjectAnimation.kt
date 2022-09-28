package com.guruthedev.todaystask

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.databinding.DataBindingUtil
import com.guruthedev.todaystask.databinding.ActivityObjectAnimationBinding

class ObjectAnimation : AppCompatActivity() {
    private lateinit var binding: ActivityObjectAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_object_animation)
        binding.moveNextActivity.setOnClickListener {
            startActivity(Intent(this, FadeAndScaleAnimation::class.java))
        }

        binding.btnMove.setOnClickListener {

            val type: ObjectAnimator = ObjectAnimator.ofFloat(
                binding.carImage,
                View.TRANSLATION_Y,
                binding.carImage.translationY,
                binding.carImage.translationY + 1000f,
            )
            type.duration = 1000
            type.interpolator = LinearInterpolator()
            type.start()
        }
    }
}