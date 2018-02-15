package com.eggon.androidd.testlibrary.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.eggon.androidd.testlibrary.R
import io.fabianterhorst.isometric.Color
import io.fabianterhorst.isometric.Path
import io.fabianterhorst.isometric.Point
import io.fabianterhorst.isometric.shapes.Prism
import kotlinx.android.synthetic.main.activity_isometric.*


class IsometricActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isometric)

//        isometric_view.add(Prism(Point(0.0, 0.0, 0.0)), Color(33.0, 150.0, 243.0))
//        isometric_view.add(Prism(Point(-1.0, 1.0, 0.0), 1.0, 2.0, 1.0), Color(33.0, 150.0, 243.0))
//        isometric_view.add(Prism(Point(1.0, -1.0, 0.0), 2.0, 1.0, 1.0), Color(33.0, 150.0, 243.0))

        isometric_view.add(Prism(Point.ORIGIN, 3.0, 3.0, 1.0), Color(50.0, 60.0, 160.0))
        isometric_view.add(Path(arrayOf(Point(1.0, 1.0, 1.0), Point(2.0, 1.0, 1.0), Point(2.0, 2.0, 1.0),
                Point(1.0, 2.0, 1.0))), Color(50.0, 160.0, 60.0))
    }
}