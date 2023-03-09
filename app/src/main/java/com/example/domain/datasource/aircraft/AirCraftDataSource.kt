package com.example.domain.datasource.aircraft

import com.example.domain.model.AirCraft
import com.example.domain.model.seat.SeatSection

interface AirCraftDataSource {
    fun getAirCrafts(): List<AirCraft>
//    abstract fun AirCraft(name: String, model: String, airline: List<SeatSection>): AirCraft
//    fun AirCraft(name: String, model: String, airline: List<SeatSection>): AirCraft
}