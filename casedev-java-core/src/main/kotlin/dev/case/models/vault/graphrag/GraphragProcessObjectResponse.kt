// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.graphrag

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.checkRequired
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GraphragProcessObjectResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communities: JsonField<Long>,
    private val entities: JsonField<Long>,
    private val objectId: JsonField<String>,
    private val relationships: JsonField<Long>,
    private val stats: JsonField<Stats>,
    private val status: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communities")
        @ExcludeMissing
        communities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entities") @ExcludeMissing entities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relationships")
        @ExcludeMissing
        relationships: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stats") @ExcludeMissing stats: JsonField<Stats> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(
        communities,
        entities,
        objectId,
        relationships,
        stats,
        status,
        success,
        vaultId,
        mutableMapOf(),
    )

    /**
     * Number of communities detected
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communities(): Long = communities.getRequired("communities")

    /**
     * Number of entities extracted
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entities(): Long = entities.getRequired("entities")

    /**
     * ID of the indexed object
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * Number of relationships extracted
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relationships(): Long = relationships.getRequired("relationships")

    /**
     * Extraction statistics
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stats(): Stats = stats.getRequired("stats")

    /**
     * Status from GraphRAG service
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Whether indexing completed successfully
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * ID of the vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): String = vaultId.getRequired("vaultId")

    /**
     * Returns the raw JSON value of [communities].
     *
     * Unlike [communities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("communities") @ExcludeMissing fun _communities(): JsonField<Long> = communities

    /**
     * Returns the raw JSON value of [entities].
     *
     * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entities") @ExcludeMissing fun _entities(): JsonField<Long> = entities

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [relationships].
     *
     * Unlike [relationships], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relationships")
    @ExcludeMissing
    fun _relationships(): JsonField<Long> = relationships

    /**
     * Returns the raw JSON value of [stats].
     *
     * Unlike [stats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stats") @ExcludeMissing fun _stats(): JsonField<Stats> = stats

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaultId") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

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
         * Returns a mutable builder for constructing an instance of
         * [GraphragProcessObjectResponse].
         *
         * The following fields are required:
         * ```java
         * .communities()
         * .entities()
         * .objectId()
         * .relationships()
         * .stats()
         * .status()
         * .success()
         * .vaultId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GraphragProcessObjectResponse]. */
    class Builder internal constructor() {

        private var communities: JsonField<Long>? = null
        private var entities: JsonField<Long>? = null
        private var objectId: JsonField<String>? = null
        private var relationships: JsonField<Long>? = null
        private var stats: JsonField<Stats>? = null
        private var status: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var vaultId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(graphragProcessObjectResponse: GraphragProcessObjectResponse) = apply {
            communities = graphragProcessObjectResponse.communities
            entities = graphragProcessObjectResponse.entities
            objectId = graphragProcessObjectResponse.objectId
            relationships = graphragProcessObjectResponse.relationships
            stats = graphragProcessObjectResponse.stats
            status = graphragProcessObjectResponse.status
            success = graphragProcessObjectResponse.success
            vaultId = graphragProcessObjectResponse.vaultId
            additionalProperties = graphragProcessObjectResponse.additionalProperties.toMutableMap()
        }

        /** Number of communities detected */
        fun communities(communities: Long) = communities(JsonField.of(communities))

        /**
         * Sets [Builder.communities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communities] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun communities(communities: JsonField<Long>) = apply { this.communities = communities }

        /** Number of entities extracted */
        fun entities(entities: Long) = entities(JsonField.of(entities))

        /**
         * Sets [Builder.entities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entities] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entities(entities: JsonField<Long>) = apply { this.entities = entities }

        /** ID of the indexed object */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Number of relationships extracted */
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

        /** Extraction statistics */
        fun stats(stats: Stats) = stats(JsonField.of(stats))

        /**
         * Sets [Builder.stats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stats] with a well-typed [Stats] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stats(stats: JsonField<Stats>) = apply { this.stats = stats }

        /** Status from GraphRAG service */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Whether indexing completed successfully */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** ID of the vault */
        fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

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
         * Returns an immutable instance of [GraphragProcessObjectResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .communities()
         * .entities()
         * .objectId()
         * .relationships()
         * .stats()
         * .status()
         * .success()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GraphragProcessObjectResponse =
            GraphragProcessObjectResponse(
                checkRequired("communities", communities),
                checkRequired("entities", entities),
                checkRequired("objectId", objectId),
                checkRequired("relationships", relationships),
                checkRequired("stats", stats),
                checkRequired("status", status),
                checkRequired("success", success),
                checkRequired("vaultId", vaultId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GraphragProcessObjectResponse = apply {
        if (validated) {
            return@apply
        }

        communities()
        entities()
        objectId()
        relationships()
        stats().validate()
        status()
        success()
        vaultId()
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
            (if (entities.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (relationships.asKnown().isPresent) 1 else 0) +
            (stats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    /** Extraction statistics */
    class Stats
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val communityCount: JsonField<Long>,
        private val entityCount: JsonField<Long>,
        private val relationshipCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("community_count")
            @ExcludeMissing
            communityCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("entity_count")
            @ExcludeMissing
            entityCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("relationship_count")
            @ExcludeMissing
            relationshipCount: JsonField<Long> = JsonMissing.of(),
        ) : this(communityCount, entityCount, relationshipCount, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun communityCount(): Optional<Long> = communityCount.getOptional("community_count")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entityCount(): Optional<Long> = entityCount.getOptional("entity_count")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relationshipCount(): Optional<Long> =
            relationshipCount.getOptional("relationship_count")

        /**
         * Returns the raw JSON value of [communityCount].
         *
         * Unlike [communityCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("community_count")
        @ExcludeMissing
        fun _communityCount(): JsonField<Long> = communityCount

        /**
         * Returns the raw JSON value of [entityCount].
         *
         * Unlike [entityCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_count")
        @ExcludeMissing
        fun _entityCount(): JsonField<Long> = entityCount

        /**
         * Returns the raw JSON value of [relationshipCount].
         *
         * Unlike [relationshipCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relationship_count")
        @ExcludeMissing
        fun _relationshipCount(): JsonField<Long> = relationshipCount

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

            /** Returns a mutable builder for constructing an instance of [Stats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stats]. */
        class Builder internal constructor() {

            private var communityCount: JsonField<Long> = JsonMissing.of()
            private var entityCount: JsonField<Long> = JsonMissing.of()
            private var relationshipCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stats: Stats) = apply {
                communityCount = stats.communityCount
                entityCount = stats.entityCount
                relationshipCount = stats.relationshipCount
                additionalProperties = stats.additionalProperties.toMutableMap()
            }

            fun communityCount(communityCount: Long) = communityCount(JsonField.of(communityCount))

            /**
             * Sets [Builder.communityCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.communityCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun communityCount(communityCount: JsonField<Long>) = apply {
                this.communityCount = communityCount
            }

            fun entityCount(entityCount: Long) = entityCount(JsonField.of(entityCount))

            /**
             * Sets [Builder.entityCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityCount(entityCount: JsonField<Long>) = apply { this.entityCount = entityCount }

            fun relationshipCount(relationshipCount: Long) =
                relationshipCount(JsonField.of(relationshipCount))

            /**
             * Sets [Builder.relationshipCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationshipCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relationshipCount(relationshipCount: JsonField<Long>) = apply {
                this.relationshipCount = relationshipCount
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
             * Returns an immutable instance of [Stats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Stats =
                Stats(
                    communityCount,
                    entityCount,
                    relationshipCount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Stats = apply {
            if (validated) {
                return@apply
            }

            communityCount()
            entityCount()
            relationshipCount()
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
            (if (communityCount.asKnown().isPresent) 1 else 0) +
                (if (entityCount.asKnown().isPresent) 1 else 0) +
                (if (relationshipCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stats &&
                communityCount == other.communityCount &&
                entityCount == other.entityCount &&
                relationshipCount == other.relationshipCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(communityCount, entityCount, relationshipCount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stats{communityCount=$communityCount, entityCount=$entityCount, relationshipCount=$relationshipCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GraphragProcessObjectResponse &&
            communities == other.communities &&
            entities == other.entities &&
            objectId == other.objectId &&
            relationships == other.relationships &&
            stats == other.stats &&
            status == other.status &&
            success == other.success &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            communities,
            entities,
            objectId,
            relationships,
            stats,
            status,
            success,
            vaultId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GraphragProcessObjectResponse{communities=$communities, entities=$entities, objectId=$objectId, relationships=$relationships, stats=$stats, status=$status, success=$success, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
