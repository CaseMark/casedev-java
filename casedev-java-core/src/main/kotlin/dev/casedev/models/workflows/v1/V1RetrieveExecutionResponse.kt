// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class V1RetrieveExecutionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val completedAt: JsonField<String>,
    private val durationMs: JsonField<Long>,
    private val error: JsonField<String>,
    private val input: JsonValue,
    private val output: JsonValue,
    private val startedAt: JsonField<String>,
    private val status: JsonField<String>,
    private val triggerType: JsonField<String>,
    private val workflowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("durationMs") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonValue = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonValue = JsonMissing.of(),
        @JsonProperty("startedAt") @ExcludeMissing startedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("triggerType")
        @ExcludeMissing
        triggerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workflowId") @ExcludeMissing workflowId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        completedAt,
        durationMs,
        error,
        input,
        output,
        startedAt,
        status,
        triggerType,
        workflowId,
        mutableMapOf(),
    )

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<String> = completedAt.getOptional("completedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Optional<Long> = durationMs.getOptional("durationMs")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

    @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<String> = startedAt.getOptional("startedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerType(): Optional<String> = triggerType.getOptional("triggerType")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowId(): Optional<String> = workflowId.getOptional("workflowId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt") @ExcludeMissing fun _completedAt(): JsonField<String> = completedAt

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("durationMs") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [triggerType].
     *
     * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggerType") @ExcludeMissing fun _triggerType(): JsonField<String> = triggerType

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflowId") @ExcludeMissing fun _workflowId(): JsonField<String> = workflowId

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
         * Returns a mutable builder for constructing an instance of [V1RetrieveExecutionResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrieveExecutionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var completedAt: JsonField<String> = JsonMissing.of()
        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var output: JsonValue = JsonMissing.of()
        private var startedAt: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var triggerType: JsonField<String> = JsonMissing.of()
        private var workflowId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1RetrieveExecutionResponse: V1RetrieveExecutionResponse) = apply {
            id = v1RetrieveExecutionResponse.id
            completedAt = v1RetrieveExecutionResponse.completedAt
            durationMs = v1RetrieveExecutionResponse.durationMs
            error = v1RetrieveExecutionResponse.error
            input = v1RetrieveExecutionResponse.input
            output = v1RetrieveExecutionResponse.output
            startedAt = v1RetrieveExecutionResponse.startedAt
            status = v1RetrieveExecutionResponse.status
            triggerType = v1RetrieveExecutionResponse.triggerType
            workflowId = v1RetrieveExecutionResponse.workflowId
            additionalProperties = v1RetrieveExecutionResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun completedAt(completedAt: String) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun completedAt(completedAt: JsonField<String>) = apply { this.completedAt = completedAt }

        fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun input(input: JsonValue) = apply { this.input = input }

        fun output(output: JsonValue) = apply { this.output = output }

        fun startedAt(startedAt: String) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun triggerType(triggerType: String) = triggerType(JsonField.of(triggerType))

        /**
         * Sets [Builder.triggerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggerType(triggerType: JsonField<String>) = apply { this.triggerType = triggerType }

        fun workflowId(workflowId: String) = workflowId(JsonField.of(workflowId))

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflowId(workflowId: JsonField<String>) = apply { this.workflowId = workflowId }

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
         * Returns an immutable instance of [V1RetrieveExecutionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1RetrieveExecutionResponse =
            V1RetrieveExecutionResponse(
                id,
                completedAt,
                durationMs,
                error,
                input,
                output,
                startedAt,
                status,
                triggerType,
                workflowId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1RetrieveExecutionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        completedAt()
        durationMs()
        error()
        startedAt()
        status()
        triggerType()
        workflowId()
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
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (durationMs.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (triggerType.asKnown().isPresent) 1 else 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1RetrieveExecutionResponse &&
            id == other.id &&
            completedAt == other.completedAt &&
            durationMs == other.durationMs &&
            error == other.error &&
            input == other.input &&
            output == other.output &&
            startedAt == other.startedAt &&
            status == other.status &&
            triggerType == other.triggerType &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            completedAt,
            durationMs,
            error,
            input,
            output,
            startedAt,
            status,
            triggerType,
            workflowId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1RetrieveExecutionResponse{id=$id, completedAt=$completedAt, durationMs=$durationMs, error=$error, input=$input, output=$output, startedAt=$startedAt, status=$status, triggerType=$triggerType, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
