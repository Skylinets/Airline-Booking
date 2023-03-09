package com.example.domain.usercase.ticket

import com.example.domain.datasource.ticket.TicketDataSource
import com.example.domain.model.Flight
import com.example.domain.model.Ticket

/*
2. Seleccionar un vuelo disponible
*/
class AssignFlightToTicket(
    private val ticketDaraSource: TicketDataSource
) {
    operator fun invoke(flight: Flight?) : Ticket? {
        return flight?.let {
            ticketDaraSource.tickets.first().apply {
                this.flight = flight
            }
        }

    }
}