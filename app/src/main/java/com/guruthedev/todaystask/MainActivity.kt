package com.guruthedev.todaystask

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.content.Intent
import android.database.DatabaseUtils
import android.icu.number.Scale
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import androidx.databinding.DataBindingUtil
import com.guruthedev.todaystask.databinding.ActivityMainBinding
import java.time.Duration

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.navigateToActivity2.setOnClickListener {
            startActivity(
                Intent(this, DisplayFragmentLifecycle::class.java)
            )
        }
        binding.btnMove.setOnClickListener {
            animate(
                binding.carImage,
                View.TRANSLATION_X,
                binding.carImage.translationX,
                binding.carImage.translationY + 800f,

                2000,
                BounceInterpolator()
            )
            // animate the Alpha
            animate(
                binding.carImage,
                View.ALPHA,
                1.0f,
                0.0f,
                2500,
                BounceInterpolator()
            )
        }
    }

    fun animate(
        target: View,
        property: Property<View, Float>,
        from: Float,
        to: Float,
        duration: Long,
        interpolator: TimeInterpolator,
    ) {
        val ty: ObjectAnimator = ObjectAnimator.ofFloat(
            target,
            property,
            from,
            to
        )
        ty.duration = duration
        ty.interpolator = interpolator
        ty.start()
    }
}