// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1.chat

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v1.chat.files.FileDownloadParams
import dev.case.api.models.agent.v1.chat.files.FileListParams
import dev.case.api.models.agent.v1.chat.files.FileListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /**
     * Lists files created by the agent in the sandbox workspace. Only available while the sandbox
     * is running.
     */
    fun list(id: String): CompletableFuture<FileListResponse> = list(id, FileListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListResponse> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: FileListParams = FileListParams.none(),
    ): CompletableFuture<FileListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListResponse>

    /** @see list */
    fun list(params: FileListParams): CompletableFuture<FileListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<FileListResponse> =
        list(id, FileListParams.none(), requestOptions)

    /**
     * Downloads a file from the sandbox workspace by path. Only available while the sandbox is
     * running.
     */
    fun download(filePath: String, params: FileDownloadParams): CompletableFuture<HttpResponse> =
        download(filePath, params, RequestOptions.none())

    /** @see download */
    fun download(
        filePath: String,
        params: FileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        download(params.toBuilder().filePath(filePath).build(), requestOptions)

    /** @see download */
    fun download(params: FileDownloadParams): CompletableFuture<HttpResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: FileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/files`, but is otherwise the
         * same as [FileServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(id, FileListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: FileListParams = FileListParams.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>>

        /** @see list */
        fun list(params: FileListParams): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(id, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/files/{filePath}`, but is
         * otherwise the same as [FileServiceAsync.download].
         */
        fun download(
            filePath: String,
            params: FileDownloadParams,
        ): CompletableFuture<HttpResponse> = download(filePath, params, RequestOptions.none())

        /** @see download */
        fun download(
            filePath: String,
            params: FileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            download(params.toBuilder().filePath(filePath).build(), requestOptions)

        /** @see download */
        fun download(params: FileDownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: FileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
