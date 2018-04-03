package com.nelsonalmendra.transitions

import android.content.Intent
import android.os.Bundle

class ActivityA : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun onButtonClick(view: android.view.View)
    {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }
}
