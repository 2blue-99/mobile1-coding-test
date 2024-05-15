package com.blue.domain.repo

import com.blue.domain.model.PhotoData
import kotlinx.coroutines.flow.Flow


interface PhotoRepo {
    suspend fun getPhotoData(): List<PhotoData>
}