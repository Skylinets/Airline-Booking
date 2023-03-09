package com.example.presentation.flight

import com.example.domain.model.Flight
import com.example.domain.presentation.utils.Formatter
import com.example.presentation.PresentationFactory
import com.example.presentation.PresentationFormat
import com.example.presentation.flight.formats.FlightConsoleFormat
import com.example.presentation.flight.formats.FlightHTMLFortmat

class FlightPresentationFactory : PresentationFactory<Flight> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Flight> {
        return when (format) {
            PresentationFormat.CONSOLE -> FlightConsoleFormat()
            PresentationFormat.HTML -> FlightHTMLFortmat()
            else -> FlightConsoleFormat()
        }


    }
}


/*fun getPresentationFormat(format: PresentationFormat): Formatter<Flight> {
    return when(format) {
        PresentationFormat.CONSOLE -> FlightConsoleFormat()
        PresentationFormat.HTML -> FlightHTMLFortmat()
        else -> FlightConsoleFormat()
}*/
