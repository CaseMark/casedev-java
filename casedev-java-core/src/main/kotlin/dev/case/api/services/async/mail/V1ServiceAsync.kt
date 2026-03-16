// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.mail

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.mail.v1.InboxServiceAsync
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun inboxes(): InboxServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun inboxes(): InboxServiceAsync.WithRawResponse
    }
}
