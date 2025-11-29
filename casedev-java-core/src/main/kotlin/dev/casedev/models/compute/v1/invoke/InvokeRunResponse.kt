// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.invoke

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.BaseDeserializer
import dev.casedev.core.BaseSerializer
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.allMaxBy
import dev.casedev.core.getOrThrow
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = InvokeRunResponse.Deserializer::class)
@JsonSerialize(using = InvokeRunResponse.Serializer::class)
class InvokeRunResponse
private constructor(
    private val synchronous: SynchronousResponse? = null,
    private val asynchronous: AsynchronousResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun synchronous(): Optional<SynchronousResponse> = Optional.ofNullable(synchronous)

    fun asynchronous(): Optional<AsynchronousResponse> = Optional.ofNullable(asynchronous)

    fun isSynchronous(): Boolean = synchronous != null

    fun isAsynchronous(): Boolean = asynchronous != null

    fun asSynchronous(): SynchronousResponse = synchronous.getOrThrow("synchronous")

    fun asAsynchronous(): AsynchronousResponse = asynchronous.getOrThrow("asynchronous")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            synchronous != null -> visitor.visitSynchronous(synchronous)
            asynchronous != null -> visitor.visitAsynchronous(asynchronous)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): InvokeRunResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSynchronous(synchronous: SynchronousResponse) {
                    synchronous.validate()
                }

                override fun visitAsynchronous(asynchronous: AsynchronousResponse) {
                    asynchronous.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitSynchronous(synchronous: SynchronousResponse) =
                    synchronous.validity()

                override fun visitAsynchronous(asynchronous: AsynchronousResponse) =
                    asynchronous.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvokeRunResponse &&
            synchronous == other.synchronous &&
            asynchronous == other.asynchronous
    }

    override fun hashCode(): Int = Objects.hash(synchronous, asynchronous)

    override fun toString(): String =
        when {
            synchronous != null -> "InvokeRunResponse{synchronous=$synchronous}"
            asynchronous != null -> "InvokeRunResponse{asynchronous=$asynchronous}"
            _json != null -> "InvokeRunResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InvokeRunResponse")
        }

    companion object {

        @JvmStatic
        fun ofSynchronous(synchronous: SynchronousResponse) =
            InvokeRunResponse(synchronous = synchronous)

        @JvmStatic
        fun ofAsynchronous(asynchronous: AsynchronousResponse) =
            InvokeRunResponse(asynchronous = asynchronous)
    }

    /**
     * An interface that defines how to map each variant of [InvokeRunResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitSynchronous(synchronous: SynchronousResponse): T

        fun visitAsynchronous(asynchronous: AsynchronousResponse): T

        /**
         * Maps an unknown variant of [InvokeRunResponse] to a value of type [T].
         *
         * An instance of [InvokeRunResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws CasedevInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CasedevInvalidDataException("Unknown InvokeRunResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<InvokeRunResponse>(InvokeRunResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InvokeRunResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SynchronousResponse>())?.let {
                            InvokeRunResponse(synchronous = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AsynchronousResponse>())?.let {
                            InvokeRunResponse(asynchronous = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> InvokeRunResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<InvokeRunResponse>(InvokeRunResponse::class) {

        override fun serialize(
            value: InvokeRunResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.synchronous != null -> generator.writeObject(value.synchronous)
                value.asynchronous != null -> generator.writeObject(value.asynchronous)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InvokeRunResponse")
            }
        }
    }

    class SynchronousResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duration: JsonField<Double>,
        private val error: JsonField<String>,
        private val output: JsonValue,
        private val runId: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonValue = JsonMissing.of(),
            @JsonProperty("runId") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(duration, error, output, runId, status, mutableMapOf())

        /**
         * Execution duration in milliseconds
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Double> = duration.getOptional("duration")

        /**
         * Error message if status is failed
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /** Function return value */
        @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

        /**
         * Unique run identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runId(): Optional<String> = runId.getOptional("runId")

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
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runId") @ExcludeMissing fun _runId(): JsonField<String> = runId

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

            /** Returns a mutable builder for constructing an instance of [SynchronousResponse]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SynchronousResponse]. */
        class Builder internal constructor() {

            private var duration: JsonField<Double> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var output: JsonValue = JsonMissing.of()
            private var runId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(synchronousResponse: SynchronousResponse) = apply {
                duration = synchronousResponse.duration
                error = synchronousResponse.error
                output = synchronousResponse.output
                runId = synchronousResponse.runId
                status = synchronousResponse.status
                additionalProperties = synchronousResponse.additionalProperties.toMutableMap()
            }

            /** Execution duration in milliseconds */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /** Error message if status is failed */
            fun error(error: String) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** Function return value */
            fun output(output: JsonValue) = apply { this.output = output }

            /** Unique run identifier */
            fun runId(runId: String) = runId(JsonField.of(runId))

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SynchronousResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SynchronousResponse =
                SynchronousResponse(
                    duration,
                    error,
                    output,
                    runId,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SynchronousResponse = apply {
            if (validated) {
                return@apply
            }

            duration()
            error()
            runId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (duration.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (runId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                COMPLETED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMPLETED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    else -> throw CasedevInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

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

            return other is SynchronousResponse &&
                duration == other.duration &&
                error == other.error &&
                output == other.output &&
                runId == other.runId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(duration, error, output, runId, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SynchronousResponse{duration=$duration, error=$error, output=$output, runId=$runId, status=$status, additionalProperties=$additionalProperties}"
    }

    class AsynchronousResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val logsUrl: JsonField<String>,
        private val runId: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("logsUrl") @ExcludeMissing logsUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runId") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(logsUrl, runId, status, mutableMapOf())

        /**
         * URL to check run status and logs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logsUrl(): Optional<String> = logsUrl.getOptional("logsUrl")

        /**
         * Unique run identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runId(): Optional<String> = runId.getOptional("runId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [logsUrl].
         *
         * Unlike [logsUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logsUrl") @ExcludeMissing fun _logsUrl(): JsonField<String> = logsUrl

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runId") @ExcludeMissing fun _runId(): JsonField<String> = runId

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

            /** Returns a mutable builder for constructing an instance of [AsynchronousResponse]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AsynchronousResponse]. */
        class Builder internal constructor() {

            private var logsUrl: JsonField<String> = JsonMissing.of()
            private var runId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(asynchronousResponse: AsynchronousResponse) = apply {
                logsUrl = asynchronousResponse.logsUrl
                runId = asynchronousResponse.runId
                status = asynchronousResponse.status
                additionalProperties = asynchronousResponse.additionalProperties.toMutableMap()
            }

            /** URL to check run status and logs */
            fun logsUrl(logsUrl: String) = logsUrl(JsonField.of(logsUrl))

            /**
             * Sets [Builder.logsUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logsUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logsUrl(logsUrl: JsonField<String>) = apply { this.logsUrl = logsUrl }

            /** Unique run identifier */
            fun runId(runId: String) = runId(JsonField.of(runId))

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [AsynchronousResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AsynchronousResponse =
                AsynchronousResponse(logsUrl, runId, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AsynchronousResponse = apply {
            if (validated) {
                return@apply
            }

            logsUrl()
            runId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (logsUrl.asKnown().isPresent) 1 else 0) +
                (if (runId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val RUNNING = of("running")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RUNNING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    RUNNING -> Value.RUNNING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    RUNNING -> Known.RUNNING
                    else -> throw CasedevInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

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

            return other is AsynchronousResponse &&
                logsUrl == other.logsUrl &&
                runId == other.runId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(logsUrl, runId, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AsynchronousResponse{logsUrl=$logsUrl, runId=$runId, status=$status, additionalProperties=$additionalProperties}"
    }
}
