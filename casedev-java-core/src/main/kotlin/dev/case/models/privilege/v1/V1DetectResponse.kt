// File generated from our OpenAPI spec by Stainless.

package dev.case.models.privilege.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.Enum
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.checkKnown
import dev.case.core.checkRequired
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1DetectResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<Category>>,
    private val confidence: JsonField<Double>,
    private val policyRationale: JsonField<String>,
    private val privileged: JsonField<Boolean>,
    private val recommendation: JsonField<Recommendation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<Category>> = JsonMissing.of(),
        @JsonProperty("confidence")
        @ExcludeMissing
        confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("policy_rationale")
        @ExcludeMissing
        policyRationale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("privileged")
        @ExcludeMissing
        privileged: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("recommendation")
        @ExcludeMissing
        recommendation: JsonField<Recommendation> = JsonMissing.of(),
    ) : this(categories, confidence, policyRationale, privileged, recommendation, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<Category> = categories.getRequired("categories")

    /**
     * Overall confidence score (0-1)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun confidence(): Double = confidence.getRequired("confidence")

    /**
     * Policy-friendly explanation for privilege log
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policyRationale(): String = policyRationale.getRequired("policy_rationale")

    /**
     * Whether any privilege was detected
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privileged(): Boolean = privileged.getRequired("privileged")

    /**
     * Recommended action for discovery
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recommendation(): Recommendation = recommendation.getRequired("recommendation")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<Category>> = categories

    /**
     * Returns the raw JSON value of [confidence].
     *
     * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

    /**
     * Returns the raw JSON value of [policyRationale].
     *
     * Unlike [policyRationale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy_rationale")
    @ExcludeMissing
    fun _policyRationale(): JsonField<String> = policyRationale

    /**
     * Returns the raw JSON value of [privileged].
     *
     * Unlike [privileged], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privileged") @ExcludeMissing fun _privileged(): JsonField<Boolean> = privileged

    /**
     * Returns the raw JSON value of [recommendation].
     *
     * Unlike [recommendation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recommendation")
    @ExcludeMissing
    fun _recommendation(): JsonField<Recommendation> = recommendation

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

        /**
         * Returns a mutable builder for constructing an instance of [V1DetectResponse].
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .confidence()
         * .policyRationale()
         * .privileged()
         * .recommendation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DetectResponse]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<Category>>? = null
        private var confidence: JsonField<Double>? = null
        private var policyRationale: JsonField<String>? = null
        private var privileged: JsonField<Boolean>? = null
        private var recommendation: JsonField<Recommendation>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1DetectResponse: V1DetectResponse) = apply {
            categories = v1DetectResponse.categories.map { it.toMutableList() }
            confidence = v1DetectResponse.confidence
            policyRationale = v1DetectResponse.policyRationale
            privileged = v1DetectResponse.privileged
            recommendation = v1DetectResponse.recommendation
            additionalProperties = v1DetectResponse.additionalProperties.toMutableMap()
        }

        fun categories(categories: List<Category>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<Category>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<List<Category>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [Category] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: Category) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /** Overall confidence score (0-1) */
        fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

        /**
         * Sets [Builder.confidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confidence] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

        /** Policy-friendly explanation for privilege log */
        fun policyRationale(policyRationale: String) =
            policyRationale(JsonField.of(policyRationale))

        /**
         * Sets [Builder.policyRationale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policyRationale] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun policyRationale(policyRationale: JsonField<String>) = apply {
            this.policyRationale = policyRationale
        }

        /** Whether any privilege was detected */
        fun privileged(privileged: Boolean) = privileged(JsonField.of(privileged))

        /**
         * Sets [Builder.privileged] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privileged] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privileged(privileged: JsonField<Boolean>) = apply { this.privileged = privileged }

        /** Recommended action for discovery */
        fun recommendation(recommendation: Recommendation) =
            recommendation(JsonField.of(recommendation))

        /**
         * Sets [Builder.recommendation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recommendation] with a well-typed [Recommendation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recommendation(recommendation: JsonField<Recommendation>) = apply {
            this.recommendation = recommendation
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
         * Returns an immutable instance of [V1DetectResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .confidence()
         * .policyRationale()
         * .privileged()
         * .recommendation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1DetectResponse =
            V1DetectResponse(
                checkRequired("categories", categories).map { it.toImmutable() },
                checkRequired("confidence", confidence),
                checkRequired("policyRationale", policyRationale),
                checkRequired("privileged", privileged),
                checkRequired("recommendation", recommendation),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1DetectResponse = apply {
        if (validated) {
            return@apply
        }

        categories().forEach { it.validate() }
        confidence()
        policyRationale()
        privileged()
        recommendation().validate()
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
        (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (confidence.asKnown().isPresent) 1 else 0) +
            (if (policyRationale.asKnown().isPresent) 1 else 0) +
            (if (privileged.asKnown().isPresent) 1 else 0) +
            (recommendation.asKnown().getOrNull()?.validity() ?: 0)

    class Category
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val confidence: JsonField<Double>,
        private val detected: JsonField<Boolean>,
        private val indicators: JsonField<List<String>>,
        private val rationale: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("detected")
            @ExcludeMissing
            detected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("indicators")
            @ExcludeMissing
            indicators: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rationale")
            @ExcludeMissing
            rationale: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(confidence, detected, indicators, rationale, type, mutableMapOf())

        /**
         * Confidence for this category (0-1)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        /**
         * Whether this privilege type was detected
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detected(): Optional<Boolean> = detected.getOptional("detected")

        /**
         * Specific phrases or patterns found
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun indicators(): Optional<List<String>> = indicators.getOptional("indicators")

        /**
         * Explanation of detection result
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rationale(): Optional<String> = rationale.getOptional("rationale")

        /**
         * Privilege category
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [detected].
         *
         * Unlike [detected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detected") @ExcludeMissing fun _detected(): JsonField<Boolean> = detected

        /**
         * Returns the raw JSON value of [indicators].
         *
         * Unlike [indicators], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("indicators")
        @ExcludeMissing
        fun _indicators(): JsonField<List<String>> = indicators

        /**
         * Returns the raw JSON value of [rationale].
         *
         * Unlike [rationale], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rationale") @ExcludeMissing fun _rationale(): JsonField<String> = rationale

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [Category]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var confidence: JsonField<Double> = JsonMissing.of()
            private var detected: JsonField<Boolean> = JsonMissing.of()
            private var indicators: JsonField<MutableList<String>>? = null
            private var rationale: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(category: Category) = apply {
                confidence = category.confidence
                detected = category.detected
                indicators = category.indicators.map { it.toMutableList() }
                rationale = category.rationale
                type = category.type
                additionalProperties = category.additionalProperties.toMutableMap()
            }

            /** Confidence for this category (0-1) */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** Whether this privilege type was detected */
            fun detected(detected: Boolean) = detected(JsonField.of(detected))

            /**
             * Sets [Builder.detected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detected] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detected(detected: JsonField<Boolean>) = apply { this.detected = detected }

            /** Specific phrases or patterns found */
            fun indicators(indicators: List<String>) = indicators(JsonField.of(indicators))

            /**
             * Sets [Builder.indicators] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indicators] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun indicators(indicators: JsonField<List<String>>) = apply {
                this.indicators = indicators.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [indicators].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndicator(indicator: String) = apply {
                indicators =
                    (indicators ?: JsonField.of(mutableListOf())).also {
                        checkKnown("indicators", it).add(indicator)
                    }
            }

            /** Explanation of detection result */
            fun rationale(rationale: String) = rationale(JsonField.of(rationale))

            /**
             * Sets [Builder.rationale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rationale] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rationale(rationale: JsonField<String>) = apply { this.rationale = rationale }

            /** Privilege category */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Category].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Category =
                Category(
                    confidence,
                    detected,
                    (indicators ?: JsonMissing.of()).map { it.toImmutable() },
                    rationale,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            confidence()
            detected()
            indicators()
            rationale()
            type()
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
            (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (detected.asKnown().isPresent) 1 else 0) +
                (indicators.asKnown().getOrNull()?.size ?: 0) +
                (if (rationale.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                confidence == other.confidence &&
                detected == other.detected &&
                indicators == other.indicators &&
                rationale == other.rationale &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(confidence, detected, indicators, rationale, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Category{confidence=$confidence, detected=$detected, indicators=$indicators, rationale=$rationale, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Recommended action for discovery */
    class Recommendation @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val WITHHOLD = of("withhold")

            @JvmField val REDACT = of("redact")

            @JvmField val PRODUCE = of("produce")

            @JvmField val REVIEW = of("review")

            @JvmStatic fun of(value: String) = Recommendation(JsonField.of(value))
        }

        /** An enum containing [Recommendation]'s known values. */
        enum class Known {
            WITHHOLD,
            REDACT,
            PRODUCE,
            REVIEW,
        }

        /**
         * An enum containing [Recommendation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Recommendation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WITHHOLD,
            REDACT,
            PRODUCE,
            REVIEW,
            /**
             * An enum member indicating that [Recommendation] was instantiated with an unknown
             * value.
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
                WITHHOLD -> Value.WITHHOLD
                REDACT -> Value.REDACT
                PRODUCE -> Value.PRODUCE
                REVIEW -> Value.REVIEW
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
                WITHHOLD -> Known.WITHHOLD
                REDACT -> Known.REDACT
                PRODUCE -> Known.PRODUCE
                REVIEW -> Known.REVIEW
                else -> throw CasedevInvalidDataException("Unknown Recommendation: $value")
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

        fun validate(): Recommendation = apply {
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

            return other is Recommendation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DetectResponse &&
            categories == other.categories &&
            confidence == other.confidence &&
            policyRationale == other.policyRationale &&
            privileged == other.privileged &&
            recommendation == other.recommendation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            confidence,
            policyRationale,
            privileged,
            recommendation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1DetectResponse{categories=$categories, confidence=$confidence, policyRationale=$policyRationale, privileged=$privileged, recommendation=$recommendation, additionalProperties=$additionalProperties}"
}
