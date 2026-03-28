// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.matters.V1ServiceAsync
import java.util.function.Consumer

interface MatterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun v1(): V1ServiceAsync

    /**
     * A view of [MatterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatterServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
