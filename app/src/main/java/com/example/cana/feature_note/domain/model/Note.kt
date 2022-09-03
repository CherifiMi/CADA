package com.example.cana.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cana.theme.*

@Entity
class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)