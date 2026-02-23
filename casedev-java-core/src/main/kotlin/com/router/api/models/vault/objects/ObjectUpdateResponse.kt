// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val contentType: JsonField<String>,
    private val filename: JsonField<String>,
    private val ingestionStatus: JsonField<String>,
    private val metadata: JsonValue,
    private val path: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ingestionStatus")
        @ExcludeMissing
        ingestionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        contentType,
        filename,
        ingestionStatus,
        metadata,
        path,
        sizeBytes,
        updatedAt,
        vaultId,
        mutableMapOf(),
    )

    /**
     * Object ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * MIME type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("contentType")

    /**
     * Updated filename
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Processing status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ingestionStatus(): Optional<String> = ingestionStatus.getOptional("ingestionStatus")

    /**
     * Full metadata object
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = objectUpdateResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Folder path for hierarchy preservation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * File size in bytes
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

    /**
     * Last update timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Vault ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = vaultId.getOptional("vaultId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentType") @ExcludeMissing fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [ingestionStatus].
     *
     * Unlike [ingestionStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ingestionStatus")
    @ExcludeMissing
    fun _ingestionStatus(): JsonField<String> = ingestionStatus

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [ObjectUpdateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var contentType: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var ingestionStatus: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var vaultId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectUpdateResponse: ObjectUpdateResponse) = apply {
            id = objectUpdateResponse.id
            contentType = objectUpdateResponse.contentType
            filename = objectUpdateResponse.filename
            ingestionStatus = objectUpdateResponse.ingestionStatus
            metadata = objectUpdateResponse.metadata
            path = objectUpdateResponse.path
            sizeBytes = objectUpdateResponse.sizeBytes
            updatedAt = objectUpdateResponse.updatedAt
            vaultId = objectUpdateResponse.vaultId
            additionalProperties = objectUpdateResponse.additionalProperties.toMutableMap()
        }

        /** Object ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** MIME type */
        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** Updated filename */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Processing status */
        fun ingestionStatus(ingestionStatus: String) =
            ingestionStatus(JsonField.of(ingestionStatus))

        /**
         * Sets [Builder.ingestionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestionStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ingestionStatus(ingestionStatus: JsonField<String>) = apply {
            this.ingestionStatus = ingestionStatus
        }

        /** Full metadata object */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** Folder path for hierarchy preservation */
        fun path(path: String?) = path(JsonField.ofNullable(path))

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** File size in bytes */
        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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

        /** Vault ID */
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
         * Returns an immutable instance of [ObjectUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectUpdateResponse =
            ObjectUpdateResponse(
                id,
                contentType,
                filename,
                ingestionStatus,
                metadata,
                path,
                sizeBytes,
                updatedAt,
                vaultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        contentType()
        filename()
        ingestionStatus()
        path()
        sizeBytes()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (ingestionStatus.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectUpdateResponse &&
            id == other.id &&
            contentType == other.contentType &&
            filename == other.filename &&
            ingestionStatus == other.ingestionStatus &&
            metadata == other.metadata &&
            path == other.path &&
            sizeBytes == other.sizeBytes &&
            updatedAt == other.updatedAt &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            contentType,
            filename,
            ingestionStatus,
            metadata,
            path,
            sizeBytes,
            updatedAt,
            vaultId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectUpdateResponse{id=$id, contentType=$contentType, filename=$filename, ingestionStatus=$ingestionStatus, metadata=$metadata, path=$path, sizeBytes=$sizeBytes, updatedAt=$updatedAt, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
