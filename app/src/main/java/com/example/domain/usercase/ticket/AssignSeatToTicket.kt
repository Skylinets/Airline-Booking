package com.example.domain.usercase.ticket

import com.example.domain.datasource.ticket.TicketDataSource
import com.example.domain.model.Ticket
import com.example.domain.model.seat.Seat

/*
seleccionar un asiento


*/
class AssignSeatToTicket(
    private val ticketDataSource: TicketDataSource
) {
    operator fun invoke(seat: Seat?): Ticket? {
        return seat?.let {
            ticketDataSource.tickets.first().apply {
                this.seat = it
            }
        }

    }
}