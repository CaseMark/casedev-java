// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

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

class RunWatchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callbackUrl: JsonField<String>,
    private val ok: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callbackUrl")
        @ExcludeMissing
        callbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ok") @ExcludeMissing ok: JsonField<Boolean> = JsonMissing.of(),
    ) : this(callbackUrl, ok, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callbackUrl")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ok(): Optional<Boolean> = ok.getOptional("ok")

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callbackUrl") @ExcludeMissing fun _callbackUrl(): JsonField<String> = callbackUrl

    /**
     * Returns the raw JSON value of [ok].
     *
     * Unlike [ok], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ok") @ExcludeMissing fun _ok(): JsonField<Boolean> = ok

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

        /** Returns a mutable builder for constructing an instance of [RunWatchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunWatchResponse]. */
    class Builder internal constructor() {

        private var callbackUrl: JsonField<String> = JsonMissing.of()
        private var ok: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runWatchResponse: RunWatchResponse) = apply {
            callbackUrl = runWatchResponse.callbackUrl
            ok = runWatchResponse.ok
            additionalProperties = runWatchResponse.additionalProperties.toMutableMap()
        }

        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        fun ok(ok: Boolean) = ok(JsonField.of(ok))

        /**
         * Sets [Builder.ok] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ok] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ok(ok: JsonField<Boolean>) = apply { this.ok = ok }

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
         * Returns an immutable instance of [RunWatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunWatchResponse =
            RunWatchResponse(callbackUrl, ok, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RunWatchResponse = apply {
        if (validated) {
            return@apply
        }

        callbackUrl()
        ok()
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
        (if (callbackUrl.asKnown().isPresent) 1 else 0) + (if (ok.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunWatchResponse &&
            callbackUrl == other.callbackUrl &&
            ok == other.ok &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(callbackUrl, ok, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunWatchResponse{callbackUrl=$callbackUrl, ok=$ok, additionalProperties=$additionalProperties}"
}
