// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SkillResolveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val methodsUsed: JsonField<List<String>>,
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("methods_used")
        @ExcludeMissing
        methodsUsed: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of(),
    ) : this(methodsUsed, results, mutableMapOf())

    /**
     * Search methods used (text, tag, semantic)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun methodsUsed(): Optional<List<String>> = methodsUsed.getOptional("methods_used")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * Returns the raw JSON value of [methodsUsed].
     *
     * Unlike [methodsUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("methods_used")
    @ExcludeMissing
    fun _methodsUsed(): JsonField<List<String>> = methodsUsed

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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

        /** Returns a mutable builder for constructing an instance of [SkillResolveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SkillResolveResponse]. */
    class Builder internal constructor() {

        private var methodsUsed: JsonField<MutableList<String>>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(skillResolveResponse: SkillResolveResponse) = apply {
            methodsUsed = skillResolveResponse.methodsUsed.map { it.toMutableList() }
            results = skillResolveResponse.results.map { it.toMutableList() }
            additionalProperties = skillResolveResponse.additionalProperties.toMutableMap()
        }

        /** Search methods used (text, tag, semantic) */
        fun methodsUsed(methodsUsed: List<String>) = methodsUsed(JsonField.of(methodsUsed))

        /**
         * Sets [Builder.methodsUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.methodsUsed] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun methodsUsed(methodsUsed: JsonField<List<String>>) = apply {
            this.methodsUsed = methodsUsed.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.methodsUsed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMethodsUsed(methodsUsed: String) = apply {
            this.methodsUsed =
                (this.methodsUsed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("methodsUsed", it).add(methodsUsed)
                }
        }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
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
         * Returns an immutable instance of [SkillResolveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SkillResolveResponse =
            SkillResolveResponse(
                (methodsUsed ?: JsonMissing.of()).map { it.toImmutable() },
                (results ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SkillResolveResponse = apply {
        if (validated) {
            return@apply
        }

        methodsUsed()
        results().ifPresent { it.forEach { it.validate() } }
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
        (methodsUsed.asKnown().getOrNull()?.size ?: 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val score: JsonField<Double>,
        private val slug: JsonField<String>,
        private val source: JsonField<Source>,
        private val summary: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(name, score, slug, source, summary, tags, mutableMapOf())

        /**
         * Skill name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Relevance score
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Unique skill identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun slug(): Optional<String> = slug.getOptional("slug")

        /**
         * Whether the skill is curated or org-custom
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * Brief skill description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun summary(): Optional<String> = summary.getOptional("summary")

        /**
         * Skill tags
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var slug: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var summary: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                name = result.name
                score = result.score
                slug = result.slug
                source = result.source
                summary = result.summary
                tags = result.tags.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Skill name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Relevance score */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Unique skill identifier */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            /** Whether the skill is curated or org-custom */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** Brief skill description */
            fun summary(summary: String) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<String>) = apply { this.summary = summary }

            /** Skill tags */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    name,
                    score,
                    slug,
                    source,
                    summary,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            name()
            score()
            slug()
            source().ifPresent { it.validate() }
            summary()
            tags()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (slug.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (if (summary.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        /** Whether the skill is curated or org-custom */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CURATED = of("curated")

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                CURATED,
                CUSTOM,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CURATED,
                CUSTOM,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    CURATED -> Value.CURATED
                    CUSTOM -> Value.CUSTOM
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
                    CURATED -> Known.CURATED
                    CUSTOM -> Known.CUSTOM
                    else -> throw CasedevInvalidDataException("Unknown Source: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                name == other.name &&
                score == other.score &&
                slug == other.slug &&
                source == other.source &&
                summary == other.summary &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, score, slug, source, summary, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{name=$name, score=$score, slug=$slug, source=$source, summary=$summary, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SkillResolveResponse &&
            methodsUsed == other.methodsUsed &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(methodsUsed, results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SkillResolveResponse{methodsUsed=$methodsUsed, results=$results, additionalProperties=$additionalProperties}"
}
