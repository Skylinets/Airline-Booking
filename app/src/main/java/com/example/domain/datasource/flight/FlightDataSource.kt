package com.example.domain.datasource.flight

import com.example.domain.model.Flight

interface FlightDataSource {
    fun getFlights(): Map<Int, Flight>
}