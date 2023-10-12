package com.example.horoscapp.domain.repository

import com.example.horoscapp.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign: String): PredictionModel?
}