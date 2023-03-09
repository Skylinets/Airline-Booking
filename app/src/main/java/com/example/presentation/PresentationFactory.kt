package com.example.presentation

import com.example.domain.presentation.utils.Formatter

interface PresentationFactory<T> {
    fun getPresentationFormat(format: PresentationFormat) : Formatter<T>
}