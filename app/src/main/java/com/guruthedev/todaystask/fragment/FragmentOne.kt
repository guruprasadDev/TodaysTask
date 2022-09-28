package com.guruthedev.todaystask.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guruthedev.todaystask.R

class FragmentOne : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("onCreate() >>>", ">>>CREATED")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("onCreateView() >>>", ">>>CREATE VIEW")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("onViewCreate() >>>", ">>>ON VIEW CREATED")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Li","onStart() >>>>>> START")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume() >>>", ">>> RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause() >>>", ">>> PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop() >>>", ">>> STOP")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("onDestroyView() >>>", ">>> ON DESTROY VIEW")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy() >>>", ">>> DESTROYED")
    }
}