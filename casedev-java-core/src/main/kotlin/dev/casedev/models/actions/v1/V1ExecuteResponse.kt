// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1ExecuteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val durationMs: JsonField<Double>,
    private val executionId: JsonField<String>,
    private val message: JsonField<String>,
    private val output: JsonField<Output>,
    private val status: JsonField<Status>,
    private val stepResults: JsonField<List<StepResult>>,
    private val webhookConfigured: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("duration_ms")
        @ExcludeMissing
        durationMs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("execution_id")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonField<Output> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("step_results")
        @ExcludeMissing
        stepResults: JsonField<List<StepResult>> = JsonMissing.of(),
        @JsonProperty("webhook_configured")
        @ExcludeMissing
        webhookConfigured: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        durationMs,
        executionId,
        message,
        output,
        status,
        stepResults,
        webhookConfigured,
        mutableMapOf(),
    )

    /**
     * Execution duration in milliseconds (only for completed executions)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Optional<Double> = durationMs.getOptional("duration_ms")

    /**
     * Unique identifier for this execution
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionId(): Optional<String> = executionId.getOptional("execution_id")

    /**
     * Human-readable status message
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Final output (only for synchronous/completed executions)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun output(): Optional<Output> = output.getOptional("output")

    /**
     * Current status of the execution
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Results from each step (only for synchronous/completed executions)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stepResults(): Optional<List<StepResult>> = stepResults.getOptional("step_results")

    /**
     * Whether webhook notifications are configured
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookConfigured(): Optional<Boolean> = webhookConfigured.getOptional("webhook_configured")

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_ms") @ExcludeMissing fun _durationMs(): JsonField<Double> = durationMs

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [stepResults].
     *
     * Unlike [stepResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("step_results")
    @ExcludeMissing
    fun _stepResults(): JsonField<List<StepResult>> = stepResults

    /**
     * Returns the raw JSON value of [webhookConfigured].
     *
     * Unlike [webhookConfigured], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_configured")
    @ExcludeMissing
    fun _webhookConfigured(): JsonField<Boolean> = webhookConfigured

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

        /** Returns a mutable builder for constructing an instance of [V1ExecuteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ExecuteResponse]. */
    class Builder internal constructor() {

        private var durationMs: JsonField<Double> = JsonMissing.of()
        private var executionId: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var output: JsonField<Output> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var stepResults: JsonField<MutableList<StepResult>>? = null
        private var webhookConfigured: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ExecuteResponse: V1ExecuteResponse) = apply {
            durationMs = v1ExecuteResponse.durationMs
            executionId = v1ExecuteResponse.executionId
            message = v1ExecuteResponse.message
            output = v1ExecuteResponse.output
            status = v1ExecuteResponse.status
            stepResults = v1ExecuteResponse.stepResults.map { it.toMutableList() }
            webhookConfigured = v1ExecuteResponse.webhookConfigured
            additionalProperties = v1ExecuteResponse.additionalProperties.toMutableMap()
        }

        /** Execution duration in milliseconds (only for completed executions) */
        fun durationMs(durationMs: Double) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationMs(durationMs: JsonField<Double>) = apply { this.durationMs = durationMs }

        /** Unique identifier for this execution */
        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        /** Human-readable status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Final output (only for synchronous/completed executions) */
        fun output(output: Output) = output(JsonField.of(output))

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed [Output] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun output(output: JsonField<Output>) = apply { this.output = output }

        /** Current status of the execution */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Results from each step (only for synchronous/completed executions) */
        fun stepResults(stepResults: List<StepResult>) = stepResults(JsonField.of(stepResults))

        /**
         * Sets [Builder.stepResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepResults] with a well-typed `List<StepResult>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stepResults(stepResults: JsonField<List<StepResult>>) = apply {
            this.stepResults = stepResults.map { it.toMutableList() }
        }

        /**
         * Adds a single [StepResult] to [stepResults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStepResult(stepResult: StepResult) = apply {
            stepResults =
                (stepResults ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stepResults", it).add(stepResult)
                }
        }

        /** Whether webhook notifications are configured */
        fun webhookConfigured(webhookConfigured: Boolean) =
            webhookConfigured(JsonField.of(webhookConfigured))

        /**
         * Sets [Builder.webhookConfigured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookConfigured] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookConfigured(webhookConfigured: JsonField<Boolean>) = apply {
            this.webhookConfigured = webhookConfigured
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
         * Returns an immutable instance of [V1ExecuteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ExecuteResponse =
            V1ExecuteResponse(
                durationMs,
                executionId,
                message,
                output,
                status,
                (stepResults ?: JsonMissing.of()).map { it.toImmutable() },
                webhookConfigured,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ExecuteResponse = apply {
        if (validated) {
            return@apply
        }

        durationMs()
        executionId()
        message()
        output().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        stepResults().ifPresent { it.forEach { it.validate() } }
        webhookConfigured()
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
        (if (durationMs.asKnown().isPresent) 1 else 0) +
            (if (executionId.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (output.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (stepResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (webhookConfigured.asKnown().isPresent) 1 else 0)

    /** Final output (only for synchronous/completed executions) */
    class Output
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Output]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Output]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(output: Output) = apply {
                additionalProperties = output.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Output].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Output = Output(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Output = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Output && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Output{additionalProperties=$additionalProperties}"
    }

    /** Current status of the execution */
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

            @JvmField val COMPLETED = of("completed")

            @JvmField val RUNNING = of("running")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            RUNNING,
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
            COMPLETED,
            RUNNING,
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
                COMPLETED -> Value.COMPLETED
                RUNNING -> Value.RUNNING
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
                COMPLETED -> Known.COMPLETED
                RUNNING -> Known.RUNNING
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

    class StepResult
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [StepResult]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StepResult]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stepResult: StepResult) = apply {
                additionalProperties = stepResult.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StepResult].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StepResult = StepResult(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): StepResult = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StepResult && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StepResult{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ExecuteResponse &&
            durationMs == other.durationMs &&
            executionId == other.executionId &&
            message == other.message &&
            output == other.output &&
            status == other.status &&
            stepResults == other.stepResults &&
            webhookConfigured == other.webhookConfigured &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            durationMs,
            executionId,
            message,
            output,
            status,
            stepResults,
            webhookConfigured,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ExecuteResponse{durationMs=$durationMs, executionId=$executionId, message=$message, output=$output, status=$status, stepResults=$stepResults, webhookConfigured=$webhookConfigured, additionalProperties=$additionalProperties}"
}
