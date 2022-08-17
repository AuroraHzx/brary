package com.devio.hilibrary.demo.refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devio.hilibrary.R
import com.devio.hiui.refresh.HiRefreshLayout

class HiRefreshActivityDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var refreshLayout = findViewById<HiRefreshLayout>(R.id.refresh_layout)

    }
}