package com.example.mmvmarquiteturaandroid.repositories

import com.example.mmvmarquiteturaandroid.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllLives() = retrofitService.getAllLives()

}