// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1ExecuteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val duration: JsonField<Long>,
    private val executionArn: JsonField<String>,
    private val executionId: JsonField<String>,
    private val mode: JsonField<Mode>,
    private val output: JsonValue,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("executionArn")
        @ExcludeMissing
        executionArn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("executionId")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonValue = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(duration, executionArn, executionId, mode, output, status, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Long> = duration.getOptional("duration")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionArn(): Optional<String> = executionArn.getOptional("executionArn")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionId(): Optional<String> = executionId.getOptional("executionId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [executionArn].
     *
     * Unlike [executionArn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionArn")
    @ExcludeMissing
    fun _executionArn(): JsonField<String> = executionArn

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionId") @ExcludeMissing fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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

        /** Returns a mutable builder for constructing an instance of [V1ExecuteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ExecuteResponse]. */
    class Builder internal constructor() {

        private var duration: JsonField<Long> = JsonMissing.of()
        private var executionArn: JsonField<String> = JsonMissing.of()
        private var executionId: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var output: JsonValue = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ExecuteResponse: V1ExecuteResponse) = apply {
            duration = v1ExecuteResponse.duration
            executionArn = v1ExecuteResponse.executionArn
            executionId = v1ExecuteResponse.executionId
            mode = v1ExecuteResponse.mode
            output = v1ExecuteResponse.output
            status = v1ExecuteResponse.status
            additionalProperties = v1ExecuteResponse.additionalProperties.toMutableMap()
        }

        fun duration(duration: Long) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        fun executionArn(executionArn: String) = executionArn(JsonField.of(executionArn))

        /**
         * Sets [Builder.executionArn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionArn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionArn(executionArn: JsonField<String>) = apply {
            this.executionArn = executionArn
        }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        fun output(output: JsonValue) = apply { this.output = output }

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
         * Returns an immutable instance of [V1ExecuteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ExecuteResponse =
            V1ExecuteResponse(
                duration,
                executionArn,
                executionId,
                mode,
                output,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ExecuteResponse = apply {
        if (validated) {
            return@apply
        }

        duration()
        executionArn()
        executionId()
        mode().ifPresent { it.validate() }
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
        (if (duration.asKnown().isPresent) 1 else 0) +
            (if (executionArn.asKnown().isPresent) 1 else 0) +
            (if (executionId.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIRE_AND_FORGET = of("fire-and-forget")

            @JvmField val CALLBACK = of("callback")

            @JvmField val SYNC = of("sync")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            FIRE_AND_FORGET,
            CALLBACK,
            SYNC,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIRE_AND_FORGET,
            CALLBACK,
            SYNC,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                FIRE_AND_FORGET -> Value.FIRE_AND_FORGET
                CALLBACK -> Value.CALLBACK
                SYNC -> Value.SYNC
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
                FIRE_AND_FORGET -> Known.FIRE_AND_FORGET
                CALLBACK -> Known.CALLBACK
                SYNC -> Known.SYNC
                else -> throw CasedevInvalidDataException("Unknown Mode: $value")
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

        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val RUNNING = of("running")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RUNNING,
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
            RUNNING,
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
                RUNNING -> Value.RUNNING
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
                RUNNING -> Known.RUNNING
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

        return other is V1ExecuteResponse &&
            duration == other.duration &&
            executionArn == other.executionArn &&
            executionId == other.executionId &&
            mode == other.mode &&
            output == other.output &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            duration,
            executionArn,
            executionId,
            mode,
            output,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ExecuteResponse{duration=$duration, executionArn=$executionArn, executionId=$executionId, mode=$mode, output=$output, status=$status, additionalProperties=$additionalProperties}"
}
