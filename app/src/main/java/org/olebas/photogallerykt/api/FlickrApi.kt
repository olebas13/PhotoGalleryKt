package org.olebas.photogallerykt.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
                "&api_key=2a827460aac32c12b8d57d704877aa18" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s")
    fun fetchContents(): Call<FlickrResponse>

}