package com.cocomo.web

import com.cocomo.library.contextreceivers.with
import com.cocomo.library.logger.LoggerContext
import com.cocomo.library.sentry.SentryContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/games")
class GameController(
    val loggerCtx: LoggerContext,
    val sentryCtx: SentryContext,
) {

    @GetMapping("{id}")
    fun find(
        @PathVariable id: Long
    ): String = with(loggerCtx, sentryCtx) {
        try {
            return findGame(id)
        } catch (e: Exception) {
            logError(e)
            throw e
        }
    }

    private fun findGame(id: Long): String {
        return when (id) {
            1L -> "LOL"
            2L -> "Battle ground"
            else -> throw RuntimeException("No game found")
        }
    }
}