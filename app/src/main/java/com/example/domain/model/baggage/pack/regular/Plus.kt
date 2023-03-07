package com.example.domain.model.baggage.pack.regular

import com.example.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(
    price: BigDecimal
) : Regular(price) {
    override val name: String = "RegularPlus"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}