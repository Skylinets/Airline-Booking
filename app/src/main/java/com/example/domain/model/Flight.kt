package com.example.domain.model


import java.math.BigDecimal
import java.time.Duration


data class Flight(
    val number: String,
    val airCraft: AirCraft,
    val price: BigDecimal,
    val departureArrivalBooking: Pair<AirportBooking, AirportBooking>,
    val duration: Duration = Duration.between(
        departureArrivalBooking.second.dateTime,
        departureArrivalBooking.first.dateTime
    )

) {

   /* override fun format(t: Flight): String {
        val departure = departureArrivarBooking.first
        val arrival = departureArrivarBooking.second
        return """
            Number : $number
            Origin : ${departure.airport.name}
            Origin DateTime : ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival : ${departure.airport.name}
            Arrival DateTime : ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration : $duration
            Price : $${price}
            
        """.trimIndent()*/
    }


   /* override fun format(): String {
     val departure = departureArrivarBooking.first
     val arrival = departureArrivarBooking.second
        return """
            Number : $number
            Origin : ${departure.airport.name}
            Origin DateTime : ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival : ${departure.airport.name}
            Arrival DateTime : ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration : $duration
            Price : $${price}
            
        """.trimIndent()
    }*/


