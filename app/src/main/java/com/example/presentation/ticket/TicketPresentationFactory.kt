package com.example.presentation.ticket

import com.example.domain.model.Ticket
import com.example.domain.presentation.Formatter
import com.example.presentation.PresentationFactory
import com.example.presentation.PresentationFormat
import com.example.presentation.ticket.formats.TicketConsoleFormat

class TicketPresentationFactory : PresentationFactory<Ticket> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Ticket> {
        return TicketConsoleFormat()
    }
}