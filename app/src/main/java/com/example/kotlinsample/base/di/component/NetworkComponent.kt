package com.example.kotlinsample.base.di.component

import com.example.kotlinsample.MainActivity
import com.example.kotlinsample.base.data_source.APIViewModel
import com.example.kotlinsample.base.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton


/**
 * Created by Annarapu Santhosh Reddy on 23/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface NetworkComponent {
    fun inject(apiViewModel: APIViewModel)

    @Component.Builder
    interface Builder {
        fun build(): NetworkComponent
        fun networkModule(networkModule: NetworkModule): Builder
    }
}