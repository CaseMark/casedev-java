// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.legal.V1Service
import java.util.function.Consumer

interface LegalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalService

    fun v1(): V1Service

    /** A view of [LegalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalService.WithRawResponse

        fun v1(): V1Service.WithRawResponse
    }
}
