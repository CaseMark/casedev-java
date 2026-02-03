// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class AccountGetLedgerResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val entries: JsonField<List<JsonValue>>,
    private val pagination: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entries")
        @ExcludeMissing
        entries: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("pagination") @ExcludeMissing pagination: JsonValue = JsonMissing.of(),
    ) : this(entries, pagination, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entries(): Optional<List<JsonValue>> = entries.getOptional("entries")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = accountGetLedgerResponse.pagination().convert(MyClass.class);
     * ```
     */
    @JsonProperty("pagination") @ExcludeMissing fun _pagination(): JsonValue = pagination

    /**
     * Returns the raw JSON value of [entries].
     *
     * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<JsonValue>> = entries

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

        /** Returns a mutable builder for constructing an instance of [AccountGetLedgerResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountGetLedgerResponse]. */
    class Builder internal constructor() {

        private var entries: JsonField<MutableList<JsonValue>>? = null
        private var pagination: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountGetLedgerResponse: AccountGetLedgerResponse) = apply {
            entries = accountGetLedgerResponse.entries.map { it.toMutableList() }
            pagination = accountGetLedgerResponse.pagination
            additionalProperties = accountGetLedgerResponse.additionalProperties.toMutableMap()
        }

        fun entries(entries: List<JsonValue>) = entries(JsonField.of(entries))

        /**
         * Sets [Builder.entries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entries] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entries(entries: JsonField<List<JsonValue>>) = apply {
            this.entries = entries.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [entries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntry(entry: JsonValue) = apply {
            entries =
                (entries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entries", it).add(entry)
                }
        }

        fun pagination(pagination: JsonValue) = apply { this.pagination = pagination }

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
         * Returns an immutable instance of [AccountGetLedgerResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountGetLedgerResponse =
            AccountGetLedgerResponse(
                (entries ?: JsonMissing.of()).map { it.toImmutable() },
                pagination,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountGetLedgerResponse = apply {
        if (validated) {
            return@apply
        }

        entries()
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
    @JvmSynthetic internal fun validity(): Int = (entries.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountGetLedgerResponse &&
            entries == other.entries &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(entries, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountGetLedgerResponse{entries=$entries, pagination=$pagination, additionalProperties=$additionalProperties}"
}
