// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkRequired
import dev.casedev.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val filesBucket: JsonField<String>,
    private val name: JsonField<String>,
    private val region: JsonField<String>,
    private val chunkStrategy: JsonField<ChunkStrategy>,
    private val description: JsonField<String>,
    private val enableGraph: JsonField<Boolean>,
    private val indexName: JsonField<String>,
    private val kmsKeyId: JsonField<String>,
    private val metadata: JsonValue,
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
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filesBucket")
        @ExcludeMissing
        filesBucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chunkStrategy")
        @ExcludeMissing
        chunkStrategy: JsonField<ChunkStrategy> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enableGraph")
        @ExcludeMissing
        enableGraph: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("indexName") @ExcludeMissing indexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kmsKeyId") @ExcludeMissing kmsKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
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
        createdAt,
        filesBucket,
        name,
        region,
        chunkStrategy,
        description,
        enableGraph,
        indexName,
        kmsKeyId,
        metadata,
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
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Vault creation timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * S3 bucket for document storage
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filesBucket(): String = filesBucket.getRequired("filesBucket")

    /**
     * Vault name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * AWS region
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): String = region.getRequired("region")

    /**
     * Document chunking strategy configuration
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkStrategy(): Optional<ChunkStrategy> = chunkStrategy.getOptional("chunkStrategy")

    /**
     * Vault description
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Whether GraphRAG is enabled
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableGraph(): Optional<Boolean> = enableGraph.getOptional("enableGraph")

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
     * MyClass myObject = vaultRetrieveResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

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
     * Returns the raw JSON value of [filesBucket].
     *
     * Unlike [filesBucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filesBucket") @ExcludeMissing fun _filesBucket(): JsonField<String> = filesBucket

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
     * Returns the raw JSON value of [chunkStrategy].
     *
     * Unlike [chunkStrategy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunkStrategy")
    @ExcludeMissing
    fun _chunkStrategy(): JsonField<ChunkStrategy> = chunkStrategy

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

        /**
         * Returns a mutable builder for constructing an instance of [VaultRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .filesBucket()
         * .name()
         * .region()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var filesBucket: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var region: JsonField<String>? = null
        private var chunkStrategy: JsonField<ChunkStrategy> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enableGraph: JsonField<Boolean> = JsonMissing.of()
        private var indexName: JsonField<String> = JsonMissing.of()
        private var kmsKeyId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var totalBytes: JsonField<Long> = JsonMissing.of()
        private var totalObjects: JsonField<Long> = JsonMissing.of()
        private var totalVectors: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var vectorBucket: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultRetrieveResponse: VaultRetrieveResponse) = apply {
            id = vaultRetrieveResponse.id
            createdAt = vaultRetrieveResponse.createdAt
            filesBucket = vaultRetrieveResponse.filesBucket
            name = vaultRetrieveResponse.name
            region = vaultRetrieveResponse.region
            chunkStrategy = vaultRetrieveResponse.chunkStrategy
            description = vaultRetrieveResponse.description
            enableGraph = vaultRetrieveResponse.enableGraph
            indexName = vaultRetrieveResponse.indexName
            kmsKeyId = vaultRetrieveResponse.kmsKeyId
            metadata = vaultRetrieveResponse.metadata
            totalBytes = vaultRetrieveResponse.totalBytes
            totalObjects = vaultRetrieveResponse.totalObjects
            totalVectors = vaultRetrieveResponse.totalVectors
            updatedAt = vaultRetrieveResponse.updatedAt
            vectorBucket = vaultRetrieveResponse.vectorBucket
            additionalProperties = vaultRetrieveResponse.additionalProperties.toMutableMap()
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

        /** Document chunking strategy configuration */
        fun chunkStrategy(chunkStrategy: ChunkStrategy) = chunkStrategy(JsonField.of(chunkStrategy))

        /**
         * Sets [Builder.chunkStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkStrategy] with a well-typed [ChunkStrategy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chunkStrategy(chunkStrategy: JsonField<ChunkStrategy>) = apply {
            this.chunkStrategy = chunkStrategy
        }

        /** Vault description */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether GraphRAG is enabled */
        fun enableGraph(enableGraph: Boolean) = enableGraph(JsonField.of(enableGraph))

        /**
         * Sets [Builder.enableGraph] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableGraph] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enableGraph(enableGraph: JsonField<Boolean>) = apply { this.enableGraph = enableGraph }

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
         * Returns an immutable instance of [VaultRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .filesBucket()
         * .name()
         * .region()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VaultRetrieveResponse =
            VaultRetrieveResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("filesBucket", filesBucket),
                checkRequired("name", name),
                checkRequired("region", region),
                chunkStrategy,
                description,
                enableGraph,
                indexName,
                kmsKeyId,
                metadata,
                totalBytes,
                totalObjects,
                totalVectors,
                updatedAt,
                vectorBucket,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        filesBucket()
        name()
        region()
        chunkStrategy().ifPresent { it.validate() }
        description()
        enableGraph()
        indexName()
        kmsKeyId()
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
            (if (filesBucket.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (chunkStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (enableGraph.asKnown().isPresent) 1 else 0) +
            (if (indexName.asKnown().isPresent) 1 else 0) +
            (if (kmsKeyId.asKnown().isPresent) 1 else 0) +
            (if (totalBytes.asKnown().isPresent) 1 else 0) +
            (if (totalObjects.asKnown().isPresent) 1 else 0) +
            (if (totalVectors.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vectorBucket.asKnown().isPresent) 1 else 0)

    /** Document chunking strategy configuration */
    class ChunkStrategy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chunkSize: JsonField<Long>,
        private val method: JsonField<String>,
        private val minChunkSize: JsonField<Long>,
        private val overlap: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chunkSize")
            @ExcludeMissing
            chunkSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minChunkSize")
            @ExcludeMissing
            minChunkSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("overlap") @ExcludeMissing overlap: JsonField<Long> = JsonMissing.of(),
        ) : this(chunkSize, method, minChunkSize, overlap, mutableMapOf())

        /**
         * Target size for each chunk in tokens
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chunkSize(): Optional<Long> = chunkSize.getOptional("chunkSize")

        /**
         * Chunking method (e.g., 'semantic', 'fixed')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun method(): Optional<String> = method.getOptional("method")

        /**
         * Minimum chunk size in tokens
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minChunkSize(): Optional<Long> = minChunkSize.getOptional("minChunkSize")

        /**
         * Number of overlapping tokens between chunks
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overlap(): Optional<Long> = overlap.getOptional("overlap")

        /**
         * Returns the raw JSON value of [chunkSize].
         *
         * Unlike [chunkSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunkSize") @ExcludeMissing fun _chunkSize(): JsonField<Long> = chunkSize

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * Returns the raw JSON value of [minChunkSize].
         *
         * Unlike [minChunkSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minChunkSize")
        @ExcludeMissing
        fun _minChunkSize(): JsonField<Long> = minChunkSize

        /**
         * Returns the raw JSON value of [overlap].
         *
         * Unlike [overlap], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overlap") @ExcludeMissing fun _overlap(): JsonField<Long> = overlap

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

            /** Returns a mutable builder for constructing an instance of [ChunkStrategy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChunkStrategy]. */
        class Builder internal constructor() {

            private var chunkSize: JsonField<Long> = JsonMissing.of()
            private var method: JsonField<String> = JsonMissing.of()
            private var minChunkSize: JsonField<Long> = JsonMissing.of()
            private var overlap: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chunkStrategy: ChunkStrategy) = apply {
                chunkSize = chunkStrategy.chunkSize
                method = chunkStrategy.method
                minChunkSize = chunkStrategy.minChunkSize
                overlap = chunkStrategy.overlap
                additionalProperties = chunkStrategy.additionalProperties.toMutableMap()
            }

            /** Target size for each chunk in tokens */
            fun chunkSize(chunkSize: Long) = chunkSize(JsonField.of(chunkSize))

            /**
             * Sets [Builder.chunkSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkSize(chunkSize: JsonField<Long>) = apply { this.chunkSize = chunkSize }

            /** Chunking method (e.g., 'semantic', 'fixed') */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            /** Minimum chunk size in tokens */
            fun minChunkSize(minChunkSize: Long) = minChunkSize(JsonField.of(minChunkSize))

            /**
             * Sets [Builder.minChunkSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minChunkSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minChunkSize(minChunkSize: JsonField<Long>) = apply {
                this.minChunkSize = minChunkSize
            }

            /** Number of overlapping tokens between chunks */
            fun overlap(overlap: Long) = overlap(JsonField.of(overlap))

            /**
             * Sets [Builder.overlap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overlap] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overlap(overlap: JsonField<Long>) = apply { this.overlap = overlap }

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
             * Returns an immutable instance of [ChunkStrategy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ChunkStrategy =
                ChunkStrategy(
                    chunkSize,
                    method,
                    minChunkSize,
                    overlap,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ChunkStrategy = apply {
            if (validated) {
                return@apply
            }

            chunkSize()
            method()
            minChunkSize()
            overlap()
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
            (if (chunkSize.asKnown().isPresent) 1 else 0) +
                (if (method.asKnown().isPresent) 1 else 0) +
                (if (minChunkSize.asKnown().isPresent) 1 else 0) +
                (if (overlap.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChunkStrategy &&
                chunkSize == other.chunkSize &&
                method == other.method &&
                minChunkSize == other.minChunkSize &&
                overlap == other.overlap &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(chunkSize, method, minChunkSize, overlap, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChunkStrategy{chunkSize=$chunkSize, method=$method, minChunkSize=$minChunkSize, overlap=$overlap, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            filesBucket == other.filesBucket &&
            name == other.name &&
            region == other.region &&
            chunkStrategy == other.chunkStrategy &&
            description == other.description &&
            enableGraph == other.enableGraph &&
            indexName == other.indexName &&
            kmsKeyId == other.kmsKeyId &&
            metadata == other.metadata &&
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
            createdAt,
            filesBucket,
            name,
            region,
            chunkStrategy,
            description,
            enableGraph,
            indexName,
            kmsKeyId,
            metadata,
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
        "VaultRetrieveResponse{id=$id, createdAt=$createdAt, filesBucket=$filesBucket, name=$name, region=$region, chunkStrategy=$chunkStrategy, description=$description, enableGraph=$enableGraph, indexName=$indexName, kmsKeyId=$kmsKeyId, metadata=$metadata, totalBytes=$totalBytes, totalObjects=$totalObjects, totalVectors=$totalVectors, updatedAt=$updatedAt, vectorBucket=$vectorBucket, additionalProperties=$additionalProperties}"
}
