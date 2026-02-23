// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.ocr.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.Enum
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1ProcessResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documentId: JsonField<String>,
    private val engine: JsonField<String>,
    private val estimatedCompletion: JsonField<OffsetDateTime>,
    private val pageCount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_id")
        @ExcludeMissing
        documentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("engine") @ExcludeMissing engine: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estimated_completion")
        @ExcludeMissing
        estimatedCompletion: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("page_count") @ExcludeMissing pageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        documentId,
        engine,
        estimatedCompletion,
        pageCount,
        status,
        mutableMapOf(),
    )

    /**
     * Unique job identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Job creation timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Document identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentId(): Optional<String> = documentId.getOptional("document_id")

    /**
     * OCR engine used
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun engine(): Optional<String> = engine.getOptional("engine")

    /**
     * Estimated completion time
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedCompletion(): Optional<OffsetDateTime> =
        estimatedCompletion.getOptional("estimated_completion")

    /**
     * Number of pages detected
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCount(): Optional<Long> = pageCount.getOptional("page_count")

    /**
     * Current job status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_id") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

    /**
     * Returns the raw JSON value of [engine].
     *
     * Unlike [engine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engine") @ExcludeMissing fun _engine(): JsonField<String> = engine

    /**
     * Returns the raw JSON value of [estimatedCompletion].
     *
     * Unlike [estimatedCompletion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estimated_completion")
    @ExcludeMissing
    fun _estimatedCompletion(): JsonField<OffsetDateTime> = estimatedCompletion

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [V1ProcessResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ProcessResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documentId: JsonField<String> = JsonMissing.of()
        private var engine: JsonField<String> = JsonMissing.of()
        private var estimatedCompletion: JsonField<OffsetDateTime> = JsonMissing.of()
        private var pageCount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ProcessResponse: V1ProcessResponse) = apply {
            id = v1ProcessResponse.id
            createdAt = v1ProcessResponse.createdAt
            documentId = v1ProcessResponse.documentId
            engine = v1ProcessResponse.engine
            estimatedCompletion = v1ProcessResponse.estimatedCompletion
            pageCount = v1ProcessResponse.pageCount
            status = v1ProcessResponse.status
            additionalProperties = v1ProcessResponse.additionalProperties.toMutableMap()
        }

        /** Unique job identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Job creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Document identifier */
        fun documentId(documentId: String) = documentId(JsonField.of(documentId))

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        /** OCR engine used */
        fun engine(engine: String) = engine(JsonField.of(engine))

        /**
         * Sets [Builder.engine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engine] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun engine(engine: JsonField<String>) = apply { this.engine = engine }

        /** Estimated completion time */
        fun estimatedCompletion(estimatedCompletion: OffsetDateTime) =
            estimatedCompletion(JsonField.of(estimatedCompletion))

        /**
         * Sets [Builder.estimatedCompletion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedCompletion] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun estimatedCompletion(estimatedCompletion: JsonField<OffsetDateTime>) = apply {
            this.estimatedCompletion = estimatedCompletion
        }

        /** Number of pages detected */
        fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

        /** Current job status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [V1ProcessResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ProcessResponse =
            V1ProcessResponse(
                id,
                createdAt,
                documentId,
                engine,
                estimatedCompletion,
                pageCount,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ProcessResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        documentId()
        engine()
        estimatedCompletion()
        pageCount()
        status().ifPresent { it.validate() }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (documentId.asKnown().isPresent) 1 else 0) +
            (if (engine.asKnown().isPresent) 1 else 0) +
            (if (estimatedCompletion.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** Current job status */
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

        return other is V1ProcessResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            documentId == other.documentId &&
            engine == other.engine &&
            estimatedCompletion == other.estimatedCompletion &&
            pageCount == other.pageCount &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            documentId,
            engine,
            estimatedCompletion,
            pageCount,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ProcessResponse{id=$id, createdAt=$createdAt, documentId=$documentId, engine=$engine, estimatedCompletion=$estimatedCompletion, pageCount=$pageCount, status=$status, additionalProperties=$additionalProperties}"
}
