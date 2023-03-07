package com.example.domain.model

data class Reservation(
    val code: String,
    val departureTicket: List<Ticket>,
    val returnTicket: List<Ticket>
)
