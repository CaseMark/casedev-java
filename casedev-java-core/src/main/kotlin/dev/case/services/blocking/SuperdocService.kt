// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.core.ClientOptions
import dev.case.services.blocking.superdoc.V1Service
import java.util.function.Consumer

interface SuperdocService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuperdocService

    fun v1(): V1Service

    /** A view of [SuperdocService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuperdocService.WithRawResponse

        fun v1(): V1Service.WithRawResponse
    }
}
