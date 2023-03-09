package com.example.domain.usercase.reservation

import com.example.domain.datasource.ReservationDataSource
import com.example.domain.model.Reservation
import com.example.domain.model.Ticket


private const val CODE_SIZE = 5

class AssignTicketToReservation(
    private val reservationDataSource: ReservationDataSource
) {
    operator fun invoke(tickets: List<Ticket>): Reservation {
        return reservationDataSource.reservation.apply {
            this.code = generateCode()
            this.departureTicket = tickets
            this.returnTicket = tickets
        }
    }

    private fun generateCode(): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..CODE_SIZE)
            .map {
            allowedChars.random()
        }.joinToString("")
    }
}