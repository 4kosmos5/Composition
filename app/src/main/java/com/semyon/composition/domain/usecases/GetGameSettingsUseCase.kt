package com.semyon.composition.domain.usecases

import com.semyon.composition.domain.entity.GameSettings
import com.semyon.composition.domain.entity.Level
import com.semyon.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}