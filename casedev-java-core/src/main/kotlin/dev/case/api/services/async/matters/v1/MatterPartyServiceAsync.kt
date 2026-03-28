// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.matterparties.MatterPartyCreateParams
import dev.case.api.models.matters.v1.matterparties.MatterPartyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface MatterPartyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterPartyServiceAsync

    /** Attach a reusable party to a matter with a matter-specific role. */
    fun create(id: String, params: MatterPartyCreateParams): CompletableFuture<Void?> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: MatterPartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: MatterPartyCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MatterPartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List parties attached to a matter. */
    fun list(id: String): CompletableFuture<Void?> = list(id, MatterPartyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: MatterPartyListParams = MatterPartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: MatterPartyListParams = MatterPartyListParams.none(),
    ): CompletableFuture<Void?> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MatterPartyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: MatterPartyListParams): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(id, MatterPartyListParams.none(), requestOptions)

    /**
     * A view of [MatterPartyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatterPartyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/parties`, but is otherwise the
         * same as [MatterPartyServiceAsync.create].
         */
        fun create(id: String, params: MatterPartyCreateParams): CompletableFuture<HttpResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: MatterPartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: MatterPartyCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MatterPartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/parties`, but is otherwise the same
         * as [MatterPartyServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponse> =
            list(id, MatterPartyListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: MatterPartyListParams = MatterPartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: MatterPartyListParams = MatterPartyListParams.none(),
        ): CompletableFuture<HttpResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MatterPartyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: MatterPartyListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(id, MatterPartyListParams.none(), requestOptions)
    }
}
