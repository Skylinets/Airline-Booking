package com.example.presentation.baggage.types

import com.example.domain.model.baggage.type.BaggageType
import com.example.domain.presentation.utils.Formatter
// 4 Mostrar
class BaggageTypesConsole : Formatter<BaggageType> {
    override fun format(t: BaggageType): String {
        return """
            ${t.emoji} ${t.quantity} ${t.title}
        """.trimIndent()
    }
}