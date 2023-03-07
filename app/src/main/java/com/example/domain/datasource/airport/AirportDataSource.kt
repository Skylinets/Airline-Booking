package com.example.domain.datasource.airport

import com.example.domain.model.Airport

interface AirportDataSource {
    fun getAirports(): List<Airport>
}