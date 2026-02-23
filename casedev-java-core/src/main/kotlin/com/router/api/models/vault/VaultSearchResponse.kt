// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.checkKnown
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultSearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val method: JsonField<String>,
    private val query: JsonField<String>,
    private val response: JsonField<String>,
    private val sources: JsonField<List<Source>>,
    private val vaultId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunks") @ExcludeMissing chunks: JsonField<List<Chunk>> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sources")
        @ExcludeMissing
        sources: JsonField<List<Source>> = JsonMissing.of(),
        @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
    ) : this(chunks, method, query, response, sources, vaultId, mutableMapOf())

    /**
     * Relevant text chunks with similarity scores and page locations
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunks(): Optional<List<Chunk>> = chunks.getOptional("chunks")

    /**
     * Search method used
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<String> = method.getOptional("method")

    /**
     * Original search query
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * AI-generated answer based on search results (for global/entity methods)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun response(): Optional<String> = response.getOptional("response")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sources(): Optional<List<Source>> = sources.getOptional("sources")

    /**
     * ID of the searched vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = vaultId.getOptional("vault_id")

    /**
     * Returns the raw JSON value of [chunks].
     *
     * Unlike [chunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

    /**
     * Returns the raw JSON value of [sources].
     *
     * Unlike [sources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sources") @ExcludeMissing fun _sources(): JsonField<List<Source>> = sources

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

        /** Returns a mutable builder for constructing an instance of [VaultSearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultSearchResponse]. */
    class Builder internal constructor() {

        private var chunks: JsonField<MutableList<Chunk>>? = null
        private var method: JsonField<String> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var response: JsonField<String> = JsonMissing.of()
        private var sources: JsonField<MutableList<Source>>? = null
        private var vaultId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultSearchResponse: VaultSearchResponse) = apply {
            chunks = vaultSearchResponse.chunks.map { it.toMutableList() }
            method = vaultSearchResponse.method
            query = vaultSearchResponse.query
            response = vaultSearchResponse.response
            sources = vaultSearchResponse.sources.map { it.toMutableList() }
            vaultId = vaultSearchResponse.vaultId
            additionalProperties = vaultSearchResponse.additionalProperties.toMutableMap()
        }

        /** Relevant text chunks with similarity scores and page locations */
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

        /** Search method used */
        fun method(method: String) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<String>) = apply { this.method = method }

        /** Original search query */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        /** AI-generated answer based on search results (for global/entity methods) */
        fun response(response: String) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun response(response: JsonField<String>) = apply { this.response = response }

        fun sources(sources: List<Source>) = sources(JsonField.of(sources))

        /**
         * Sets [Builder.sources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sources] with a well-typed `List<Source>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sources(sources: JsonField<List<Source>>) = apply {
            this.sources = sources.map { it.toMutableList() }
        }

        /**
         * Adds a single [Source] to [sources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSource(source: Source) = apply {
            sources =
                (sources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sources", it).add(source)
                }
        }

        /** ID of the searched vault */
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
         * Returns an immutable instance of [VaultSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultSearchResponse =
            VaultSearchResponse(
                (chunks ?: JsonMissing.of()).map { it.toImmutable() },
                method,
                query,
                response,
                (sources ?: JsonMissing.of()).map { it.toImmutable() },
                vaultId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultSearchResponse = apply {
        if (validated) {
            return@apply
        }

        chunks().ifPresent { it.forEach { it.validate() } }
        method()
        query()
        response()
        sources().ifPresent { it.forEach { it.validate() } }
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
            (if (method.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (if (response.asKnown().isPresent) 1 else 0) +
            (sources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (vaultId.asKnown().isPresent) 1 else 0)

    class Chunk
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chunkIndex: JsonField<Long>,
        private val distance: JsonField<Double>,
        private val objectId: JsonField<String>,
        private val pageEnd: JsonField<Long>,
        private val pageStart: JsonField<Long>,
        private val score: JsonField<Double>,
        private val source: JsonField<String>,
        private val text: JsonField<String>,
        private val wordEndIndex: JsonField<Long>,
        private val wordStartIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chunk_index")
            @ExcludeMissing
            chunkIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("object_id")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_end") @ExcludeMissing pageEnd: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_start")
            @ExcludeMissing
            pageStart: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("word_end_index")
            @ExcludeMissing
            wordEndIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("word_start_index")
            @ExcludeMissing
            wordStartIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(
            chunkIndex,
            distance,
            objectId,
            pageEnd,
            pageStart,
            score,
            source,
            text,
            wordEndIndex,
            wordStartIndex,
            mutableMapOf(),
        )

        /**
         * Index of the chunk within the document (0-based)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chunkIndex(): Optional<Long> = chunkIndex.getOptional("chunk_index")

        /**
         * Vector similarity distance (lower is more similar)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * ID of the source document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectId(): Optional<String> = objectId.getOptional("object_id")

        /**
         * PDF page number where the chunk ends (1-indexed). Null for non-PDF documents or documents
         * ingested before page tracking was added.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageEnd(): Optional<Long> = pageEnd.getOptional("page_end")

        /**
         * PDF page number where the chunk begins (1-indexed). Null for non-PDF documents or
         * documents ingested before page tracking was added.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageStart(): Optional<Long> = pageStart.getOptional("page_start")

        /**
         * Relevance score (deprecated, use distance or hybridScore)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Source identifier (deprecated, use object_id)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Preview of the chunk text (up to 500 characters)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Ending word index (0-based) in the OCR word list. Use with GET
         * /vault/:id/objects/:objectId/ocr-words to retrieve bounding boxes for highlighting.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wordEndIndex(): Optional<Long> = wordEndIndex.getOptional("word_end_index")

        /**
         * Starting word index (0-based) in the OCR word list. Use with GET
         * /vault/:id/objects/:objectId/ocr-words to retrieve bounding boxes for highlighting.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wordStartIndex(): Optional<Long> = wordStartIndex.getOptional("word_start_index")

        /**
         * Returns the raw JSON value of [chunkIndex].
         *
         * Unlike [chunkIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chunk_index") @ExcludeMissing fun _chunkIndex(): JsonField<Long> = chunkIndex

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

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
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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

            /** Returns a mutable builder for constructing an instance of [Chunk]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chunk]. */
        class Builder internal constructor() {

            private var chunkIndex: JsonField<Long> = JsonMissing.of()
            private var distance: JsonField<Double> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var pageEnd: JsonField<Long> = JsonMissing.of()
            private var pageStart: JsonField<Long> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var wordEndIndex: JsonField<Long> = JsonMissing.of()
            private var wordStartIndex: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chunk: Chunk) = apply {
                chunkIndex = chunk.chunkIndex
                distance = chunk.distance
                objectId = chunk.objectId
                pageEnd = chunk.pageEnd
                pageStart = chunk.pageStart
                score = chunk.score
                source = chunk.source
                text = chunk.text
                wordEndIndex = chunk.wordEndIndex
                wordStartIndex = chunk.wordStartIndex
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            /** Index of the chunk within the document (0-based) */
            fun chunkIndex(chunkIndex: Long) = chunkIndex(JsonField.of(chunkIndex))

            /**
             * Sets [Builder.chunkIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkIndex(chunkIndex: JsonField<Long>) = apply { this.chunkIndex = chunkIndex }

            /** Vector similarity distance (lower is more similar) */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /** ID of the source document */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /**
             * PDF page number where the chunk ends (1-indexed). Null for non-PDF documents or
             * documents ingested before page tracking was added.
             */
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

            /**
             * PDF page number where the chunk begins (1-indexed). Null for non-PDF documents or
             * documents ingested before page tracking was added.
             */
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

            /** Relevance score (deprecated, use distance or hybridScore) */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Source identifier (deprecated, use object_id) */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Preview of the chunk text (up to 500 characters) */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Ending word index (0-based) in the OCR word list. Use with GET
             * /vault/:id/objects/:objectId/ocr-words to retrieve bounding boxes for highlighting.
             */
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

            /**
             * Starting word index (0-based) in the OCR word list. Use with GET
             * /vault/:id/objects/:objectId/ocr-words to retrieve bounding boxes for highlighting.
             */
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
             */
            fun build(): Chunk =
                Chunk(
                    chunkIndex,
                    distance,
                    objectId,
                    pageEnd,
                    pageStart,
                    score,
                    source,
                    text,
                    wordEndIndex,
                    wordStartIndex,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            chunkIndex()
            distance()
            objectId()
            pageEnd()
            pageStart()
            score()
            source()
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
            (if (chunkIndex.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (if (objectId.asKnown().isPresent) 1 else 0) +
                (if (pageEnd.asKnown().isPresent) 1 else 0) +
                (if (pageStart.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (wordEndIndex.asKnown().isPresent) 1 else 0) +
                (if (wordStartIndex.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chunk &&
                chunkIndex == other.chunkIndex &&
                distance == other.distance &&
                objectId == other.objectId &&
                pageEnd == other.pageEnd &&
                pageStart == other.pageStart &&
                score == other.score &&
                source == other.source &&
                text == other.text &&
                wordEndIndex == other.wordEndIndex &&
                wordStartIndex == other.wordStartIndex &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                chunkIndex,
                distance,
                objectId,
                pageEnd,
                pageStart,
                score,
                source,
                text,
                wordEndIndex,
                wordStartIndex,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{chunkIndex=$chunkIndex, distance=$distance, objectId=$objectId, pageEnd=$pageEnd, pageStart=$pageStart, score=$score, source=$source, text=$text, wordEndIndex=$wordEndIndex, wordStartIndex=$wordStartIndex, additionalProperties=$additionalProperties}"
    }

    class Source
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val chunkCount: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val filename: JsonField<String>,
        private val ingestionCompletedAt: JsonField<OffsetDateTime>,
        private val pageCount: JsonField<Long>,
        private val textLength: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chunkCount")
            @ExcludeMissing
            chunkCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingestionCompletedAt")
            @ExcludeMissing
            ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pageCount")
            @ExcludeMissing
            pageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("textLength")
            @ExcludeMissing
            textLength: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            chunkCount,
            createdAt,
            filename,
            ingestionCompletedAt,
            pageCount,
            textLength,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chunkCount(): Optional<Long> = chunkCount.getOptional("chunkCount")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ingestionCompletedAt(): Optional<OffsetDateTime> =
            ingestionCompletedAt.getOptional("ingestionCompletedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageCount(): Optional<Long> = pageCount.getOptional("pageCount")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textLength(): Optional<Long> = textLength.getOptional("textLength")

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
        @JsonProperty("chunkCount") @ExcludeMissing fun _chunkCount(): JsonField<Long> = chunkCount

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
         * Returns the raw JSON value of [pageCount].
         *
         * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

        /**
         * Returns the raw JSON value of [textLength].
         *
         * Unlike [textLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("textLength") @ExcludeMissing fun _textLength(): JsonField<Long> = textLength

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

            /** Returns a mutable builder for constructing an instance of [Source]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var chunkCount: JsonField<Long> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var ingestionCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pageCount: JsonField<Long> = JsonMissing.of()
            private var textLength: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                id = source.id
                chunkCount = source.chunkCount
                createdAt = source.createdAt
                filename = source.filename
                ingestionCompletedAt = source.ingestionCompletedAt
                pageCount = source.pageCount
                textLength = source.textLength
                additionalProperties = source.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun chunkCount(chunkCount: Long) = chunkCount(JsonField.of(chunkCount))

            /**
             * Sets [Builder.chunkCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chunkCount(chunkCount: JsonField<Long>) = apply { this.chunkCount = chunkCount }

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

            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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

            fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

            /**
             * Sets [Builder.pageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

            fun textLength(textLength: Long) = textLength(JsonField.of(textLength))

            /**
             * Sets [Builder.textLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textLength(textLength: JsonField<Long>) = apply { this.textLength = textLength }

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
             * Returns an immutable instance of [Source].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Source =
                Source(
                    id,
                    chunkCount,
                    createdAt,
                    filename,
                    ingestionCompletedAt,
                    pageCount,
                    textLength,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            id()
            chunkCount()
            createdAt()
            filename()
            ingestionCompletedAt()
            pageCount()
            textLength()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (ingestionCompletedAt.asKnown().isPresent) 1 else 0) +
                (if (pageCount.asKnown().isPresent) 1 else 0) +
                (if (textLength.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                id == other.id &&
                chunkCount == other.chunkCount &&
                createdAt == other.createdAt &&
                filename == other.filename &&
                ingestionCompletedAt == other.ingestionCompletedAt &&
                pageCount == other.pageCount &&
                textLength == other.textLength &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                chunkCount,
                createdAt,
                filename,
                ingestionCompletedAt,
                pageCount,
                textLength,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{id=$id, chunkCount=$chunkCount, createdAt=$createdAt, filename=$filename, ingestionCompletedAt=$ingestionCompletedAt, pageCount=$pageCount, textLength=$textLength, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultSearchResponse &&
            chunks == other.chunks &&
            method == other.method &&
            query == other.query &&
            response == other.response &&
            sources == other.sources &&
            vaultId == other.vaultId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chunks, method, query, response, sources, vaultId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultSearchResponse{chunks=$chunks, method=$method, query=$query, response=$response, sources=$sources, vaultId=$vaultId, additionalProperties=$additionalProperties}"
}
