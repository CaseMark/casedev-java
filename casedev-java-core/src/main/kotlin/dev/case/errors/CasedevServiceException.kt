// File generated from our OpenAPI spec by Stainless.

package dev.case.errors

import dev.case.core.JsonValue
import dev.case.core.http.Headers

abstract class CasedevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CasedevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
