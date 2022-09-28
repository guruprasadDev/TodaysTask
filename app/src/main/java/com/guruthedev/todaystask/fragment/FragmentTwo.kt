package com.guruthedev.todaystask.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guruthedev.todaystask.R

class FragmentTwo : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("onCreate() >>>", ">>> CREATED 2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("onCreateView() >>>", ">>> CREATE VIEW 2")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("onViewCreate() >>>", ">>> ON VIEW CREATED 2")
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart() >>>", ">>> START 2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume() >>>", ">>> RESUME 2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause() >>>", ">>> PAUSE 2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop() >>>", ">>> STOP 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("onDestroyView() >>>", ">>> ON DESTROY VIEW 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy() >>>", ">>> DESTROYED")
    }

}