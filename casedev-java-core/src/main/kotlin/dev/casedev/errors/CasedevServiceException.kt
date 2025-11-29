// File generated from our OpenAPI spec by Stainless.

package dev.casedev.errors

import dev.casedev.core.JsonValue
import dev.casedev.core.http.Headers

abstract class CasedevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CasedevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
