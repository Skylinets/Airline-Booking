package com.example.domain.model.baggage.pack.vclub

import com.example.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubPlus(
    price: BigDecimal
) : VClub(price) {
    override val name: String = "ClubPlus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST

    override var price: BigDecimal = price
        get(){
            return super.price + BigDecimal(20)
        }
}