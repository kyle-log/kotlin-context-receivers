package com.cocomo.library.sentry

interface SentryContext {
    val sentry: Sentry
}

class StandardSentryContext(
    override val sentry: Sentry
) : SentryContext