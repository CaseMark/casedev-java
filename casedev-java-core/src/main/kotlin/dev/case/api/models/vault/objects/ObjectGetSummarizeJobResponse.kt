// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectGetSummarizeJobResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val error: JsonField<String>,
    private val jobId: JsonField<String>,
    private val resultFilename: JsonField<String>,
    private val resultObjectId: JsonField<String>,
    private val sourceObjectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val workflowType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jobId") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resultFilename")
        @ExcludeMissing
        resultFilename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resultObjectId")
        @ExcludeMissing
        resultObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceObjectId")
        @ExcludeMissing
        sourceObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("workflowType")
        @ExcludeMissing
        workflowType: JsonField<String> = JsonMissing.of(),
    ) : this(
        completedAt,
        createdAt,
        error,
        jobId,
        resultFilename,
        resultObjectId,
        sourceObjectId,
        status,
        workflowType,
        mutableMapOf(),
    )

    /**
     * When the job completed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

    /**
     * When the job was created
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Error message (if failed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Case.dev job ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("jobId")

    /**
     * Filename of the result document (if completed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultFilename(): Optional<String> = resultFilename.getOptional("resultFilename")

    /**
     * ID of the result document (if completed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultObjectId(): Optional<String> = resultObjectId.getOptional("resultObjectId")

    /**
     * ID of the source document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceObjectId(): Optional<String> = sourceObjectId.getOptional("sourceObjectId")

    /**
     * Current job status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Type of workflow being executed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowType(): Optional<String> = workflowType.getOptional("workflowType")

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jobId") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [resultFilename].
     *
     * Unlike [resultFilename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resultFilename")
    @ExcludeMissing
    fun _resultFilename(): JsonField<String> = resultFilename

    /**
     * Returns the raw JSON value of [resultObjectId].
     *
     * Unlike [resultObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resultObjectId")
    @ExcludeMissing
    fun _resultObjectId(): JsonField<String> = resultObjectId

    /**
     * Returns the raw JSON value of [sourceObjectId].
     *
     * Unlike [sourceObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceObjectId")
    @ExcludeMissing
    fun _sourceObjectId(): JsonField<String> = sourceObjectId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [workflowType].
     *
     * Unlike [workflowType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflowType")
    @ExcludeMissing
    fun _workflowType(): JsonField<String> = workflowType

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
         * [ObjectGetSummarizeJobResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetSummarizeJobResponse]. */
    class Builder internal constructor() {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var resultFilename: JsonField<String> = JsonMissing.of()
        private var resultObjectId: JsonField<String> = JsonMissing.of()
        private var sourceObjectId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var workflowType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectGetSummarizeJobResponse: ObjectGetSummarizeJobResponse) = apply {
            completedAt = objectGetSummarizeJobResponse.completedAt
            createdAt = objectGetSummarizeJobResponse.createdAt
            error = objectGetSummarizeJobResponse.error
            jobId = objectGetSummarizeJobResponse.jobId
            resultFilename = objectGetSummarizeJobResponse.resultFilename
            resultObjectId = objectGetSummarizeJobResponse.resultObjectId
            sourceObjectId = objectGetSummarizeJobResponse.sourceObjectId
            status = objectGetSummarizeJobResponse.status
            workflowType = objectGetSummarizeJobResponse.workflowType
            additionalProperties = objectGetSummarizeJobResponse.additionalProperties.toMutableMap()
        }

        /** When the job completed */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /** When the job was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Error message (if failed) */
        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Case.dev job ID */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** Filename of the result document (if completed) */
        fun resultFilename(resultFilename: String?) =
            resultFilename(JsonField.ofNullable(resultFilename))

        /** Alias for calling [Builder.resultFilename] with `resultFilename.orElse(null)`. */
        fun resultFilename(resultFilename: Optional<String>) =
            resultFilename(resultFilename.getOrNull())

        /**
         * Sets [Builder.resultFilename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultFilename] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resultFilename(resultFilename: JsonField<String>) = apply {
            this.resultFilename = resultFilename
        }

        /** ID of the result document (if completed) */
        fun resultObjectId(resultObjectId: String?) =
            resultObjectId(JsonField.ofNullable(resultObjectId))

        /** Alias for calling [Builder.resultObjectId] with `resultObjectId.orElse(null)`. */
        fun resultObjectId(resultObjectId: Optional<String>) =
            resultObjectId(resultObjectId.getOrNull())

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

        /** ID of the source document */
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

        /** Current job status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Type of workflow being executed */
        fun workflowType(workflowType: String) = workflowType(JsonField.of(workflowType))

        /**
         * Sets [Builder.workflowType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflowType(workflowType: JsonField<String>) = apply {
            this.workflowType = workflowType
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
         * Returns an immutable instance of [ObjectGetSummarizeJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectGetSummarizeJobResponse =
            ObjectGetSummarizeJobResponse(
                completedAt,
                createdAt,
                error,
                jobId,
                resultFilename,
                resultObjectId,
                sourceObjectId,
                status,
                workflowType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectGetSummarizeJobResponse = apply {
        if (validated) {
            return@apply
        }

        completedAt()
        createdAt()
        error()
        jobId()
        resultFilename()
        resultObjectId()
        sourceObjectId()
        status().ifPresent { it.validate() }
        workflowType()
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
        (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (if (resultFilename.asKnown().isPresent) 1 else 0) +
            (if (resultObjectId.asKnown().isPresent) 1 else 0) +
            (if (sourceObjectId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workflowType.asKnown().isPresent) 1 else 0)

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

            @JvmField val PENDING = of("pending")

            @JvmField val PROCESSING = of("processing")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
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
            PENDING,
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
                PENDING -> Value.PENDING
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
                PENDING -> Known.PENDING
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

        return other is ObjectGetSummarizeJobResponse &&
            completedAt == other.completedAt &&
            createdAt == other.createdAt &&
            error == other.error &&
            jobId == other.jobId &&
            resultFilename == other.resultFilename &&
            resultObjectId == other.resultObjectId &&
            sourceObjectId == other.sourceObjectId &&
            status == other.status &&
            workflowType == other.workflowType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completedAt,
            createdAt,
            error,
            jobId,
            resultFilename,
            resultObjectId,
            sourceObjectId,
            status,
            workflowType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectGetSummarizeJobResponse{completedAt=$completedAt, createdAt=$createdAt, error=$error, jobId=$jobId, resultFilename=$resultFilename, resultObjectId=$resultObjectId, sourceObjectId=$sourceObjectId, status=$status, workflowType=$workflowType, additionalProperties=$additionalProperties}"
}
