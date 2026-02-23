@file:JvmName("EmptyHandler")

package com.router.api.core.handlers

import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
