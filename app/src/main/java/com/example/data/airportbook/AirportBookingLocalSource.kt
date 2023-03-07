package com.example.data.airportbook

import com.example.domain.model.AirportBooking
import com.example.domain.datasource.aiportbook.AirportBookingDataSource
import com.example.domain.datasource.airport.AirportDataSource
import java.time.LocalDateTime
import java.time.Month


class AirportBookingLocalSource(
    private val airportDataSource: AirportDataSource
) : AirportBookingDataSource {
    override fun getAirBookinPairs(): List<Pair<AirportBooking, AirportBooking>> = listOf(
        Pair(
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10, 13, 0, 0
                )
            ),
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10, 17, 30, 0
                )
            )
        ),
        Pair(
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 12, 14, 0, 0
                )
            ),
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 12, 17, 0, 0
                )
            )
        ),
        Pair(
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.FEBRUARY, 20, 11, 40, 0
                )
            ),
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.FEBRUARY, 20, 14, 20, 0
                )
            )
        ),
        Pair(
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.MARCH, 15, 15, 30, 0
                )
            ),
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.MARCH, 15, 18, 0, 0
                )
            )
        ),
        Pair(
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.MARCH, 22, 16, 0, 0
                )
            ),
            AirportBooking(
                airport = airportDataSource.getAirports().random(),
                dateTime = LocalDateTime.of(
                    2023, Month.MARCH, 22, 18, 0, 0
                )
            )
        )

    )
}