// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.shares.ShareCreateParams
import dev.case.api.models.matters.v1.shares.ShareDeleteParams
import dev.case.api.models.matters.v1.shares.ShareListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface ShareServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareServiceAsync

    /** Grant another organization scoped access to this matter and its primary vault. */
    fun create(id: String, params: ShareCreateParams): CompletableFuture<Void?> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List cross-org shares for a matter. Owner only. */
    fun list(id: String): CompletableFuture<Void?> = list(id, ShareListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ShareListParams = ShareListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ShareListParams = ShareListParams.none(),
    ): CompletableFuture<Void?> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ShareListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: ShareListParams): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(id, ShareListParams.none(), requestOptions)

    /** Revoke a matter share and its linked vault share. */
    fun delete(shareId: String, params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(shareId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        shareId: String,
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().shareId(shareId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ShareServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/shares`, but is otherwise the same
         * as [ShareServiceAsync.create].
         */
        fun create(id: String, params: ShareCreateParams): CompletableFuture<HttpResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: ShareCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/shares`, but is otherwise the same
         * as [ShareServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponse> = list(id, ShareListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ShareListParams = ShareListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ShareListParams = ShareListParams.none(),
        ): CompletableFuture<HttpResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ShareListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: ShareListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(id, ShareListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /matters/v1/{id}/shares/{shareId}`, but is
         * otherwise the same as [ShareServiceAsync.delete].
         */
        fun delete(shareId: String, params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(shareId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            shareId: String,
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().shareId(shareId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
