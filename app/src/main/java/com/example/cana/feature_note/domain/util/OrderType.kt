package com.example.cana.feature_note.domain.util

sealed class OrderType{
    object Asc: OrderType()
    object Des: OrderType()
}
