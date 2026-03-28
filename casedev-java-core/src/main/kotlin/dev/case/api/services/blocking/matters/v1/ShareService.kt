// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.shares.ShareCreateParams
import dev.case.api.models.matters.v1.shares.ShareDeleteParams
import dev.case.api.models.matters.v1.shares.ShareListParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface ShareService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService

    /** Grant another organization scoped access to this matter and its primary vault. */
    fun create(id: String, params: ShareCreateParams) = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ShareCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: ShareCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** List cross-org shares for a matter. Owner only. */
    fun list(id: String) = list(id, ShareListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ShareListParams = ShareListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: ShareListParams = ShareListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: ShareListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: ShareListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, ShareListParams.none(), requestOptions)

    /** Revoke a matter share and its linked vault share. */
    fun delete(shareId: String, params: ShareDeleteParams) =
        delete(shareId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        shareId: String,
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().shareId(shareId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ShareDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ShareDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ShareService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/shares`, but is otherwise the same
         * as [ShareService.create].
         */
        @MustBeClosed
        fun create(id: String, params: ShareCreateParams): HttpResponse =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ShareCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/shares`, but is otherwise the same
         * as [ShareService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, ShareListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ShareListParams = ShareListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(id: String, params: ShareListParams = ShareListParams.none()): HttpResponse =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShareListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: ShareListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, ShareListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /matters/v1/{id}/shares/{shareId}`, but is
         * otherwise the same as [ShareService.delete].
         */
        @MustBeClosed
        fun delete(shareId: String, params: ShareDeleteParams): HttpResponse =
            delete(shareId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            shareId: String,
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().shareId(shareId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ShareDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
