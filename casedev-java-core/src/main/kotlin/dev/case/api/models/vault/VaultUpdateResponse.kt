// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class VaultUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chunkStrategy: JsonValue,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val enableGraph: JsonField<Boolean>,
    private val filesBucket: JsonField<String>,
    private val indexName: JsonField<String>,
    private val kmsKeyId: JsonField<String>,
    private val metadata: JsonValue,
    private val name: JsonField<String>,
    private val region: JsonField<String>,
    private val totalBytes: JsonField<Long>,
    private val totalObjects: JsonField<Long>,
    private val totalVectors: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vectorBucket: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chunkStrategy") @ExcludeMissing chunkStrategy: JsonValue = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enableGraph")
        @ExcludeMissing
        enableGraph: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("filesBucket")
        @ExcludeMissing
        filesBucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indexName") @ExcludeMissing indexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kmsKeyId") @ExcludeMissing kmsKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalBytes") @ExcludeMissing totalBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalObjects")
        @ExcludeMissing
        totalObjects: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalVectors")
        @ExcludeMissing
        totalVectors: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vectorBucket")
        @ExcludeMissing
        vectorBucket: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        chunkStrategy,
        createdAt,
        description,
        enableGraph,
        filesBucket,
        indexName,
        kmsKeyId,
        metadata,
        name,
        region,
        totalBytes,
        totalObjects,
        totalVectors,
        updatedAt,
        vectorBucket,
        mutableMapOf(),
    )

    /**
     * Vault identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Document chunking strategy configuration
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = vaultUpdateResponse.chunkStrategy().convert(MyClass.class);
     * ```
     */
    @JsonProperty("chunkStrategy") @ExcludeMissing fun _chunkStrategy(): JsonValue = chunkStrategy

    /**
     * Vault creation timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Vault description
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Whether GraphRAG is enabled for future uploads
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableGraph(): Optional<Boolean> = enableGraph.getOptional("enableGraph")

    /**
     * S3 bucket for document storage
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filesBucket(): Optional<String> = filesBucket.getOptional("filesBucket")

    /**
     * Search index name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexName(): Optional<String> = indexName.getOptional("indexName")

    /**
     * KMS key for encryption
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kmsKeyId(): Optional<String> = kmsKeyId.getOptional("kmsKeyId")

    /**
     * Additional vault metadata
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = vaultUpdateResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Vault name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * AWS region
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Total storage size in bytes
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalBytes(): Optional<Long> = totalBytes.getOptional("totalBytes")

    /**
     * Number of stored documents
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalObjects(): Optional<Long> = totalObjects.getOptional("totalObjects")

    /**
     * Number of vector embeddings
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalVectors(): Optional<Long> = totalVectors.getOptional("totalVectors")

    /**
     * Last update timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * S3 bucket for vector embeddings
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorBucket(): Optional<String> = vectorBucket.getOptional("vectorBucket")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enableGraph].
     *
     * Unlike [enableGraph], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enableGraph")
    @ExcludeMissing
    fun _enableGraph(): JsonField<Boolean> = enableGraph

    /**
     * Returns the raw JSON value of [filesBucket].
     *
     * Unlike [filesBucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filesBucket") @ExcludeMissing fun _filesBucket(): JsonField<String> = filesBucket

    /**
     * Returns the raw JSON value of [indexName].
     *
     * Unlike [indexName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("indexName") @ExcludeMissing fun _indexName(): JsonField<String> = indexName

    /**
     * Returns the raw JSON value of [kmsKeyId].
     *
     * Unlike [kmsKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kmsKeyId") @ExcludeMissing fun _kmsKeyId(): JsonField<String> = kmsKeyId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [totalBytes].
     *
     * Unlike [totalBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalBytes") @ExcludeMissing fun _totalBytes(): JsonField<Long> = totalBytes

    /**
     * Returns the raw JSON value of [totalObjects].
     *
     * Unlike [totalObjects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalObjects")
    @ExcludeMissing
    fun _totalObjects(): JsonField<Long> = totalObjects

    /**
     * Returns the raw JSON value of [totalVectors].
     *
     * Unlike [totalVectors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalVectors")
    @ExcludeMissing
    fun _totalVectors(): JsonField<Long> = totalVectors

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vectorBucket].
     *
     * Unlike [vectorBucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vectorBucket")
    @ExcludeMissing
    fun _vectorBucket(): JsonField<String> = vectorBucket

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

        /** Returns a mutable builder for constructing an instance of [VaultUpdateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var chunkStrategy: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enableGraph: JsonField<Boolean> = JsonMissing.of()
        private var filesBucket: JsonField<String> = JsonMissing.of()
        private var indexName: JsonField<String> = JsonMissing.of()
        private var kmsKeyId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var totalBytes: JsonField<Long> = JsonMissing.of()
        private var totalObjects: JsonField<Long> = JsonMissing.of()
        private var totalVectors: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var vectorBucket: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultUpdateResponse: VaultUpdateResponse) = apply {
            id = vaultUpdateResponse.id
            chunkStrategy = vaultUpdateResponse.chunkStrategy
            createdAt = vaultUpdateResponse.createdAt
            description = vaultUpdateResponse.description
            enableGraph = vaultUpdateResponse.enableGraph
            filesBucket = vaultUpdateResponse.filesBucket
            indexName = vaultUpdateResponse.indexName
            kmsKeyId = vaultUpdateResponse.kmsKeyId
            metadata = vaultUpdateResponse.metadata
            name = vaultUpdateResponse.name
            region = vaultUpdateResponse.region
            totalBytes = vaultUpdateResponse.totalBytes
            totalObjects = vaultUpdateResponse.totalObjects
            totalVectors = vaultUpdateResponse.totalVectors
            updatedAt = vaultUpdateResponse.updatedAt
            vectorBucket = vaultUpdateResponse.vectorBucket
            additionalProperties = vaultUpdateResponse.additionalProperties.toMutableMap()
        }

        /** Vault identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Document chunking strategy configuration */
        fun chunkStrategy(chunkStrategy: JsonValue) = apply { this.chunkStrategy = chunkStrategy }

        /** Vault creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Vault description */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether GraphRAG is enabled for future uploads */
        fun enableGraph(enableGraph: Boolean) = enableGraph(JsonField.of(enableGraph))

        /**
         * Sets [Builder.enableGraph] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableGraph] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enableGraph(enableGraph: JsonField<Boolean>) = apply { this.enableGraph = enableGraph }

        /** S3 bucket for document storage */
        fun filesBucket(filesBucket: String) = filesBucket(JsonField.of(filesBucket))

        /**
         * Sets [Builder.filesBucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesBucket] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filesBucket(filesBucket: JsonField<String>) = apply { this.filesBucket = filesBucket }

        /** Search index name */
        fun indexName(indexName: String) = indexName(JsonField.of(indexName))

        /**
         * Sets [Builder.indexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

        /** KMS key for encryption */
        fun kmsKeyId(kmsKeyId: String) = kmsKeyId(JsonField.of(kmsKeyId))

        /**
         * Sets [Builder.kmsKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kmsKeyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kmsKeyId(kmsKeyId: JsonField<String>) = apply { this.kmsKeyId = kmsKeyId }

        /** Additional vault metadata */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** Vault name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** AWS region */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** Total storage size in bytes */
        fun totalBytes(totalBytes: Long) = totalBytes(JsonField.of(totalBytes))

        /**
         * Sets [Builder.totalBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalBytes(totalBytes: JsonField<Long>) = apply { this.totalBytes = totalBytes }

        /** Number of stored documents */
        fun totalObjects(totalObjects: Long) = totalObjects(JsonField.of(totalObjects))

        /**
         * Sets [Builder.totalObjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalObjects] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalObjects(totalObjects: JsonField<Long>) = apply { this.totalObjects = totalObjects }

        /** Number of vector embeddings */
        fun totalVectors(totalVectors: Long) = totalVectors(JsonField.of(totalVectors))

        /**
         * Sets [Builder.totalVectors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalVectors] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalVectors(totalVectors: JsonField<Long>) = apply { this.totalVectors = totalVectors }

        /** Last update timestamp */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** S3 bucket for vector embeddings */
        fun vectorBucket(vectorBucket: String?) = vectorBucket(JsonField.ofNullable(vectorBucket))

        /** Alias for calling [Builder.vectorBucket] with `vectorBucket.orElse(null)`. */
        fun vectorBucket(vectorBucket: Optional<String>) = vectorBucket(vectorBucket.getOrNull())

        /**
         * Sets [Builder.vectorBucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorBucket] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorBucket(vectorBucket: JsonField<String>) = apply {
            this.vectorBucket = vectorBucket
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
         * Returns an immutable instance of [VaultUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultUpdateResponse =
            VaultUpdateResponse(
                id,
                chunkStrategy,
                createdAt,
                description,
                enableGraph,
                filesBucket,
                indexName,
                kmsKeyId,
                metadata,
                name,
                region,
                totalBytes,
                totalObjects,
                totalVectors,
                updatedAt,
                vectorBucket,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        enableGraph()
        filesBucket()
        indexName()
        kmsKeyId()
        name()
        region()
        totalBytes()
        totalObjects()
        totalVectors()
        updatedAt()
        vectorBucket()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (enableGraph.asKnown().isPresent) 1 else 0) +
            (if (filesBucket.asKnown().isPresent) 1 else 0) +
            (if (indexName.asKnown().isPresent) 1 else 0) +
            (if (kmsKeyId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (totalBytes.asKnown().isPresent) 1 else 0) +
            (if (totalObjects.asKnown().isPresent) 1 else 0) +
            (if (totalVectors.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vectorBucket.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultUpdateResponse &&
            id == other.id &&
            chunkStrategy == other.chunkStrategy &&
            createdAt == other.createdAt &&
            description == other.description &&
            enableGraph == other.enableGraph &&
            filesBucket == other.filesBucket &&
            indexName == other.indexName &&
            kmsKeyId == other.kmsKeyId &&
            metadata == other.metadata &&
            name == other.name &&
            region == other.region &&
            totalBytes == other.totalBytes &&
            totalObjects == other.totalObjects &&
            totalVectors == other.totalVectors &&
            updatedAt == other.updatedAt &&
            vectorBucket == other.vectorBucket &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chunkStrategy,
            createdAt,
            description,
            enableGraph,
            filesBucket,
            indexName,
            kmsKeyId,
            metadata,
            name,
            region,
            totalBytes,
            totalObjects,
            totalVectors,
            updatedAt,
            vectorBucket,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultUpdateResponse{id=$id, chunkStrategy=$chunkStrategy, createdAt=$createdAt, description=$description, enableGraph=$enableGraph, filesBucket=$filesBucket, indexName=$indexName, kmsKeyId=$kmsKeyId, metadata=$metadata, name=$name, region=$region, totalBytes=$totalBytes, totalObjects=$totalObjects, totalVectors=$totalVectors, updatedAt=$updatedAt, vectorBucket=$vectorBucket, additionalProperties=$additionalProperties}"
}
