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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectGetChunksResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val objectId: JsonField<String>,
    private val totalChunks: JsonField<Long>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunks") @ExcludeMissing chunks: JsonField<List<Chunk>> = JsonMissing.of(),
        @JsonProperty("object_id") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_chunks")
        @ExcludeMissing
        totalChunks: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(chunks, objectId, totalChunks, vaultId, mutableMapOf())

    /**
     * Full chunk objects for the requested range
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    /**
     * The object ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("object_id")

    /**
     * Total number of chunks stored for the object
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalChunks(): Long = totalChunks.getRequired("total_chunks")

    /**
     * The vault ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): String = vaultId.getRequired("vault_id")

    /**
     * Returns the raw JSON value of [chunks].
     *
     * Unlike [chunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [totalChunks].
     *
     * Unlike [totalChunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_chunks") @ExcludeMissing fun _totalChunks(): JsonField<Long> = totalChunks

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

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
         * Returns a mutable builder for constructing an instance of [ObjectGetChunksResponse].
         *
         * The following fields are required:
         * ```java
         * .chunks()
         * .objectId()
         * .totalChunks()
         * .vaultId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetChunksResponse]. */
    class Builder internal constructor() {

        private var chunks: JsonField<MutableList<Chunk>>? = null
        private var objectId: JsonField<String>? = null
        private var totalChunks: JsonField<Long>? = null
        private var vaultId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectGetChunksResponse: ObjectGetChunksResponse) = apply {
            chunks = objectGetChunksResponse.chunks.map { it.toMutableList() }
            objectId = objectGetChunksResponse.objectId
            totalChunks = objectGetChunksResponse.totalChunks
            vaultId = objectGetChunksResponse.vaultId
            additionalProperties = objectGetChunksResponse.additionalProperties.toMutableMap()
        }

        /** Full chunk objects for the requested range */
        fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

        /**
         * Sets [Builder.chunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunks] with a well-typed `List<Chunk>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chunks(chunks: JsonField<List<Chunk>>) = apply {
            this.chunks = chunks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Chunk] to [chunks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChunk(chunk: Chunk) = apply {
            chunks =
                (chunks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("chunks", it).add(chunk)
                }
        }

        /** The object ID */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Total number of chunks stored for the object */
        fun totalChunks(totalChunks: Long) = totalChunks(JsonField.of(totalChunks))

        /**
         * Sets [Builder.totalChunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalChunks] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalChunks(totalChunks: JsonField<Long>) = apply { this.totalChunks = totalChunks }

        /** The vault ID */
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
         * Returns an immutable instance of [ObjectGetChunksResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chunks()
         * .objectId()
         * .totalChunks()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectGetChunksResponse =
            ObjectGetChunksResponse(
                checkRequired("chunks", chunks).map { it.toImmutable() },
                checkRequired("objectId", objectId),
                checkRequired("totalChunks", totalChunks),
                checkRequired("vaultId", vaultId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectGetChunksResponse = apply {
        if (validated) {
            return@apply
        }

        chunks().forEach { it.validate() }
        objectId()
        totalChunks()
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
        (chunks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (totalChunks.asKnown().isPresent) 1 else 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    class Chunk
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val index: JsonField<Long>,
        private val pageEnd: JsonField<Long>,
        private val pageStart: JsonField<Long>,
        private val text: JsonField<String>,
        private val wordEndIndex: JsonField<Long>,
        private val wordStartIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_end") @ExcludeMissing pageEnd: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_start")
            @ExcludeMissing
            pageStart: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("word_end_index")
            @ExcludeMissing
            wordEndIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("word_start_index")
            @ExcludeMissing
            wordStartIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(index, pageEnd, pageStart, text, wordEndIndex, wordStartIndex, mutableMapOf())

        /**
         * Chunk index within the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * Last page covered by the chunk, if page mapping is available
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageEnd(): Optional<Long> = pageEnd.getOptional("page_end")

        /**
         * First page covered by the chunk, if page mapping is available
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageStart(): Optional<Long> = pageStart.getOptional("page_start")

        /**
         * Full text for the chunk
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Last OCR word index covered by the chunk, if available
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wordEndIndex(): Optional<Long> = wordEndIndex.getOptional("word_end_index")

        /**
         * First OCR word index covered by the chunk, if available
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wordStartIndex(): Optional<Long> = wordStartIndex.getOptional("word_start_index")

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [pageEnd].
         *
         * Unlike [pageEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_end") @ExcludeMissing fun _pageEnd(): JsonField<Long> = pageEnd

        /**
         * Returns the raw JSON value of [pageStart].
         *
         * Unlike [pageStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_start") @ExcludeMissing fun _pageStart(): JsonField<Long> = pageStart

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [wordEndIndex].
         *
         * Unlike [wordEndIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("word_end_index")
        @ExcludeMissing
        fun _wordEndIndex(): JsonField<Long> = wordEndIndex

        /**
         * Returns the raw JSON value of [wordStartIndex].
         *
         * Unlike [wordStartIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("word_start_index")
        @ExcludeMissing
        fun _wordStartIndex(): JsonField<Long> = wordStartIndex

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
             * Returns a mutable builder for constructing an instance of [Chunk].
             *
             * The following fields are required:
             * ```java
             * .index()
             * .pageEnd()
             * .pageStart()
             * .text()
             * .wordEndIndex()
             * .wordStartIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chunk]. */
        class Builder internal constructor() {

            private var index: JsonField<Long>? = null
            private var pageEnd: JsonField<Long>? = null
            private var pageStart: JsonField<Long>? = null
            private var text: JsonField<String>? = null
            private var wordEndIndex: JsonField<Long>? = null
            private var wordStartIndex: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chunk: Chunk) = apply {
                index = chunk.index
                pageEnd = chunk.pageEnd
                pageStart = chunk.pageStart
                text = chunk.text
                wordEndIndex = chunk.wordEndIndex
                wordStartIndex = chunk.wordStartIndex
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            /** Chunk index within the document */
            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            /** Last page covered by the chunk, if page mapping is available */
            fun pageEnd(pageEnd: Long?) = pageEnd(JsonField.ofNullable(pageEnd))

            /**
             * Alias for [Builder.pageEnd].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageEnd(pageEnd: Long) = pageEnd(pageEnd as Long?)

            /** Alias for calling [Builder.pageEnd] with `pageEnd.orElse(null)`. */
            fun pageEnd(pageEnd: Optional<Long>) = pageEnd(pageEnd.getOrNull())

            /**
             * Sets [Builder.pageEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageEnd] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageEnd(pageEnd: JsonField<Long>) = apply { this.pageEnd = pageEnd }

            /** First page covered by the chunk, if page mapping is available */
            fun pageStart(pageStart: Long?) = pageStart(JsonField.ofNullable(pageStart))

            /**
             * Alias for [Builder.pageStart].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageStart(pageStart: Long) = pageStart(pageStart as Long?)

            /** Alias for calling [Builder.pageStart] with `pageStart.orElse(null)`. */
            fun pageStart(pageStart: Optional<Long>) = pageStart(pageStart.getOrNull())

            /**
             * Sets [Builder.pageStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageStart] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageStart(pageStart: JsonField<Long>) = apply { this.pageStart = pageStart }

            /** Full text for the chunk */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Last OCR word index covered by the chunk, if available */
            fun wordEndIndex(wordEndIndex: Long?) = wordEndIndex(JsonField.ofNullable(wordEndIndex))

            /**
             * Alias for [Builder.wordEndIndex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun wordEndIndex(wordEndIndex: Long) = wordEndIndex(wordEndIndex as Long?)

            /** Alias for calling [Builder.wordEndIndex] with `wordEndIndex.orElse(null)`. */
            fun wordEndIndex(wordEndIndex: Optional<Long>) = wordEndIndex(wordEndIndex.getOrNull())

            /**
             * Sets [Builder.wordEndIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wordEndIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wordEndIndex(wordEndIndex: JsonField<Long>) = apply {
                this.wordEndIndex = wordEndIndex
            }

            /** First OCR word index covered by the chunk, if available */
            fun wordStartIndex(wordStartIndex: Long?) =
                wordStartIndex(JsonField.ofNullable(wordStartIndex))

            /**
             * Alias for [Builder.wordStartIndex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun wordStartIndex(wordStartIndex: Long) = wordStartIndex(wordStartIndex as Long?)

            /** Alias for calling [Builder.wordStartIndex] with `wordStartIndex.orElse(null)`. */
            fun wordStartIndex(wordStartIndex: Optional<Long>) =
                wordStartIndex(wordStartIndex.getOrNull())

            /**
             * Sets [Builder.wordStartIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wordStartIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wordStartIndex(wordStartIndex: JsonField<Long>) = apply {
                this.wordStartIndex = wordStartIndex
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
             * Returns an immutable instance of [Chunk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .index()
             * .pageEnd()
             * .pageStart()
             * .text()
             * .wordEndIndex()
             * .wordStartIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Chunk =
                Chunk(
                    checkRequired("index", index),
                    checkRequired("pageEnd", pageEnd),
                    checkRequired("pageStart", pageStart),
                    checkRequired("text", text),
                    checkRequired("wordEndIndex", wordEndIndex),
                    checkRequired("wordStartIndex", wordStartIndex),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            index()
            pageEnd()
            pageStart()
            text()
            wordEndIndex()
            wordStartIndex()
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
            (if (index.asKnown().isPresent) 1 else 0) +
                (if (pageEnd.asKnown().isPresent) 1 else 0) +
                (if (pageStart.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (wordEndIndex.asKnown().isPresent) 1 else 0) +
                (if (wordStartIndex.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chunk &&
                index == other.index &&
                pageEnd == other.pageEnd &&
                pageStart == other.pageStart &&
                text == other.text &&
                wordEndIndex == other.wordEndIndex &&
                wordStartIndex == other.wordStartIndex &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                index,
                pageEnd,
                pageStart,
                text,
                wordEndIndex,
                wordStartIndex,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{index=$index, pageEnd=$pageEnd, pageStart=$pageStart, text=$text, wordEndIndex=$wordEndIndex, wordStartIndex=$wordStartIndex, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetChunksResponse &&
            chunks == other.chunks &&
            objectId == other.objectId &&
            totalChunks == other.totalChunks &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chunks, objectId, totalChunks, vaultId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectGetChunksResponse{chunks=$chunks, objectId=$objectId, totalChunks=$totalChunks, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
