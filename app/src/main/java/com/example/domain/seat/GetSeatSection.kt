package com.example.domain.seat

import com.example.domain.model.seat.SeatSection
import com.example.domain.usercase.flight.GetFlightSaved

/*
Mostrar asientos disponibles

*/

class GetSeatSection(

    private val getFlightSaved: GetFlightSaved
) {

    operator fun invoke(): Map<Int, SeatSection> {
        val flight = getFlightSaved()
        return flight
            .airCraf
            .seatSection
            .mapIndexed { index, seatSection ->
                index + 1 to seatSection
            }.toMap()
    }
}