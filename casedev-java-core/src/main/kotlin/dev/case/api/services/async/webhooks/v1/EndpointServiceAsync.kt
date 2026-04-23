// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.webhooks.v1.endpoints.EndpointCreateParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointDeleteParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointListParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointRetrieveParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointRotateSecretParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointTestParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Webhook endpoint management */
interface EndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EndpointServiceAsync

    /**
     * Creates a webhook endpoint that receives platform events matching the supplied event-type
     * filters. Returns the generated signing secret ONCE — the response is the only time it is
     * shown in plaintext.
     */
    fun create(params: EndpointCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get webhook endpoint */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, EndpointRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: EndpointRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, EndpointRetrieveParams.none(), requestOptions)

    /**
     * Partially updates a webhook endpoint. Any omitted field is left unchanged. Signing secrets
     * are rotated via the separate /rotate_secret endpoint.
     */
    fun update(id: String): CompletableFuture<Void?> = update(id, EndpointUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EndpointUpdateParams = EndpointUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: EndpointUpdateParams = EndpointUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: EndpointUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, EndpointUpdateParams.none(), requestOptions)

    /**
     * Returns the organization's webhook endpoints, newest first. Signing secrets are never
     * included.
     */
    fun list(): CompletableFuture<Void?> = list(EndpointListParams.none())

    /** @see list */
    fun list(
        params: EndpointListParams = EndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: EndpointListParams = EndpointListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(EndpointListParams.none(), requestOptions)

    /**
     * Soft-deletes a webhook endpoint. Delivery stops immediately and the endpoint no longer
     * appears in list results. Delivery history is preserved (and can be fetched via GET
     * /deliveries with the endpoint_id filter) so audit trails and post-mortem debugging remain
     * possible.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EndpointDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EndpointDeleteParams = EndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EndpointDeleteParams = EndpointDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EndpointDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EndpointDeleteParams.none(), requestOptions)

    /**
     * Generates a new signing secret for the endpoint. The previous secret remains valid until
     * `previousSecretExpiresInSec` elapses (default 24h, max 30 days). During the grace window
     * deliveries are signed with both secrets so receivers can migrate without downtime. Returns
     * the new secret — this is the only time it is shown in plaintext.
     */
    fun rotateSecret(id: String): CompletableFuture<Void?> =
        rotateSecret(id, EndpointRotateSecretParams.none())

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = rotateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
    ): CompletableFuture<Void?> = rotateSecret(id, params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        params: EndpointRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rotateSecret */
    fun rotateSecret(params: EndpointRotateSecretParams): CompletableFuture<Void?> =
        rotateSecret(params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        rotateSecret(id, EndpointRotateSecretParams.none(), requestOptions)

    /**
     * Synchronously delivers a synthetic `webhook.test` event to the endpoint and returns the HTTP
     * result. No retries. Useful for validating that a new endpoint is reachable and its signature
     * verifier works. The delivery is not persisted in the delivery history.
     */
    fun test(id: String): CompletableFuture<Void?> = test(id, EndpointTestParams.none())

    /** @see test */
    fun test(
        id: String,
        params: EndpointTestParams = EndpointTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = test(params.toBuilder().id(id).build(), requestOptions)

    /** @see test */
    fun test(
        id: String,
        params: EndpointTestParams = EndpointTestParams.none(),
    ): CompletableFuture<Void?> = test(id, params, RequestOptions.none())

    /** @see test */
    fun test(
        params: EndpointTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see test */
    fun test(params: EndpointTestParams): CompletableFuture<Void?> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        test(id, EndpointTestParams.none(), requestOptions)

    /**
     * A view of [EndpointServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EndpointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints`, but is otherwise the same
         * as [EndpointServiceAsync.create].
         */
        fun create(params: EndpointCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/endpoints/{id}`, but is otherwise the
         * same as [EndpointServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, EndpointRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: EndpointRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, EndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/v1/endpoints/{id}`, but is otherwise the
         * same as [EndpointServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, EndpointUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: EndpointUpdateParams = EndpointUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: EndpointUpdateParams = EndpointUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: EndpointUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, EndpointUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/endpoints`, but is otherwise the same
         * as [EndpointServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(EndpointListParams.none())

        /** @see list */
        fun list(
            params: EndpointListParams = EndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: EndpointListParams = EndpointListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(EndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/v1/endpoints/{id}`, but is otherwise
         * the same as [EndpointServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EndpointDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EndpointDeleteParams = EndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EndpointDeleteParams = EndpointDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EndpointDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EndpointDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints/{id}/rotate_secret`, but is
         * otherwise the same as [EndpointServiceAsync.rotateSecret].
         */
        fun rotateSecret(id: String): CompletableFuture<HttpResponse> =
            rotateSecret(id, EndpointRotateSecretParams.none())

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rotateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
        ): CompletableFuture<HttpResponse> = rotateSecret(id, params, RequestOptions.none())

        /** @see rotateSecret */
        fun rotateSecret(
            params: EndpointRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rotateSecret */
        fun rotateSecret(params: EndpointRotateSecretParams): CompletableFuture<HttpResponse> =
            rotateSecret(params, RequestOptions.none())

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            rotateSecret(id, EndpointRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints/{id}/test`, but is otherwise
         * the same as [EndpointServiceAsync.test].
         */
        fun test(id: String): CompletableFuture<HttpResponse> = test(id, EndpointTestParams.none())

        /** @see test */
        fun test(
            id: String,
            params: EndpointTestParams = EndpointTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = test(params.toBuilder().id(id).build(), requestOptions)

        /** @see test */
        fun test(
            id: String,
            params: EndpointTestParams = EndpointTestParams.none(),
        ): CompletableFuture<HttpResponse> = test(id, params, RequestOptions.none())

        /** @see test */
        fun test(
            params: EndpointTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see test */
        fun test(params: EndpointTestParams): CompletableFuture<HttpResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            test(id, EndpointTestParams.none(), requestOptions)
    }
}
