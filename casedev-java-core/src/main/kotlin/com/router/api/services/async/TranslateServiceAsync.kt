// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async

import com.router.api.core.ClientOptions
import com.router.api.services.async.translate.V1ServiceAsync
import java.util.function.Consumer

interface TranslateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranslateServiceAsync

    fun v1(): V1ServiceAsync

    /**
     * A view of [TranslateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranslateServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
