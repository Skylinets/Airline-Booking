package com.example.domain.model.baggage.pack.vclub

import com.example.domain.model.baggage.pack.BaggagePackage
import com.example.domain.model.baggage.pack.BoardingTurn
import com.example.domain.model.baggage.type.BaggageType
import com.example.domain.model.baggage.type.BoxPacked
import java.math.BigDecimal

const val DISCOUNT = 30
abstract class VClub(
    price: BigDecimal
) : BaggagePackage() {

    override var price: BigDecimal = price
        get() {
            return (field * BigDecimal(DISCOUNT)) / BigDecimal(100)
        }

    abstract override val name: String
    abstract override val boardingTurn: BoardingTurn

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(
            BoxPacked()
        )

}