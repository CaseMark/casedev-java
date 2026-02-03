// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
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

class V1ListJurisdictionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val found: JsonField<Long>,
    private val hint: JsonField<String>,
    private val jurisdictions: JsonField<List<Jurisdiction>>,
    private val query: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("found") @ExcludeMissing found: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hint") @ExcludeMissing hint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jurisdictions")
        @ExcludeMissing
        jurisdictions: JsonField<List<Jurisdiction>> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
    ) : this(found, hint, jurisdictions, query, mutableMapOf())

    /**
     * Number of matching jurisdictions
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun found(): Optional<Long> = found.getOptional("found")

    /**
     * Usage guidance
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hint(): Optional<String> = hint.getOptional("hint")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdictions(): Optional<List<Jurisdiction>> = jurisdictions.getOptional("jurisdictions")

    /**
     * Original search query
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Returns the raw JSON value of [found].
     *
     * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<Long> = found

    /**
     * Returns the raw JSON value of [hint].
     *
     * Unlike [hint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

    /**
     * Returns the raw JSON value of [jurisdictions].
     *
     * Unlike [jurisdictions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jurisdictions")
    @ExcludeMissing
    fun _jurisdictions(): JsonField<List<Jurisdiction>> = jurisdictions

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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
         * Returns a mutable builder for constructing an instance of [V1ListJurisdictionsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListJurisdictionsResponse]. */
    class Builder internal constructor() {

        private var found: JsonField<Long> = JsonMissing.of()
        private var hint: JsonField<String> = JsonMissing.of()
        private var jurisdictions: JsonField<MutableList<Jurisdiction>>? = null
        private var query: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListJurisdictionsResponse: V1ListJurisdictionsResponse) = apply {
            found = v1ListJurisdictionsResponse.found
            hint = v1ListJurisdictionsResponse.hint
            jurisdictions = v1ListJurisdictionsResponse.jurisdictions.map { it.toMutableList() }
            query = v1ListJurisdictionsResponse.query
            additionalProperties = v1ListJurisdictionsResponse.additionalProperties.toMutableMap()
        }

        /** Number of matching jurisdictions */
        fun found(found: Long) = found(JsonField.of(found))

        /**
         * Sets [Builder.found] to an arbitrary JSON value.
         *
         * You should usually call [Builder.found] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun found(found: JsonField<Long>) = apply { this.found = found }

        /** Usage guidance */
        fun hint(hint: String) = hint(JsonField.of(hint))

        /**
         * Sets [Builder.hint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hint(hint: JsonField<String>) = apply { this.hint = hint }

        fun jurisdictions(jurisdictions: List<Jurisdiction>) =
            jurisdictions(JsonField.of(jurisdictions))

        /**
         * Sets [Builder.jurisdictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdictions] with a well-typed `List<Jurisdiction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jurisdictions(jurisdictions: JsonField<List<Jurisdiction>>) = apply {
            this.jurisdictions = jurisdictions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Jurisdiction] to [jurisdictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addJurisdiction(jurisdiction: Jurisdiction) = apply {
            jurisdictions =
                (jurisdictions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("jurisdictions", it).add(jurisdiction)
                }
        }

        /** Original search query */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

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
         * Returns an immutable instance of [V1ListJurisdictionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListJurisdictionsResponse =
            V1ListJurisdictionsResponse(
                found,
                hint,
                (jurisdictions ?: JsonMissing.of()).map { it.toImmutable() },
                query,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ListJurisdictionsResponse = apply {
        if (validated) {
            return@apply
        }

        found()
        hint()
        jurisdictions().ifPresent { it.forEach { it.validate() } }
        query()
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
        (if (found.asKnown().isPresent) 1 else 0) +
            (if (hint.asKnown().isPresent) 1 else 0) +
            (jurisdictions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0)

    class Jurisdiction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val level: JsonField<Level>,
        private val name: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("level") @ExcludeMissing level: JsonField<Level> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(id, level, name, state, mutableMapOf())

        /**
         * Jurisdiction ID to use in other endpoints
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Jurisdiction level
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun level(): Optional<Level> = level.getOptional("level")

        /**
         * Full jurisdiction name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * State abbreviation (if applicable)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [level].
         *
         * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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

            /** Returns a mutable builder for constructing an instance of [Jurisdiction]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Jurisdiction]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var level: JsonField<Level> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(jurisdiction: Jurisdiction) = apply {
                id = jurisdiction.id
                level = jurisdiction.level
                name = jurisdiction.name
                state = jurisdiction.state
                additionalProperties = jurisdiction.additionalProperties.toMutableMap()
            }

            /** Jurisdiction ID to use in other endpoints */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Jurisdiction level */
            fun level(level: Level) = level(JsonField.of(level))

            /**
             * Sets [Builder.level] to an arbitrary JSON value.
             *
             * You should usually call [Builder.level] with a well-typed [Level] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun level(level: JsonField<Level>) = apply { this.level = level }

            /** Full jurisdiction name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** State abbreviation (if applicable) */
            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** Alias for calling [Builder.state] with `state.orElse(null)`. */
            fun state(state: Optional<String>) = state(state.getOrNull())

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [Jurisdiction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Jurisdiction =
                Jurisdiction(id, level, name, state, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Jurisdiction = apply {
            if (validated) {
                return@apply
            }

            id()
            level().ifPresent { it.validate() }
            name()
            state()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (level.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        /** Jurisdiction level */
        class Level @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FEDERAL = of("federal")

                @JvmField val STATE = of("state")

                @JvmField val COUNTY = of("county")

                @JvmField val MUNICIPAL = of("municipal")

                @JvmStatic fun of(value: String) = Level(JsonField.of(value))
            }

            /** An enum containing [Level]'s known values. */
            enum class Known {
                FEDERAL,
                STATE,
                COUNTY,
                MUNICIPAL,
            }

            /**
             * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Level] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FEDERAL,
                STATE,
                COUNTY,
                MUNICIPAL,
                /**
                 * An enum member indicating that [Level] was instantiated with an unknown value.
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
                    FEDERAL -> Value.FEDERAL
                    STATE -> Value.STATE
                    COUNTY -> Value.COUNTY
                    MUNICIPAL -> Value.MUNICIPAL
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
                    FEDERAL -> Known.FEDERAL
                    STATE -> Known.STATE
                    COUNTY -> Known.COUNTY
                    MUNICIPAL -> Known.MUNICIPAL
                    else -> throw CasedevInvalidDataException("Unknown Level: $value")
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

            fun validate(): Level = apply {
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

                return other is Level && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Jurisdiction &&
                id == other.id &&
                level == other.level &&
                name == other.name &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, level, name, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Jurisdiction{id=$id, level=$level, name=$name, state=$state, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListJurisdictionsResponse &&
            found == other.found &&
            hint == other.hint &&
            jurisdictions == other.jurisdictions &&
            query == other.query &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(found, hint, jurisdictions, query, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListJurisdictionsResponse{found=$found, hint=$hint, jurisdictions=$jurisdictions, query=$query, additionalProperties=$additionalProperties}"
}
