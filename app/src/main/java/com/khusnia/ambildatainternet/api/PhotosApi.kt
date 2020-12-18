package com.khusnia.ambildatainternet.api

import com.khusnia.ambildatainternet.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}