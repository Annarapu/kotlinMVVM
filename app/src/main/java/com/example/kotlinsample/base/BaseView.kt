package com.example.kotlinsample.base

import android.content.Context


/**
 * Created by Annarapu Santhosh Reddy on 24/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
interface BaseView {
    /**
     * Returns the context in which the application is running.
     * @return the context in which the application is running
     */
    fun getContext(): Context
}