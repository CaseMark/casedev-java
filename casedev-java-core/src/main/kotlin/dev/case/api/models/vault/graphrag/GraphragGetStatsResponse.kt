// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.graphrag

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

class GraphragGetStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communities: JsonField<Long>,
    private val documents: JsonField<Long>,
    private val entities: JsonField<Long>,
    private val lastProcessed: JsonField<OffsetDateTime>,
    private val relationships: JsonField<Long>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communities")
        @ExcludeMissing
        communities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("documents") @ExcludeMissing documents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entities") @ExcludeMissing entities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lastProcessed")
        @ExcludeMissing
        lastProcessed: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("relationships")
        @ExcludeMissing
        relationships: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(communities, documents, entities, lastProcessed, relationships, status, mutableMapOf())

    /**
     * Number of entity communities identified
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun communities(): Optional<Long> = communities.getOptional("communities")

    /**
     * Number of processed documents
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<Long> = documents.getOptional("documents")

    /**
     * Total number of entities extracted from documents
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entities(): Optional<Long> = entities.getOptional("entities")

    /**
     * Timestamp of last GraphRAG processing
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastProcessed(): Optional<OffsetDateTime> = lastProcessed.getOptional("lastProcessed")

    /**
     * Total number of relationships between entities
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relationships(): Optional<Long> = relationships.getOptional("relationships")

    /**
     * Current processing status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [communities].
     *
     * Unlike [communities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("communities") @ExcludeMissing fun _communities(): JsonField<Long> = communities

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents") @ExcludeMissing fun _documents(): JsonField<Long> = documents

    /**
     * Returns the raw JSON value of [entities].
     *
     * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entities") @ExcludeMissing fun _entities(): JsonField<Long> = entities

    /**
     * Returns the raw JSON value of [lastProcessed].
     *
     * Unlike [lastProcessed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastProcessed")
    @ExcludeMissing
    fun _lastProcessed(): JsonField<OffsetDateTime> = lastProcessed

    /**
     * Returns the raw JSON value of [relationships].
     *
     * Unlike [relationships], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relationships")
    @ExcludeMissing
    fun _relationships(): JsonField<Long> = relationships

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [GraphragGetStatsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GraphragGetStatsResponse]. */
    class Builder internal constructor() {

        private var communities: JsonField<Long> = JsonMissing.of()
        private var documents: JsonField<Long> = JsonMissing.of()
        private var entities: JsonField<Long> = JsonMissing.of()
        private var lastProcessed: JsonField<OffsetDateTime> = JsonMissing.of()
        private var relationships: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(graphragGetStatsResponse: GraphragGetStatsResponse) = apply {
            communities = graphragGetStatsResponse.communities
            documents = graphragGetStatsResponse.documents
            entities = graphragGetStatsResponse.entities
            lastProcessed = graphragGetStatsResponse.lastProcessed
            relationships = graphragGetStatsResponse.relationships
            status = graphragGetStatsResponse.status
            additionalProperties = graphragGetStatsResponse.additionalProperties.toMutableMap()
        }

        /** Number of entity communities identified */
        fun communities(communities: Long) = communities(JsonField.of(communities))

        /**
         * Sets [Builder.communities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communities] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun communities(communities: JsonField<Long>) = apply { this.communities = communities }

        /** Number of processed documents */
        fun documents(documents: Long) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun documents(documents: JsonField<Long>) = apply { this.documents = documents }

        /** Total number of entities extracted from documents */
        fun entities(entities: Long) = entities(JsonField.of(entities))

        /**
         * Sets [Builder.entities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entities] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entities(entities: JsonField<Long>) = apply { this.entities = entities }

        /** Timestamp of last GraphRAG processing */
        fun lastProcessed(lastProcessed: OffsetDateTime) =
            lastProcessed(JsonField.of(lastProcessed))

        /**
         * Sets [Builder.lastProcessed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastProcessed] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastProcessed(lastProcessed: JsonField<OffsetDateTime>) = apply {
            this.lastProcessed = lastProcessed
        }

        /** Total number of relationships between entities */
        fun relationships(relationships: Long) = relationships(JsonField.of(relationships))

        /**
         * Sets [Builder.relationships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relationships] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun relationships(relationships: JsonField<Long>) = apply {
            this.relationships = relationships
        }

        /** Current processing status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [GraphragGetStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GraphragGetStatsResponse =
            GraphragGetStatsResponse(
                communities,
                documents,
                entities,
                lastProcessed,
                relationships,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GraphragGetStatsResponse = apply {
        if (validated) {
            return@apply
        }

        communities()
        documents()
        entities()
        lastProcessed()
        relationships()
        status().ifPresent { it.validate() }
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
        (if (communities.asKnown().isPresent) 1 else 0) +
            (if (documents.asKnown().isPresent) 1 else 0) +
            (if (entities.asKnown().isPresent) 1 else 0) +
            (if (lastProcessed.asKnown().isPresent) 1 else 0) +
            (if (relationships.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** Current processing status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROCESSING = of("processing")

            @JvmField val COMPLETED = of("completed")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PROCESSING,
            COMPLETED,
            ERROR,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROCESSING,
            COMPLETED,
            ERROR,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PROCESSING -> Value.PROCESSING
                COMPLETED -> Value.COMPLETED
                ERROR -> Value.ERROR
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
                PROCESSING -> Known.PROCESSING
                COMPLETED -> Known.COMPLETED
                ERROR -> Known.ERROR
                else -> throw CasedevInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GraphragGetStatsResponse &&
            communities == other.communities &&
            documents == other.documents &&
            entities == other.entities &&
            lastProcessed == other.lastProcessed &&
            relationships == other.relationships &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            communities,
            documents,
            entities,
            lastProcessed,
            relationships,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GraphragGetStatsResponse{communities=$communities, documents=$documents, entities=$entities, lastProcessed=$lastProcessed, relationships=$relationships, status=$status, additionalProperties=$additionalProperties}"
}
