// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.types.TypeCreateParams
import dev.case.api.models.matters.v1.types.TypeListParams
import dev.case.api.models.matters.v1.types.TypeRetrieveParams
import dev.case.api.models.matters.v1.types.TypeUpdateParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface TypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypeService

    /** Create a matter type with plain-English operating instructions and seeded work. */
    fun create(params: TypeCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: TypeCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a single matter type. */
    fun retrieve(id: String) = retrieve(id, TypeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TypeRetrieveParams = TypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: TypeRetrieveParams = TypeRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: TypeRetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: TypeRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, TypeRetrieveParams.none(), requestOptions)

    /** Update a matter type. */
    fun update(id: String) = update(id, TypeUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TypeUpdateParams = TypeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: TypeUpdateParams = TypeUpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: TypeUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: TypeUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, TypeUpdateParams.none(), requestOptions)

    /** List matter types for the authenticated organization. */
    fun list() = list(TypeListParams.none())

    /** @see list */
    fun list(
        params: TypeListParams = TypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: TypeListParams = TypeListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(TypeListParams.none(), requestOptions)

    /** A view of [TypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/types`, but is otherwise the same as
         * [TypeService.create].
         */
        @MustBeClosed
        fun create(params: TypeCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/types/{id}`, but is otherwise the same
         * as [TypeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, TypeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TypeRetrieveParams = TypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TypeRetrieveParams = TypeRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TypeRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, TypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/types/{id}`, but is otherwise the same
         * as [TypeService.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, TypeUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TypeUpdateParams = TypeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String, params: TypeUpdateParams = TypeUpdateParams.none()): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: TypeUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, TypeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1/types`, but is otherwise the same as
         * [TypeService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(TypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TypeListParams = TypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: TypeListParams = TypeListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(TypeListParams.none(), requestOptions)
    }
}
