// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

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
import kotlin.jvm.optionals.getOrNull

class ChatDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cost: JsonField<Double>,
    private val runtimeMs: JsonField<Long>,
    private val snapshotImageId: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("runtimeMs") @ExcludeMissing runtimeMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("snapshotImageId")
        @ExcludeMissing
        snapshotImageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(id, cost, runtimeMs, snapshotImageId, status, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Double> = cost.getOptional("cost")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtimeMs(): Optional<Long> = runtimeMs.getOptional("runtimeMs")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotImageId(): Optional<String> = snapshotImageId.getOptional("snapshotImageId")

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
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

    /**
     * Returns the raw JSON value of [runtimeMs].
     *
     * Unlike [runtimeMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeMs") @ExcludeMissing fun _runtimeMs(): JsonField<Long> = runtimeMs

    /**
     * Returns the raw JSON value of [snapshotImageId].
     *
     * Unlike [snapshotImageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshotImageId")
    @ExcludeMissing
    fun _snapshotImageId(): JsonField<String> = snapshotImageId

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

        /** Returns a mutable builder for constructing an instance of [ChatDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatDeleteResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var cost: JsonField<Double> = JsonMissing.of()
        private var runtimeMs: JsonField<Long> = JsonMissing.of()
        private var snapshotImageId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatDeleteResponse: ChatDeleteResponse) = apply {
            id = chatDeleteResponse.id
            cost = chatDeleteResponse.cost
            runtimeMs = chatDeleteResponse.runtimeMs
            snapshotImageId = chatDeleteResponse.snapshotImageId
            status = chatDeleteResponse.status
            additionalProperties = chatDeleteResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun cost(cost: Double) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        fun runtimeMs(runtimeMs: Long) = runtimeMs(JsonField.of(runtimeMs))

        /**
         * Sets [Builder.runtimeMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runtimeMs(runtimeMs: JsonField<Long>) = apply { this.runtimeMs = runtimeMs }

        fun snapshotImageId(snapshotImageId: String?) =
            snapshotImageId(JsonField.ofNullable(snapshotImageId))

        /** Alias for calling [Builder.snapshotImageId] with `snapshotImageId.orElse(null)`. */
        fun snapshotImageId(snapshotImageId: Optional<String>) =
            snapshotImageId(snapshotImageId.getOrNull())

        /**
         * Sets [Builder.snapshotImageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotImageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun snapshotImageId(snapshotImageId: JsonField<String>) = apply {
            this.snapshotImageId = snapshotImageId
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
         * Returns an immutable instance of [ChatDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatDeleteResponse =
            ChatDeleteResponse(
                id,
                cost,
                runtimeMs,
                snapshotImageId,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        cost()
        runtimeMs()
        snapshotImageId()
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
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (runtimeMs.asKnown().isPresent) 1 else 0) +
            (if (snapshotImageId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatDeleteResponse &&
            id == other.id &&
            cost == other.cost &&
            runtimeMs == other.runtimeMs &&
            snapshotImageId == other.snapshotImageId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, cost, runtimeMs, snapshotImageId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatDeleteResponse{id=$id, cost=$cost, runtimeMs=$runtimeMs, snapshotImageId=$snapshotImageId, status=$status, additionalProperties=$additionalProperties}"
}
