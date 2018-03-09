package com.eggon.androidd.testlibrary.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.eggon.androidd.testlibrary.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diagonal_activity.setOnClickListener { startActivity(Intent(this, DiagonalActivity::class.java)) }
        panorama_activity.setOnClickListener { startActivity(Intent(this, PanoramaActivity::class.java)) }
        isometric_activity.setOnClickListener { startActivity(Intent(this, IsometricActivity::class.java)) }
        view_activity.setOnClickListener { startActivity(Intent(this, ViewActivity::class.java)) }
        anko_activity.setOnClickListener { startActivity(Intent(this, AnkoActivity::class.java)) }
        p_activity.setOnClickListener { startActivity(Intent(this, PActivity::class.java)) }
    }
}
