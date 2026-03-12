// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class V1ListCourtsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val courts: JsonField<List<Court>>,
    private val found: JsonField<Long>,
    private val inUseOnly: JsonField<Boolean>,
    private val jurisdiction: JsonField<String>,
    private val query: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("courts") @ExcludeMissing courts: JsonField<List<Court>> = JsonMissing.of(),
        @JsonProperty("found") @ExcludeMissing found: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inUseOnly") @ExcludeMissing inUseOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        jurisdiction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
    ) : this(courts, found, inUseOnly, jurisdiction, query, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun courts(): Optional<List<Court>> = courts.getOptional("courts")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun found(): Optional<Long> = found.getOptional("found")

    /**
     * Whether results are filtered to in-use courts only
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inUseOnly(): Optional<Boolean> = inUseOnly.getOptional("inUseOnly")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdiction(): Optional<String> = jurisdiction.getOptional("jurisdiction")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Returns the raw JSON value of [courts].
     *
     * Unlike [courts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("courts") @ExcludeMissing fun _courts(): JsonField<List<Court>> = courts

    /**
     * Returns the raw JSON value of [found].
     *
     * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<Long> = found

    /**
     * Returns the raw JSON value of [inUseOnly].
     *
     * Unlike [inUseOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inUseOnly") @ExcludeMissing fun _inUseOnly(): JsonField<Boolean> = inUseOnly

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jurisdiction")
    @ExcludeMissing
    fun _jurisdiction(): JsonField<String> = jurisdiction

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

        /** Returns a mutable builder for constructing an instance of [V1ListCourtsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListCourtsResponse]. */
    class Builder internal constructor() {

        private var courts: JsonField<MutableList<Court>>? = null
        private var found: JsonField<Long> = JsonMissing.of()
        private var inUseOnly: JsonField<Boolean> = JsonMissing.of()
        private var jurisdiction: JsonField<String> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListCourtsResponse: V1ListCourtsResponse) = apply {
            courts = v1ListCourtsResponse.courts.map { it.toMutableList() }
            found = v1ListCourtsResponse.found
            inUseOnly = v1ListCourtsResponse.inUseOnly
            jurisdiction = v1ListCourtsResponse.jurisdiction
            query = v1ListCourtsResponse.query
            additionalProperties = v1ListCourtsResponse.additionalProperties.toMutableMap()
        }

        fun courts(courts: List<Court>) = courts(JsonField.of(courts))

        /**
         * Sets [Builder.courts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.courts] with a well-typed `List<Court>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun courts(courts: JsonField<List<Court>>) = apply {
            this.courts = courts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Court] to [courts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCourt(court: Court) = apply {
            courts =
                (courts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("courts", it).add(court)
                }
        }

        fun found(found: Long) = found(JsonField.of(found))

        /**
         * Sets [Builder.found] to an arbitrary JSON value.
         *
         * You should usually call [Builder.found] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun found(found: JsonField<Long>) = apply { this.found = found }

        /** Whether results are filtered to in-use courts only */
        fun inUseOnly(inUseOnly: Boolean) = inUseOnly(JsonField.of(inUseOnly))

        /**
         * Sets [Builder.inUseOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inUseOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inUseOnly(inUseOnly: JsonField<Boolean>) = apply { this.inUseOnly = inUseOnly }

        fun jurisdiction(jurisdiction: String?) = jurisdiction(JsonField.ofNullable(jurisdiction))

        /** Alias for calling [Builder.jurisdiction] with `jurisdiction.orElse(null)`. */
        fun jurisdiction(jurisdiction: Optional<String>) = jurisdiction(jurisdiction.getOrNull())

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            this.jurisdiction = jurisdiction
        }

        fun query(query: String?) = query(JsonField.ofNullable(query))

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

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
         * Returns an immutable instance of [V1ListCourtsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListCourtsResponse =
            V1ListCourtsResponse(
                (courts ?: JsonMissing.of()).map { it.toImmutable() },
                found,
                inUseOnly,
                jurisdiction,
                query,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ListCourtsResponse = apply {
        if (validated) {
            return@apply
        }

        courts().ifPresent { it.forEach { it.validate() } }
        found()
        inUseOnly()
        jurisdiction()
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
        (courts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (found.asKnown().isPresent) 1 else 0) +
            (if (inUseOnly.asKnown().isPresent) 1 else 0) +
            (if (jurisdiction.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0)

    class Court
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val fullName: JsonField<String>,
        private val jurisdiction: JsonField<String>,
        private val pacerCourtId: JsonField<Long>,
        private val shortName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fullName")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("jurisdiction")
            @ExcludeMissing
            jurisdiction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pacerCourtId")
            @ExcludeMissing
            pacerCourtId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("shortName")
            @ExcludeMissing
            shortName: JsonField<String> = JsonMissing.of(),
        ) : this(id, fullName, jurisdiction, pacerCourtId, shortName, mutableMapOf())

        /**
         * Court slug (use as the court parameter in legal.docket())
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fullName(): Optional<String> = fullName.getOptional("fullName")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jurisdiction(): Optional<String> = jurisdiction.getOptional("jurisdiction")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pacerCourtId(): Optional<Long> = pacerCourtId.getOptional("pacerCourtId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shortName(): Optional<String> = shortName.getOptional("shortName")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<String> = jurisdiction

        /**
         * Returns the raw JSON value of [pacerCourtId].
         *
         * Unlike [pacerCourtId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pacerCourtId")
        @ExcludeMissing
        fun _pacerCourtId(): JsonField<Long> = pacerCourtId

        /**
         * Returns the raw JSON value of [shortName].
         *
         * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

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

            /** Returns a mutable builder for constructing an instance of [Court]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Court]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var jurisdiction: JsonField<String> = JsonMissing.of()
            private var pacerCourtId: JsonField<Long> = JsonMissing.of()
            private var shortName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(court: Court) = apply {
                id = court.id
                fullName = court.fullName
                jurisdiction = court.jurisdiction
                pacerCourtId = court.pacerCourtId
                shortName = court.shortName
                additionalProperties = court.additionalProperties.toMutableMap()
            }

            /** Court slug (use as the court parameter in legal.docket()) */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun fullName(fullName: String?) = fullName(JsonField.ofNullable(fullName))

            /** Alias for calling [Builder.fullName] with `fullName.orElse(null)`. */
            fun fullName(fullName: Optional<String>) = fullName(fullName.getOrNull())

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            fun jurisdiction(jurisdiction: String?) =
                jurisdiction(JsonField.ofNullable(jurisdiction))

            /** Alias for calling [Builder.jurisdiction] with `jurisdiction.orElse(null)`. */
            fun jurisdiction(jurisdiction: Optional<String>) =
                jurisdiction(jurisdiction.getOrNull())

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<String>) = apply {
                this.jurisdiction = jurisdiction
            }

            fun pacerCourtId(pacerCourtId: Long?) = pacerCourtId(JsonField.ofNullable(pacerCourtId))

            /**
             * Alias for [Builder.pacerCourtId].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pacerCourtId(pacerCourtId: Long) = pacerCourtId(pacerCourtId as Long?)

            /** Alias for calling [Builder.pacerCourtId] with `pacerCourtId.orElse(null)`. */
            fun pacerCourtId(pacerCourtId: Optional<Long>) = pacerCourtId(pacerCourtId.getOrNull())

            /**
             * Sets [Builder.pacerCourtId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pacerCourtId] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pacerCourtId(pacerCourtId: JsonField<Long>) = apply {
                this.pacerCourtId = pacerCourtId
            }

            fun shortName(shortName: String?) = shortName(JsonField.ofNullable(shortName))

            /** Alias for calling [Builder.shortName] with `shortName.orElse(null)`. */
            fun shortName(shortName: Optional<String>) = shortName(shortName.getOrNull())

            /**
             * Sets [Builder.shortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shortName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

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
             * Returns an immutable instance of [Court].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Court =
                Court(
                    id,
                    fullName,
                    jurisdiction,
                    pacerCourtId,
                    shortName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Court = apply {
            if (validated) {
                return@apply
            }

            id()
            fullName()
            jurisdiction()
            pacerCourtId()
            shortName()
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
                (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (jurisdiction.asKnown().isPresent) 1 else 0) +
                (if (pacerCourtId.asKnown().isPresent) 1 else 0) +
                (if (shortName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Court &&
                id == other.id &&
                fullName == other.fullName &&
                jurisdiction == other.jurisdiction &&
                pacerCourtId == other.pacerCourtId &&
                shortName == other.shortName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, fullName, jurisdiction, pacerCourtId, shortName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Court{id=$id, fullName=$fullName, jurisdiction=$jurisdiction, pacerCourtId=$pacerCourtId, shortName=$shortName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListCourtsResponse &&
            courts == other.courts &&
            found == other.found &&
            inUseOnly == other.inUseOnly &&
            jurisdiction == other.jurisdiction &&
            query == other.query &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(courts, found, inUseOnly, jurisdiction, query, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListCourtsResponse{courts=$courts, found=$found, inUseOnly=$inUseOnly, jurisdiction=$jurisdiction, query=$query, additionalProperties=$additionalProperties}"
}
