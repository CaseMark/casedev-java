// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.execute

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExecuteCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<String>,
    private val error: JsonField<String>,
    private val logs: JsonField<Logs>,
    private val message: JsonField<String>,
    private val output: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val runId: JsonField<String>,
    private val runtimeId: JsonField<String>,
    private val runtimeState: JsonField<RuntimeState>,
    private val status: JsonField<Status>,
    private val usage: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logs") @ExcludeMissing logs: JsonField<Logs> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("runId") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runtimeId") @ExcludeMissing runtimeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runtimeState")
        @ExcludeMissing
        runtimeState: JsonField<RuntimeState> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonValue = JsonMissing.of(),
    ) : this(
        agentId,
        error,
        logs,
        message,
        output,
        provider,
        runId,
        runtimeId,
        runtimeState,
        status,
        usage,
        mutableMapOf(),
    )

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentId(): Optional<String> = agentId.getOptional("agentId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logs(): Optional<Logs> = logs.getOptional("logs")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun output(): Optional<String> = output.getOptional("output")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runId(): Optional<String> = runId.getOptional("runId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtimeId(): Optional<String> = runtimeId.getOptional("runtimeId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtimeState(): Optional<RuntimeState> = runtimeState.getOptional("runtimeState")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = executeCreateResponse.usage().convert(MyClass.class);
     * ```
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonValue = usage

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [logs].
     *
     * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<Logs> = logs

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
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runId") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [runtimeId].
     *
     * Unlike [runtimeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeId") @ExcludeMissing fun _runtimeId(): JsonField<String> = runtimeId

    /**
     * Returns the raw JSON value of [runtimeState].
     *
     * Unlike [runtimeState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeState")
    @ExcludeMissing
    fun _runtimeState(): JsonField<RuntimeState> = runtimeState

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

        /** Returns a mutable builder for constructing an instance of [ExecuteCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecuteCreateResponse]. */
    class Builder internal constructor() {

        private var agentId: JsonField<String> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var logs: JsonField<Logs> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var output: JsonField<String> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var runId: JsonField<String> = JsonMissing.of()
        private var runtimeId: JsonField<String> = JsonMissing.of()
        private var runtimeState: JsonField<RuntimeState> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var usage: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executeCreateResponse: ExecuteCreateResponse) = apply {
            agentId = executeCreateResponse.agentId
            error = executeCreateResponse.error
            logs = executeCreateResponse.logs
            message = executeCreateResponse.message
            output = executeCreateResponse.output
            provider = executeCreateResponse.provider
            runId = executeCreateResponse.runId
            runtimeId = executeCreateResponse.runtimeId
            runtimeState = executeCreateResponse.runtimeState
            status = executeCreateResponse.status
            usage = executeCreateResponse.usage
            additionalProperties = executeCreateResponse.additionalProperties.toMutableMap()
        }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

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

        fun logs(logs: Logs?) = logs(JsonField.ofNullable(logs))

        /** Alias for calling [Builder.logs] with `logs.orElse(null)`. */
        fun logs(logs: Optional<Logs>) = logs(logs.getOrNull())

        /**
         * Sets [Builder.logs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logs] with a well-typed [Logs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logs(logs: JsonField<Logs>) = apply { this.logs = logs }

        fun message(message: String?) = message(JsonField.ofNullable(message))

        /** Alias for calling [Builder.message] with `message.orElse(null)`. */
        fun message(message: Optional<String>) = message(message.getOrNull())

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun output(output: String?) = output(JsonField.ofNullable(output))

        /** Alias for calling [Builder.output] with `output.orElse(null)`. */
        fun output(output: Optional<String>) = output(output.getOrNull())

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun output(output: JsonField<String>) = apply { this.output = output }

        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun runtimeId(runtimeId: String?) = runtimeId(JsonField.ofNullable(runtimeId))

        /** Alias for calling [Builder.runtimeId] with `runtimeId.orElse(null)`. */
        fun runtimeId(runtimeId: Optional<String>) = runtimeId(runtimeId.getOrNull())

        /**
         * Sets [Builder.runtimeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runtimeId(runtimeId: JsonField<String>) = apply { this.runtimeId = runtimeId }

        fun runtimeState(runtimeState: RuntimeState) = runtimeState(JsonField.of(runtimeState))

        /**
         * Sets [Builder.runtimeState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeState] with a well-typed [RuntimeState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runtimeState(runtimeState: JsonField<RuntimeState>) = apply {
            this.runtimeState = runtimeState
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun usage(usage: JsonValue) = apply { this.usage = usage }

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
         * Returns an immutable instance of [ExecuteCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExecuteCreateResponse =
            ExecuteCreateResponse(
                agentId,
                error,
                logs,
                message,
                output,
                provider,
                runId,
                runtimeId,
                runtimeState,
                status,
                usage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExecuteCreateResponse = apply {
        if (validated) {
            return@apply
        }

        agentId()
        error()
        logs().ifPresent { it.validate() }
        message()
        output()
        provider().ifPresent { it.validate() }
        runId()
        runtimeId()
        runtimeState().ifPresent { it.validate() }
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
        (if (agentId.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (logs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (output.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (runtimeId.asKnown().isPresent) 1 else 0) +
            (runtimeState.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Logs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val linc: JsonField<String>,
        private val runner: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("linc") @ExcludeMissing linc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runner") @ExcludeMissing runner: JsonField<String> = JsonMissing.of(),
        ) : this(linc, runner, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linc(): Optional<String> = linc.getOptional("linc")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runner(): Optional<String> = runner.getOptional("runner")

        /**
         * Returns the raw JSON value of [linc].
         *
         * Unlike [linc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linc") @ExcludeMissing fun _linc(): JsonField<String> = linc

        /**
         * Returns the raw JSON value of [runner].
         *
         * Unlike [runner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runner") @ExcludeMissing fun _runner(): JsonField<String> = runner

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

            /** Returns a mutable builder for constructing an instance of [Logs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Logs]. */
        class Builder internal constructor() {

            private var linc: JsonField<String> = JsonMissing.of()
            private var runner: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(logs: Logs) = apply {
                linc = logs.linc
                runner = logs.runner
                additionalProperties = logs.additionalProperties.toMutableMap()
            }

            fun linc(linc: String?) = linc(JsonField.ofNullable(linc))

            /** Alias for calling [Builder.linc] with `linc.orElse(null)`. */
            fun linc(linc: Optional<String>) = linc(linc.getOrNull())

            /**
             * Sets [Builder.linc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun linc(linc: JsonField<String>) = apply { this.linc = linc }

            fun runner(runner: String?) = runner(JsonField.ofNullable(runner))

            /** Alias for calling [Builder.runner] with `runner.orElse(null)`. */
            fun runner(runner: Optional<String>) = runner(runner.getOrNull())

            /**
             * Sets [Builder.runner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runner(runner: JsonField<String>) = apply { this.runner = runner }

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
             * Returns an immutable instance of [Logs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Logs = Logs(linc, runner, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Logs = apply {
            if (validated) {
                return@apply
            }

            linc()
            runner()
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
            (if (linc.asKnown().isPresent) 1 else 0) + (if (runner.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logs &&
                linc == other.linc &&
                runner == other.runner &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(linc, runner, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Logs{linc=$linc, runner=$runner, additionalProperties=$additionalProperties}"
    }

    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DAYTONA = of("daytona")

            @JvmField val VERCEL = of("vercel")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            DAYTONA,
            VERCEL,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAYTONA,
            VERCEL,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                DAYTONA -> Value.DAYTONA
                VERCEL -> Value.VERCEL
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
                DAYTONA -> Known.DAYTONA
                VERCEL -> Known.VERCEL
                else -> throw CasedevInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RuntimeState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val RUNNING = of("running")

            @JvmField val ENDED = of("ended")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = RuntimeState(JsonField.of(value))
        }

        /** An enum containing [RuntimeState]'s known values. */
        enum class Known {
            RUNNING,
            ENDED,
            ERROR,
        }

        /**
         * An enum containing [RuntimeState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RuntimeState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUNNING,
            ENDED,
            ERROR,
            /**
             * An enum member indicating that [RuntimeState] was instantiated with an unknown value.
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
                RUNNING -> Value.RUNNING
                ENDED -> Value.ENDED
                ERROR -> Value.ERROR
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
                ENDED -> Known.ENDED
                ERROR -> Known.ERROR
                else -> throw CasedevInvalidDataException("Unknown RuntimeState: $value")
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

        fun validate(): RuntimeState = apply {
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

            return other is RuntimeState && value == other.value
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

        return other is ExecuteCreateResponse &&
            agentId == other.agentId &&
            error == other.error &&
            logs == other.logs &&
            message == other.message &&
            output == other.output &&
            provider == other.provider &&
            runId == other.runId &&
            runtimeId == other.runtimeId &&
            runtimeState == other.runtimeState &&
            status == other.status &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agentId,
            error,
            logs,
            message,
            output,
            provider,
            runId,
            runtimeId,
            runtimeState,
            status,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecuteCreateResponse{agentId=$agentId, error=$error, logs=$logs, message=$message, output=$output, provider=$provider, runId=$runId, runtimeId=$runtimeId, runtimeState=$runtimeState, status=$status, usage=$usage, additionalProperties=$additionalProperties}"
}
