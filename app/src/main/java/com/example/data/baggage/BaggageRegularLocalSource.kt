package com.example.data.baggage

import com.example.domain.model.baggage.pack.BaggagePackage
import com.example.domain.model.baggage.pack.regular.RegularBasic
import com.example.domain.model.baggage.pack.regular.RegularClassic
import com.example.domain.model.baggage.pack.regular.RegularPlus

class BaggageRegularLocalSource : BaggagePackageLocalSource() {
    override fun getBaggagePacks(): Map<Int, BaggagePackage> {
        return mapOf(
            1 to RegularBasic(price),
            2 to RegularClassic(price),
            3 to RegularPlus(price)
        )
    }
}