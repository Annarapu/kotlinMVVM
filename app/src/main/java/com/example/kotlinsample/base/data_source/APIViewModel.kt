package com.example.kotlinsample.base.data_source

import com.example.kotlinsample.base.BaseViewModel
import com.example.kotlinsample.base.data_source.RestService
import javax.inject.Inject


/**
 * Created by Annarapu Santhosh Reddy on 24/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
class APIViewModel: BaseViewModel() {
    @Inject
    lateinit var restService: RestService
}