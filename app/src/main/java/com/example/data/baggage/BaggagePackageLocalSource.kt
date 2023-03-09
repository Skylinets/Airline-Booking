package com.example.data.baggage

import com.example.domain.datasource.baggage.BaggagePackageDataSource
import java.math.BigDecimal

abstract class BaggagePackageLocalSource:  BaggagePackageDataSource {
    val price: BigDecimal = BigDecimal(50)
}