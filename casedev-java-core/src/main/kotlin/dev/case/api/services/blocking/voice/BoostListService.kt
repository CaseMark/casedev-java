// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.voice

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.voice.boostlist.BoostListExtractParams
import dev.case.api.models.voice.boostlist.BoostListExtractResponse
import dev.case.api.models.voice.boostlist.BoostListGenerateParams
import dev.case.api.models.voice.boostlist.BoostListGenerateResponse
import java.util.function.Consumer

/** Audio transcription and text-to-speech */
interface BoostListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoostListService

    /**
     * Extracts a categorized word boost list from vault documents or raw text using LLM entity
     * extraction. The resulting list can be passed as `word_boost` to the transcription endpoint
     * for improved accuracy.
     */
    fun extract(): BoostListExtractResponse = extract(BoostListExtractParams.none())

    /** @see extract */
    fun extract(
        params: BoostListExtractParams = BoostListExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoostListExtractResponse

    /** @see extract */
    fun extract(
        params: BoostListExtractParams = BoostListExtractParams.none()
    ): BoostListExtractResponse = extract(params, RequestOptions.none())

    /** @see extract */
    fun extract(requestOptions: RequestOptions): BoostListExtractResponse =
        extract(BoostListExtractParams.none(), requestOptions)

    /**
     * Generates a categorized word boost list from a completed transcription job. Extracts entities
     * from the pass-1 transcript for use as `word_boost` in a second transcription pass.
     */
    fun generate(params: BoostListGenerateParams): BoostListGenerateResponse =
        generate(params, RequestOptions.none())

    /** @see generate */
    fun generate(
        params: BoostListGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoostListGenerateResponse

    /** A view of [BoostListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoostListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice/boost-list/extract`, but is otherwise the
         * same as [BoostListService.extract].
         */
        @MustBeClosed
        fun extract(): HttpResponseFor<BoostListExtractResponse> =
            extract(BoostListExtractParams.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            params: BoostListExtractParams = BoostListExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoostListExtractResponse>

        /** @see extract */
        @MustBeClosed
        fun extract(
            params: BoostListExtractParams = BoostListExtractParams.none()
        ): HttpResponseFor<BoostListExtractResponse> = extract(params, RequestOptions.none())

        /** @see extract */
        @MustBeClosed
        fun extract(requestOptions: RequestOptions): HttpResponseFor<BoostListExtractResponse> =
            extract(BoostListExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /voice/boost-list/generate`, but is otherwise the
         * same as [BoostListService.generate].
         */
        @MustBeClosed
        fun generate(params: BoostListGenerateParams): HttpResponseFor<BoostListGenerateResponse> =
            generate(params, RequestOptions.none())

        /** @see generate */
        @MustBeClosed
        fun generate(
            params: BoostListGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoostListGenerateResponse>
    }
}
