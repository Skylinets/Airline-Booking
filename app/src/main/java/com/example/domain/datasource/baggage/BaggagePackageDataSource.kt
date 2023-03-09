package com.example.domain.datasource.baggage

import com.example.domain.model.baggage.pack.BaggagePackage

interface BaggagePackageDataSource {
    fun getBaggagePacks(): Map<Int, BaggagePackage>
}