package com.eggon.androidd.testlibrary.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.eggon.androidd.testlibrary.R
import io.fabianterhorst.isometric.Color
import io.fabianterhorst.isometric.Point
import io.fabianterhorst.isometric.shapes.Octahedron
import io.fabianterhorst.isometric.shapes.Prism
import io.fabianterhorst.isometric.shapes.Stairs
import kotlinx.android.synthetic.main.activity_isometric.*


class IsometricActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isometric)

        val blue = Color(0.0, 0.0, 255.0)
        val green = Color(0.0, 255.0, 0.0)
        val red = Color(255.0, 0.0, 0.0)
        val orange = Color(255.0, 130.0, 60.0)

        isometric_view.apply {

            //level 1
            add(Stairs(Point.ORIGIN, 6.0)
                    .scale(Point.ORIGIN, 2.0, 2.0, 2.0), blue)

            add(Prism(Point(2.0, 0.0), 2.0, 8.0, 2.0), green)

            add(Prism(Point(0.0, 2.0), 2.0, 6.0, 2.0), blue)


            // level 2
            add(Stairs(Point(2.0, 2.0, 1.0), 20.0)
                    .scale(Point.ORIGIN, 2.0, 2.0, 4.0)
                    .rotateZ(Point(3.0, 7.0, 0.0), -(Math.PI / 2)), red)

            add(Prism(Point(4.0, 6.0), 8.0, 2.0, 6.0), blue)

            // goal
            add(Octahedron(Point(8.0, 3.5, 9.0)), orange)
        }
    }
}