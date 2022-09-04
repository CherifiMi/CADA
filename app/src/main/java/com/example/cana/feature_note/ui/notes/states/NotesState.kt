package com.example.cana.feature_note.ui.notes.states

import com.example.cana.feature_note.domain.model.Note
import com.example.cana.feature_note.domain.util.NoteOrder
import com.example.cana.feature_note.domain.util.OrderType

sealed class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Des),
    val isOrderSectionVisible : Boolean = false
)
