package com.traductor.modismos.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity(tableName = "modismos")
@Serializable
data class Modismo(
    @PrimaryKey
    val modismo: String,
    val definicion: String,
    val ejemplo: String,
    val traduccion: String,
    val audioUrl: String? = null,
    val isFavorite: Boolean = false
)

data class ModismoSearchResult(
    val modismos: List<Modismo>,
    val totalCount: Int
)
