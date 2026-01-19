// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Double>,
    private val objects: JsonField<List<Object>>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("objects")
        @ExcludeMissing
        objects: JsonField<List<Object>> = JsonMissing.of(),
        @JsonProperty("vaultId") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(count, objects, vaultId, mutableMapOf())

    /**
     * Total number of objects in the vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Double> = count.getOptional("count")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objects(): Optional<List<Object>> = objects.getOptional("objects")

    /**
     * The ID of the vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = vaultId.getOptional("vaultId")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

    /**
     * Returns the raw JSON value of [objects].
     *
     * Unlike [objects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objects") @ExcludeMissing fun _objects(): JsonField<List<Object>> = objects

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

        /** Returns a mutable builder for constructing an instance of [ObjectListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Double> = JsonMissing.of()
        private var objects: JsonField<MutableList<Object>>? = null
        private var vaultId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectListResponse: ObjectListResponse) = apply {
            count = objectListResponse.count
            objects = objectListResponse.objects.map { it.toMutableList() }
            vaultId = objectListResponse.vaultId
            additionalProperties = objectListResponse.additionalProperties.toMutableMap()
        }

        /** Total number of objects in the vault */
        fun count(count: Double) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Double>) = apply { this.count = count }

        fun objects(objects: List<Object>) = objects(JsonField.of(objects))

        /**
         * Sets [Builder.objects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objects] with a well-typed `List<Object>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objects(objects: JsonField<List<Object>>) = apply {
            this.objects = objects.map { it.toMutableList() }
        }

        /**
         * Adds a single [Object] to [objects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObject(object_: Object) = apply {
            objects =
                (objects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objects", it).add(object_)
                }
        }

        /** The ID of the vault */
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
         * Returns an immutable instance of [ObjectListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectListResponse =
            ObjectListResponse(
                count,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                vaultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        objects().ifPresent { it.forEach { it.validate() } }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (objects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    class Object
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val chunkCount: JsonField<Double>,
        private val contentType: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val filename: JsonField<String>,
        private val ingestionCompletedAt: JsonField<OffsetDateTime>,
        private val ingestionStatus: JsonField<String>,
        private val metadata: JsonValue,
        private val pageCount: JsonField<Double>,
        private val path: JsonField<String>,
        private val sizeBytes: JsonField<Double>,
        private val tags: JsonField<List<String>>,
        private val textLength: JsonField<Double>,
        private val vectorCount: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chunkCount")
            @ExcludeMissing
            chunkCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("contentType")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingestionCompletedAt")
            @ExcludeMissing
            ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ingestionStatus")
            @ExcludeMissing
            ingestionStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("pageCount")
            @ExcludeMissing
            pageCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sizeBytes")
            @ExcludeMissing
            sizeBytes: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("textLength")
            @ExcludeMissing
            textLength: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("vectorCount")
            @ExcludeMissing
            vectorCount: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            chunkCount,
            contentType,
            createdAt,
            filename,
            ingestionCompletedAt,
            ingestionStatus,
            metadata,
            pageCount,
            path,
            sizeBytes,
            tags,
            textLength,
            vectorCount,
            mutableMapOf(),
        )

        /**
         * Unique object identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Number of text chunks created for vectorization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chunkCount(): Optional<Double> = chunkCount.getOptional("chunkCount")

        /**
         * MIME type of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("contentType")

        /**
         * Document upload timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Original filename of the uploaded document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * Processing completion timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionCompletedAt(): Optional<OffsetDateTime> =
            ingestionCompletedAt.getOptional("ingestionCompletedAt")

        /**
         * Processing status of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionStatus(): Optional<String> = ingestionStatus.getOptional("ingestionStatus")

        /** Custom metadata associated with the document */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Number of pages in the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageCount(): Optional<Double> = pageCount.getOptional("pageCount")

        /**
         * Optional folder path for hierarchy preservation from source systems
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
        fun sizeBytes(): Optional<Double> = sizeBytes.getOptional("sizeBytes")

        /**
         * Custom tags associated with the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Total character count of extracted text
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textLength(): Optional<Double> = textLength.getOptional("textLength")

        /**
         * Number of vectors generated for semantic search
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vectorCount(): Optional<Double> = vectorCount.getOptional("vectorCount")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [chunkCount].
         *
         * Unlike [chunkCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunkCount")
        @ExcludeMissing
        fun _chunkCount(): JsonField<Double> = chunkCount

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contentType")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [ingestionCompletedAt].
         *
         * Unlike [ingestionCompletedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ingestionCompletedAt")
        @ExcludeMissing
        fun _ingestionCompletedAt(): JsonField<OffsetDateTime> = ingestionCompletedAt

        /**
         * Returns the raw JSON value of [ingestionStatus].
         *
         * Unlike [ingestionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ingestionStatus")
        @ExcludeMissing
        fun _ingestionStatus(): JsonField<String> = ingestionStatus

        /**
         * Returns the raw JSON value of [pageCount].
         *
         * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Double> = pageCount

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
        @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Double> = sizeBytes

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [textLength].
         *
         * Unlike [textLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("textLength")
        @ExcludeMissing
        fun _textLength(): JsonField<Double> = textLength

        /**
         * Returns the raw JSON value of [vectorCount].
         *
         * Unlike [vectorCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vectorCount")
        @ExcludeMissing
        fun _vectorCount(): JsonField<Double> = vectorCount

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

            /** Returns a mutable builder for constructing an instance of [Object]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Object]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var chunkCount: JsonField<Double> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ingestionStatus: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var pageCount: JsonField<Double> = JsonMissing.of()
            private var path: JsonField<String> = JsonMissing.of()
            private var sizeBytes: JsonField<Double> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var textLength: JsonField<Double> = JsonMissing.of()
            private var vectorCount: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(object_: Object) = apply {
                id = object_.id
                chunkCount = object_.chunkCount
                contentType = object_.contentType
                createdAt = object_.createdAt
                filename = object_.filename
                ingestionCompletedAt = object_.ingestionCompletedAt
                ingestionStatus = object_.ingestionStatus
                metadata = object_.metadata
                pageCount = object_.pageCount
                path = object_.path
                sizeBytes = object_.sizeBytes
                tags = object_.tags.map { it.toMutableList() }
                textLength = object_.textLength
                vectorCount = object_.vectorCount
                additionalProperties = object_.additionalProperties.toMutableMap()
            }

            /** Unique object identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Number of text chunks created for vectorization */
            fun chunkCount(chunkCount: Double) = chunkCount(JsonField.of(chunkCount))

            /**
             * Sets [Builder.chunkCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkCount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkCount(chunkCount: JsonField<Double>) = apply { this.chunkCount = chunkCount }

            /** MIME type of the document */
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

            /** Document upload timestamp */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Original filename of the uploaded document */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Processing completion timestamp */
            fun ingestionCompletedAt(ingestionCompletedAt: OffsetDateTime) =
                ingestionCompletedAt(JsonField.of(ingestionCompletedAt))

            /**
             * Sets [Builder.ingestionCompletedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestionCompletedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ingestionCompletedAt(ingestionCompletedAt: JsonField<OffsetDateTime>) = apply {
                this.ingestionCompletedAt = ingestionCompletedAt
            }

            /** Processing status of the document */
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

            /** Custom metadata associated with the document */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /** Number of pages in the document */
            fun pageCount(pageCount: Double) = pageCount(JsonField.of(pageCount))

            /**
             * Sets [Builder.pageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCount(pageCount: JsonField<Double>) = apply { this.pageCount = pageCount }

            /** Optional folder path for hierarchy preservation from source systems */
            fun path(path: String?) = path(JsonField.ofNullable(path))

            /** Alias for calling [Builder.path] with `path.orElse(null)`. */
            fun path(path: Optional<String>) = path(path.getOrNull())

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            /** File size in bytes */
            fun sizeBytes(sizeBytes: Double) = sizeBytes(JsonField.of(sizeBytes))

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Double>) = apply { this.sizeBytes = sizeBytes }

            /** Custom tags associated with the document */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Total character count of extracted text */
            fun textLength(textLength: Double) = textLength(JsonField.of(textLength))

            /**
             * Sets [Builder.textLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textLength] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textLength(textLength: JsonField<Double>) = apply { this.textLength = textLength }

            /** Number of vectors generated for semantic search */
            fun vectorCount(vectorCount: Double) = vectorCount(JsonField.of(vectorCount))

            /**
             * Sets [Builder.vectorCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorCount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorCount(vectorCount: JsonField<Double>) = apply {
                this.vectorCount = vectorCount
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
             * Returns an immutable instance of [Object].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Object =
                Object(
                    id,
                    chunkCount,
                    contentType,
                    createdAt,
                    filename,
                    ingestionCompletedAt,
                    ingestionStatus,
                    metadata,
                    pageCount,
                    path,
                    sizeBytes,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    textLength,
                    vectorCount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            id()
            chunkCount()
            contentType()
            createdAt()
            filename()
            ingestionCompletedAt()
            ingestionStatus()
            pageCount()
            path()
            sizeBytes()
            tags()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (chunkCount.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (ingestionCompletedAt.asKnown().isPresent) 1 else 0) +
                (if (ingestionStatus.asKnown().isPresent) 1 else 0) +
                (if (pageCount.asKnown().isPresent) 1 else 0) +
                (if (path.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (textLength.asKnown().isPresent) 1 else 0) +
                (if (vectorCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object &&
                id == other.id &&
                chunkCount == other.chunkCount &&
                contentType == other.contentType &&
                createdAt == other.createdAt &&
                filename == other.filename &&
                ingestionCompletedAt == other.ingestionCompletedAt &&
                ingestionStatus == other.ingestionStatus &&
                metadata == other.metadata &&
                pageCount == other.pageCount &&
                path == other.path &&
                sizeBytes == other.sizeBytes &&
                tags == other.tags &&
                textLength == other.textLength &&
                vectorCount == other.vectorCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                chunkCount,
                contentType,
                createdAt,
                filename,
                ingestionCompletedAt,
                ingestionStatus,
                metadata,
                pageCount,
                path,
                sizeBytes,
                tags,
                textLength,
                vectorCount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Object{id=$id, chunkCount=$chunkCount, contentType=$contentType, createdAt=$createdAt, filename=$filename, ingestionCompletedAt=$ingestionCompletedAt, ingestionStatus=$ingestionStatus, metadata=$metadata, pageCount=$pageCount, path=$path, sizeBytes=$sizeBytes, tags=$tags, textLength=$textLength, vectorCount=$vectorCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectListResponse &&
            count == other.count &&
            objects == other.objects &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(count, objects, vaultId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectListResponse{count=$count, objects=$objects, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
