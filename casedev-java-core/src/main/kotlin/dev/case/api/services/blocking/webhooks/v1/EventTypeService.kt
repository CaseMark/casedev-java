// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.webhooks.v1.eventtypes.EventTypeListParams
import java.util.function.Consumer

/** Webhook endpoint management */
interface EventTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventTypeService

    /**
     * Returns the catalog of event types that can be subscribed to via webhook endpoints. Each
     * entry lists the required service scope the API key must carry to subscribe, plus the
     * stability level.
     */
    fun list() = list(EventTypeListParams.none())

    /** @see list */
    fun list(
        params: EventTypeListParams = EventTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: EventTypeListParams = EventTypeListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(EventTypeListParams.none(), requestOptions)

    /** A view of [EventTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/event_types`, but is otherwise the same
         * as [EventTypeService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(EventTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventTypeListParams = EventTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: EventTypeListParams = EventTypeListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(EventTypeListParams.none(), requestOptions)
    }
}
