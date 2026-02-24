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

class ObjectGetTextResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val metadata: JsonField<Metadata>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(metadata, text, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Full concatenated text content from all chunks
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
         * Returns a mutable builder for constructing an instance of [ObjectGetTextResponse].
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetTextResponse]. */
    class Builder internal constructor() {

        private var metadata: JsonField<Metadata>? = null
        private var text: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectGetTextResponse: ObjectGetTextResponse) = apply {
            metadata = objectGetTextResponse.metadata
            text = objectGetTextResponse.text
            additionalProperties = objectGetTextResponse.additionalProperties.toMutableMap()
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Full concatenated text content from all chunks */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [ObjectGetTextResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectGetTextResponse =
            ObjectGetTextResponse(
                checkRequired("metadata", metadata),
                checkRequired("text", text),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectGetTextResponse = apply {
        if (validated) {
            return@apply
        }

        metadata().validate()
        text()
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
        (metadata.asKnown().getOrNull()?.validity() ?: 0) + (if (text.asKnown().isPresent) 1 else 0)

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chunkCount: JsonField<Long>,
        private val filename: JsonField<String>,
        private val length: JsonField<Long>,
        private val objectId: JsonField<String>,
        private val vaultId: JsonField<String>,
        private val ingestionCompletedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chunk_count")
            @ExcludeMissing
            chunkCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("length") @ExcludeMissing length: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("object_id")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingestion_completed_at")
            @ExcludeMissing
            ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            chunkCount,
            filename,
            length,
            objectId,
            vaultId,
            ingestionCompletedAt,
            mutableMapOf(),
        )

        /**
         * Number of text chunks the document was split into
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chunkCount(): Long = chunkCount.getRequired("chunk_count")

        /**
         * Original filename of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * Total character count of the extracted text
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun length(): Long = length.getRequired("length")

        /**
         * The object ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("object_id")

        /**
         * The vault ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vaultId(): String = vaultId.getRequired("vault_id")

        /**
         * When the document processing completed
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionCompletedAt(): Optional<OffsetDateTime> =
            ingestionCompletedAt.getOptional("ingestion_completed_at")

        /**
         * Returns the raw JSON value of [chunkCount].
         *
         * Unlike [chunkCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunk_count") @ExcludeMissing fun _chunkCount(): JsonField<Long> = chunkCount

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [length].
         *
         * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

        /**
         * Returns the raw JSON value of [ingestionCompletedAt].
         *
         * Unlike [ingestionCompletedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ingestion_completed_at")
        @ExcludeMissing
        fun _ingestionCompletedAt(): JsonField<OffsetDateTime> = ingestionCompletedAt

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
             * Returns a mutable builder for constructing an instance of [Metadata].
             *
             * The following fields are required:
             * ```java
             * .chunkCount()
             * .filename()
             * .length()
             * .objectId()
             * .vaultId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var chunkCount: JsonField<Long>? = null
            private var filename: JsonField<String>? = null
            private var length: JsonField<Long>? = null
            private var objectId: JsonField<String>? = null
            private var vaultId: JsonField<String>? = null
            private var ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                chunkCount = metadata.chunkCount
                filename = metadata.filename
                length = metadata.length
                objectId = metadata.objectId
                vaultId = metadata.vaultId
                ingestionCompletedAt = metadata.ingestionCompletedAt
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** Number of text chunks the document was split into */
            fun chunkCount(chunkCount: Long) = chunkCount(JsonField.of(chunkCount))

            /**
             * Sets [Builder.chunkCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkCount(chunkCount: JsonField<Long>) = apply { this.chunkCount = chunkCount }

            /** Original filename of the document */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Total character count of the extracted text */
            fun length(length: Long) = length(JsonField.of(length))

            /**
             * Sets [Builder.length] to an arbitrary JSON value.
             *
             * You should usually call [Builder.length] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun length(length: JsonField<Long>) = apply { this.length = length }

            /** The object ID */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The vault ID */
            fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

            /** When the document processing completed */
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
             *
             * The following fields are required:
             * ```java
             * .chunkCount()
             * .filename()
             * .length()
             * .objectId()
             * .vaultId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("chunkCount", chunkCount),
                    checkRequired("filename", filename),
                    checkRequired("length", length),
                    checkRequired("objectId", objectId),
                    checkRequired("vaultId", vaultId),
                    ingestionCompletedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            chunkCount()
            filename()
            length()
            objectId()
            vaultId()
            ingestionCompletedAt()
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
            (if (chunkCount.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (length.asKnown().isPresent) 1 else 0) +
                (if (objectId.asKnown().isPresent) 1 else 0) +
                (if (vaultId.asKnown().isPresent) 1 else 0) +
                (if (ingestionCompletedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                chunkCount == other.chunkCount &&
                filename == other.filename &&
                length == other.length &&
                objectId == other.objectId &&
                vaultId == other.vaultId &&
                ingestionCompletedAt == other.ingestionCompletedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                chunkCount,
                filename,
                length,
                objectId,
                vaultId,
                ingestionCompletedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{chunkCount=$chunkCount, filename=$filename, length=$length, objectId=$objectId, vaultId=$vaultId, ingestionCompletedAt=$ingestionCompletedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetTextResponse &&
            metadata == other.metadata &&
            text == other.text &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(metadata, text, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectGetTextResponse{metadata=$metadata, text=$text, additionalProperties=$additionalProperties}"
}
