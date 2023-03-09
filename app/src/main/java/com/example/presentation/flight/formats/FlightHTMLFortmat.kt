package com.example.presentation.flight.formats

import com.example.domain.model.Flight
import com.example.domain.presentation.utils.Formatter
import java.time.format.DateTimeFormatter

class FlightHTMLFortmat : Formatter<Flight> {
    override fun format(flight: Flight): String {

        val departure = flight.departureArrivalBooking.first
        val arrival = flight.departureArrivalBooking.second

        return """
                <p><strong>${flight.number}</strong><br/>
            Origin: ${departure.airport.name} <br/> 
            Destination: ${arrival.airport.name}<br/>
            Departure: ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)}
            Arrival Date : ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)}
            Duration: ${flight.duration} <br/>
            <strong>Price : ${'$'}${flight.price}</strong>
                    </p>
            """.trimIndent()


    }
}