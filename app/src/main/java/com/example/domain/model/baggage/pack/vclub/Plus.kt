package com.example.domain.model.baggage.pack.vclub

import com.example.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(
    price: BigDecimal
) : VClub(price) {
    override val name: String = "ClubPlus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}