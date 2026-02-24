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
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val status: JsonField<Status>,
    private val audioDuration: JsonField<Double>,
    private val confidence: JsonField<Double>,
    private val error: JsonField<String>,
    private val resultObjectId: JsonField<String>,
    private val sourceObjectId: JsonField<String>,
    private val text: JsonField<String>,
    private val vaultId: JsonField<String>,
    private val wordCount: JsonField<Long>,
    private val words: JsonField<List<JsonValue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("audio_duration")
        @ExcludeMissing
        audioDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result_object_id")
        @ExcludeMissing
        resultObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_object_id")
        @ExcludeMissing
        sourceObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("word_count") @ExcludeMissing wordCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("words") @ExcludeMissing words: JsonField<List<JsonValue>> = JsonMissing.of(),
    ) : this(
        id,
        status,
        audioDuration,
        confidence,
        error,
        resultObjectId,
        sourceObjectId,
        text,
        vaultId,
        wordCount,
        words,
        mutableMapOf(),
    )

    /**
     * Unique transcription job ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Current status of the transcription job
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Duration of the audio file in seconds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioDuration(): Optional<Double> = audioDuration.getOptional("audio_duration")

    /**
     * Overall confidence score (0-100)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confidence(): Optional<Double> = confidence.getOptional("confidence")

    /**
     * Error message (only present when status is failed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Result transcript object ID (vault-based jobs, when completed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultObjectId(): Optional<String> = resultObjectId.getOptional("result_object_id")

    /**
     * Source audio object ID (vault-based jobs only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceObjectId(): Optional<String> = sourceObjectId.getOptional("source_object_id")

    /**
     * Full transcription text (legacy direct URL jobs only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Vault ID (vault-based jobs only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = vaultId.getOptional("vault_id")

    /**
     * Number of words in the transcript
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wordCount(): Optional<Long> = wordCount.getOptional("word_count")

    /**
     * Word-level timestamps (legacy direct URL jobs only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun words(): Optional<List<JsonValue>> = words.getOptional("words")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [audioDuration].
     *
     * Unlike [audioDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_duration")
    @ExcludeMissing
    fun _audioDuration(): JsonField<Double> = audioDuration

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [resultObjectId].
     *
     * Unlike [resultObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result_object_id")
    @ExcludeMissing
    fun _resultObjectId(): JsonField<String> = resultObjectId

    /**
     * Returns the raw JSON value of [sourceObjectId].
     *
     * Unlike [sourceObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_object_id")
    @ExcludeMissing
    fun _sourceObjectId(): JsonField<String> = sourceObjectId

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

    /**
     * Returns the raw JSON value of [wordCount].
     *
     * Unlike [wordCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("word_count") @ExcludeMissing fun _wordCount(): JsonField<Long> = wordCount

    /**
     * Returns the raw JSON value of [words].
     *
     * Unlike [words], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<JsonValue>> = words

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
         * Returns a mutable builder for constructing an instance of
         * [TranscriptionRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var audioDuration: JsonField<Double> = JsonMissing.of()
        private var confidence: JsonField<Double> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var resultObjectId: JsonField<String> = JsonMissing.of()
        private var sourceObjectId: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var vaultId: JsonField<String> = JsonMissing.of()
        private var wordCount: JsonField<Long> = JsonMissing.of()
        private var words: JsonField<MutableList<JsonValue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionRetrieveResponse: TranscriptionRetrieveResponse) = apply {
            id = transcriptionRetrieveResponse.id
            status = transcriptionRetrieveResponse.status
            audioDuration = transcriptionRetrieveResponse.audioDuration
            confidence = transcriptionRetrieveResponse.confidence
            error = transcriptionRetrieveResponse.error
            resultObjectId = transcriptionRetrieveResponse.resultObjectId
            sourceObjectId = transcriptionRetrieveResponse.sourceObjectId
            text = transcriptionRetrieveResponse.text
            vaultId = transcriptionRetrieveResponse.vaultId
            wordCount = transcriptionRetrieveResponse.wordCount
            words = transcriptionRetrieveResponse.words.map { it.toMutableList() }
            additionalProperties = transcriptionRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Unique transcription job ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Current status of the transcription job */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Duration of the audio file in seconds */
        fun audioDuration(audioDuration: Double) = audioDuration(JsonField.of(audioDuration))

        /**
         * Sets [Builder.audioDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioDuration] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioDuration(audioDuration: JsonField<Double>) = apply {
            this.audioDuration = audioDuration
        }

        /** Overall confidence score (0-100) */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

        /** Error message (only present when status is failed) */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Result transcript object ID (vault-based jobs, when completed) */
        fun resultObjectId(resultObjectId: String) = resultObjectId(JsonField.of(resultObjectId))

        /**
         * Sets [Builder.resultObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resultObjectId(resultObjectId: JsonField<String>) = apply {
            this.resultObjectId = resultObjectId
        }

        /** Source audio object ID (vault-based jobs only) */
        fun sourceObjectId(sourceObjectId: String) = sourceObjectId(JsonField.of(sourceObjectId))

        /**
         * Sets [Builder.sourceObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceObjectId(sourceObjectId: JsonField<String>) = apply {
            this.sourceObjectId = sourceObjectId
        }

        /** Full transcription text (legacy direct URL jobs only) */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Vault ID (vault-based jobs only) */
        fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

        /** Number of words in the transcript */
        fun wordCount(wordCount: Long) = wordCount(JsonField.of(wordCount))

        /**
         * Sets [Builder.wordCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wordCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wordCount(wordCount: JsonField<Long>) = apply { this.wordCount = wordCount }

        /** Word-level timestamps (legacy direct URL jobs only) */
        fun words(words: List<JsonValue>) = words(JsonField.of(words))

        /**
         * Sets [Builder.words] to an arbitrary JSON value.
         *
         * You should usually call [Builder.words] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun words(words: JsonField<List<JsonValue>>) = apply {
            this.words = words.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [words].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWord(word: JsonValue) = apply {
            words =
                (words ?: JsonField.of(mutableListOf())).also { checkKnown("words", it).add(word) }
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
         * Returns an immutable instance of [TranscriptionRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptionRetrieveResponse =
            TranscriptionRetrieveResponse(
                checkRequired("id", id),
                checkRequired("status", status),
                audioDuration,
                confidence,
                error,
                resultObjectId,
                sourceObjectId,
                text,
                vaultId,
                wordCount,
                (words ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        status().validate()
        audioDuration()
        confidence()
        error()
        resultObjectId()
        sourceObjectId()
        text()
        vaultId()
        wordCount()
        words()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (audioDuration.asKnown().isPresent) 1 else 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (resultObjectId.asKnown().isPresent) 1 else 0) +
            (if (sourceObjectId.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0) +
            (if (wordCount.asKnown().isPresent) 1 else 0) +
            (words.asKnown().getOrNull()?.size ?: 0)

    /** Current status of the transcription job */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUEUED = of("queued")

            @JvmField val PROCESSING = of("processing")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            PROCESSING,
            COMPLETED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            PROCESSING,
            COMPLETED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                QUEUED -> Value.QUEUED
                PROCESSING -> Value.PROCESSING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
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
                QUEUED -> Known.QUEUED
                PROCESSING -> Known.PROCESSING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                else -> throw CasedevInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionRetrieveResponse &&
            id == other.id &&
            status == other.status &&
            audioDuration == other.audioDuration &&
            confidence == other.confidence &&
            error == other.error &&
            resultObjectId == other.resultObjectId &&
            sourceObjectId == other.sourceObjectId &&
            text == other.text &&
            vaultId == other.vaultId &&
            wordCount == other.wordCount &&
            words == other.words &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            status,
            audioDuration,
            confidence,
            error,
            resultObjectId,
            sourceObjectId,
            text,
            vaultId,
            wordCount,
            words,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionRetrieveResponse{id=$id, status=$status, audioDuration=$audioDuration, confidence=$confidence, error=$error, resultObjectId=$resultObjectId, sourceObjectId=$sourceObjectId, text=$text, vaultId=$vaultId, wordCount=$wordCount, words=$words, additionalProperties=$additionalProperties}"
}
