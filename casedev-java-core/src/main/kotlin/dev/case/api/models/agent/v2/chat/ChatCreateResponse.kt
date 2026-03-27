// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

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

class ChatCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val idleTimeoutMs: JsonField<Long>,
    private val provider: JsonField<Provider>,
    private val runtimeState: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idleTimeoutMs")
        @ExcludeMissing
        idleTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("runtimeState")
        @ExcludeMissing
        runtimeState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, idleTimeoutMs, provider, runtimeState, status, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idleTimeoutMs(): Optional<Long> = idleTimeoutMs.getOptional("idleTimeoutMs")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtimeState(): Optional<String> = runtimeState.getOptional("runtimeState")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

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
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [idleTimeoutMs].
     *
     * Unlike [idleTimeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idleTimeoutMs")
    @ExcludeMissing
    fun _idleTimeoutMs(): JsonField<Long> = idleTimeoutMs

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [runtimeState].
     *
     * Unlike [runtimeState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeState")
    @ExcludeMissing
    fun _runtimeState(): JsonField<String> = runtimeState

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [ChatCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idleTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var runtimeState: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCreateResponse: ChatCreateResponse) = apply {
            id = chatCreateResponse.id
            createdAt = chatCreateResponse.createdAt
            idleTimeoutMs = chatCreateResponse.idleTimeoutMs
            provider = chatCreateResponse.provider
            runtimeState = chatCreateResponse.runtimeState
            status = chatCreateResponse.status
            additionalProperties = chatCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun idleTimeoutMs(idleTimeoutMs: Long) = idleTimeoutMs(JsonField.of(idleTimeoutMs))

        /**
         * Sets [Builder.idleTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleTimeoutMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idleTimeoutMs(idleTimeoutMs: JsonField<Long>) = apply {
            this.idleTimeoutMs = idleTimeoutMs
        }

        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        fun runtimeState(runtimeState: String) = runtimeState(JsonField.of(runtimeState))

        /**
         * Sets [Builder.runtimeState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runtimeState(runtimeState: JsonField<String>) = apply {
            this.runtimeState = runtimeState
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [ChatCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatCreateResponse =
            ChatCreateResponse(
                id,
                createdAt,
                idleTimeoutMs,
                provider,
                runtimeState,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        idleTimeoutMs()
        provider().ifPresent { it.validate() }
        runtimeState()
        status()
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
            (if (idleTimeoutMs.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runtimeState.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

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

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            DAYTONA
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCreateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            idleTimeoutMs == other.idleTimeoutMs &&
            provider == other.provider &&
            runtimeState == other.runtimeState &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            idleTimeoutMs,
            provider,
            runtimeState,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCreateResponse{id=$id, createdAt=$createdAt, idleTimeoutMs=$idleTimeoutMs, provider=$provider, runtimeState=$runtimeState, status=$status, additionalProperties=$additionalProperties}"
}
