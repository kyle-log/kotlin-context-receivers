package com.cocomo.library.logger

interface LoggerContext {
    val logger: Logger
}

class StandardLoggerContext(
    override val logger: Logger
) : LoggerContext

