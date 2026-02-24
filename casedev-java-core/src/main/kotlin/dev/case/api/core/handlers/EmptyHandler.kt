@file:JvmName("EmptyHandler")

package dev.case.api.core.handlers

import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
