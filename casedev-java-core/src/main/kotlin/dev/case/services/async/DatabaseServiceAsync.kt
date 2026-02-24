// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

import dev.case.core.ClientOptions
import dev.case.services.async.database.V1ServiceAsync
import java.util.function.Consumer

interface DatabaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseServiceAsync

    fun v1(): V1ServiceAsync

    /**
     * A view of [DatabaseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatabaseServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
