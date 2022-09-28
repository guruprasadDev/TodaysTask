package com.guruthedev.todaystask.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.guruthedev.todaystask.R
import com.guruthedev.todaystask.dataClass.User
import de.hdodenhof.circleimageview.CircleImageView

class ListAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(
        context,
        R.layout.list_item, arrayList
    ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)

        val imageView: CircleImageView = view.findViewById(R.id.profilePic)
        val userName: TextView = view.findViewById(R.id.personName)
        val lastMag: TextView = view.findViewById(R.id.listMessage)
        val lastMsgTime: TextView = view.findViewById(R.id.lastMsgTime)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].name
        lastMag.text = arrayList[position].lastMessage
        lastMsgTime.text = arrayList[position].lastMegTime

        return view
    }
}