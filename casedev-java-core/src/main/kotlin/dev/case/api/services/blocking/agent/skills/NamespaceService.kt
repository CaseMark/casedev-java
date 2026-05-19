// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.skills

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.agent.skills.namespaces.NamespaceCreateParams
import dev.case.api.models.agent.skills.namespaces.NamespaceDeleteParams
import dev.case.api.models.agent.skills.namespaces.NamespaceListParams
import dev.case.api.models.agent.skills.namespaces.NamespacePublishParams
import dev.case.api.models.agent.skills.namespaces.NamespacePullParams
import dev.case.api.models.agent.skills.namespaces.NamespaceRetrieveParams
import dev.case.api.models.agent.skills.namespaces.NamespaceRotateTokenParams
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface NamespaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceService

    /**
     * Create a private skill namespace owned by the authenticated org and receive a one-time bearer
     * token used by the case-skills publisher.
     */
    fun create(params: NamespaceCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Read skill namespace */
    fun retrieve(id: String) = retrieve(id, NamespaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: NamespaceRetrieveParams = NamespaceRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: NamespaceRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, NamespaceRetrieveParams.none(), requestOptions)

    /** List all active skill namespaces owned by the authenticated organization. */
    fun list() = list(NamespaceListParams.none())

    /** @see list */
    fun list(
        params: NamespaceListParams = NamespaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: NamespaceListParams = NamespaceListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(NamespaceListParams.none(), requestOptions)

    /** Delete skill namespace */
    fun delete(id: String) = delete(id, NamespaceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: NamespaceDeleteParams = NamespaceDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: NamespaceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, NamespaceDeleteParams.none(), requestOptions)

    /**
     * Upload a tree of skill files for the namespace. Authenticated by the namespace bearer token.
     * Atomic at the version-bump level: a partial upload leaves the namespace pinned to the
     * previous version.
     */
    fun publish(id: String, params: NamespacePublishParams) =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: NamespacePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: NamespacePublishParams) = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: NamespacePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Returns the active version's file manifest with short-lived presigned S3 URLs. Sandboxes use
     * this to materialize the tree at /workspace/.agents/skills/ before opencode boots.
     */
    fun pull(id: String) = pull(id, NamespacePullParams.none())

    /** @see pull */
    fun pull(
        id: String,
        params: NamespacePullParams = NamespacePullParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pull(params.toBuilder().id(id).build(), requestOptions)

    /** @see pull */
    fun pull(id: String, params: NamespacePullParams = NamespacePullParams.none()) =
        pull(id, params, RequestOptions.none())

    /** @see pull */
    fun pull(params: NamespacePullParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see pull */
    fun pull(params: NamespacePullParams) = pull(params, RequestOptions.none())

    /** @see pull */
    fun pull(id: String, requestOptions: RequestOptions) =
        pull(id, NamespacePullParams.none(), requestOptions)

    /** Rotate skill namespace token */
    fun rotateToken(id: String) = rotateToken(id, NamespaceRotateTokenParams.none())

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = rotateToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
    ) = rotateToken(id, params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(
        params: NamespaceRotateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rotateToken */
    fun rotateToken(params: NamespaceRotateTokenParams) = rotateToken(params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(id: String, requestOptions: RequestOptions) =
        rotateToken(id, NamespaceRotateTokenParams.none(), requestOptions)

    /** A view of [NamespaceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces`, but is otherwise the
         * same as [NamespaceService.create].
         */
        @MustBeClosed
        fun create(params: NamespaceCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces/{id}`, but is otherwise the
         * same as [NamespaceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, NamespaceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: NamespaceRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, NamespaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces`, but is otherwise the same
         * as [NamespaceService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(NamespaceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NamespaceListParams = NamespaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: NamespaceListParams = NamespaceListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(NamespaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/skills/namespaces/{id}`, but is otherwise
         * the same as [NamespaceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, NamespaceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NamespaceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, NamespaceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces/{id}/publish`, but is
         * otherwise the same as [NamespaceService.publish].
         */
        @MustBeClosed
        fun publish(id: String, params: NamespacePublishParams): HttpResponse =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            id: String,
            params: NamespacePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(params: NamespacePublishParams): HttpResponse =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: NamespacePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces/{id}/pull`, but is
         * otherwise the same as [NamespaceService.pull].
         */
        @MustBeClosed fun pull(id: String): HttpResponse = pull(id, NamespacePullParams.none())

        /** @see pull */
        @MustBeClosed
        fun pull(
            id: String,
            params: NamespacePullParams = NamespacePullParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pull(params.toBuilder().id(id).build(), requestOptions)

        /** @see pull */
        @MustBeClosed
        fun pull(
            id: String,
            params: NamespacePullParams = NamespacePullParams.none(),
        ): HttpResponse = pull(id, params, RequestOptions.none())

        /** @see pull */
        @MustBeClosed
        fun pull(
            params: NamespacePullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pull */
        @MustBeClosed
        fun pull(params: NamespacePullParams): HttpResponse = pull(params, RequestOptions.none())

        /** @see pull */
        @MustBeClosed
        fun pull(id: String, requestOptions: RequestOptions): HttpResponse =
            pull(id, NamespacePullParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces/{id}/rotate-token`, but is
         * otherwise the same as [NamespaceService.rotateToken].
         */
        @MustBeClosed
        fun rotateToken(id: String): HttpResponse =
            rotateToken(id, NamespaceRotateTokenParams.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            id: String,
            params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = rotateToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            id: String,
            params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
        ): HttpResponse = rotateToken(id, params, RequestOptions.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(
            params: NamespaceRotateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(params: NamespaceRotateTokenParams): HttpResponse =
            rotateToken(params, RequestOptions.none())

        /** @see rotateToken */
        @MustBeClosed
        fun rotateToken(id: String, requestOptions: RequestOptions): HttpResponse =
            rotateToken(id, NamespaceRotateTokenParams.none(), requestOptions)
    }
}
