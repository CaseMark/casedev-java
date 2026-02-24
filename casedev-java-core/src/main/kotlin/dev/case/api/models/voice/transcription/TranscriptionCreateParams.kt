// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.transcription

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
import dev.case.api.core.checkKnown
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates an asynchronous transcription job for audio files. Supports two modes:
 *
 * **Vault-based (recommended)**: Pass `vault_id` and `object_id` to transcribe audio from your
 * vault. The transcript will automatically be saved back to the vault when complete.
 *
 * **Direct URL (legacy)**: Pass `audio_url` for direct transcription without automatic storage.
 */
class TranscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL of the audio file to transcribe (legacy mode, no auto-storage)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * Automatically extract key phrases and topics
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoHighlights(): Optional<Boolean> = body.autoHighlights()

    /**
     * How much to boost custom vocabulary
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boostParam(): Optional<BoostParam> = body.boostParam()

    /**
     * Enable content moderation and safety labeling
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentSafetyLabels(): Optional<Boolean> = body.contentSafetyLabels()

    /**
     * Output format for the transcript when using vault mode
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<Format> = body.format()

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
     * Object ID of the audio file in the vault (use with vault_id)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = body.objectId()

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
     * Expected number of speakers (improves accuracy when known)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speakersExpected(): Optional<Long> = body.speakersExpected()

    /**
     * Priority-ordered speech models to use
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speechModels(): Optional<List<String>> = body.speechModels()

    /**
     * Vault ID containing the audio file (use with object_id)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = body.vaultId()

    /**
     * Custom vocabulary words to boost (e.g., legal terms)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wordBoost(): Optional<List<String>> = body.wordBoost()

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
     * Returns the raw JSON value of [boostParam].
     *
     * Unlike [boostParam], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _boostParam(): JsonField<BoostParam> = body._boostParam()

    /**
     * Returns the raw JSON value of [contentSafetyLabels].
     *
     * Unlike [contentSafetyLabels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _contentSafetyLabels(): JsonField<Boolean> = body._contentSafetyLabels()

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _format(): JsonField<Format> = body._format()

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
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectId(): JsonField<String> = body._objectId()

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

    /**
     * Returns the raw JSON value of [speakersExpected].
     *
     * Unlike [speakersExpected], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _speakersExpected(): JsonField<Long> = body._speakersExpected()

    /**
     * Returns the raw JSON value of [speechModels].
     *
     * Unlike [speechModels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _speechModels(): JsonField<List<String>> = body._speechModels()

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultId(): JsonField<String> = body._vaultId()

    /**
     * Returns the raw JSON value of [wordBoost].
     *
     * Unlike [wordBoost], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _wordBoost(): JsonField<List<String>> = body._wordBoost()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TranscriptionCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [TranscriptionCreateParams].
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
         * - [boostParam]
         * - [contentSafetyLabels]
         * - [format]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL of the audio file to transcribe (legacy mode, no auto-storage) */
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

        /** How much to boost custom vocabulary */
        fun boostParam(boostParam: BoostParam) = apply { body.boostParam(boostParam) }

        /**
         * Sets [Builder.boostParam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boostParam] with a well-typed [BoostParam] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boostParam(boostParam: JsonField<BoostParam>) = apply { body.boostParam(boostParam) }

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

        /** Output format for the transcript when using vault mode */
        fun format(format: Format) = apply { body.format(format) }

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { body.format(format) }

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

        /** Object ID of the audio file in the vault (use with vault_id) */
        fun objectId(objectId: String) = apply { body.objectId(objectId) }

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { body.objectId(objectId) }

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

        /** Expected number of speakers (improves accuracy when known) */
        fun speakersExpected(speakersExpected: Long) = apply {
            body.speakersExpected(speakersExpected)
        }

        /**
         * Sets [Builder.speakersExpected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speakersExpected] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speakersExpected(speakersExpected: JsonField<Long>) = apply {
            body.speakersExpected(speakersExpected)
        }

        /** Priority-ordered speech models to use */
        fun speechModels(speechModels: List<String>) = apply { body.speechModels(speechModels) }

        /**
         * Sets [Builder.speechModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speechModels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speechModels(speechModels: JsonField<List<String>>) = apply {
            body.speechModels(speechModels)
        }

        /**
         * Adds a single [String] to [speechModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpeechModel(speechModel: String) = apply { body.addSpeechModel(speechModel) }

        /** Vault ID containing the audio file (use with object_id) */
        fun vaultId(vaultId: String) = apply { body.vaultId(vaultId) }

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { body.vaultId(vaultId) }

        /** Custom vocabulary words to boost (e.g., legal terms) */
        fun wordBoost(wordBoost: List<String>) = apply { body.wordBoost(wordBoost) }

        /**
         * Sets [Builder.wordBoost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wordBoost] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wordBoost(wordBoost: JsonField<List<String>>) = apply { body.wordBoost(wordBoost) }

        /**
         * Adds a single [String] to [Builder.wordBoost].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWordBoost(wordBoost: String) = apply { body.addWordBoost(wordBoost) }

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
        private val boostParam: JsonField<BoostParam>,
        private val contentSafetyLabels: JsonField<Boolean>,
        private val format: JsonField<Format>,
        private val formatText: JsonField<Boolean>,
        private val languageCode: JsonField<String>,
        private val languageDetection: JsonField<Boolean>,
        private val objectId: JsonField<String>,
        private val punctuate: JsonField<Boolean>,
        private val speakerLabels: JsonField<Boolean>,
        private val speakersExpected: JsonField<Long>,
        private val speechModels: JsonField<List<String>>,
        private val vaultId: JsonField<String>,
        private val wordBoost: JsonField<List<String>>,
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
            @JsonProperty("boost_param")
            @ExcludeMissing
            boostParam: JsonField<BoostParam> = JsonMissing.of(),
            @JsonProperty("content_safety_labels")
            @ExcludeMissing
            contentSafetyLabels: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
            @JsonProperty("format_text")
            @ExcludeMissing
            formatText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language_code")
            @ExcludeMissing
            languageCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language_detection")
            @ExcludeMissing
            languageDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object_id")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("punctuate")
            @ExcludeMissing
            punctuate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("speaker_labels")
            @ExcludeMissing
            speakerLabels: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("speakers_expected")
            @ExcludeMissing
            speakersExpected: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("speech_models")
            @ExcludeMissing
            speechModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("word_boost")
            @ExcludeMissing
            wordBoost: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            audioUrl,
            autoHighlights,
            boostParam,
            contentSafetyLabels,
            format,
            formatText,
            languageCode,
            languageDetection,
            objectId,
            punctuate,
            speakerLabels,
            speakersExpected,
            speechModels,
            vaultId,
            wordBoost,
            mutableMapOf(),
        )

        /**
         * URL of the audio file to transcribe (legacy mode, no auto-storage)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * Automatically extract key phrases and topics
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoHighlights(): Optional<Boolean> = autoHighlights.getOptional("auto_highlights")

        /**
         * How much to boost custom vocabulary
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun boostParam(): Optional<BoostParam> = boostParam.getOptional("boost_param")

        /**
         * Enable content moderation and safety labeling
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentSafetyLabels(): Optional<Boolean> =
            contentSafetyLabels.getOptional("content_safety_labels")

        /**
         * Output format for the transcript when using vault mode
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun format(): Optional<Format> = format.getOptional("format")

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
         * Object ID of the audio file in the vault (use with vault_id)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectId(): Optional<String> = objectId.getOptional("object_id")

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
         * Expected number of speakers (improves accuracy when known)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speakersExpected(): Optional<Long> = speakersExpected.getOptional("speakers_expected")

        /**
         * Priority-ordered speech models to use
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speechModels(): Optional<List<String>> = speechModels.getOptional("speech_models")

        /**
         * Vault ID containing the audio file (use with object_id)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultId(): Optional<String> = vaultId.getOptional("vault_id")

        /**
         * Custom vocabulary words to boost (e.g., legal terms)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wordBoost(): Optional<List<String>> = wordBoost.getOptional("word_boost")

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
         * Returns the raw JSON value of [boostParam].
         *
         * Unlike [boostParam], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boost_param")
        @ExcludeMissing
        fun _boostParam(): JsonField<BoostParam> = boostParam

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
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

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
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

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

        /**
         * Returns the raw JSON value of [speakersExpected].
         *
         * Unlike [speakersExpected], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("speakers_expected")
        @ExcludeMissing
        fun _speakersExpected(): JsonField<Long> = speakersExpected

        /**
         * Returns the raw JSON value of [speechModels].
         *
         * Unlike [speechModels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("speech_models")
        @ExcludeMissing
        fun _speechModels(): JsonField<List<String>> = speechModels

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

        /**
         * Returns the raw JSON value of [wordBoost].
         *
         * Unlike [wordBoost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("word_boost")
        @ExcludeMissing
        fun _wordBoost(): JsonField<List<String>> = wordBoost

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var autoHighlights: JsonField<Boolean> = JsonMissing.of()
            private var boostParam: JsonField<BoostParam> = JsonMissing.of()
            private var contentSafetyLabels: JsonField<Boolean> = JsonMissing.of()
            private var format: JsonField<Format> = JsonMissing.of()
            private var formatText: JsonField<Boolean> = JsonMissing.of()
            private var languageCode: JsonField<String> = JsonMissing.of()
            private var languageDetection: JsonField<Boolean> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var punctuate: JsonField<Boolean> = JsonMissing.of()
            private var speakerLabels: JsonField<Boolean> = JsonMissing.of()
            private var speakersExpected: JsonField<Long> = JsonMissing.of()
            private var speechModels: JsonField<MutableList<String>>? = null
            private var vaultId: JsonField<String> = JsonMissing.of()
            private var wordBoost: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioUrl = body.audioUrl
                autoHighlights = body.autoHighlights
                boostParam = body.boostParam
                contentSafetyLabels = body.contentSafetyLabels
                format = body.format
                formatText = body.formatText
                languageCode = body.languageCode
                languageDetection = body.languageDetection
                objectId = body.objectId
                punctuate = body.punctuate
                speakerLabels = body.speakerLabels
                speakersExpected = body.speakersExpected
                speechModels = body.speechModels.map { it.toMutableList() }
                vaultId = body.vaultId
                wordBoost = body.wordBoost.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL of the audio file to transcribe (legacy mode, no auto-storage) */
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

            /** How much to boost custom vocabulary */
            fun boostParam(boostParam: BoostParam) = boostParam(JsonField.of(boostParam))

            /**
             * Sets [Builder.boostParam] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boostParam] with a well-typed [BoostParam] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boostParam(boostParam: JsonField<BoostParam>) = apply {
                this.boostParam = boostParam
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

            /** Output format for the transcript when using vault mode */
            fun format(format: Format) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [Format] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<Format>) = apply { this.format = format }

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

            /** Object ID of the audio file in the vault (use with vault_id) */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

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

            /** Expected number of speakers (improves accuracy when known) */
            fun speakersExpected(speakersExpected: Long) =
                speakersExpected(JsonField.of(speakersExpected))

            /**
             * Sets [Builder.speakersExpected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speakersExpected] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speakersExpected(speakersExpected: JsonField<Long>) = apply {
                this.speakersExpected = speakersExpected
            }

            /** Priority-ordered speech models to use */
            fun speechModels(speechModels: List<String>) = speechModels(JsonField.of(speechModels))

            /**
             * Sets [Builder.speechModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speechModels] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speechModels(speechModels: JsonField<List<String>>) = apply {
                this.speechModels = speechModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [speechModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpeechModel(speechModel: String) = apply {
                speechModels =
                    (speechModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("speechModels", it).add(speechModel)
                    }
            }

            /** Vault ID containing the audio file (use with object_id) */
            fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

            /** Custom vocabulary words to boost (e.g., legal terms) */
            fun wordBoost(wordBoost: List<String>) = wordBoost(JsonField.of(wordBoost))

            /**
             * Sets [Builder.wordBoost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wordBoost] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wordBoost(wordBoost: JsonField<List<String>>) = apply {
                this.wordBoost = wordBoost.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.wordBoost].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWordBoost(wordBoost: String) = apply {
                this.wordBoost =
                    (this.wordBoost ?: JsonField.of(mutableListOf())).also {
                        checkKnown("wordBoost", it).add(wordBoost)
                    }
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
             */
            fun build(): Body =
                Body(
                    audioUrl,
                    autoHighlights,
                    boostParam,
                    contentSafetyLabels,
                    format,
                    formatText,
                    languageCode,
                    languageDetection,
                    objectId,
                    punctuate,
                    speakerLabels,
                    speakersExpected,
                    (speechModels ?: JsonMissing.of()).map { it.toImmutable() },
                    vaultId,
                    (wordBoost ?: JsonMissing.of()).map { it.toImmutable() },
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
            boostParam().ifPresent { it.validate() }
            contentSafetyLabels()
            format().ifPresent { it.validate() }
            formatText()
            languageCode()
            languageDetection()
            objectId()
            punctuate()
            speakerLabels()
            speakersExpected()
            speechModels()
            vaultId()
            wordBoost()
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
                (boostParam.asKnown().getOrNull()?.validity() ?: 0) +
                (if (contentSafetyLabels.asKnown().isPresent) 1 else 0) +
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                (if (formatText.asKnown().isPresent) 1 else 0) +
                (if (languageCode.asKnown().isPresent) 1 else 0) +
                (if (languageDetection.asKnown().isPresent) 1 else 0) +
                (if (objectId.asKnown().isPresent) 1 else 0) +
                (if (punctuate.asKnown().isPresent) 1 else 0) +
                (if (speakerLabels.asKnown().isPresent) 1 else 0) +
                (if (speakersExpected.asKnown().isPresent) 1 else 0) +
                (speechModels.asKnown().getOrNull()?.size ?: 0) +
                (if (vaultId.asKnown().isPresent) 1 else 0) +
                (wordBoost.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioUrl == other.audioUrl &&
                autoHighlights == other.autoHighlights &&
                boostParam == other.boostParam &&
                contentSafetyLabels == other.contentSafetyLabels &&
                format == other.format &&
                formatText == other.formatText &&
                languageCode == other.languageCode &&
                languageDetection == other.languageDetection &&
                objectId == other.objectId &&
                punctuate == other.punctuate &&
                speakerLabels == other.speakerLabels &&
                speakersExpected == other.speakersExpected &&
                speechModels == other.speechModels &&
                vaultId == other.vaultId &&
                wordBoost == other.wordBoost &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audioUrl,
                autoHighlights,
                boostParam,
                contentSafetyLabels,
                format,
                formatText,
                languageCode,
                languageDetection,
                objectId,
                punctuate,
                speakerLabels,
                speakersExpected,
                speechModels,
                vaultId,
                wordBoost,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioUrl=$audioUrl, autoHighlights=$autoHighlights, boostParam=$boostParam, contentSafetyLabels=$contentSafetyLabels, format=$format, formatText=$formatText, languageCode=$languageCode, languageDetection=$languageDetection, objectId=$objectId, punctuate=$punctuate, speakerLabels=$speakerLabels, speakersExpected=$speakersExpected, speechModels=$speechModels, vaultId=$vaultId, wordBoost=$wordBoost, additionalProperties=$additionalProperties}"
    }

    /** How much to boost custom vocabulary */
    class BoostParam @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOW = of("low")

            @JvmField val DEFAULT = of("default")

            @JvmField val HIGH = of("high")

            @JvmStatic fun of(value: String) = BoostParam(JsonField.of(value))
        }

        /** An enum containing [BoostParam]'s known values. */
        enum class Known {
            LOW,
            DEFAULT,
            HIGH,
        }

        /**
         * An enum containing [BoostParam]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BoostParam] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            DEFAULT,
            HIGH,
            /**
             * An enum member indicating that [BoostParam] was instantiated with an unknown value.
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
                LOW -> Value.LOW
                DEFAULT -> Value.DEFAULT
                HIGH -> Value.HIGH
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
                LOW -> Known.LOW
                DEFAULT -> Known.DEFAULT
                HIGH -> Known.HIGH
                else -> throw CasedevInvalidDataException("Unknown BoostParam: $value")
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

        fun validate(): BoostParam = apply {
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

            return other is BoostParam && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Output format for the transcript when using vault mode */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val JSON = of("json")

            @JvmField val TEXT = of("text")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            JSON,
            TEXT,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            TEXT,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                JSON -> Value.JSON
                TEXT -> Value.TEXT
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
                JSON -> Known.JSON
                TEXT -> Known.TEXT
                else -> throw CasedevInvalidDataException("Unknown Format: $value")
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

        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
