package com.example.data.ticket

import com.example.domain.datasource.ticket.TicketDataSource
import com.example.domain.model.Ticket

class TicketListSingleton : TicketDataSource{

    companion object {
        private val tickets = mutableListOf(
            Ticket()
        )
    }

    override val tickets: List<Ticket> = TicketListSingleton.tickets
}