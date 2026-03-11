// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.vault.groups.GroupCreateParams
import dev.case.api.models.vault.groups.GroupDeleteParams
import dev.case.api.models.vault.groups.GroupListParams
import dev.case.api.models.vault.groups.GroupUpdateParams
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /**
     * Creates a vault group for organizing vaults and applying group-scoped access controls.
     * Group-scoped API keys cannot create or manage vault groups.
     */
    fun create(params: GroupCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: GroupCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Updates a vault group for the authenticated organization. Only provided fields are changed,
     * and setting description to null removes the current description.
     */
    fun update(groupId: String) = update(groupId, GroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(groupId: String, params: GroupUpdateParams = GroupUpdateParams.none()) =
        update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(params: GroupUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: GroupUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(groupId: String, requestOptions: RequestOptions) =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /**
     * Lists vault groups visible to the authenticated organization. Group-scoped API keys only
     * receive groups within their allowed scope.
     */
    fun list() = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(GroupListParams.none(), requestOptions)

    /**
     * Soft-deletes a vault group that no longer has any active vaults assigned. This operation is
     * blocked when the group still contains vaults.
     */
    fun delete(groupId: String) = delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(groupId: String, params: GroupDeleteParams = GroupDeleteParams.none()) =
        delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions) =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/groups`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch /vault/groups/{groupId}`, but is otherwise the
         * same as [GroupService.update].
         */
        @MustBeClosed
        fun update(groupId: String): HttpResponse = update(groupId, GroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): HttpResponse = update(groupId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: GroupUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(groupId: String, requestOptions: RequestOptions): HttpResponse =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vault/groups`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: GroupListParams = GroupListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/groups/{groupId}`, but is otherwise the
         * same as [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupId: String): HttpResponse = delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): HttpResponse = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(groupId: String, requestOptions: RequestOptions): HttpResponse =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
