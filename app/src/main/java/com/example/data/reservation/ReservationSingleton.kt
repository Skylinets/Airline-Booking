package com.example.data.reservation

import com.example.domain.datasource.ReservationDataSource
import com.example.domain.model.Reservation


class ReservationSingleton : ReservationDataSource {

    companion object {
        private val reservation = Reservation()
    }
   override val reservation: Reservation = ReservationSingleton.reservation
}

