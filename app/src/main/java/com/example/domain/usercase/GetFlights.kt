package com.example.domain.usercase

import com.example.domain.model.AirCraf
import com.example.domain.model.Airport
import com.example.domain.model.AirportBooking
import com.example.domain.model.Flight
import com.example.domain.presentation.Formatter

import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetFlights(
    private val formatter: Formatter<Flight>
) {
    fun invoke(): String{
        val flight = Flight(
            number = "Y4 708",
            airCraf = AirCraf("Airbus", "A320"),
            price = BigDecimal(100.0),
            departureArrivarBooking = getAirportPair()
        )
        val flights = listOf(
            flight,
            flight,
            flight
        )
        return formatter.format(flights)
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

}