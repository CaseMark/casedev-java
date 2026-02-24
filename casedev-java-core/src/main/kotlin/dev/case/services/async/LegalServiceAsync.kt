// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

import dev.case.core.ClientOptions
import dev.case.services.async.legal.V1ServiceAsync
import java.util.function.Consumer

interface LegalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalServiceAsync

    fun v1(): V1ServiceAsync

    /** A view of [LegalServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
