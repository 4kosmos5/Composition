package com.semyon.composition.domain.repository

import com.semyon.composition.domain.entity.GameSettings
import com.semyon.composition.domain.entity.Level
import com.semyon.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}