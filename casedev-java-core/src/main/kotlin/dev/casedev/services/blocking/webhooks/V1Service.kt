// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.webhooks.v1.V1CreateParams
import dev.casedev.models.webhooks.v1.V1CreateResponse
import dev.casedev.models.webhooks.v1.V1DeleteParams
import dev.casedev.models.webhooks.v1.V1ListParams
import dev.casedev.models.webhooks.v1.V1RetrieveParams
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /**
     * Create a new webhook endpoint to receive real-time notifications for events in your Case.dev
     * workspace. Webhooks enable automated workflows by sending HTTP POST requests to your
     * specified URL when events occur.
     *
     * **Security**: Webhooks are signed with HMAC-SHA256 using the provided secret. The signature
     * is included in the `X-Case-Signature` header.
     *
     * **Available Events**:
     * - `document.processed` - Document OCR/processing completed
     * - `vault.updated` - Document added/removed from vault
     * - `action.completed` - Workflow action finished
     * - `compute.finished` - Compute job completed
     */
    fun create(params: V1CreateParams): V1CreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateResponse

    /**
     * Retrieve detailed information about a specific webhook endpoint, including its URL,
     * description, subscribed events, and status.
     */
    fun retrieve(id: String) = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /**
     * Retrieve all webhook endpoints configured for your organization. Webhooks allow you to
     * receive real-time notifications when events occur in your Case.dev workspace, such as
     * document processing completion, OCR results, or workflow status changes.
     */
    fun list() = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(V1ListParams.none(), requestOptions)

    /**
     * Delete a webhook endpoint from your organization. This action is irreversible and will stop
     * all webhook deliveries to the specified URL.
     */
    fun delete(id: String) = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, V1DeleteParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v1`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed
        fun create(params: V1CreateParams): HttpResponseFor<V1CreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1CreateResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed fun retrieve(id: String): HttpResponse = retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()): HttpResponse =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/v1`, but is otherwise the same as
         * [V1Service.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(V1ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: V1ListParams = V1ListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/v1/{id}`, but is otherwise the same as
         * [V1Service.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, V1DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: V1DeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, V1DeleteParams.none(), requestOptions)
    }
}
