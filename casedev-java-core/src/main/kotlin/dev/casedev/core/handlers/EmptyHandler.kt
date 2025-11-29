@file:JvmName("EmptyHandler")

package dev.casedev.core.handlers

import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
