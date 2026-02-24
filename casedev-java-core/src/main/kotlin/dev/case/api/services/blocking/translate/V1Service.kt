// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.translate

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.translate.v1.V1DetectParams
import dev.case.api.models.translate.v1.V1DetectResponse
import dev.case.api.models.translate.v1.V1ListLanguagesParams
import dev.case.api.models.translate.v1.V1ListLanguagesResponse
import dev.case.api.models.translate.v1.V1TranslateParams
import dev.case.api.models.translate.v1.V1TranslateResponse
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

    /**
     * Detect the language of text. Returns the most likely language code and confidence score.
     * Supports batch detection for multiple texts.
     */
    fun detect(params: V1DetectParams): V1DetectResponse = detect(params, RequestOptions.none())

    /** @see detect */
    fun detect(
        params: V1DetectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DetectResponse

    /**
     * Get the list of languages supported for translation. Optionally specify a target language to
     * get translated language names.
     */
    fun listLanguages(): V1ListLanguagesResponse = listLanguages(V1ListLanguagesParams.none())

    /** @see listLanguages */
    fun listLanguages(
        params: V1ListLanguagesParams = V1ListLanguagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListLanguagesResponse

    /** @see listLanguages */
    fun listLanguages(
        params: V1ListLanguagesParams = V1ListLanguagesParams.none()
    ): V1ListLanguagesResponse = listLanguages(params, RequestOptions.none())

    /** @see listLanguages */
    fun listLanguages(requestOptions: RequestOptions): V1ListLanguagesResponse =
        listLanguages(V1ListLanguagesParams.none(), requestOptions)

    /**
     * Translate text between languages using Google Cloud Translation API. Supports 100+ languages,
     * automatic language detection, HTML preservation, and batch translation.
     */
    fun translate(params: V1TranslateParams): V1TranslateResponse =
        translate(params, RequestOptions.none())

    /** @see translate */
    fun translate(
        params: V1TranslateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1TranslateResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /translate/v1/detect`, but is otherwise the same as
         * [V1Service.detect].
         */
        @MustBeClosed
        fun detect(params: V1DetectParams): HttpResponseFor<V1DetectResponse> =
            detect(params, RequestOptions.none())

        /** @see detect */
        @MustBeClosed
        fun detect(
            params: V1DetectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DetectResponse>

        /**
         * Returns a raw HTTP response for `get /translate/v1/languages`, but is otherwise the same
         * as [V1Service.listLanguages].
         */
        @MustBeClosed
        fun listLanguages(): HttpResponseFor<V1ListLanguagesResponse> =
            listLanguages(V1ListLanguagesParams.none())

        /** @see listLanguages */
        @MustBeClosed
        fun listLanguages(
            params: V1ListLanguagesParams = V1ListLanguagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListLanguagesResponse>

        /** @see listLanguages */
        @MustBeClosed
        fun listLanguages(
            params: V1ListLanguagesParams = V1ListLanguagesParams.none()
        ): HttpResponseFor<V1ListLanguagesResponse> = listLanguages(params, RequestOptions.none())

        /** @see listLanguages */
        @MustBeClosed
        fun listLanguages(
            requestOptions: RequestOptions
        ): HttpResponseFor<V1ListLanguagesResponse> =
            listLanguages(V1ListLanguagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /translate/v1/translate`, but is otherwise the same
         * as [V1Service.translate].
         */
        @MustBeClosed
        fun translate(params: V1TranslateParams): HttpResponseFor<V1TranslateResponse> =
            translate(params, RequestOptions.none())

        /** @see translate */
        @MustBeClosed
        fun translate(
            params: V1TranslateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1TranslateResponse>
    }
}
