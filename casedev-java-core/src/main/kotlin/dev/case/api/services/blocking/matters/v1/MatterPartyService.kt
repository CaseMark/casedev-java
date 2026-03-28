// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.matterparties.MatterPartyCreateParams
import dev.case.api.models.matters.v1.matterparties.MatterPartyListParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface MatterPartyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterPartyService

    /** Attach a reusable party to a matter with a matter-specific role. */
    fun create(id: String, params: MatterPartyCreateParams) =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: MatterPartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: MatterPartyCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MatterPartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List parties attached to a matter. */
    fun list(id: String) = list(id, MatterPartyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: MatterPartyListParams = MatterPartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: MatterPartyListParams = MatterPartyListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: MatterPartyListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: MatterPartyListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, MatterPartyListParams.none(), requestOptions)

    /**
     * A view of [MatterPartyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatterPartyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/parties`, but is otherwise the
         * same as [MatterPartyService.create].
         */
        @MustBeClosed
        fun create(id: String, params: MatterPartyCreateParams): HttpResponse =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: MatterPartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: MatterPartyCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MatterPartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/parties`, but is otherwise the same
         * as [MatterPartyService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, MatterPartyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: MatterPartyListParams = MatterPartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: MatterPartyListParams = MatterPartyListParams.none(),
        ): HttpResponse = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MatterPartyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: MatterPartyListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, MatterPartyListParams.none(), requestOptions)
    }
}
