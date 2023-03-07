package com.example.domain.model.baggage.pack.regular

import com.example.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularClassic(
    price: BigDecimal
) : Regular(price) {
    override val name: String = "RegularClassic"
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
    }