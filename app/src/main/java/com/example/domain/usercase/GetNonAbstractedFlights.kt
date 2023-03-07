package com.example.domain.usercase

import com.example.domain.model.AirCraft
import com.example.domain.model.Airport
import com.example.domain.model.AirportBooking
import com.example.domain.model.Flight
import com.example.presentation.PresentationFormat
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter

class GetNonAbstractedFlights {
    val format: PresentationFormat = TODO()

    //invoke :  que hace una sola cosa
    fun invoke(): String {
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320"),
            price = BigDecimal(100.0),
            departureArrivarBooking = getAirportPair()
        )

       return when (format) {
            PresentationFormat.CONSOLE -> {
                val departure = flight.departureArrivarBooking.first
                val arrival = flight.departureArrivarBooking.second
                """
            Number : ${flight.number}
            Origin : ${departure.airport.name}
            Origin DateTime : ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival : ${departure.airport.name}
            Arrival DateTime : ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration : ${flight.duration}
            Price : $${flight.price}
            """.trimIndent()
            }
            PresentationFormat.HTML -> {
                val departure = flight.departureArrivarBooking.first
                val arrival = flight.departureArrivarBooking.second
                """
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

            PresentationFormat.JSON ->{
                """
                    flight : {
                    Number :
                    
                    }
                    
                """.trimIndent()
            }
        }


    }
}
private fun getAirportPair(): Pair<AirportBooking, AirportBooking> {
    return Pair(
        AirportBooking(
            airport = Airport("B06", "Bogotá"),
            dateTime = LocalDateTime.of(
                2023, Month.JANUARY, 18, 13, 0, 0
            )
        ),
        AirportBooking(
            airport = Airport("CUN", "Cancun"),
            dateTime = LocalDateTime.of(
                2023, Month.JANUARY, 16, 17, 30, 0
            )
        )
    )
}