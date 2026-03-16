// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.skills

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.skills.custom.CustomListParams
import dev.case.api.models.skills.custom.CustomListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search and read legal AI skills for agents */
interface CustomServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomServiceAsync

    /**
     * List all custom skills for the authenticated organization. Supports cursor-based pagination.
     */
    fun list(): CompletableFuture<CustomListResponse> = list(CustomListParams.none())

    /** @see list */
    fun list(
        params: CustomListParams = CustomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomListResponse>

    /** @see list */
    fun list(
        params: CustomListParams = CustomListParams.none()
    ): CompletableFuture<CustomListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomListResponse> =
        list(CustomListParams.none(), requestOptions)

    /**
     * A view of [CustomServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skills/custom`, but is otherwise the same as
         * [CustomServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomListResponse>> =
            list(CustomListParams.none())

        /** @see list */
        fun list(
            params: CustomListParams = CustomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomListResponse>>

        /** @see list */
        fun list(
            params: CustomListParams = CustomListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomListResponse>> =
            list(CustomListParams.none(), requestOptions)
    }
}
