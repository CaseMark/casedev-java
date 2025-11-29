// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Creates an asynchronous transcription job for audio files. Supports various audio formats and
 * advanced features like speaker identification, content moderation, and automatic highlights.
 * Returns a job ID for checking transcription status and retrieving results.
 */
class TranscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL of the audio file to transcribe
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun audioUrl(): String = body.audioUrl()

    /**
     * Automatically extract key phrases and topics
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoHighlights(): Optional<Boolean> = body.autoHighlights()

    /**
     * Enable content moderation and safety labeling
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentSafetyLabels(): Optional<Boolean> = body.contentSafetyLabels()

    /**
     * Format text with proper capitalization
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formatText(): Optional<Boolean> = body.formatText()

    /**
     * Language code (e.g., 'en_us', 'es', 'fr'). If not specified, language will be auto-detected
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languageCode(): Optional<String> = body.languageCode()

    /**
     * Enable automatic language detection
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languageDetection(): Optional<Boolean> = body.languageDetection()

    /**
     * Add punctuation to the transcript
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun punctuate(): Optional<Boolean> = body.punctuate()

    /**
     * Enable speaker identification and labeling
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speakerLabels(): Optional<Boolean> = body.speakerLabels()

    /**
     * Returns the raw JSON value of [audioUrl].
     *
     * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioUrl(): JsonField<String> = body._audioUrl()

    /**
     * Returns the raw JSON value of [autoHighlights].
     *
     * Unlike [autoHighlights], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoHighlights(): JsonField<Boolean> = body._autoHighlights()

    /**
     * Returns the raw JSON value of [contentSafetyLabels].
     *
     * Unlike [contentSafetyLabels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _contentSafetyLabels(): JsonField<Boolean> = body._contentSafetyLabels()

    /**
     * Returns the raw JSON value of [formatText].
     *
     * Unlike [formatText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formatText(): JsonField<Boolean> = body._formatText()

    /**
     * Returns the raw JSON value of [languageCode].
     *
     * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _languageCode(): JsonField<String> = body._languageCode()

    /**
     * Returns the raw JSON value of [languageDetection].
     *
     * Unlike [languageDetection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _languageDetection(): JsonField<Boolean> = body._languageDetection()

    /**
     * Returns the raw JSON value of [punctuate].
     *
     * Unlike [punctuate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _punctuate(): JsonField<Boolean> = body._punctuate()

    /**
     * Returns the raw JSON value of [speakerLabels].
     *
     * Unlike [speakerLabels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _speakerLabels(): JsonField<Boolean> = body._speakerLabels()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TranscriptionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .audioUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transcriptionCreateParams: TranscriptionCreateParams) = apply {
            body = transcriptionCreateParams.body.toBuilder()
            additionalHeaders = transcriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transcriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [audioUrl]
         * - [autoHighlights]
         * - [contentSafetyLabels]
         * - [formatText]
         * - [languageCode]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL of the audio file to transcribe */
        fun audioUrl(audioUrl: String) = apply { body.audioUrl(audioUrl) }

        /**
         * Sets [Builder.audioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audioUrl(audioUrl: JsonField<String>) = apply { body.audioUrl(audioUrl) }

        /** Automatically extract key phrases and topics */
        fun autoHighlights(autoHighlights: Boolean) = apply { body.autoHighlights(autoHighlights) }

        /**
         * Sets [Builder.autoHighlights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoHighlights] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoHighlights(autoHighlights: JsonField<Boolean>) = apply {
            body.autoHighlights(autoHighlights)
        }

        /** Enable content moderation and safety labeling */
        fun contentSafetyLabels(contentSafetyLabels: Boolean) = apply {
            body.contentSafetyLabels(contentSafetyLabels)
        }

        /**
         * Sets [Builder.contentSafetyLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentSafetyLabels] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentSafetyLabels(contentSafetyLabels: JsonField<Boolean>) = apply {
            body.contentSafetyLabels(contentSafetyLabels)
        }

        /** Format text with proper capitalization */
        fun formatText(formatText: Boolean) = apply { body.formatText(formatText) }

        /**
         * Sets [Builder.formatText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formatText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formatText(formatText: JsonField<Boolean>) = apply { body.formatText(formatText) }

        /**
         * Language code (e.g., 'en_us', 'es', 'fr'). If not specified, language will be
         * auto-detected
         */
        fun languageCode(languageCode: String) = apply { body.languageCode(languageCode) }

        /**
         * Sets [Builder.languageCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languageCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun languageCode(languageCode: JsonField<String>) = apply {
            body.languageCode(languageCode)
        }

        /** Enable automatic language detection */
        fun languageDetection(languageDetection: Boolean) = apply {
            body.languageDetection(languageDetection)
        }

        /**
         * Sets [Builder.languageDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languageDetection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun languageDetection(languageDetection: JsonField<Boolean>) = apply {
            body.languageDetection(languageDetection)
        }

        /** Add punctuation to the transcript */
        fun punctuate(punctuate: Boolean) = apply { body.punctuate(punctuate) }

        /**
         * Sets [Builder.punctuate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.punctuate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun punctuate(punctuate: JsonField<Boolean>) = apply { body.punctuate(punctuate) }

        /** Enable speaker identification and labeling */
        fun speakerLabels(speakerLabels: Boolean) = apply { body.speakerLabels(speakerLabels) }

        /**
         * Sets [Builder.speakerLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speakerLabels] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speakerLabels(speakerLabels: JsonField<Boolean>) = apply {
            body.speakerLabels(speakerLabels)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TranscriptionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .audioUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptionCreateParams =
            TranscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audioUrl: JsonField<String>,
        private val autoHighlights: JsonField<Boolean>,
        private val contentSafetyLabels: JsonField<Boolean>,
        private val formatText: JsonField<Boolean>,
        private val languageCode: JsonField<String>,
        private val languageDetection: JsonField<Boolean>,
        private val punctuate: JsonField<Boolean>,
        private val speakerLabels: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_highlights")
            @ExcludeMissing
            autoHighlights: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("content_safety_labels")
            @ExcludeMissing
            contentSafetyLabels: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("format_text")
            @ExcludeMissing
            formatText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language_detection")
            @ExcludeMissing
            languageDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("punctuate")
            @ExcludeMissing
            punctuate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("speaker_labels")
            @ExcludeMissing
            speakerLabels: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            audioUrl,
            autoHighlights,
            contentSafetyLabels,
            formatText,
            languageCode,
            languageDetection,
            punctuate,
            speakerLabels,
            mutableMapOf(),
        )

        /**
         * URL of the audio file to transcribe
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audioUrl(): String = audioUrl.getRequired("audio_url")

        /**
         * Automatically extract key phrases and topics
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoHighlights(): Optional<Boolean> = autoHighlights.getOptional("auto_highlights")

        /**
         * Enable content moderation and safety labeling
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentSafetyLabels(): Optional<Boolean> =
            contentSafetyLabels.getOptional("content_safety_labels")

        /**
         * Format text with proper capitalization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun formatText(): Optional<Boolean> = formatText.getOptional("format_text")

        /**
         * Language code (e.g., 'en_us', 'es', 'fr'). If not specified, language will be
         * auto-detected
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageCode(): Optional<String> = languageCode.getOptional("language_code")

        /**
         * Enable automatic language detection
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageDetection(): Optional<Boolean> =
            languageDetection.getOptional("language_detection")

        /**
         * Add punctuation to the transcript
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun punctuate(): Optional<Boolean> = punctuate.getOptional("punctuate")

        /**
         * Enable speaker identification and labeling
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speakerLabels(): Optional<Boolean> = speakerLabels.getOptional("speaker_labels")

        /**
         * Returns the raw JSON value of [audioUrl].
         *
         * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_url") @ExcludeMissing fun _audioUrl(): JsonField<String> = audioUrl

        /**
         * Returns the raw JSON value of [autoHighlights].
         *
         * Unlike [autoHighlights], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_highlights")
        @ExcludeMissing
        fun _autoHighlights(): JsonField<Boolean> = autoHighlights

        /**
         * Returns the raw JSON value of [contentSafetyLabels].
         *
         * Unlike [contentSafetyLabels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("content_safety_labels")
        @ExcludeMissing
        fun _contentSafetyLabels(): JsonField<Boolean> = contentSafetyLabels

        /**
         * Returns the raw JSON value of [formatText].
         *
         * Unlike [formatText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format_text")
        @ExcludeMissing
        fun _formatText(): JsonField<Boolean> = formatText

        /**
         * Returns the raw JSON value of [languageCode].
         *
         * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_code")
        @ExcludeMissing
        fun _languageCode(): JsonField<String> = languageCode

        /**
         * Returns the raw JSON value of [languageDetection].
         *
         * Unlike [languageDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("language_detection")
        @ExcludeMissing
        fun _languageDetection(): JsonField<Boolean> = languageDetection

        /**
         * Returns the raw JSON value of [punctuate].
         *
         * Unlike [punctuate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("punctuate") @ExcludeMissing fun _punctuate(): JsonField<Boolean> = punctuate

        /**
         * Returns the raw JSON value of [speakerLabels].
         *
         * Unlike [speakerLabels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("speaker_labels")
        @ExcludeMissing
        fun _speakerLabels(): JsonField<Boolean> = speakerLabels

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .audioUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var audioUrl: JsonField<String>? = null
            private var autoHighlights: JsonField<Boolean> = JsonMissing.of()
            private var contentSafetyLabels: JsonField<Boolean> = JsonMissing.of()
            private var formatText: JsonField<Boolean> = JsonMissing.of()
            private var languageCode: JsonField<String> = JsonMissing.of()
            private var languageDetection: JsonField<Boolean> = JsonMissing.of()
            private var punctuate: JsonField<Boolean> = JsonMissing.of()
            private var speakerLabels: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioUrl = body.audioUrl
                autoHighlights = body.autoHighlights
                contentSafetyLabels = body.contentSafetyLabels
                formatText = body.formatText
                languageCode = body.languageCode
                languageDetection = body.languageDetection
                punctuate = body.punctuate
                speakerLabels = body.speakerLabels
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL of the audio file to transcribe */
            fun audioUrl(audioUrl: String) = audioUrl(JsonField.of(audioUrl))

            /**
             * Sets [Builder.audioUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioUrl(audioUrl: JsonField<String>) = apply { this.audioUrl = audioUrl }

            /** Automatically extract key phrases and topics */
            fun autoHighlights(autoHighlights: Boolean) =
                autoHighlights(JsonField.of(autoHighlights))

            /**
             * Sets [Builder.autoHighlights] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoHighlights] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoHighlights(autoHighlights: JsonField<Boolean>) = apply {
                this.autoHighlights = autoHighlights
            }

            /** Enable content moderation and safety labeling */
            fun contentSafetyLabels(contentSafetyLabels: Boolean) =
                contentSafetyLabels(JsonField.of(contentSafetyLabels))

            /**
             * Sets [Builder.contentSafetyLabels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentSafetyLabels] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contentSafetyLabels(contentSafetyLabels: JsonField<Boolean>) = apply {
                this.contentSafetyLabels = contentSafetyLabels
            }

            /** Format text with proper capitalization */
            fun formatText(formatText: Boolean) = formatText(JsonField.of(formatText))

            /**
             * Sets [Builder.formatText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formatText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formatText(formatText: JsonField<Boolean>) = apply { this.formatText = formatText }

            /**
             * Language code (e.g., 'en_us', 'es', 'fr'). If not specified, language will be
             * auto-detected
             */
            fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

            /**
             * Sets [Builder.languageCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageCode(languageCode: JsonField<String>) = apply {
                this.languageCode = languageCode
            }

            /** Enable automatic language detection */
            fun languageDetection(languageDetection: Boolean) =
                languageDetection(JsonField.of(languageDetection))

            /**
             * Sets [Builder.languageDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languageDetection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languageDetection(languageDetection: JsonField<Boolean>) = apply {
                this.languageDetection = languageDetection
            }

            /** Add punctuation to the transcript */
            fun punctuate(punctuate: Boolean) = punctuate(JsonField.of(punctuate))

            /**
             * Sets [Builder.punctuate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.punctuate] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun punctuate(punctuate: JsonField<Boolean>) = apply { this.punctuate = punctuate }

            /** Enable speaker identification and labeling */
            fun speakerLabels(speakerLabels: Boolean) = speakerLabels(JsonField.of(speakerLabels))

            /**
             * Sets [Builder.speakerLabels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speakerLabels] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speakerLabels(speakerLabels: JsonField<Boolean>) = apply {
                this.speakerLabels = speakerLabels
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .audioUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("audioUrl", audioUrl),
                    autoHighlights,
                    contentSafetyLabels,
                    formatText,
                    languageCode,
                    languageDetection,
                    punctuate,
                    speakerLabels,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            audioUrl()
            autoHighlights()
            contentSafetyLabels()
            formatText()
            languageCode()
            languageDetection()
            punctuate()
            speakerLabels()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CasedevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (autoHighlights.asKnown().isPresent) 1 else 0) +
                (if (contentSafetyLabels.asKnown().isPresent) 1 else 0) +
                (if (formatText.asKnown().isPresent) 1 else 0) +
                (if (languageCode.asKnown().isPresent) 1 else 0) +
                (if (languageDetection.asKnown().isPresent) 1 else 0) +
                (if (punctuate.asKnown().isPresent) 1 else 0) +
                (if (speakerLabels.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioUrl == other.audioUrl &&
                autoHighlights == other.autoHighlights &&
                contentSafetyLabels == other.contentSafetyLabels &&
                formatText == other.formatText &&
                languageCode == other.languageCode &&
                languageDetection == other.languageDetection &&
                punctuate == other.punctuate &&
                speakerLabels == other.speakerLabels &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audioUrl,
                autoHighlights,
                contentSafetyLabels,
                formatText,
                languageCode,
                languageDetection,
                punctuate,
                speakerLabels,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioUrl=$audioUrl, autoHighlights=$autoHighlights, contentSafetyLabels=$contentSafetyLabels, formatText=$formatText, languageCode=$languageCode, languageDetection=$languageDetection, punctuate=$punctuate, speakerLabels=$speakerLabels, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TranscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
