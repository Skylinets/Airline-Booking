package com.example.domain.model

import com.example.domain.model.baggage.pack.regular.RegularBasic
import com.example.domain.model.seat.Seat
import com.example.domain.presentation.Formatter
import java.math.BigDecimal

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: RegularBasic,
    val seat: Seat,
    val totalPrice: BigDecimal = flight.price + baggagePackage.price + seat.price
) {



}
