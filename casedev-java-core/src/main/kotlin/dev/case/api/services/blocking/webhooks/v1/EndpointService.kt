// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Webhook endpoint management */
interface EndpointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EndpointService

    /**
     * Creates a webhook endpoint that receives platform events matching the supplied event-type
     * filters. Returns the generated signing secret ONCE — the response is the only time it is
     * shown in plaintext.
     */
    fun create(params: EndpointCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: EndpointCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get webhook endpoint */
    fun retrieve(id: String) = retrieve(id, EndpointRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: EndpointRetrieveParams = EndpointRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: EndpointRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, EndpointRetrieveParams.none(), requestOptions)

    /**
     * Partially updates a webhook endpoint. Any omitted field is left unchanged. Signing secrets
     * are rotated via the separate /rotate_secret endpoint.
     */
    fun update(id: String) = update(id, EndpointUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EndpointUpdateParams = EndpointUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: EndpointUpdateParams = EndpointUpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: EndpointUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: EndpointUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, EndpointUpdateParams.none(), requestOptions)

    /**
     * Returns the organization's webhook endpoints, newest first. Signing secrets are never
     * included.
     */
    fun list() = list(EndpointListParams.none())

    /** @see list */
    fun list(
        params: EndpointListParams = EndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: EndpointListParams = EndpointListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(EndpointListParams.none(), requestOptions)

    /**
     * Soft-deletes a webhook endpoint. Delivery stops immediately and the endpoint no longer
     * appears in list results. Delivery history is preserved (and can be fetched via GET
     * /deliveries with the endpoint_id filter) so audit trails and post-mortem debugging remain
     * possible.
     */
    fun delete(id: String) = delete(id, EndpointDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EndpointDeleteParams = EndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EndpointDeleteParams = EndpointDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EndpointDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EndpointDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EndpointDeleteParams.none(), requestOptions)

    /**
     * Generates a new signing secret for the endpoint. The previous secret remains valid until
     * `previousSecretExpiresInSec` elapses (default 24h, max 30 days). During the grace window
     * deliveries are signed with both secrets so receivers can migrate without downtime. Returns
     * the new secret — this is the only time it is shown in plaintext.
     */
    fun rotateSecret(id: String) = rotateSecret(id, EndpointRotateSecretParams.none())

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = rotateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
    ) = rotateSecret(id, params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        params: EndpointRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rotateSecret */
    fun rotateSecret(params: EndpointRotateSecretParams) =
        rotateSecret(params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(id: String, requestOptions: RequestOptions) =
        rotateSecret(id, EndpointRotateSecretParams.none(), requestOptions)

    /**
     * Synchronously delivers a synthetic `webhook.test` event to the endpoint and returns the HTTP
     * result. No retries. Useful for validating that a new endpoint is reachable and its signature
     * verifier works. The delivery is not persisted in the delivery history.
     */
    fun test(id: String) = test(id, EndpointTestParams.none())

    /** @see test */
    fun test(
        id: String,
        params: EndpointTestParams = EndpointTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = test(params.toBuilder().id(id).build(), requestOptions)

    /** @see test */
    fun test(id: String, params: EndpointTestParams = EndpointTestParams.none()) =
        test(id, params, RequestOptions.none())

    /** @see test */
    fun test(params: EndpointTestParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see test */
    fun test(params: EndpointTestParams) = test(params, RequestOptions.none())

    /** @see test */
    fun test(id: String, requestOptions: RequestOptions) =
        test(id, EndpointTestParams.none(), requestOptions)

    /** A view of [EndpointService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EndpointService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints`, but is otherwise the same
         * as [EndpointService.create].
         */
        @MustBeClosed
        fun create(params: EndpointCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/endpoints/{id}`, but is otherwise the
         * same as [EndpointService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, EndpointRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EndpointRetrieveParams = EndpointRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EndpointRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, EndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/v1/endpoints/{id}`, but is otherwise the
         * same as [EndpointService.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, EndpointUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EndpointUpdateParams = EndpointUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EndpointUpdateParams = EndpointUpdateParams.none(),
        ): HttpResponse = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: EndpointUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, EndpointUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/endpoints`, but is otherwise the same
         * as [EndpointService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(EndpointListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EndpointListParams = EndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: EndpointListParams = EndpointListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(EndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/v1/endpoints/{id}`, but is otherwise
         * the same as [EndpointService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, EndpointDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EndpointDeleteParams = EndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EndpointDeleteParams = EndpointDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EndpointDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EndpointDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints/{id}/rotate_secret`, but is
         * otherwise the same as [EndpointService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(id: String): HttpResponse =
            rotateSecret(id, EndpointRotateSecretParams.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            id: String,
            params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = rotateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            id: String,
            params: EndpointRotateSecretParams = EndpointRotateSecretParams.none(),
        ): HttpResponse = rotateSecret(id, params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            params: EndpointRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(params: EndpointRotateSecretParams): HttpResponse =
            rotateSecret(params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(id: String, requestOptions: RequestOptions): HttpResponse =
            rotateSecret(id, EndpointRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/endpoints/{id}/test`, but is otherwise
         * the same as [EndpointService.test].
         */
        @MustBeClosed fun test(id: String): HttpResponse = test(id, EndpointTestParams.none())

        /** @see test */
        @MustBeClosed
        fun test(
            id: String,
            params: EndpointTestParams = EndpointTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = test(params.toBuilder().id(id).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(id: String, params: EndpointTestParams = EndpointTestParams.none()): HttpResponse =
            test(id, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: EndpointTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see test */
        @MustBeClosed
        fun test(params: EndpointTestParams): HttpResponse = test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(id: String, requestOptions: RequestOptions): HttpResponse =
            test(id, EndpointTestParams.none(), requestOptions)
    }
}
