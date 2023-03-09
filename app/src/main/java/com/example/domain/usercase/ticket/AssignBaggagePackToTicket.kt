package com.example.domain.usercase.ticket

import com.example.domain.datasource.ticket.TicketDataSource
import com.example.domain.model.Ticket
import com.example.domain.model.baggage.pack.BaggagePackage

/*
Seleccionar un equipaje


*/

class AssignBaggagePackToTicket(
    private val ticketDataSource: TicketDataSource
) {

    operator fun invoke(baggagePackage: BaggagePackage?): Ticket? {
        return baggagePackage?.let {
            ticketDataSource.tickets.first().apply {
                this.baggagePackage = it
            }

        }

    }
}