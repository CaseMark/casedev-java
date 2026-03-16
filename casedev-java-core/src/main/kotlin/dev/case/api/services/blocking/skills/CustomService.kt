// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.skills

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.skills.custom.CustomListParams
import dev.case.api.models.skills.custom.CustomListResponse
import java.util.function.Consumer

/** Search and read legal AI skills for agents */
interface CustomService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomService

    /**
     * List all custom skills for the authenticated organization. Supports cursor-based pagination.
     */
    fun list(): CustomListResponse = list(CustomListParams.none())

    /** @see list */
    fun list(
        params: CustomListParams = CustomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomListResponse

    /** @see list */
    fun list(params: CustomListParams = CustomListParams.none()): CustomListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomListResponse =
        list(CustomListParams.none(), requestOptions)

    /** A view of [CustomService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skills/custom`, but is otherwise the same as
         * [CustomService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomListResponse> = list(CustomListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomListParams = CustomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomListParams = CustomListParams.none()
        ): HttpResponseFor<CustomListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomListResponse> =
            list(CustomListParams.none(), requestOptions)
    }
}
