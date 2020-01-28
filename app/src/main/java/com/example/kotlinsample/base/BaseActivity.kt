package com.example.kotlinsample.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * Created by Annarapu Santhosh Reddy on 23/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}