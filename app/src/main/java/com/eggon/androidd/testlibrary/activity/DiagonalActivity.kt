package com.eggon.androidd.testlibrary.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.eggon.androidd.testlibrary.R
import kotlinx.android.synthetic.main.activity_diagonal.*

class DiagonalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagonal)

//        GlideApp.with(this).load("https://blog.ink361.com/wp-content/uploads/2015/10/image1.jpg").into(image)
//        GlideApp.with(this).load("https://1.bp.blogspot.com/-9QM7ciGXRkQ/V1hsB-wNLBI/AAAAAAAAMoA/eYbSHs00PTAjrI4QAmvYAIGCUe1AuRAnwCLcB/s1600/bryan_cranston_0095.jpg")
//                .circleCrop().into(avatar)


        listview.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, (0..100).toList().map(Int::toString))

    }
}