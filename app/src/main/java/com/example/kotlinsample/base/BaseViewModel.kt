package com.example.kotlinsample.base

import androidx.lifecycle.ViewModel
import com.example.kotlinsample.base.data_source.APIViewModel
import com.example.kotlinsample.base.di.component.DaggerNetworkComponent
import com.example.kotlinsample.base.di.component.NetworkComponent
import com.example.kotlinsample.base.di.module.NetworkModule


/**
 * Created by Annarapu Santhosh Reddy on 24/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
abstract class BaseViewModel: ViewModel() {
    private val networkComponent : NetworkComponent = DaggerNetworkComponent
        .builder().networkModule(NetworkModule).build()

    init {
        inject()
    }

    private fun inject() {
        when(this){
            is APIViewModel -> networkComponent.inject(this)
        }
    }

}