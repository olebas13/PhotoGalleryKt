package org.olebas.photogallerykt.api

import com.google.gson.annotations.SerializedName
import org.olebas.photogallerykt.GalleryItem

class PhotoResponse {

    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>

}