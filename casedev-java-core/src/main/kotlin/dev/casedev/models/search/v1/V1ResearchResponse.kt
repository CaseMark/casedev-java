// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

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

class V1ResearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val model: JsonField<String>,
    private val researchId: JsonField<String>,
    private val results: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("researchId")
        @ExcludeMissing
        researchId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonValue = JsonMissing.of(),
    ) : this(model, researchId, results, mutableMapOf())

    /**
     * Model used for research
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * Unique identifier for this research
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun researchId(): Optional<String> = researchId.getOptional("researchId")

    /**
     * Research findings and analysis
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = v1ResearchResponse.results().convert(MyClass.class);
     * ```
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonValue = results

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [researchId].
     *
     * Unlike [researchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("researchId") @ExcludeMissing fun _researchId(): JsonField<String> = researchId

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

        /** Returns a mutable builder for constructing an instance of [V1ResearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ResearchResponse]. */
    class Builder internal constructor() {

        private var model: JsonField<String> = JsonMissing.of()
        private var researchId: JsonField<String> = JsonMissing.of()
        private var results: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ResearchResponse: V1ResearchResponse) = apply {
            model = v1ResearchResponse.model
            researchId = v1ResearchResponse.researchId
            results = v1ResearchResponse.results
            additionalProperties = v1ResearchResponse.additionalProperties.toMutableMap()
        }

        /** Model used for research */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Unique identifier for this research */
        fun researchId(researchId: String) = researchId(JsonField.of(researchId))

        /**
         * Sets [Builder.researchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.researchId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun researchId(researchId: JsonField<String>) = apply { this.researchId = researchId }

        /** Research findings and analysis */
        fun results(results: JsonValue) = apply { this.results = results }

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
         * Returns an immutable instance of [V1ResearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ResearchResponse =
            V1ResearchResponse(model, researchId, results, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1ResearchResponse = apply {
        if (validated) {
            return@apply
        }

        model()
        researchId()
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
        (if (model.asKnown().isPresent) 1 else 0) + (if (researchId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ResearchResponse &&
            model == other.model &&
            researchId == other.researchId &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(model, researchId, results, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ResearchResponse{model=$model, researchId=$researchId, results=$results, additionalProperties=$additionalProperties}"
}
