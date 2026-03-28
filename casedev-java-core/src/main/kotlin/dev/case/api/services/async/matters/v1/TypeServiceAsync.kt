// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.types.TypeCreateParams
import dev.case.api.models.matters.v1.types.TypeListParams
import dev.case.api.models.matters.v1.types.TypeRetrieveParams
import dev.case.api.models.matters.v1.types.TypeUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface TypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypeServiceAsync

    /** Create a matter type with plain-English operating instructions and seeded work. */
    fun create(params: TypeCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a single matter type. */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, TypeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TypeRetrieveParams = TypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TypeRetrieveParams = TypeRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: TypeRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, TypeRetrieveParams.none(), requestOptions)

    /** Update a matter type. */
    fun update(id: String): CompletableFuture<Void?> = update(id, TypeUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TypeUpdateParams = TypeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TypeUpdateParams = TypeUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: TypeUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, TypeUpdateParams.none(), requestOptions)

    /** List matter types for the authenticated organization. */
    fun list(): CompletableFuture<Void?> = list(TypeListParams.none())

    /** @see list */
    fun list(
        params: TypeListParams = TypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: TypeListParams = TypeListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(TypeListParams.none(), requestOptions)

    /** A view of [TypeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/types`, but is otherwise the same as
         * [TypeServiceAsync.create].
         */
        fun create(params: TypeCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/types/{id}`, but is otherwise the same
         * as [TypeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, TypeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TypeRetrieveParams = TypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TypeRetrieveParams = TypeRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: TypeRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, TypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/types/{id}`, but is otherwise the same
         * as [TypeServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, TypeUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: TypeUpdateParams = TypeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: TypeUpdateParams = TypeUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: TypeUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, TypeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1/types`, but is otherwise the same as
         * [TypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(TypeListParams.none())

        /** @see list */
        fun list(
            params: TypeListParams = TypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: TypeListParams = TypeListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(TypeListParams.none(), requestOptions)
    }
}
