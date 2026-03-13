// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1.chat

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v1.chat.files.FileDownloadParams
import dev.case.api.models.agent.v1.chat.files.FileListParams
import dev.case.api.models.agent.v1.chat.files.FileListResponse
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /**
     * Lists files created by the agent in the sandbox workspace. Only available while the sandbox
     * is running.
     */
    fun list(id: String): FileListResponse = list(id, FileListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: FileListParams = FileListParams.none()): FileListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse

    /** @see list */
    fun list(params: FileListParams): FileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): FileListResponse =
        list(id, FileListParams.none(), requestOptions)

    /**
     * Downloads a file from the sandbox workspace by path. Only available while the sandbox is
     * running.
     */
    @MustBeClosed
    fun download(filePath: String, params: FileDownloadParams): HttpResponse =
        download(filePath, params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        filePath: String,
        params: FileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().filePath(filePath).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(params: FileDownloadParams): HttpResponse = download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: FileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/files`, but is otherwise the
         * same as [FileService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<FileListResponse> = list(id, FileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: FileListParams = FileListParams.none(),
        ): HttpResponseFor<FileListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: FileListParams): HttpResponseFor<FileListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<FileListResponse> =
            list(id, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/files/{filePath}`, but is
         * otherwise the same as [FileService.download].
         */
        @MustBeClosed
        fun download(filePath: String, params: FileDownloadParams): HttpResponse =
            download(filePath, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            filePath: String,
            params: FileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().filePath(filePath).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(params: FileDownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: FileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
