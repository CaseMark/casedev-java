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
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
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
     * Relevant text chunks with similarity scores
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

        /** Relevant text chunks with similarity scores */
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
        private val score: JsonField<Double>,
        private val source: JsonField<String>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(score, source, text, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

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

            private var score: JsonField<Double> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chunk: Chunk) = apply {
                score = chunk.score
                source = chunk.source
                text = chunk.text
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Chunk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Chunk = Chunk(score, source, text, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            score()
            source()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (score.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chunk &&
                score == other.score &&
                source == other.source &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(score, source, text, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{score=$score, source=$source, text=$text, additionalProperties=$additionalProperties}"
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
