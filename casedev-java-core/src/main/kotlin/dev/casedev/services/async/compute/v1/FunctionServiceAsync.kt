// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

interface FunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync

    /**
     * A view of [FunctionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse
    }
}
