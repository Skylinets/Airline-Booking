package com.example.data.airport

import com.example.domain.datasource.airport.AirportDataSource
import com.example.domain.model.Airport

class AirportLocalSource : AirportDataSource {
    override fun getAirports(): List<Airport> = listOf(
        Airport("QMX", "Mexico City"),
        Airport("CL", "Santiago"),
        Airport("ARG", "Buenos Aires"),
        Airport("CUN", "Cancún"),

    )
}