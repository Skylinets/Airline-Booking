package com.example.presentation.flight

import com.example.domain.model.Flight
import com.example.domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightHTMLFortmat : Formatter<Flight> {
    override fun format(flight: Flight): String {

        val departure = flight.departureArrivarBooking.first
        val arrival = flight.departureArrivarBooking.second

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