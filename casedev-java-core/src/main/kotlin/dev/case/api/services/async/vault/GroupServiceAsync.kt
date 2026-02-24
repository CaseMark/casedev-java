// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.vault.groups.GroupCreateParams
import dev.case.api.models.vault.groups.GroupDeleteParams
import dev.case.api.models.vault.groups.GroupListParams
import dev.case.api.models.vault.groups.GroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Create vault group */
    fun create(): CompletableFuture<Void?> = create(GroupCreateParams.none())

    /** @see create */
    fun create(
        params: GroupCreateParams = GroupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(params: GroupCreateParams = GroupCreateParams.none()): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(GroupCreateParams.none(), requestOptions)

    /** Update vault group */
    fun update(groupId: String): CompletableFuture<Void?> =
        update(groupId, GroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
    ): CompletableFuture<Void?> = update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: GroupUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(groupId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /** List vault groups */
    fun list(): CompletableFuture<Void?> = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(GroupListParams.none(), requestOptions)

    /** Delete vault group */
    fun delete(groupId: String): CompletableFuture<Void?> =
        delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/groups`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponse> = create(GroupCreateParams.none())

        /** @see create */
        fun create(
            params: GroupCreateParams = GroupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: GroupCreateParams = GroupCreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(GroupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vault/groups/{groupId}`, but is otherwise the
         * same as [GroupServiceAsync.update].
         */
        fun update(groupId: String): CompletableFuture<HttpResponse> =
            update(groupId, GroupUpdateParams.none())

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(groupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: GroupUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vault/groups`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(GroupListParams.none())

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/groups/{groupId}`, but is otherwise the
         * same as [GroupServiceAsync.delete].
         */
        fun delete(groupId: String): CompletableFuture<HttpResponse> =
            delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
