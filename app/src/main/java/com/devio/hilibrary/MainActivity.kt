package com.devio.hilibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.devio.hilibrary.demo.HiLogDemoActivity
import com.devio.hilibrary.demo.tab.HiTabBottomDemoActivity
import com.devio.hilibrary.demo.tab.HiTabTopDemoActivity
import com.devio.hiui.tab.bottom.HiTabBottom
import com.devio.hiui.tab.bottom.HiTabBottomInfo

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onClick(v: View?) {
        Log.d("huzixu", "aaa");
        when (v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiTabTopDemoActivity::class.java))
            }
            R.id.tv_hibottom -> {
                startActivity(Intent(this, HiTabBottomDemoActivity::class.java))
            }
        }
    }

}