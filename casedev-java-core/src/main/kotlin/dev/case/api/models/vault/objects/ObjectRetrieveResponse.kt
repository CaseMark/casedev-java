// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkRequired
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val contentType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val downloadUrl: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val filename: JsonField<String>,
    private val ingestionStatus: JsonField<String>,
    private val vaultId: JsonField<String>,
    private val chunkCount: JsonField<Long>,
    private val metadata: JsonValue,
    private val pageCount: JsonField<Long>,
    private val path: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val textLength: JsonField<Long>,
    private val vectorCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("downloadUrl")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ingestionStatus")
        @ExcludeMissing
        ingestionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chunkCount") @ExcludeMissing chunkCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("pageCount") @ExcludeMissing pageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("textLength") @ExcludeMissing textLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vectorCount") @ExcludeMissing vectorCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        contentType,
        createdAt,
        downloadUrl,
        expiresIn,
        filename,
        ingestionStatus,
        vaultId,
        chunkCount,
        metadata,
        pageCount,
        path,
        sizeBytes,
        textLength,
        vectorCount,
        mutableMapOf(),
    )

    /**
     * Object ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * MIME type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentType(): String = contentType.getRequired("contentType")

    /**
     * Upload timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Presigned S3 download URL
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun downloadUrl(): String = downloadUrl.getRequired("downloadUrl")

    /**
     * URL expiration time in seconds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expiresIn")

    /**
     * Original filename
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filename(): String = filename.getRequired("filename")

    /**
     * Processing status (pending, processing, completed, failed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ingestionStatus(): String = ingestionStatus.getRequired("ingestionStatus")

    /**
     * Vault ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): String = vaultId.getRequired("vaultId")

    /**
     * Number of text chunks created
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkCount(): Optional<Long> = chunkCount.getOptional("chunkCount")

    /**
     * Additional metadata
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = objectRetrieveResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Number of pages (for documents)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCount(): Optional<Long> = pageCount.getOptional("pageCount")

    /**
     * Optional folder path for hierarchy preservation
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
     * Length of extracted text
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textLength(): Optional<Long> = textLength.getOptional("textLength")

    /**
     * Number of embedding vectors generated
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vectorCount(): Optional<Long> = vectorCount.getOptional("vectorCount")

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downloadUrl") @ExcludeMissing fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresIn") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

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
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaultId") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

    /**
     * Returns the raw JSON value of [chunkCount].
     *
     * Unlike [chunkCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunkCount") @ExcludeMissing fun _chunkCount(): JsonField<Long> = chunkCount

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

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
     * Returns the raw JSON value of [textLength].
     *
     * Unlike [textLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("textLength") @ExcludeMissing fun _textLength(): JsonField<Long> = textLength

    /**
     * Returns the raw JSON value of [vectorCount].
     *
     * Unlike [vectorCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vectorCount") @ExcludeMissing fun _vectorCount(): JsonField<Long> = vectorCount

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
         * Returns a mutable builder for constructing an instance of [ObjectRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contentType()
         * .createdAt()
         * .downloadUrl()
         * .expiresIn()
         * .filename()
         * .ingestionStatus()
         * .vaultId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var contentType: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var downloadUrl: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var filename: JsonField<String>? = null
        private var ingestionStatus: JsonField<String>? = null
        private var vaultId: JsonField<String>? = null
        private var chunkCount: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var pageCount: JsonField<Long> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var textLength: JsonField<Long> = JsonMissing.of()
        private var vectorCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectRetrieveResponse: ObjectRetrieveResponse) = apply {
            id = objectRetrieveResponse.id
            contentType = objectRetrieveResponse.contentType
            createdAt = objectRetrieveResponse.createdAt
            downloadUrl = objectRetrieveResponse.downloadUrl
            expiresIn = objectRetrieveResponse.expiresIn
            filename = objectRetrieveResponse.filename
            ingestionStatus = objectRetrieveResponse.ingestionStatus
            vaultId = objectRetrieveResponse.vaultId
            chunkCount = objectRetrieveResponse.chunkCount
            metadata = objectRetrieveResponse.metadata
            pageCount = objectRetrieveResponse.pageCount
            path = objectRetrieveResponse.path
            sizeBytes = objectRetrieveResponse.sizeBytes
            textLength = objectRetrieveResponse.textLength
            vectorCount = objectRetrieveResponse.vectorCount
            additionalProperties = objectRetrieveResponse.additionalProperties.toMutableMap()
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

        /** Upload timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Presigned S3 download URL */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** URL expiration time in seconds */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Original filename */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Processing status (pending, processing, completed, failed) */
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

        /** Vault ID */
        fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

        /** Number of text chunks created */
        fun chunkCount(chunkCount: Long) = chunkCount(JsonField.of(chunkCount))

        /**
         * Sets [Builder.chunkCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkCount(chunkCount: JsonField<Long>) = apply { this.chunkCount = chunkCount }

        /** Additional metadata */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** Number of pages (for documents) */
        fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

        /** Optional folder path for hierarchy preservation */
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

        /** Length of extracted text */
        fun textLength(textLength: Long) = textLength(JsonField.of(textLength))

        /**
         * Sets [Builder.textLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textLength(textLength: JsonField<Long>) = apply { this.textLength = textLength }

        /** Number of embedding vectors generated */
        fun vectorCount(vectorCount: Long) = vectorCount(JsonField.of(vectorCount))

        /**
         * Sets [Builder.vectorCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorCount(vectorCount: JsonField<Long>) = apply { this.vectorCount = vectorCount }

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
         * Returns an immutable instance of [ObjectRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contentType()
         * .createdAt()
         * .downloadUrl()
         * .expiresIn()
         * .filename()
         * .ingestionStatus()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectRetrieveResponse =
            ObjectRetrieveResponse(
                checkRequired("id", id),
                checkRequired("contentType", contentType),
                checkRequired("createdAt", createdAt),
                checkRequired("downloadUrl", downloadUrl),
                checkRequired("expiresIn", expiresIn),
                checkRequired("filename", filename),
                checkRequired("ingestionStatus", ingestionStatus),
                checkRequired("vaultId", vaultId),
                chunkCount,
                metadata,
                pageCount,
                path,
                sizeBytes,
                textLength,
                vectorCount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        contentType()
        createdAt()
        downloadUrl()
        expiresIn()
        filename()
        ingestionStatus()
        vaultId()
        chunkCount()
        pageCount()
        path()
        sizeBytes()
        textLength()
        vectorCount()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (ingestionStatus.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0) +
            (if (chunkCount.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (textLength.asKnown().isPresent) 1 else 0) +
            (if (vectorCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectRetrieveResponse &&
            id == other.id &&
            contentType == other.contentType &&
            createdAt == other.createdAt &&
            downloadUrl == other.downloadUrl &&
            expiresIn == other.expiresIn &&
            filename == other.filename &&
            ingestionStatus == other.ingestionStatus &&
            vaultId == other.vaultId &&
            chunkCount == other.chunkCount &&
            metadata == other.metadata &&
            pageCount == other.pageCount &&
            path == other.path &&
            sizeBytes == other.sizeBytes &&
            textLength == other.textLength &&
            vectorCount == other.vectorCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            contentType,
            createdAt,
            downloadUrl,
            expiresIn,
            filename,
            ingestionStatus,
            vaultId,
            chunkCount,
            metadata,
            pageCount,
            path,
            sizeBytes,
            textLength,
            vectorCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectRetrieveResponse{id=$id, contentType=$contentType, createdAt=$createdAt, downloadUrl=$downloadUrl, expiresIn=$expiresIn, filename=$filename, ingestionStatus=$ingestionStatus, vaultId=$vaultId, chunkCount=$chunkCount, metadata=$metadata, pageCount=$pageCount, path=$path, sizeBytes=$sizeBytes, textLength=$textLength, vectorCount=$vectorCount, additionalProperties=$additionalProperties}"
}
