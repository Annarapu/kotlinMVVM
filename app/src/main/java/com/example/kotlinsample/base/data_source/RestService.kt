package com.example.kotlinsample.base.data_source

import android.database.Observable
import com.example.kotlinsample.dto.Post
import retrofit2.http.GET
import java.util.*


/**
 * Created by Annarapu Santhosh Reddy on 24/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
interface RestService {
    @GET
fun getPosts(): Observable<List<Post>>
}