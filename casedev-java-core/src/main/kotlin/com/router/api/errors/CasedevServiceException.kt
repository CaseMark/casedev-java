// File generated from our OpenAPI spec by Stainless.

package com.router.api.errors

import com.router.api.core.JsonValue
import com.router.api.core.http.Headers

abstract class CasedevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CasedevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
