package com.eggon.androidd.testlibrary.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.gofynd.gravityview.GravityView
import com.eggon.androidd.testlibrary.R
import kotlinx.android.synthetic.main.activity_panorama.*

class PanoramaActivity : AppCompatActivity() {

    private var gravityView: GravityView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panorama)

        gravityView = GravityView.getInstance(this)
                .setImage(image, R.drawable.landscape)
                .center()
    }

    override fun onResume() {
        super.onResume()
        gravityView?.registerListener()
    }

    override fun onStop() {
        super.onStop()
        gravityView?.unRegisterListener()
    }
}