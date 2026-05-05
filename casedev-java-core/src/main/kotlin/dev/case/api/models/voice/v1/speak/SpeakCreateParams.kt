// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.v1.speak

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Convert text to natural-sounding audio using ElevenLabs voices. Ideal for creating audio
 * summaries of legal documents, client presentations, or accessibility features. Supports multiple
 * languages and voice customization.
 */
class SpeakCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Text to convert to speech
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = body.text()

    /**
     * Apply automatic text normalization
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyTextNormalization(): Optional<Boolean> = body.applyTextNormalization()

    /**
     * Enable request logging
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableLogging(): Optional<Boolean> = body.enableLogging()

    /**
     * Language code for multilingual models
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languageCode(): Optional<String> = body.languageCode()

    /**
     * ElevenLabs model ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelId(): Optional<ModelId> = body.modelId()

    /**
     * Next context for better pronunciation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextText(): Optional<String> = body.nextText()

    /**
     * Optimize for streaming latency (0-4)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optimizeStreamingLatency(): Optional<Long> = body.optimizeStreamingLatency()

    /**
     * Audio output format
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputFormat(): Optional<OutputFormat> = body.outputFormat()

    /**
     * Previous context for better pronunciation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousText(): Optional<String> = body.previousText()

    /**
     * Seed for reproducible generation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Optional<Long> = body.seed()

    /**
     * ElevenLabs voice ID (defaults to Rachel - professional, clear)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceId(): Optional<String> = body.voiceId()

    /**
     * Voice customization settings
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettings(): Optional<VoiceSettings> = body.voiceSettings()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [applyTextNormalization].
     *
     * Unlike [applyTextNormalization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _applyTextNormalization(): JsonField<Boolean> = body._applyTextNormalization()

    /**
     * Returns the raw JSON value of [enableLogging].
     *
     * Unlike [enableLogging], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableLogging(): JsonField<Boolean> = body._enableLogging()

    /**
     * Returns the raw JSON value of [languageCode].
     *
     * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _languageCode(): JsonField<String> = body._languageCode()

    /**
     * Returns the raw JSON value of [modelId].
     *
     * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelId(): JsonField<ModelId> = body._modelId()

    /**
     * Returns the raw JSON value of [nextText].
     *
     * Unlike [nextText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nextText(): JsonField<String> = body._nextText()

    /**
     * Returns the raw JSON value of [optimizeStreamingLatency].
     *
     * Unlike [optimizeStreamingLatency], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _optimizeStreamingLatency(): JsonField<Long> = body._optimizeStreamingLatency()

    /**
     * Returns the raw JSON value of [outputFormat].
     *
     * Unlike [outputFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputFormat(): JsonField<OutputFormat> = body._outputFormat()

    /**
     * Returns the raw JSON value of [previousText].
     *
     * Unlike [previousText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _previousText(): JsonField<String> = body._previousText()

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seed(): JsonField<Long> = body._seed()

    /**
     * Returns the raw JSON value of [voiceId].
     *
     * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceId(): JsonField<String> = body._voiceId()

    /**
     * Returns the raw JSON value of [voiceSettings].
     *
     * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceSettings(): JsonField<VoiceSettings> = body._voiceSettings()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpeakCreateParams].
         *
         * The following fields are required:
         * ```java
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpeakCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(speakCreateParams: SpeakCreateParams) = apply {
            body = speakCreateParams.body.toBuilder()
            additionalHeaders = speakCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = speakCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [text]
         * - [applyTextNormalization]
         * - [enableLogging]
         * - [languageCode]
         * - [modelId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Text to convert to speech */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /** Apply automatic text normalization */
        fun applyTextNormalization(applyTextNormalization: Boolean) = apply {
            body.applyTextNormalization(applyTextNormalization)
        }

        /**
         * Sets [Builder.applyTextNormalization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyTextNormalization] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applyTextNormalization(applyTextNormalization: JsonField<Boolean>) = apply {
            body.applyTextNormalization(applyTextNormalization)
        }

        /** Enable request logging */
        fun enableLogging(enableLogging: Boolean) = apply { body.enableLogging(enableLogging) }

        /**
         * Sets [Builder.enableLogging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableLogging] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableLogging(enableLogging: JsonField<Boolean>) = apply {
            body.enableLogging(enableLogging)
        }

        /** Language code for multilingual models */
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

        /** ElevenLabs model ID */
        fun modelId(modelId: ModelId) = apply { body.modelId(modelId) }

        /**
         * Sets [Builder.modelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelId] with a well-typed [ModelId] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modelId(modelId: JsonField<ModelId>) = apply { body.modelId(modelId) }

        /** Next context for better pronunciation */
        fun nextText(nextText: String) = apply { body.nextText(nextText) }

        /**
         * Sets [Builder.nextText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextText(nextText: JsonField<String>) = apply { body.nextText(nextText) }

        /** Optimize for streaming latency (0-4) */
        fun optimizeStreamingLatency(optimizeStreamingLatency: Long) = apply {
            body.optimizeStreamingLatency(optimizeStreamingLatency)
        }

        /**
         * Sets [Builder.optimizeStreamingLatency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optimizeStreamingLatency] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optimizeStreamingLatency(optimizeStreamingLatency: JsonField<Long>) = apply {
            body.optimizeStreamingLatency(optimizeStreamingLatency)
        }

        /** Audio output format */
        fun outputFormat(outputFormat: OutputFormat) = apply { body.outputFormat(outputFormat) }

        /**
         * Sets [Builder.outputFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFormat] with a well-typed [OutputFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputFormat(outputFormat: JsonField<OutputFormat>) = apply {
            body.outputFormat(outputFormat)
        }

        /** Previous context for better pronunciation */
        fun previousText(previousText: String) = apply { body.previousText(previousText) }

        /**
         * Sets [Builder.previousText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previousText(previousText: JsonField<String>) = apply {
            body.previousText(previousText)
        }

        /** Seed for reproducible generation */
        fun seed(seed: Long) = apply { body.seed(seed) }

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { body.seed(seed) }

        /** ElevenLabs voice ID (defaults to Rachel - professional, clear) */
        fun voiceId(voiceId: String) = apply { body.voiceId(voiceId) }

        /**
         * Sets [Builder.voiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceId(voiceId: JsonField<String>) = apply { body.voiceId(voiceId) }

        /** Voice customization settings */
        fun voiceSettings(voiceSettings: VoiceSettings) = apply {
            body.voiceSettings(voiceSettings)
        }

        /**
         * Sets [Builder.voiceSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
            body.voiceSettings(voiceSettings)
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
         * Returns an immutable instance of [SpeakCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpeakCreateParams =
            SpeakCreateParams(
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
        private val text: JsonField<String>,
        private val applyTextNormalization: JsonField<Boolean>,
        private val enableLogging: JsonField<Boolean>,
        private val languageCode: JsonField<String>,
        private val modelId: JsonField<ModelId>,
        private val nextText: JsonField<String>,
        private val optimizeStreamingLatency: JsonField<Long>,
        private val outputFormat: JsonField<OutputFormat>,
        private val previousText: JsonField<String>,
        private val seed: JsonField<Long>,
        private val voiceId: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apply_text_normalization")
            @ExcludeMissing
            applyTextNormalization: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enable_logging")
            @ExcludeMissing
            enableLogging: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_id")
            @ExcludeMissing
            modelId: JsonField<ModelId> = JsonMissing.of(),
            @JsonProperty("next_text")
            @ExcludeMissing
            nextText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optimize_streaming_latency")
            @ExcludeMissing
            optimizeStreamingLatency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("output_format")
            @ExcludeMissing
            outputFormat: JsonField<OutputFormat> = JsonMissing.of(),
            @JsonProperty("previous_text")
            @ExcludeMissing
            previousText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            text,
            applyTextNormalization,
            enableLogging,
            languageCode,
            modelId,
            nextText,
            optimizeStreamingLatency,
            outputFormat,
            previousText,
            seed,
            voiceId,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * Text to convert to speech
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Apply automatic text normalization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applyTextNormalization(): Optional<Boolean> =
            applyTextNormalization.getOptional("apply_text_normalization")

        /**
         * Enable request logging
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableLogging(): Optional<Boolean> = enableLogging.getOptional("enable_logging")

        /**
         * Language code for multilingual models
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languageCode(): Optional<String> = languageCode.getOptional("language_code")

        /**
         * ElevenLabs model ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelId(): Optional<ModelId> = modelId.getOptional("model_id")

        /**
         * Next context for better pronunciation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextText(): Optional<String> = nextText.getOptional("next_text")

        /**
         * Optimize for streaming latency (0-4)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optimizeStreamingLatency(): Optional<Long> =
            optimizeStreamingLatency.getOptional("optimize_streaming_latency")

        /**
         * Audio output format
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputFormat(): Optional<OutputFormat> = outputFormat.getOptional("output_format")

        /**
         * Previous context for better pronunciation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previousText(): Optional<String> = previousText.getOptional("previous_text")

        /**
         * Seed for reproducible generation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun seed(): Optional<Long> = seed.getOptional("seed")

        /**
         * ElevenLabs voice ID (defaults to Rachel - professional, clear)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceId(): Optional<String> = voiceId.getOptional("voice_id")

        /**
         * Voice customization settings
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [applyTextNormalization].
         *
         * Unlike [applyTextNormalization], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("apply_text_normalization")
        @ExcludeMissing
        fun _applyTextNormalization(): JsonField<Boolean> = applyTextNormalization

        /**
         * Returns the raw JSON value of [enableLogging].
         *
         * Unlike [enableLogging], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enable_logging")
        @ExcludeMissing
        fun _enableLogging(): JsonField<Boolean> = enableLogging

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
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<ModelId> = modelId

        /**
         * Returns the raw JSON value of [nextText].
         *
         * Unlike [nextText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_text") @ExcludeMissing fun _nextText(): JsonField<String> = nextText

        /**
         * Returns the raw JSON value of [optimizeStreamingLatency].
         *
         * Unlike [optimizeStreamingLatency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("optimize_streaming_latency")
        @ExcludeMissing
        fun _optimizeStreamingLatency(): JsonField<Long> = optimizeStreamingLatency

        /**
         * Returns the raw JSON value of [outputFormat].
         *
         * Unlike [outputFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_format")
        @ExcludeMissing
        fun _outputFormat(): JsonField<OutputFormat> = outputFormat

        /**
         * Returns the raw JSON value of [previousText].
         *
         * Unlike [previousText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_text")
        @ExcludeMissing
        fun _previousText(): JsonField<String> = previousText

        /**
         * Returns the raw JSON value of [seed].
         *
         * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

        /**
         * Returns the raw JSON value of [voiceId].
         *
         * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice_id") @ExcludeMissing fun _voiceId(): JsonField<String> = voiceId

        /**
         * Returns the raw JSON value of [voiceSettings].
         *
         * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_settings")
        @ExcludeMissing
        fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

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
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var applyTextNormalization: JsonField<Boolean> = JsonMissing.of()
            private var enableLogging: JsonField<Boolean> = JsonMissing.of()
            private var languageCode: JsonField<String> = JsonMissing.of()
            private var modelId: JsonField<ModelId> = JsonMissing.of()
            private var nextText: JsonField<String> = JsonMissing.of()
            private var optimizeStreamingLatency: JsonField<Long> = JsonMissing.of()
            private var outputFormat: JsonField<OutputFormat> = JsonMissing.of()
            private var previousText: JsonField<String> = JsonMissing.of()
            private var seed: JsonField<Long> = JsonMissing.of()
            private var voiceId: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                text = body.text
                applyTextNormalization = body.applyTextNormalization
                enableLogging = body.enableLogging
                languageCode = body.languageCode
                modelId = body.modelId
                nextText = body.nextText
                optimizeStreamingLatency = body.optimizeStreamingLatency
                outputFormat = body.outputFormat
                previousText = body.previousText
                seed = body.seed
                voiceId = body.voiceId
                voiceSettings = body.voiceSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Text to convert to speech */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Apply automatic text normalization */
            fun applyTextNormalization(applyTextNormalization: Boolean) =
                applyTextNormalization(JsonField.of(applyTextNormalization))

            /**
             * Sets [Builder.applyTextNormalization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyTextNormalization] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun applyTextNormalization(applyTextNormalization: JsonField<Boolean>) = apply {
                this.applyTextNormalization = applyTextNormalization
            }

            /** Enable request logging */
            fun enableLogging(enableLogging: Boolean) = enableLogging(JsonField.of(enableLogging))

            /**
             * Sets [Builder.enableLogging] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableLogging] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableLogging(enableLogging: JsonField<Boolean>) = apply {
                this.enableLogging = enableLogging
            }

            /** Language code for multilingual models */
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

            /** ElevenLabs model ID */
            fun modelId(modelId: ModelId) = modelId(JsonField.of(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [ModelId] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<ModelId>) = apply { this.modelId = modelId }

            /** Next context for better pronunciation */
            fun nextText(nextText: String) = nextText(JsonField.of(nextText))

            /**
             * Sets [Builder.nextText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextText(nextText: JsonField<String>) = apply { this.nextText = nextText }

            /** Optimize for streaming latency (0-4) */
            fun optimizeStreamingLatency(optimizeStreamingLatency: Long) =
                optimizeStreamingLatency(JsonField.of(optimizeStreamingLatency))

            /**
             * Sets [Builder.optimizeStreamingLatency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optimizeStreamingLatency] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun optimizeStreamingLatency(optimizeStreamingLatency: JsonField<Long>) = apply {
                this.optimizeStreamingLatency = optimizeStreamingLatency
            }

            /** Audio output format */
            fun outputFormat(outputFormat: OutputFormat) = outputFormat(JsonField.of(outputFormat))

            /**
             * Sets [Builder.outputFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputFormat] with a well-typed [OutputFormat] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputFormat(outputFormat: JsonField<OutputFormat>) = apply {
                this.outputFormat = outputFormat
            }

            /** Previous context for better pronunciation */
            fun previousText(previousText: String) = previousText(JsonField.of(previousText))

            /**
             * Sets [Builder.previousText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousText(previousText: JsonField<String>) = apply {
                this.previousText = previousText
            }

            /** Seed for reproducible generation */
            fun seed(seed: Long) = seed(JsonField.of(seed))

            /**
             * Sets [Builder.seed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

            /** ElevenLabs voice ID (defaults to Rachel - professional, clear) */
            fun voiceId(voiceId: String) = voiceId(JsonField.of(voiceId))

            /**
             * Sets [Builder.voiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceId(voiceId: JsonField<String>) = apply { this.voiceId = voiceId }

            /** Voice customization settings */
            fun voiceSettings(voiceSettings: VoiceSettings) =
                voiceSettings(JsonField.of(voiceSettings))

            /**
             * Sets [Builder.voiceSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
                this.voiceSettings = voiceSettings
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
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("text", text),
                    applyTextNormalization,
                    enableLogging,
                    languageCode,
                    modelId,
                    nextText,
                    optimizeStreamingLatency,
                    outputFormat,
                    previousText,
                    seed,
                    voiceId,
                    voiceSettings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            text()
            applyTextNormalization()
            enableLogging()
            languageCode()
            modelId().ifPresent { it.validate() }
            nextText()
            optimizeStreamingLatency()
            outputFormat().ifPresent { it.validate() }
            previousText()
            seed()
            voiceId()
            voiceSettings().ifPresent { it.validate() }
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
            (if (text.asKnown().isPresent) 1 else 0) +
                (if (applyTextNormalization.asKnown().isPresent) 1 else 0) +
                (if (enableLogging.asKnown().isPresent) 1 else 0) +
                (if (languageCode.asKnown().isPresent) 1 else 0) +
                (modelId.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nextText.asKnown().isPresent) 1 else 0) +
                (if (optimizeStreamingLatency.asKnown().isPresent) 1 else 0) +
                (outputFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (previousText.asKnown().isPresent) 1 else 0) +
                (if (seed.asKnown().isPresent) 1 else 0) +
                (if (voiceId.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                text == other.text &&
                applyTextNormalization == other.applyTextNormalization &&
                enableLogging == other.enableLogging &&
                languageCode == other.languageCode &&
                modelId == other.modelId &&
                nextText == other.nextText &&
                optimizeStreamingLatency == other.optimizeStreamingLatency &&
                outputFormat == other.outputFormat &&
                previousText == other.previousText &&
                seed == other.seed &&
                voiceId == other.voiceId &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                text,
                applyTextNormalization,
                enableLogging,
                languageCode,
                modelId,
                nextText,
                optimizeStreamingLatency,
                outputFormat,
                previousText,
                seed,
                voiceId,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{text=$text, applyTextNormalization=$applyTextNormalization, enableLogging=$enableLogging, languageCode=$languageCode, modelId=$modelId, nextText=$nextText, optimizeStreamingLatency=$optimizeStreamingLatency, outputFormat=$outputFormat, previousText=$previousText, seed=$seed, voiceId=$voiceId, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /** ElevenLabs model ID */
    class ModelId @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ELEVEN_MULTILINGUAL_V2 = of("eleven_multilingual_v2")

            @JvmField val ELEVEN_TURBO_V2 = of("eleven_turbo_v2")

            @JvmField val ELEVEN_MONOLINGUAL_V1 = of("eleven_monolingual_v1")

            @JvmStatic fun of(value: String) = ModelId(JsonField.of(value))
        }

        /** An enum containing [ModelId]'s known values. */
        enum class Known {
            ELEVEN_MULTILINGUAL_V2,
            ELEVEN_TURBO_V2,
            ELEVEN_MONOLINGUAL_V1,
        }

        /**
         * An enum containing [ModelId]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModelId] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ELEVEN_MULTILINGUAL_V2,
            ELEVEN_TURBO_V2,
            ELEVEN_MONOLINGUAL_V1,
            /** An enum member indicating that [ModelId] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ELEVEN_MULTILINGUAL_V2 -> Value.ELEVEN_MULTILINGUAL_V2
                ELEVEN_TURBO_V2 -> Value.ELEVEN_TURBO_V2
                ELEVEN_MONOLINGUAL_V1 -> Value.ELEVEN_MONOLINGUAL_V1
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ELEVEN_MULTILINGUAL_V2 -> Known.ELEVEN_MULTILINGUAL_V2
                ELEVEN_TURBO_V2 -> Known.ELEVEN_TURBO_V2
                ELEVEN_MONOLINGUAL_V1 -> Known.ELEVEN_MONOLINGUAL_V1
                else -> throw CasedevInvalidDataException("Unknown ModelId: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ModelId = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelId && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Audio output format */
    class OutputFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MP3_44100_128 = of("mp3_44100_128")

            @JvmField val MP3_44100_192 = of("mp3_44100_192")

            @JvmField val PCM_16000 = of("pcm_16000")

            @JvmField val PCM_22050 = of("pcm_22050")

            @JvmField val PCM_24000 = of("pcm_24000")

            @JvmField val PCM_44100 = of("pcm_44100")

            @JvmStatic fun of(value: String) = OutputFormat(JsonField.of(value))
        }

        /** An enum containing [OutputFormat]'s known values. */
        enum class Known {
            MP3_44100_128,
            MP3_44100_192,
            PCM_16000,
            PCM_22050,
            PCM_24000,
            PCM_44100,
        }

        /**
         * An enum containing [OutputFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OutputFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MP3_44100_128,
            MP3_44100_192,
            PCM_16000,
            PCM_22050,
            PCM_24000,
            PCM_44100,
            /**
             * An enum member indicating that [OutputFormat] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MP3_44100_128 -> Value.MP3_44100_128
                MP3_44100_192 -> Value.MP3_44100_192
                PCM_16000 -> Value.PCM_16000
                PCM_22050 -> Value.PCM_22050
                PCM_24000 -> Value.PCM_24000
                PCM_44100 -> Value.PCM_44100
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MP3_44100_128 -> Known.MP3_44100_128
                MP3_44100_192 -> Known.MP3_44100_192
                PCM_16000 -> Known.PCM_16000
                PCM_22050 -> Known.PCM_22050
                PCM_24000 -> Known.PCM_24000
                PCM_44100 -> Known.PCM_44100
                else -> throw CasedevInvalidDataException("Unknown OutputFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OutputFormat = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Voice customization settings */
    class VoiceSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val similarityBoost: JsonField<Double>,
        private val stability: JsonField<Double>,
        private val style: JsonField<Double>,
        private val useSpeakerBoost: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("similarity_boost")
            @ExcludeMissing
            similarityBoost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("stability")
            @ExcludeMissing
            stability: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("style") @ExcludeMissing style: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_speaker_boost")
            @ExcludeMissing
            useSpeakerBoost: JsonField<Boolean> = JsonMissing.of(),
        ) : this(similarityBoost, stability, style, useSpeakerBoost, mutableMapOf())

        /**
         * Similarity boost (0-1)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun similarityBoost(): Optional<Double> = similarityBoost.getOptional("similarity_boost")

        /**
         * Voice stability (0-1)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stability(): Optional<Double> = stability.getOptional("stability")

        /**
         * Style exaggeration (0-1)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun style(): Optional<Double> = style.getOptional("style")

        /**
         * Enable speaker boost
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useSpeakerBoost(): Optional<Boolean> = useSpeakerBoost.getOptional("use_speaker_boost")

        /**
         * Returns the raw JSON value of [similarityBoost].
         *
         * Unlike [similarityBoost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("similarity_boost")
        @ExcludeMissing
        fun _similarityBoost(): JsonField<Double> = similarityBoost

        /**
         * Returns the raw JSON value of [stability].
         *
         * Unlike [stability], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stability") @ExcludeMissing fun _stability(): JsonField<Double> = stability

        /**
         * Returns the raw JSON value of [style].
         *
         * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<Double> = style

        /**
         * Returns the raw JSON value of [useSpeakerBoost].
         *
         * Unlike [useSpeakerBoost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_speaker_boost")
        @ExcludeMissing
        fun _useSpeakerBoost(): JsonField<Boolean> = useSpeakerBoost

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

            /** Returns a mutable builder for constructing an instance of [VoiceSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoiceSettings]. */
        class Builder internal constructor() {

            private var similarityBoost: JsonField<Double> = JsonMissing.of()
            private var stability: JsonField<Double> = JsonMissing.of()
            private var style: JsonField<Double> = JsonMissing.of()
            private var useSpeakerBoost: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voiceSettings: VoiceSettings) = apply {
                similarityBoost = voiceSettings.similarityBoost
                stability = voiceSettings.stability
                style = voiceSettings.style
                useSpeakerBoost = voiceSettings.useSpeakerBoost
                additionalProperties = voiceSettings.additionalProperties.toMutableMap()
            }

            /** Similarity boost (0-1) */
            fun similarityBoost(similarityBoost: Double) =
                similarityBoost(JsonField.of(similarityBoost))

            /**
             * Sets [Builder.similarityBoost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.similarityBoost] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun similarityBoost(similarityBoost: JsonField<Double>) = apply {
                this.similarityBoost = similarityBoost
            }

            /** Voice stability (0-1) */
            fun stability(stability: Double) = stability(JsonField.of(stability))

            /**
             * Sets [Builder.stability] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stability] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stability(stability: JsonField<Double>) = apply { this.stability = stability }

            /** Style exaggeration (0-1) */
            fun style(style: Double) = style(JsonField.of(style))

            /**
             * Sets [Builder.style] to an arbitrary JSON value.
             *
             * You should usually call [Builder.style] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun style(style: JsonField<Double>) = apply { this.style = style }

            /** Enable speaker boost */
            fun useSpeakerBoost(useSpeakerBoost: Boolean) =
                useSpeakerBoost(JsonField.of(useSpeakerBoost))

            /**
             * Sets [Builder.useSpeakerBoost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useSpeakerBoost] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useSpeakerBoost(useSpeakerBoost: JsonField<Boolean>) = apply {
                this.useSpeakerBoost = useSpeakerBoost
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
             * Returns an immutable instance of [VoiceSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoiceSettings =
                VoiceSettings(
                    similarityBoost,
                    stability,
                    style,
                    useSpeakerBoost,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): VoiceSettings = apply {
            if (validated) {
                return@apply
            }

            similarityBoost()
            stability()
            style()
            useSpeakerBoost()
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
            (if (similarityBoost.asKnown().isPresent) 1 else 0) +
                (if (stability.asKnown().isPresent) 1 else 0) +
                (if (style.asKnown().isPresent) 1 else 0) +
                (if (useSpeakerBoost.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoiceSettings &&
                similarityBoost == other.similarityBoost &&
                stability == other.stability &&
                style == other.style &&
                useSpeakerBoost == other.useSpeakerBoost &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(similarityBoost, stability, style, useSpeakerBoost, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoiceSettings{similarityBoost=$similarityBoost, stability=$stability, style=$style, useSpeakerBoost=$useSpeakerBoost, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpeakCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SpeakCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
