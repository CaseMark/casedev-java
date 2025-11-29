// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.webhooks

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.webhooks.v1.V1CreateParams
import dev.casedev.models.webhooks.v1.V1CreateResponse
import dev.casedev.models.webhooks.v1.V1DeleteParams
import dev.casedev.models.webhooks.v1.V1ListParams
import dev.casedev.models.webhooks.v1.V1RetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    fun create(params: V1CreateParams): CompletableFuture<V1CreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateResponse>

    /**
     * Retrieve detailed information about a specific webhook endpoint, including its URL,
     * description, subscribed events, and status.
     */
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

    /**
     * Retrieve all webhook endpoints configured for your organization. Webhooks allow you to
     * receive real-time notifications when events occur in your Case.dev workspace, such as
     * document processing completion, OCR results, or workflow status changes.
     */
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

    /**
     * Delete a webhook endpoint from your organization. This action is irreversible and will stop
     * all webhook deliveries to the specified URL.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: V1DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, V1DeleteParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v1`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(params: V1CreateParams): CompletableFuture<HttpResponseFor<V1CreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1CreateResponse>>

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /webhooks/v1`, but is otherwise the same as
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

        /**
         * Returns a raw HTTP response for `delete /webhooks/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, V1DeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: V1DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, V1DeleteParams.none(), requestOptions)
    }
}
