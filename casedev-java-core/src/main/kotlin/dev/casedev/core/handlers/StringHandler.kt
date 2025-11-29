@file:JvmName("StringHandler")

package dev.casedev.core.handlers

import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
