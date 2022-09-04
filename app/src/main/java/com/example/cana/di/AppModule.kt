package com.example.cana.di

import android.app.Application
import androidx.room.Room
import com.example.cana.feature_note.data.NoteRepositoryImp
import com.example.cana.feature_note.data.local.NoteDatabase
import com.example.cana.feature_note.domain.repository.NoteRepository
import com.example.cana.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.Database_Name
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(dp: NoteDatabase): NoteRepository{
        return NoteRepositoryImp(dp.notDao)
    }


    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCase {
        return NoteUseCase(
            getNote = GetNote(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNotes = GetNotes(repository)
        )
    }
}