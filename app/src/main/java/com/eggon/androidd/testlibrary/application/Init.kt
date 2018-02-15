package com.eggon.androidd.testlibrary.application

import android.app.Application
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

class Init : Application()

@GlideModule
class AppGlideModule : AppGlideModule()