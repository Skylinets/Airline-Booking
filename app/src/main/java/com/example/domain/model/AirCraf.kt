package com.example.domain.model

import com.example.domain.model.seat.SeatSection

data class AirCraf(
    val name: String,
    val model: String,
    val airline: Airline = Airline("VL", "Volarios"),
    //val seatSection: Map<Int, SeatSection>
)
