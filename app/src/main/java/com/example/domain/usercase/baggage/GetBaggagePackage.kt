package com.example.domain.usercase.baggage

import com.example.domain.datasource.baggage.BaggagePackageDataSource
import com.example.domain.model.baggage.pack.BaggagePackage

/*
Mostrar los tipos de equipajes disponibles

*/

class GetBaggagePackage(
    private val baggagePackageDataSource: BaggagePackageDataSource
) {

    operator fun invoke(): Map<Int, BaggagePackage> {
        return baggagePackageDataSource.getBaggagePacks()
    }
}