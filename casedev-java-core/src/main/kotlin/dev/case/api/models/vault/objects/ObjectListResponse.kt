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
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
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
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Double = count.getRequired("count")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objects(): List<Object> = objects.getRequired("objects")

    /**
     * The ID of the vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): String = vaultId.getRequired("vaultId")

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

        /**
         * Returns a mutable builder for constructing an instance of [ObjectListResponse].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .objects()
         * .vaultId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Double>? = null
        private var objects: JsonField<MutableList<Object>>? = null
        private var vaultId: JsonField<String>? = null
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
         *
         * The following fields are required:
         * ```java
         * .count()
         * .objects()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectListResponse =
            ObjectListResponse(
                checkRequired("count", count),
                checkRequired("objects", objects).map { it.toImmutable() },
                checkRequired("vaultId", vaultId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CasedevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ObjectListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        objects().forEach { it.validate() }
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
        private val contentType: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val filename: JsonField<String>,
        private val ingestionStatus: JsonField<String>,
        private val chunkCount: JsonField<Double>,
        private val ingestionCompletedAt: JsonField<OffsetDateTime>,
        private val ingestionError: JsonField<String>,
        private val ingestionStartedAt: JsonField<OffsetDateTime>,
        private val ingestionWorkflowId: JsonField<String>,
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
            @JsonProperty("contentType")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingestionStatus")
            @ExcludeMissing
            ingestionStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chunkCount")
            @ExcludeMissing
            chunkCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ingestionCompletedAt")
            @ExcludeMissing
            ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ingestionError")
            @ExcludeMissing
            ingestionError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingestionStartedAt")
            @ExcludeMissing
            ingestionStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ingestionWorkflowId")
            @ExcludeMissing
            ingestionWorkflowId: JsonField<String> = JsonMissing.of(),
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
            contentType,
            createdAt,
            filename,
            ingestionStatus,
            chunkCount,
            ingestionCompletedAt,
            ingestionError,
            ingestionStartedAt,
            ingestionWorkflowId,
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
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * MIME type of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contentType(): String = contentType.getRequired("contentType")

        /**
         * Document upload timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Original filename of the uploaded document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * Processing status of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ingestionStatus(): String = ingestionStatus.getRequired("ingestionStatus")

        /**
         * Number of text chunks created for vectorization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chunkCount(): Optional<Double> = chunkCount.getOptional("chunkCount")

        /**
         * Processing completion timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionCompletedAt(): Optional<OffsetDateTime> =
            ingestionCompletedAt.getOptional("ingestionCompletedAt")

        /**
         * Failure reason when ingestion status is a failed state
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionError(): Optional<String> = ingestionError.getOptional("ingestionError")

        /**
         * When ingestion processing began
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionStartedAt(): Optional<OffsetDateTime> =
            ingestionStartedAt.getOptional("ingestionStartedAt")

        /**
         * Durable workflow run ID for the active or last ingestion attempt
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionWorkflowId(): Optional<String> =
            ingestionWorkflowId.getOptional("ingestionWorkflowId")

        /**
         * Custom metadata associated with the document
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = object_.metadata().convert(MyClass.class);
         * ```
         */
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
         * Returns the raw JSON value of [ingestionStatus].
         *
         * Unlike [ingestionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ingestionStatus")
        @ExcludeMissing
        fun _ingestionStatus(): JsonField<String> = ingestionStatus

        /**
         * Returns the raw JSON value of [chunkCount].
         *
         * Unlike [chunkCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunkCount")
        @ExcludeMissing
        fun _chunkCount(): JsonField<Double> = chunkCount

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
         * Returns the raw JSON value of [ingestionError].
         *
         * Unlike [ingestionError], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ingestionError")
        @ExcludeMissing
        fun _ingestionError(): JsonField<String> = ingestionError

        /**
         * Returns the raw JSON value of [ingestionStartedAt].
         *
         * Unlike [ingestionStartedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ingestionStartedAt")
        @ExcludeMissing
        fun _ingestionStartedAt(): JsonField<OffsetDateTime> = ingestionStartedAt

        /**
         * Returns the raw JSON value of [ingestionWorkflowId].
         *
         * Unlike [ingestionWorkflowId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ingestionWorkflowId")
        @ExcludeMissing
        fun _ingestionWorkflowId(): JsonField<String> = ingestionWorkflowId

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

            /**
             * Returns a mutable builder for constructing an instance of [Object].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contentType()
             * .createdAt()
             * .filename()
             * .ingestionStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Object]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contentType: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var filename: JsonField<String>? = null
            private var ingestionStatus: JsonField<String>? = null
            private var chunkCount: JsonField<Double> = JsonMissing.of()
            private var ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ingestionError: JsonField<String> = JsonMissing.of()
            private var ingestionStartedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ingestionWorkflowId: JsonField<String> = JsonMissing.of()
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
                contentType = object_.contentType
                createdAt = object_.createdAt
                filename = object_.filename
                ingestionStatus = object_.ingestionStatus
                chunkCount = object_.chunkCount
                ingestionCompletedAt = object_.ingestionCompletedAt
                ingestionError = object_.ingestionError
                ingestionStartedAt = object_.ingestionStartedAt
                ingestionWorkflowId = object_.ingestionWorkflowId
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

            /** Failure reason when ingestion status is a failed state */
            fun ingestionError(ingestionError: String?) =
                ingestionError(JsonField.ofNullable(ingestionError))

            /** Alias for calling [Builder.ingestionError] with `ingestionError.orElse(null)`. */
            fun ingestionError(ingestionError: Optional<String>) =
                ingestionError(ingestionError.getOrNull())

            /**
             * Sets [Builder.ingestionError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestionError] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ingestionError(ingestionError: JsonField<String>) = apply {
                this.ingestionError = ingestionError
            }

            /** When ingestion processing began */
            fun ingestionStartedAt(ingestionStartedAt: OffsetDateTime?) =
                ingestionStartedAt(JsonField.ofNullable(ingestionStartedAt))

            /**
             * Alias for calling [Builder.ingestionStartedAt] with
             * `ingestionStartedAt.orElse(null)`.
             */
            fun ingestionStartedAt(ingestionStartedAt: Optional<OffsetDateTime>) =
                ingestionStartedAt(ingestionStartedAt.getOrNull())

            /**
             * Sets [Builder.ingestionStartedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestionStartedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ingestionStartedAt(ingestionStartedAt: JsonField<OffsetDateTime>) = apply {
                this.ingestionStartedAt = ingestionStartedAt
            }

            /** Durable workflow run ID for the active or last ingestion attempt */
            fun ingestionWorkflowId(ingestionWorkflowId: String?) =
                ingestionWorkflowId(JsonField.ofNullable(ingestionWorkflowId))

            /**
             * Alias for calling [Builder.ingestionWorkflowId] with
             * `ingestionWorkflowId.orElse(null)`.
             */
            fun ingestionWorkflowId(ingestionWorkflowId: Optional<String>) =
                ingestionWorkflowId(ingestionWorkflowId.getOrNull())

            /**
             * Sets [Builder.ingestionWorkflowId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestionWorkflowId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ingestionWorkflowId(ingestionWorkflowId: JsonField<String>) = apply {
                this.ingestionWorkflowId = ingestionWorkflowId
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
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contentType()
             * .createdAt()
             * .filename()
             * .ingestionStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Object =
                Object(
                    checkRequired("id", id),
                    checkRequired("contentType", contentType),
                    checkRequired("createdAt", createdAt),
                    checkRequired("filename", filename),
                    checkRequired("ingestionStatus", ingestionStatus),
                    chunkCount,
                    ingestionCompletedAt,
                    ingestionError,
                    ingestionStartedAt,
                    ingestionWorkflowId,
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            id()
            contentType()
            createdAt()
            filename()
            ingestionStatus()
            chunkCount()
            ingestionCompletedAt()
            ingestionError()
            ingestionStartedAt()
            ingestionWorkflowId()
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
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (ingestionStatus.asKnown().isPresent) 1 else 0) +
                (if (chunkCount.asKnown().isPresent) 1 else 0) +
                (if (ingestionCompletedAt.asKnown().isPresent) 1 else 0) +
                (if (ingestionError.asKnown().isPresent) 1 else 0) +
                (if (ingestionStartedAt.asKnown().isPresent) 1 else 0) +
                (if (ingestionWorkflowId.asKnown().isPresent) 1 else 0) +
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
                contentType == other.contentType &&
                createdAt == other.createdAt &&
                filename == other.filename &&
                ingestionStatus == other.ingestionStatus &&
                chunkCount == other.chunkCount &&
                ingestionCompletedAt == other.ingestionCompletedAt &&
                ingestionError == other.ingestionError &&
                ingestionStartedAt == other.ingestionStartedAt &&
                ingestionWorkflowId == other.ingestionWorkflowId &&
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
                contentType,
                createdAt,
                filename,
                ingestionStatus,
                chunkCount,
                ingestionCompletedAt,
                ingestionError,
                ingestionStartedAt,
                ingestionWorkflowId,
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
            "Object{id=$id, contentType=$contentType, createdAt=$createdAt, filename=$filename, ingestionStatus=$ingestionStatus, chunkCount=$chunkCount, ingestionCompletedAt=$ingestionCompletedAt, ingestionError=$ingestionError, ingestionStartedAt=$ingestionStartedAt, ingestionWorkflowId=$ingestionWorkflowId, metadata=$metadata, pageCount=$pageCount, path=$path, sizeBytes=$sizeBytes, tags=$tags, textLength=$textLength, vectorCount=$vectorCount, additionalProperties=$additionalProperties}"
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
