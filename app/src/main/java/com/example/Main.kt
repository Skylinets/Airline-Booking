package com.example

import com.example.domain.model.*
import com.example.domain.model.baggage.pack.regular.RegularBasic
import com.example.domain.model.seat.Seat
import com.example.domain.model.seat.SeatClass
import com.example.domain.model.seat.SeatStatus
import com.example.domain.usercase.GetFlights
import com.example.presentation.flight.FlightConsoleFormat
import com.example.presentation.flight.FlightHTMLFortmat
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

fun main() {

    val getFlights = GetFlights(FlightHTMLFortmat())
    val flightFormat = getFlights.invoke()
    println(flightFormat)

}



    /*  val basicPrice = BigDecimal(200)
      val classicPrice = BigDecimal(400)

      val clubBasicClub: VClub = ClubBasic(basicPrice)
      val clubClassicClub : VClub = ClubClassic(classicPrice)

      println(clubBasicClub.name)
      println(clubBasicClub.price)

      println(clubClassicClub.name)
      println(clubClassicClub.price)

      val basic: Regular = RegularBasic(basicPrice)
      val classic: Regular = RegularClassic(classicPrice)


      println(basic.name)
      println(basic.price)

      println(classic.name)
      println(classic.price)

      val plus: BaggagePackage = Plus(BigDecimal(500))
      println(plus.price)*/


