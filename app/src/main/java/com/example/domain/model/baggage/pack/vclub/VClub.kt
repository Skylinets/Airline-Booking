package com.example.domain.model.baggage.pack.vclub

import com.example.domain.model.baggage.pack.BaggagePackage
import com.example.domain.model.baggage.pack.BoardingTurn
import com.example.domain.model.baggage.type.BaggageType
import com.example.domain.model.baggage.type.BoxPacked
import java.math.BigDecimal

const val DISCOUNT = 30

abstract class VClub(
    final override var price: BigDecimal

) : BaggagePackage() {


    init {
        price = (price * BigDecimal(DISCOUNT)) / BigDecimal(100)
    }

    abstract override val name: String
    abstract override val boardingTurn: BoardingTurn

    override val baggageType: List<BaggageType>
        get() = super.baggageType + listOf(
            BoxPacked()
        )

}