package com.nelsonalmendra.transitions

import android.os.Bundle

class ActivityB : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    fun onButtonClick(view: android.view.View)
    {
        finish()
    }
}
