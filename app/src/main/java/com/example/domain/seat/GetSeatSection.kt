package com.example.domain.seat

import com.example.domain.model.seat.SeatSection
import com.example.domain.usercase.flight.GetFlightSaved

/**
 * 5.1 Mostrar los asientos disponibles
 */
class GetSeatsSection(
    private val getFlightSaved: GetFlightSaved
) {
    operator fun invoke(): Map<Int, SeatSection> {
        val flight = getFlightSaved()
        return flight
            ?.airCraft
            ?.seatSections
            ?.mapIndexed { index, seatSection ->
                index + 1 to seatSection
            }?.toMap() ?: mapOf()
    }
}