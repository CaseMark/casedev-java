@file:JvmName("EmptyHandler")

package dev.case.core.handlers

import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
