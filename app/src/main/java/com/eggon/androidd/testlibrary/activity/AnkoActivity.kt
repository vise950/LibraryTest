package com.eggon.androidd.testlibrary.activity

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import com.eggon.androidd.testlibrary.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.switchCompat
import org.jetbrains.anko.design.textInputLayout

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            horizontalPadding = dip(16)
            verticalPadding = dip(16)

            switchCompat {
                text = "Maschio"
                textSize = 16f
                setOnCheckedChangeListener { _, isChecked ->
                    text = if (isChecked) "Femmina" else "Maschio"
                }
            }

            switchCompat {
                text = "Stomaco vuoto"
                textSize = 16f
                setOnCheckedChangeListener { _, isChecked ->
                    text = if (isChecked) "Stomaco pieno" else "Stomaco vuoto"
                }
            }.lparams(width = matchParent) {
                topMargin = dip(8)
            }

            textInputLayout {
                hint = "Peso (Kg)"
                editText { }
            }.lparams(width = matchParent) {
                topMargin = dip(8)
            }

            textInputLayout {
                hint = "Alcool (cc/ml)"
                editText { }
            }.lparams(width = matchParent) {
                topMargin = dip(8)
            }

            textInputLayout {
                hint = "Grado alcolico"
                editText { }
            }.lparams(width = matchParent) {
                topMargin = dip(8)
            }

            button("Calcola") {
                backgroundColor = ContextCompat.getColor(context, R.color.colorAccent)
            }.lparams(width = wrapContent, height = wrapContent) {
                topMargin = dip(16)
                gravity = Gravity.CENTER
            }

            textView {
                textSize = 46f
                gravity = Gravity.CENTER
            }
        }
    }
}