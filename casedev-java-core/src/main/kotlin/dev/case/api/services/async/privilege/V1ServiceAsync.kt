// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.privilege

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.privilege.v1.V1DetectParams
import dev.case.api.models.privilege.v1.V1DetectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Privilege detection for e-discovery and litigation workflows */
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
     * Analyzes text or vault documents for legal privilege review. Detects attorney-client
     * privilege, work product doctrine, and common interest privilege.
     *
     * Returns structured review flags with confidence scores and policy-friendly rationale suitable
     * for discovery workflows and privilege logs. This endpoint is an AI-assisted triage tool and
     * does not replace attorney judgment.
     *
     * **Size Limit:** Maximum 200,000 characters (larger documents rejected).
     *
     * **Permissions:** Requires `chat` permission. When using `document_id`, also requires `vault`
     * permission.
     *
     * **Note:** When analyzing vault documents, results are automatically stored in the document's
     * `privilege_analysis` metadata field.
     */
    fun detect(): CompletableFuture<V1DetectResponse> = detect(V1DetectParams.none())

    /** @see detect */
    fun detect(
        params: V1DetectParams = V1DetectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DetectResponse>

    /** @see detect */
    fun detect(
        params: V1DetectParams = V1DetectParams.none()
    ): CompletableFuture<V1DetectResponse> = detect(params, RequestOptions.none())

    /** @see detect */
    fun detect(requestOptions: RequestOptions): CompletableFuture<V1DetectResponse> =
        detect(V1DetectParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /privilege/v1/detect`, but is otherwise the same as
         * [V1ServiceAsync.detect].
         */
        fun detect(): CompletableFuture<HttpResponseFor<V1DetectResponse>> =
            detect(V1DetectParams.none())

        /** @see detect */
        fun detect(
            params: V1DetectParams = V1DetectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DetectResponse>>

        /** @see detect */
        fun detect(
            params: V1DetectParams = V1DetectParams.none()
        ): CompletableFuture<HttpResponseFor<V1DetectResponse>> =
            detect(params, RequestOptions.none())

        /** @see detect */
        fun detect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1DetectResponse>> =
            detect(V1DetectParams.none(), requestOptions)
    }
}
