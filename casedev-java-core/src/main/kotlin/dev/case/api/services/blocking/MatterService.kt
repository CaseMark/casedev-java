// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.matters.V1Service
import java.util.function.Consumer

interface MatterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterService

    /** Matter-native legal workspaces and orchestration primitives */
    fun v1(): V1Service

    /** A view of [MatterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun v1(): V1Service.WithRawResponse
    }
}
