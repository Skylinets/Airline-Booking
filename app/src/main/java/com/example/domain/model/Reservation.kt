package com.example.domain.model

import java.math.BigDecimal

class Reservation{
   lateinit var code: String
    var departureTicket: List<Ticket> = mutableListOf()
    var returnTicket: List<Ticket> = mutableListOf()
    val total: BigDecimal
    get() {
       return departureTicket.sumOf {
           it.totalPrice
       }.plus(
           returnTicket.sumOf {
               it.totalPrice
           }
       )
    }
}


