package com.example.domain.usercase.baggage

import com.example.domain.model.baggage.pack.BaggagePackage

/*
Mostrar los tipos de equipajes disponibles

*/

class GetBaggagePackage {

    operator fun invoke(): Map<Int, BaggagePackage> {
        return mapOf()
    }
}