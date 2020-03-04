package com.example.startup

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_food_details.*
//import kotlinx.android.synthetic.main.food_ticket.*

class foodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val bundle=intent.extras

         imageView.setImageResource(bundle!!.getInt("image"))
         textView.text=bundle.getString("name")
         textView2.text=bundle.getString("des")
    }

    fun openWikiPage(view: View) {
        val url="https://en.wikipedia.org/wiki/${textView.text}"
        val intent= Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse(url)
        startActivity(intent)
    }
}
