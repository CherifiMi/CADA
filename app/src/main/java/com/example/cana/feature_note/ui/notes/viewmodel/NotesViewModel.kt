package com.example.cana.feature_note.ui.notes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cana.feature_note.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
) : ViewModel() {

}