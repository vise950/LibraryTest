package com.eggon.androidd.testlibrary.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import com.eggon.androidd.testlibrary.R
import kotlinx.android.synthetic.main.activity_view.*


class ViewActivity : AppCompatActivity() {

    private val GMAIL_PK = "com.google.android.gm"
    private val INBOX_PK = "com.google.android.apps.inbox"
    private val DEFAULT_MAIL_PK = "com.android.email"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        show_loading_snackbar.setOnClickListener {
            snackbarProgress()
            Handler().postDelayed({
                snackbarDone()
            }, 2000L)
        }

        show_intent_snackbar.setOnClickListener {
            snackbarIntent()
        }
    }

    private fun snackbarProgress() {
        Snackbar.make(root_layout, "Something", Snackbar.LENGTH_INDEFINITE).apply {
            (view.findViewById<View>(android.support.design.R.id.snackbar_text).parent as ViewGroup)
                    .addView(ProgressBar(this@ViewActivity))
            show()
        }
    }

    private fun snackbarDone() {
        Snackbar.make(root_layout, "Done", Snackbar.LENGTH_LONG).show()
    }

    private fun snackbarIntent() {
        Snackbar.make(root_layout, "Something", Snackbar.LENGTH_INDEFINITE)
                .setAction("open mail", { openClientEmail() })
                .show()
    }

    private fun openClientEmail() {
        INBOX_PK.getLaunchIntent(this)?.let {
            startActivity(it)
        } ?: run {
            GMAIL_PK.getLaunchIntent(this)?.let {
                startActivity(it)
            } ?: run {
                DEFAULT_MAIL_PK.getLaunchIntent(this)?.let {
                    startActivity(it)
                } ?: run {
                    Toast.makeText(this, "Nessun client mail compatibile", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

fun String.getLaunchIntent(context: Context): Intent? = context.packageManager.getLaunchIntentForPackage(this)