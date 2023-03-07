package com.example.presentation.flight.formats

import com.example.domain.model.Flight
import com.example.domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightConsoleFormat : Formatter<Flight> {
    override fun format(t: Flight): String {
        val departure = t.departureArrivarBooking.first
        val arrival = t.departureArrivarBooking.second
        return """
            Number : ${t.number}
            Origin : ${departure.airport.name}
            Origin DateTime : ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival : ${departure.airport.name}
            Arrival DateTime : ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration : ${t.duration}
            Price : $${t.price}
            """.trimIndent()
    }

}