package com.example.domain.usercase.flight

import com.example.domain.datasource.flight.FlightDataSource
import com.example.domain.model.Flight

import java.time.Month

/**
 * 1. Mostrar vuelos disponiubles de un mes
 *
 */

class GetFlights(
    private val flightDataSource: FlightDataSource
) {

    operator fun invoke(month: Month): Map<Int, Flight> {
        return flightDataSource
            .getFlights()
            .filter { flightEntry ->
                flightEntry.value.departureArrivalBooking.first.dateTime.month == month
            }
    }

}


/* fun invoke(month: Month): Map<Int, Flight> {
       val flight = Flight(
           number = "Y4 708",
           airCraft = AirCraft("Airbus", "A320"),
           price = BigDecimal(100.0),
           departureArrivalBooking = getAirportPair()
       )

       val flightsMap = mapOf(
           1 to flight,
           2 to flight,
           3 to flight
       )

       return flightsMap.filter { flightEntry ->
           flightEntry.value.departureArrivalBooking.first.dateTime.month == month

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
   }*/