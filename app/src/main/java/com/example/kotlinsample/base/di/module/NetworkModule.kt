package com.example.kotlinsample.base.di.module

import com.example.kotlinsample.BuildConfig
import com.example.kotlinsample.base.data_source.RestService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Created by Annarapu Santhosh Reddy on 23/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
@Module
object NetworkModule {

    @Provides
    internal fun restService(retrofit: Retrofit): RestService {
        return retrofit.create(RestService::class.java)
    }

    @Provides
    internal fun retrofit(
        gsonConverterFactory: GsonConverterFactory,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build();
    }

    @Provides
    internal fun gsonConverterFactory(gson: Gson): GsonConverterFactory {
        return GsonConverterFactory.create(gson)
    }

    @Provides
    fun gson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    fun okHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
            .connectTimeout(100, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.MINUTES)
            .readTimeout(100000, TimeUnit.SECONDS).build();
    }

    @Provides
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }
}