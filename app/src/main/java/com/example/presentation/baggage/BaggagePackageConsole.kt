package com.example.presentation.baggage

import com.example.domain.model.baggage.pack.BaggagePackage
import com.example.domain.model.baggage.type.BaggageType
import com.example.domain.presentation.utils.Formatter


// 4. Mostrar
class BaggagePackageConsole(
    private val baggageType: Formatter<BaggageType>
) : Formatter<BaggagePackage> {
    override fun format(t: BaggagePackage): String {
        return """
${t.name}
${baggageType.format(t.baggageTypes).trim()}
Boarding Turn: ${t.boardingTurn.name}
Price: $${t.price}
        """.trimIndent()
    }
}