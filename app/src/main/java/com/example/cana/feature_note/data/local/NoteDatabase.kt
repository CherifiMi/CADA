package com.example.cana.feature_note.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cana.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val notDao: NoteDao
    companion object{
        const val Database_Name = "note_db"
    }
}