package com.example.domain.usercase.ticket

import com.example.domain.datasource.ticket.TicketDataSource
import com.example.domain.model.Passenger
import com.example.domain.model.Ticket
/*

Introducir informacion del pasajero

*/

class AssignPassengerToTicket(
    private val ticketDataSource: TicketDataSource
) {
    operator fun invoke(passenger: Passenger): Ticket {
        return ticketDataSource.tickets.first().apply {
            this.passenger = passenger
        }

    }
}