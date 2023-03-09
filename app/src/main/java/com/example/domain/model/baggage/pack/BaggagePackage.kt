package com.example.domain.model.baggage.pack

import com.example.domain.model.baggage.type.BaggageType
import com.example.domain.model.baggage.type.Hand
import com.example.domain.model.baggage.type.BigHand
import com.example.domain.model.baggage.type.Checked
import java.math.BigDecimal

abstract class BaggagePackage {

    abstract val name: String
    abstract val price: BigDecimal
    abstract val boardingTurn: BoardingTurn

    open val baggageTypes: List<BaggageType> = listOf(
        Hand(),
        BigHand(),
        Checked()
    )
}