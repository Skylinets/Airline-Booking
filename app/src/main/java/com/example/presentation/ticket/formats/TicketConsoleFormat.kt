package com.example.presentation.ticket.formats

import com.example.domain.model.Ticket
import com.example.domain.presentation.Formatter

class TicketConsoleFormat : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            Passenger : ${t.passenger.name}
            Flight Number : ${t.flight.number}
            Departure : ${t.flight.departureArrivarBooking.first.airport.name}
            Arrival : ${t.flight.departureArrivarBooking.second.airport.name}
            Flight Price : $${t.flight.price}
            BaggagePlan : $//{baggage.format()}
            Seat : ${t.seat.number}
            Total: $${t.totalPrice}
            
        """.trimIndent()
    }
}