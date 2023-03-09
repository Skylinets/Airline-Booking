package com.example.domain.model

import com.example.domain.model.baggage.pack.BaggagePackage
import com.example.domain.model.baggage.pack.regular.RegularBasic
import com.example.domain.model.seat.Seat
import java.math.BigDecimal

class Ticket {
    lateinit var flight: Flight
    lateinit var passenger: Passenger
    lateinit var baggagePackage: BaggagePackage
    lateinit var seat: Seat
    val totalPrice: BigDecimal // = flight.price + baggagePackage.price + seat.price
        get() {
            return if (this::flight.isInitialized && this::baggagePackage.isInitialized && this::seat.isInitialized)
            flight.price + baggagePackage.price + seat.price
            else BigDecimal(0)
        }


}
