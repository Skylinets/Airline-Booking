package com.example.domain.datasource.aircraft

import com.example.domain.model.AirCraft
import com.example.domain.model.seat.SeatSection

interface AirCraftDataSource {
    fun getAirCrafts(): List<AirCraft>
    fun AirCraft(name: String, model: String, airline: List<SeatSection>): AirCraft
}