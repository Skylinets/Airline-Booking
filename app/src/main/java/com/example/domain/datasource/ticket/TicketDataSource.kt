package com.example.domain.datasource.ticket

import com.example.domain.model.Ticket

interface TicketDataSource {
    val tickets : List<Ticket>
}