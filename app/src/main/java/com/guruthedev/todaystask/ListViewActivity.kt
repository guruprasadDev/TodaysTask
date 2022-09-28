package com.guruthedev.todaystask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import androidx.databinding.DataBindingUtil
import com.guruthedev.todaystask.dataClass.User
import com.guruthedev.todaystask.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_view)

        val imageId = intArrayOf(
            R.drawable.img,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i
        )

        val name = arrayOf(
            "Guru Prasad",
            "Elon Musk",
            "Steve Jobs",
            "Bill Gates",
            "Mark Zuckerberg",
            "James Gosling",
            "Sundar Pichai",
            "Kevin Systrom",
            "Parag Agrawal"
        )

        val phoneNo = arrayOf(
            "7995674395",
            "7345678998",
            "9876543456",
            "9876543345",
            "8345679876",
            "7345665478",
            "3456789876",
            "76543213456",
            "987654334578"
        )
        val lastMessage = arrayOf(
            "Hey",
            "Good Morning",
            "Iam in Meeting",
            "Lets Go",
            "How are you?",
            "any Weekend plans?",
            "how was your day?",
            "Lets Catchup",
            "Dinner tonight?"

        )
        val lastMsgTime= arrayOf(
            "8:45 am",
            "9:00 am",
            "9:50 am",
            "10:20 am",
            "11:00 am",
            "12:10 pm",
            "1:19: pm",
            "2:45 pm",
            "3:00 pm"
        )
        val country = arrayOf(
            "India",
            "United States",
            "United States",
            "United States",
            "United States",
            "United States",
            "Russia",
            "India",
            "United Kingdom",
            "India"

        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i],lastMessage[i],lastMsgTime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)
        }
        binding.listVie.isClickable = true
        binding.listVie.adapter = com.guruthedev.todaystask.adapter.ListAdapter(this,userArrayList)
        binding.listVie.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("EXTRA_NAME",name)
            i.putExtra("EXTRA_PHONE",phone)
            i.putExtra("EXTRA_COUNTRY",country)
            i.putExtra("EXTRA_IMAGE",imageId)
            startActivity(i)
        }
    }
}