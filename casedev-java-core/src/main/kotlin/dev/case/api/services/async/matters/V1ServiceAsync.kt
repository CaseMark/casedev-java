// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.V1CreateParams
import dev.case.api.models.matters.v1.V1ListParams
import dev.case.api.models.matters.v1.V1RetrieveParams
import dev.case.api.models.matters.v1.V1UpdateParams
import dev.case.api.services.async.matters.v1.AgentTypeServiceAsync
import dev.case.api.services.async.matters.v1.EventServiceAsync
import dev.case.api.services.async.matters.v1.LogServiceAsync
import dev.case.api.services.async.matters.v1.MatterPartyServiceAsync
import dev.case.api.services.async.matters.v1.PartyServiceAsync
import dev.case.api.services.async.matters.v1.ShareServiceAsync
import dev.case.api.services.async.matters.v1.TypeServiceAsync
import dev.case.api.services.async.matters.v1.WorkItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
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

    /** Matter-native legal workspaces and orchestration primitives */
    fun agentTypes(): AgentTypeServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun parties(): PartyServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun types(): TypeServiceAsync

    fun events(): EventServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun log(): LogServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun matterParties(): MatterPartyServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun shares(): ShareServiceAsync

    /** Matter-native legal workspaces and orchestration primitives */
    fun workItems(): WorkItemServiceAsync

    /** Create a new legal matter and provision its primary vault. */
    fun create(params: V1CreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a single matter by ID. */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** Update mutable matter fields. */
    fun update(id: String): CompletableFuture<Void?> = update(id, V1UpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: V1UpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, V1UpdateParams.none(), requestOptions)

    /** List matters for the authenticated organization. */
    fun list(): CompletableFuture<Void?> = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(V1ListParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun agentTypes(): AgentTypeServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun parties(): PartyServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun types(): TypeServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun log(): LogServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun matterParties(): MatterPartyServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun shares(): ShareServiceAsync.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun workItems(): WorkItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(params: V1CreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: V1RetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> = update(id, V1UpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: V1UpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, V1UpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1`, but is otherwise the same as
         * [V1ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(V1ListParams.none())

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(V1ListParams.none(), requestOptions)
    }
}
