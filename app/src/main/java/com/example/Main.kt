package com.example

import com.example.data.aircraft.AirCraftLocalSource
import com.example.data.airport.AirportLocalSource
import com.example.data.airportbook.AirportBookingLocalSource
import com.example.data.baggage.BaggageRegularLocalSource
import com.example.data.baggage.BaggageVClubLocalSource
import com.example.data.flight.FlightLocalSource
import com.example.data.ticket.TicketListSingleton
import com.example.domain.usercase.baggage.GetBaggagePackage
import com.example.domain.usercase.flight.GetFlights
import com.example.domain.usercase.ticket.AssignFlightToTicket
import com.example.presentation.baggage.BaggagePackageConsole
import com.example.presentation.baggage.types.BaggageTypesConsole
import com.example.presentation.flight.formats.FlightConsoleFormat
import java.time.Month

fun main() {

    val aiportDataSource = AirportLocalSource()
    val airportBookingLocalSource = AirportBookingLocalSource(aiportDataSource)
    val airCraftLocalSource = AirCraftLocalSource()

    val flightLocal = FlightLocalSource(airCraftLocalSource, airportBookingLocalSource)
    val getFlights = GetFlights(flightLocal).invoke(Month.JANUARY)
    getFlights.forEach { (t, u) ->
        println("t : $t")
        println("u " + FlightConsoleFormat().format(u))
    }
    println()
    println("*** Flight Selected ***")
    val ticketSingleton = TicketListSingleton()
    val flight = getFlights[1]
    AssignFlightToTicket(ticketSingleton).invoke(flight)
    val flightSelected = ticketSingleton.tickets.first().flight
    println(
        FlightConsoleFormat().format(flightSelected)
    )
}


/* val vClubLocalSource = BaggageVClubLocalSource()
    val getVClubPackage = GetBaggagePackage(vClubLocalSource).invoke()


    println(" *** VClub ****")
    getVClubPackage.forEach { (t, u) ->
        println("$t. ")
        println(
            BaggagePackageConsole(
            BaggageTypesConsole()
            ).format(u)
        )
    }
    println()
    val regularLocalSource = BaggageRegularLocalSource()
    val getRegularPackages = GetBaggagePackage(regularLocalSource).invoke()

    println(" *** Regular BAgagge's ****")
    getRegularPackages.forEach { (t, u) ->
        println("$t. ")
        println(
            BaggagePackageConsole(
                BaggageTypesConsole()
            ).format(u)
        )
    }*/


//*******************


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


