// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.privilege

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.privilege.v1.V1DetectParams
import dev.case.api.models.privilege.v1.V1DetectResponse
import java.util.function.Consumer

/** Privilege detection for e-discovery and litigation workflows */
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
     * Analyzes text or vault documents for legal privilege. Detects attorney-client privilege, work
     * product doctrine, common interest privilege, and litigation hold materials.
     *
     * Returns structured privilege flags with confidence scores and policy-friendly rationale
     * suitable for discovery workflows and privilege logs.
     *
     * **Size Limit:** Maximum 200,000 characters (larger documents rejected).
     *
     * **Permissions:** Requires `chat` permission. When using `document_id`, also requires `vault`
     * permission.
     *
     * **Note:** When analyzing vault documents, results are automatically stored in the document's
     * `privilege_analysis` metadata field.
     */
    fun detect(): V1DetectResponse = detect(V1DetectParams.none())

    /** @see detect */
    fun detect(
        params: V1DetectParams = V1DetectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DetectResponse

    /** @see detect */
    fun detect(params: V1DetectParams = V1DetectParams.none()): V1DetectResponse =
        detect(params, RequestOptions.none())

    /** @see detect */
    fun detect(requestOptions: RequestOptions): V1DetectResponse =
        detect(V1DetectParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /privilege/v1/detect`, but is otherwise the same as
         * [V1Service.detect].
         */
        @MustBeClosed
        fun detect(): HttpResponseFor<V1DetectResponse> = detect(V1DetectParams.none())

        /** @see detect */
        @MustBeClosed
        fun detect(
            params: V1DetectParams = V1DetectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DetectResponse>

        /** @see detect */
        @MustBeClosed
        fun detect(
            params: V1DetectParams = V1DetectParams.none()
        ): HttpResponseFor<V1DetectResponse> = detect(params, RequestOptions.none())

        /** @see detect */
        @MustBeClosed
        fun detect(requestOptions: RequestOptions): HttpResponseFor<V1DetectResponse> =
            detect(V1DetectParams.none(), requestOptions)
    }
}
