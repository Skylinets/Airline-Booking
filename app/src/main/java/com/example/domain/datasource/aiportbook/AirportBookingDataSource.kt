package com.example.domain.datasource.aiportbook

import com.example.domain.model.AirportBooking

interface AirportBookingDataSource {
    fun getAirBookingPairs(): List<Pair<AirportBooking, AirportBooking>>
}