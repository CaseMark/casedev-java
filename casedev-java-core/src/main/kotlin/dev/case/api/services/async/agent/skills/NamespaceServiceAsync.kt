// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.skills

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface NamespaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceServiceAsync

    /**
     * Create a private skill namespace owned by the authenticated org and receive a one-time bearer
     * token used by the case-skills publisher.
     */
    fun create(params: NamespaceCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Read skill namespace */
    fun retrieve(id: String): CompletableFuture<Void?> =
        retrieve(id, NamespaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: NamespaceRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, NamespaceRetrieveParams.none(), requestOptions)

    /** List all active skill namespaces owned by the authenticated organization. */
    fun list(): CompletableFuture<Void?> = list(NamespaceListParams.none())

    /** @see list */
    fun list(
        params: NamespaceListParams = NamespaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: NamespaceListParams = NamespaceListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(NamespaceListParams.none(), requestOptions)

    /** Delete skill namespace */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, NamespaceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NamespaceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, NamespaceDeleteParams.none(), requestOptions)

    /**
     * Upload a tree of skill files for the namespace. Authenticated by the namespace bearer token.
     * Atomic at the version-bump level: a partial upload leaves the namespace pinned to the
     * previous version.
     */
    fun publish(id: String, params: NamespacePublishParams): CompletableFuture<Void?> =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        id: String,
        params: NamespacePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(params: NamespacePublishParams): CompletableFuture<Void?> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: NamespacePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Returns the active version's file manifest with short-lived presigned S3 URLs. Sandboxes use
     * this to materialize the tree at /workspace/.agents/skills/ before opencode boots.
     */
    fun pull(id: String): CompletableFuture<Void?> = pull(id, NamespacePullParams.none())

    /** @see pull */
    fun pull(
        id: String,
        params: NamespacePullParams = NamespacePullParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = pull(params.toBuilder().id(id).build(), requestOptions)

    /** @see pull */
    fun pull(
        id: String,
        params: NamespacePullParams = NamespacePullParams.none(),
    ): CompletableFuture<Void?> = pull(id, params, RequestOptions.none())

    /** @see pull */
    fun pull(
        params: NamespacePullParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pull */
    fun pull(params: NamespacePullParams): CompletableFuture<Void?> =
        pull(params, RequestOptions.none())

    /** @see pull */
    fun pull(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pull(id, NamespacePullParams.none(), requestOptions)

    /** Rotate skill namespace token */
    fun rotateToken(id: String): CompletableFuture<Void?> =
        rotateToken(id, NamespaceRotateTokenParams.none())

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = rotateToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateToken */
    fun rotateToken(
        id: String,
        params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
    ): CompletableFuture<Void?> = rotateToken(id, params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(
        params: NamespaceRotateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rotateToken */
    fun rotateToken(params: NamespaceRotateTokenParams): CompletableFuture<Void?> =
        rotateToken(params, RequestOptions.none())

    /** @see rotateToken */
    fun rotateToken(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        rotateToken(id, NamespaceRotateTokenParams.none(), requestOptions)

    /**
     * A view of [NamespaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces`, but is otherwise the
         * same as [NamespaceServiceAsync.create].
         */
        fun create(params: NamespaceCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces/{id}`, but is otherwise the
         * same as [NamespaceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, NamespaceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NamespaceRetrieveParams = NamespaceRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: NamespaceRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, NamespaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces`, but is otherwise the same
         * as [NamespaceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(NamespaceListParams.none())

        /** @see list */
        fun list(
            params: NamespaceListParams = NamespaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: NamespaceListParams = NamespaceListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(NamespaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/skills/namespaces/{id}`, but is otherwise
         * the same as [NamespaceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, NamespaceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NamespaceDeleteParams = NamespaceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NamespaceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, NamespaceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces/{id}/publish`, but is
         * otherwise the same as [NamespaceServiceAsync.publish].
         */
        fun publish(id: String, params: NamespacePublishParams): CompletableFuture<HttpResponse> =
            publish(id, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            id: String,
            params: NamespacePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        fun publish(params: NamespacePublishParams): CompletableFuture<HttpResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: NamespacePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /agent/skills/namespaces/{id}/pull`, but is
         * otherwise the same as [NamespaceServiceAsync.pull].
         */
        fun pull(id: String): CompletableFuture<HttpResponse> = pull(id, NamespacePullParams.none())

        /** @see pull */
        fun pull(
            id: String,
            params: NamespacePullParams = NamespacePullParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = pull(params.toBuilder().id(id).build(), requestOptions)

        /** @see pull */
        fun pull(
            id: String,
            params: NamespacePullParams = NamespacePullParams.none(),
        ): CompletableFuture<HttpResponse> = pull(id, params, RequestOptions.none())

        /** @see pull */
        fun pull(
            params: NamespacePullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pull */
        fun pull(params: NamespacePullParams): CompletableFuture<HttpResponse> =
            pull(params, RequestOptions.none())

        /** @see pull */
        fun pull(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            pull(id, NamespacePullParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/skills/namespaces/{id}/rotate-token`, but is
         * otherwise the same as [NamespaceServiceAsync.rotateToken].
         */
        fun rotateToken(id: String): CompletableFuture<HttpResponse> =
            rotateToken(id, NamespaceRotateTokenParams.none())

        /** @see rotateToken */
        fun rotateToken(
            id: String,
            params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rotateToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateToken */
        fun rotateToken(
            id: String,
            params: NamespaceRotateTokenParams = NamespaceRotateTokenParams.none(),
        ): CompletableFuture<HttpResponse> = rotateToken(id, params, RequestOptions.none())

        /** @see rotateToken */
        fun rotateToken(
            params: NamespaceRotateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rotateToken */
        fun rotateToken(params: NamespaceRotateTokenParams): CompletableFuture<HttpResponse> =
            rotateToken(params, RequestOptions.none())

        /** @see rotateToken */
        fun rotateToken(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            rotateToken(id, NamespaceRotateTokenParams.none(), requestOptions)
    }
}
