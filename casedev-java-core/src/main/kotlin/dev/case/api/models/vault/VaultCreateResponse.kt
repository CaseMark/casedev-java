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

class VaultCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val enableIndexing: JsonField<Boolean>,
    private val filesBucket: JsonField<String>,
    private val indexName: JsonField<String>,
    private val name: JsonField<String>,
    private val region: JsonField<String>,
    private val vectorBucket: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enableIndexing")
        @ExcludeMissing
        enableIndexing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("filesBucket")
        @ExcludeMissing
        filesBucket: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indexName") @ExcludeMissing indexName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vectorBucket")
        @ExcludeMissing
        vectorBucket: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        enableIndexing,
        filesBucket,
        indexName,
        name,
        region,
        vectorBucket,
        mutableMapOf(),
    )

    /**
     * Unique vault identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

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
     * Whether vector indexing is enabled for this vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableIndexing(): Optional<Boolean> = enableIndexing.getOptional("enableIndexing")

    /**
     * S3 bucket name for document storage
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filesBucket(): Optional<String> = filesBucket.getOptional("filesBucket")

    /**
     * Vector search index name. Null for storage-only vaults.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexName(): Optional<String> = indexName.getOptional("indexName")

    /**
     * Vault display name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * AWS region for storage
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * S3 bucket name for vector embeddings. Null for storage-only vaults.
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
     * Returns the raw JSON value of [enableIndexing].
     *
     * Unlike [enableIndexing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enableIndexing")
    @ExcludeMissing
    fun _enableIndexing(): JsonField<Boolean> = enableIndexing

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

        /** Returns a mutable builder for constructing an instance of [VaultCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enableIndexing: JsonField<Boolean> = JsonMissing.of()
        private var filesBucket: JsonField<String> = JsonMissing.of()
        private var indexName: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var vectorBucket: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultCreateResponse: VaultCreateResponse) = apply {
            id = vaultCreateResponse.id
            createdAt = vaultCreateResponse.createdAt
            description = vaultCreateResponse.description
            enableIndexing = vaultCreateResponse.enableIndexing
            filesBucket = vaultCreateResponse.filesBucket
            indexName = vaultCreateResponse.indexName
            name = vaultCreateResponse.name
            region = vaultCreateResponse.region
            vectorBucket = vaultCreateResponse.vectorBucket
            additionalProperties = vaultCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique vault identifier */
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

        /** Whether vector indexing is enabled for this vault */
        fun enableIndexing(enableIndexing: Boolean) = enableIndexing(JsonField.of(enableIndexing))

        /**
         * Sets [Builder.enableIndexing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableIndexing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableIndexing(enableIndexing: JsonField<Boolean>) = apply {
            this.enableIndexing = enableIndexing
        }

        /** S3 bucket name for document storage */
        fun filesBucket(filesBucket: String) = filesBucket(JsonField.of(filesBucket))

        /**
         * Sets [Builder.filesBucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesBucket] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filesBucket(filesBucket: JsonField<String>) = apply { this.filesBucket = filesBucket }

        /** Vector search index name. Null for storage-only vaults. */
        fun indexName(indexName: String?) = indexName(JsonField.ofNullable(indexName))

        /** Alias for calling [Builder.indexName] with `indexName.orElse(null)`. */
        fun indexName(indexName: Optional<String>) = indexName(indexName.getOrNull())

        /**
         * Sets [Builder.indexName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

        /** Vault display name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** AWS region for storage */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** S3 bucket name for vector embeddings. Null for storage-only vaults. */
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
         * Returns an immutable instance of [VaultCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultCreateResponse =
            VaultCreateResponse(
                id,
                createdAt,
                description,
                enableIndexing,
                filesBucket,
                indexName,
                name,
                region,
                vectorBucket,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        enableIndexing()
        filesBucket()
        indexName()
        name()
        region()
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
            (if (enableIndexing.asKnown().isPresent) 1 else 0) +
            (if (filesBucket.asKnown().isPresent) 1 else 0) +
            (if (indexName.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (vectorBucket.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultCreateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            description == other.description &&
            enableIndexing == other.enableIndexing &&
            filesBucket == other.filesBucket &&
            indexName == other.indexName &&
            name == other.name &&
            region == other.region &&
            vectorBucket == other.vectorBucket &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            description,
            enableIndexing,
            filesBucket,
            indexName,
            name,
            region,
            vectorBucket,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultCreateResponse{id=$id, createdAt=$createdAt, description=$description, enableIndexing=$enableIndexing, filesBucket=$filesBucket, indexName=$indexName, name=$name, region=$region, vectorBucket=$vectorBucket, additionalProperties=$additionalProperties}"
}
