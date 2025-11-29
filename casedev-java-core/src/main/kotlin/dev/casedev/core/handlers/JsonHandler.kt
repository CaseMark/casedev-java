@file:JvmName("JsonHandler")

package dev.casedev.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.errors.CasedevInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw CasedevInvalidDataException("Error reading response", e)
            }
    }
