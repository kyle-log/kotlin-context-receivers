package com.cocomo.web

import com.cocomo.library.logger.LoggerContext
import com.cocomo.library.sentry.SentryContext

context(LoggerContext, SentryContext)
fun logError(exception: Exception) {
    logger.error(exception)
    sentry.send(exception)
}