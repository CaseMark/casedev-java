// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instances

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class InstanceDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val message: JsonField<String>,
    private val name: JsonField<String>,
    private val status: JsonField<String>,
    private val totalCost: JsonField<String>,
    private val totalRuntimeSeconds: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalCost") @ExcludeMissing totalCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalRuntimeSeconds")
        @ExcludeMissing
        totalRuntimeSeconds: JsonField<Long> = JsonMissing.of(),
    ) : this(id, message, name, status, totalCost, totalRuntimeSeconds, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<String> = totalCost.getOptional("totalCost")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRuntimeSeconds(): Optional<Long> =
        totalRuntimeSeconds.getOptional("totalRuntimeSeconds")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalCost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

    /**
     * Returns the raw JSON value of [totalRuntimeSeconds].
     *
     * Unlike [totalRuntimeSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalRuntimeSeconds")
    @ExcludeMissing
    fun _totalRuntimeSeconds(): JsonField<Long> = totalRuntimeSeconds

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

        /** Returns a mutable builder for constructing an instance of [InstanceDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceDeleteResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var totalRuntimeSeconds: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instanceDeleteResponse: InstanceDeleteResponse) = apply {
            id = instanceDeleteResponse.id
            message = instanceDeleteResponse.message
            name = instanceDeleteResponse.name
            status = instanceDeleteResponse.status
            totalCost = instanceDeleteResponse.totalCost
            totalRuntimeSeconds = instanceDeleteResponse.totalRuntimeSeconds
            additionalProperties = instanceDeleteResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun totalCost(totalCost: String) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

        fun totalRuntimeSeconds(totalRuntimeSeconds: Long) =
            totalRuntimeSeconds(JsonField.of(totalRuntimeSeconds))

        /**
         * Sets [Builder.totalRuntimeSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRuntimeSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalRuntimeSeconds(totalRuntimeSeconds: JsonField<Long>) = apply {
            this.totalRuntimeSeconds = totalRuntimeSeconds
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
         * Returns an immutable instance of [InstanceDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstanceDeleteResponse =
            InstanceDeleteResponse(
                id,
                message,
                name,
                status,
                totalCost,
                totalRuntimeSeconds,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CasedevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): InstanceDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        message()
        name()
        status()
        totalCost()
        totalRuntimeSeconds()
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
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalRuntimeSeconds.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceDeleteResponse &&
            id == other.id &&
            message == other.message &&
            name == other.name &&
            status == other.status &&
            totalCost == other.totalCost &&
            totalRuntimeSeconds == other.totalRuntimeSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            message,
            name,
            status,
            totalCost,
            totalRuntimeSeconds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstanceDeleteResponse{id=$id, message=$message, name=$name, status=$status, totalCost=$totalCost, totalRuntimeSeconds=$totalRuntimeSeconds, additionalProperties=$additionalProperties}"
}
