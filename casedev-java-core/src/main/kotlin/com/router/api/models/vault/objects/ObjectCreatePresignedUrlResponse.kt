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

class ObjectCreatePresignedUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val expiresIn: JsonField<Long>,
    private val filename: JsonField<String>,
    private val instructions: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val objectId: JsonField<String>,
    private val operation: JsonField<String>,
    private val presignedUrl: JsonField<String>,
    private val s3Key: JsonField<String>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instructions") @ExcludeMissing instructions: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operation") @ExcludeMissing operation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presignedUrl")
        @ExcludeMissing
        presignedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("s3Key") @ExcludeMissing s3Key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(
        expiresAt,
        expiresIn,
        filename,
        instructions,
        metadata,
        objectId,
        operation,
        presignedUrl,
        s3Key,
        vaultId,
        mutableMapOf(),
    )

    /**
     * URL expiration timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * URL expiration time in seconds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresIn(): Optional<Long> = expiresIn.getOptional("expiresIn")

    /**
     * Original filename
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Usage instructions and examples
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = objectCreatePresignedUrlResponse.instructions().convert(MyClass.class);
     * ```
     */
    @JsonProperty("instructions") @ExcludeMissing fun _instructions(): JsonValue = instructions

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * The object identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * The operation type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operation(): Optional<String> = operation.getOptional("operation")

    /**
     * The presigned URL for direct S3 access
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presignedUrl(): Optional<String> = presignedUrl.getOptional("presignedUrl")

    /**
     * S3 object key
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3Key(): Optional<String> = s3Key.getOptional("s3Key")

    /**
     * The vault identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = vaultId.getOptional("vaultId")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<String> = operation

    /**
     * Returns the raw JSON value of [presignedUrl].
     *
     * Unlike [presignedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presignedUrl")
    @ExcludeMissing
    fun _presignedUrl(): JsonField<String> = presignedUrl

    /**
     * Returns the raw JSON value of [s3Key].
     *
     * Unlike [s3Key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s3Key") @ExcludeMissing fun _s3Key(): JsonField<String> = s3Key

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
         * [ObjectCreatePresignedUrlResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectCreatePresignedUrlResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiresIn: JsonField<Long> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var instructions: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var operation: JsonField<String> = JsonMissing.of()
        private var presignedUrl: JsonField<String> = JsonMissing.of()
        private var s3Key: JsonField<String> = JsonMissing.of()
        private var vaultId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectCreatePresignedUrlResponse: ObjectCreatePresignedUrlResponse) =
            apply {
                expiresAt = objectCreatePresignedUrlResponse.expiresAt
                expiresIn = objectCreatePresignedUrlResponse.expiresIn
                filename = objectCreatePresignedUrlResponse.filename
                instructions = objectCreatePresignedUrlResponse.instructions
                metadata = objectCreatePresignedUrlResponse.metadata
                objectId = objectCreatePresignedUrlResponse.objectId
                operation = objectCreatePresignedUrlResponse.operation
                presignedUrl = objectCreatePresignedUrlResponse.presignedUrl
                s3Key = objectCreatePresignedUrlResponse.s3Key
                vaultId = objectCreatePresignedUrlResponse.vaultId
                additionalProperties =
                    objectCreatePresignedUrlResponse.additionalProperties.toMutableMap()
            }

        /** URL expiration timestamp */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

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

        /** Usage instructions and examples */
        fun instructions(instructions: JsonValue) = apply { this.instructions = instructions }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The object identifier */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The operation type */
        fun operation(operation: String) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<String>) = apply { this.operation = operation }

        /** The presigned URL for direct S3 access */
        fun presignedUrl(presignedUrl: String) = presignedUrl(JsonField.of(presignedUrl))

        /**
         * Sets [Builder.presignedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presignedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun presignedUrl(presignedUrl: JsonField<String>) = apply {
            this.presignedUrl = presignedUrl
        }

        /** S3 object key */
        fun s3Key(s3Key: String) = s3Key(JsonField.of(s3Key))

        /**
         * Sets [Builder.s3Key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3Key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun s3Key(s3Key: JsonField<String>) = apply { this.s3Key = s3Key }

        /** The vault identifier */
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
         * Returns an immutable instance of [ObjectCreatePresignedUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectCreatePresignedUrlResponse =
            ObjectCreatePresignedUrlResponse(
                expiresAt,
                expiresIn,
                filename,
                instructions,
                metadata,
                objectId,
                operation,
                presignedUrl,
                s3Key,
                vaultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectCreatePresignedUrlResponse = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        expiresIn()
        filename()
        metadata().ifPresent { it.validate() }
        objectId()
        operation()
        presignedUrl()
        s3Key()
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
        (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (operation.asKnown().isPresent) 1 else 0) +
            (if (presignedUrl.asKnown().isPresent) 1 else 0) +
            (if (s3Key.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bucket: JsonField<String>,
        private val contentType: JsonField<String>,
        private val region: JsonField<String>,
        private val sizeBytes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contentType")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        ) : this(bucket, contentType, region, sizeBytes, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bucket(): Optional<String> = bucket.getOptional("bucket")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("contentType")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

        /**
         * Returns the raw JSON value of [bucket].
         *
         * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contentType")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [sizeBytes].
         *
         * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var bucket: JsonField<String> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var sizeBytes: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                bucket = metadata.bucket
                contentType = metadata.contentType
                region = metadata.region
                sizeBytes = metadata.sizeBytes
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun bucket(bucket: String) = bucket(JsonField.of(bucket))

            /**
             * Sets [Builder.bucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata =
                Metadata(
                    bucket,
                    contentType,
                    region,
                    sizeBytes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            bucket()
            contentType()
            region()
            sizeBytes()
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
            (if (bucket.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                bucket == other.bucket &&
                contentType == other.contentType &&
                region == other.region &&
                sizeBytes == other.sizeBytes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bucket, contentType, region, sizeBytes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{bucket=$bucket, contentType=$contentType, region=$region, sizeBytes=$sizeBytes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectCreatePresignedUrlResponse &&
            expiresAt == other.expiresAt &&
            expiresIn == other.expiresIn &&
            filename == other.filename &&
            instructions == other.instructions &&
            metadata == other.metadata &&
            objectId == other.objectId &&
            operation == other.operation &&
            presignedUrl == other.presignedUrl &&
            s3Key == other.s3Key &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            expiresAt,
            expiresIn,
            filename,
            instructions,
            metadata,
            objectId,
            operation,
            presignedUrl,
            s3Key,
            vaultId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectCreatePresignedUrlResponse{expiresAt=$expiresAt, expiresIn=$expiresIn, filename=$filename, instructions=$instructions, metadata=$metadata, objectId=$objectId, operation=$operation, presignedUrl=$presignedUrl, s3Key=$s3Key, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
