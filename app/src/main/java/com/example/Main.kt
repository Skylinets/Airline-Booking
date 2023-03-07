package com.example

import com.example.domain.model.*
import com.example.domain.presentation.Formatter
import com.example.domain.usercase.flight.GetFlights
import com.example.presentation.PresentationFormat
import com.example.presentation.flight.FlightPresentationFactory

fun main() {
/*
    val format = PresentationFormat.HTML
    val flightFormat: Formatter<Flight> = FlightPresentationFactory().getPresentationFormat(format)
    //val flights = GetFlights(flightFormat).invoke()
    println(flights)*/


//    val getFlights = GetFlights(flightFormat1)
//    val flightFormat = getFlights.invoke()
//    println(flightFormat)


/*val format = "HTML"
    val flightFormat1 : Formatter<Flight> = when (format) {
        "HTML" -> {
            FlightHTMLFortmat()
        }
        "Console" -> {
            FlightConsoleFormat()
        }
        else -> {
            FlightConsoleFormat()
        }
    }*/
   /* val getFlights = GetFlights(FlightHTMLFortmat())
    val flightFormat = getFlights.invoke()
    println(flightFormat)

    val getFlights1 = GetFlights(FlightConsoleFormat())
    val flightFormat2 = getFlights1.invoke()
    println(flightFormat2)*/

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


