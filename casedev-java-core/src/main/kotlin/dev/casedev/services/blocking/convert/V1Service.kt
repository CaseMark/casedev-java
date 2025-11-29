// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.convert

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.convert.v1.V1DownloadParams
import dev.casedev.models.convert.v1.V1ProcessParams
import dev.casedev.models.convert.v1.V1ProcessResponse
import dev.casedev.models.convert.v1.V1WebhookParams
import dev.casedev.models.convert.v1.V1WebhookResponse
import dev.casedev.services.blocking.convert.v1.JobService
import java.util.function.Consumer

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

    fun jobs(): JobService

    /**
     * Download the converted M4A audio file from a completed FTR conversion job. The file is
     * streamed directly to the client with appropriate headers for audio playback or download.
     */
    @MustBeClosed fun download(id: String): HttpResponse = download(id, V1DownloadParams.none())

    /** @see download */
    @MustBeClosed
    fun download(
        id: String,
        params: V1DownloadParams = V1DownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(id: String, params: V1DownloadParams = V1DownloadParams.none()): HttpResponse =
        download(id, params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: V1DownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    fun download(params: V1DownloadParams): HttpResponse = download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(id: String, requestOptions: RequestOptions): HttpResponse =
        download(id, V1DownloadParams.none(), requestOptions)

    /**
     * Submit an FTR (ForensicTech Recording) file for conversion to M4A audio format. This endpoint
     * is commonly used to convert court recording files into standard audio formats for
     * transcription or playback. The conversion is processed asynchronously - you'll receive a job
     * ID to track the conversion status.
     *
     * **Supported Input**: FTR files via S3 presigned URLs **Output Format**: M4A audio
     * **Processing**: Asynchronous with webhook callbacks
     */
    fun process(params: V1ProcessParams): V1ProcessResponse = process(params, RequestOptions.none())

    /** @see process */
    fun process(
        params: V1ProcessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ProcessResponse

    /**
     * Internal webhook endpoint that receives completion notifications from the Modal FTR converter
     * service. This endpoint handles status updates for file conversion jobs, including success and
     * failure notifications. Requires valid Bearer token authentication.
     */
    fun webhook(params: V1WebhookParams): V1WebhookResponse = webhook(params, RequestOptions.none())

    /** @see webhook */
    fun webhook(
        params: V1WebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1WebhookResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /convert/v1/download/{id}`, but is otherwise the
         * same as [V1Service.download].
         */
        @MustBeClosed fun download(id: String): HttpResponse = download(id, V1DownloadParams.none())

        /** @see download */
        @MustBeClosed
        fun download(
            id: String,
            params: V1DownloadParams = V1DownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(id: String, params: V1DownloadParams = V1DownloadParams.none()): HttpResponse =
            download(id, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: V1DownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        fun download(params: V1DownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(id: String, requestOptions: RequestOptions): HttpResponse =
            download(id, V1DownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /convert/v1/process`, but is otherwise the same as
         * [V1Service.process].
         */
        @MustBeClosed
        fun process(params: V1ProcessParams): HttpResponseFor<V1ProcessResponse> =
            process(params, RequestOptions.none())

        /** @see process */
        @MustBeClosed
        fun process(
            params: V1ProcessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ProcessResponse>

        /**
         * Returns a raw HTTP response for `post /convert/v1/webhook`, but is otherwise the same as
         * [V1Service.webhook].
         */
        @MustBeClosed
        fun webhook(params: V1WebhookParams): HttpResponseFor<V1WebhookResponse> =
            webhook(params, RequestOptions.none())

        /** @see webhook */
        @MustBeClosed
        fun webhook(
            params: V1WebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1WebhookResponse>
    }
}
