package com.example.domain.model

import java.time.LocalDateTime
import java.time.LocalTime

data class AirportBooking(
    val airport: Airport,
    val dateTime: LocalDateTime
)
