// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.checkKnown
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectGetOcrWordsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val objectId: JsonField<String>,
    private val pageCount: JsonField<Long>,
    private val pages: JsonField<List<Page>>,
    private val totalWords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageCount") @ExcludeMissing pageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of(),
        @JsonProperty("totalWords") @ExcludeMissing totalWords: JsonField<Long> = JsonMissing.of(),
    ) : this(createdAt, objectId, pageCount, pages, totalWords, mutableMapOf())

    /**
     * When the OCR data was extracted
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * The object ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * Total number of pages in the document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCount(): Optional<Long> = pageCount.getOptional("pageCount")

    /**
     * Per-page word data with bounding boxes
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pages(): Optional<List<Page>> = pages.getOptional("pages")

    /**
     * Total number of words extracted from the document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalWords(): Optional<Long> = totalWords.getOptional("totalWords")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

    /**
     * Returns the raw JSON value of [totalWords].
     *
     * Unlike [totalWords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalWords") @ExcludeMissing fun _totalWords(): JsonField<Long> = totalWords

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
         * Returns a mutable builder for constructing an instance of [ObjectGetOcrWordsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetOcrWordsResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var pageCount: JsonField<Long> = JsonMissing.of()
        private var pages: JsonField<MutableList<Page>>? = null
        private var totalWords: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectGetOcrWordsResponse: ObjectGetOcrWordsResponse) = apply {
            createdAt = objectGetOcrWordsResponse.createdAt
            objectId = objectGetOcrWordsResponse.objectId
            pageCount = objectGetOcrWordsResponse.pageCount
            pages = objectGetOcrWordsResponse.pages.map { it.toMutableList() }
            totalWords = objectGetOcrWordsResponse.totalWords
            additionalProperties = objectGetOcrWordsResponse.additionalProperties.toMutableMap()
        }

        /** When the OCR data was extracted */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The object ID */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Total number of pages in the document */
        fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

        /** Per-page word data with bounding boxes */
        fun pages(pages: List<Page>) = pages(JsonField.of(pages))

        /**
         * Sets [Builder.pages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pages(pages: JsonField<List<Page>>) = apply {
            this.pages = pages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Page] to [pages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPage(page: Page) = apply {
            pages =
                (pages ?: JsonField.of(mutableListOf())).also { checkKnown("pages", it).add(page) }
        }

        /** Total number of words extracted from the document */
        fun totalWords(totalWords: Long) = totalWords(JsonField.of(totalWords))

        /**
         * Sets [Builder.totalWords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalWords] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalWords(totalWords: JsonField<Long>) = apply { this.totalWords = totalWords }

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
         * Returns an immutable instance of [ObjectGetOcrWordsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectGetOcrWordsResponse =
            ObjectGetOcrWordsResponse(
                createdAt,
                objectId,
                pageCount,
                (pages ?: JsonMissing.of()).map { it.toImmutable() },
                totalWords,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectGetOcrWordsResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        objectId()
        pageCount()
        pages().ifPresent { it.forEach { it.validate() } }
        totalWords()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0) +
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalWords.asKnown().isPresent) 1 else 0)

    class Page
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val page: JsonField<Long>,
        private val words: JsonField<List<Word>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("words") @ExcludeMissing words: JsonField<List<Word>> = JsonMissing.of(),
        ) : this(page, words, mutableMapOf())

        /**
         * Page number (1-indexed)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun page(): Optional<Long> = page.getOptional("page")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun words(): Optional<List<Word>> = words.getOptional("words")

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [words].
         *
         * Unlike [words], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

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

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var page: JsonField<Long> = JsonMissing.of()
            private var words: JsonField<MutableList<Word>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                this.page = page.page
                words = page.words.map { it.toMutableList() }
                additionalProperties = page.additionalProperties.toMutableMap()
            }

            /** Page number (1-indexed) */
            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun words(words: List<Word>) = words(JsonField.of(words))

            /**
             * Sets [Builder.words] to an arbitrary JSON value.
             *
             * You should usually call [Builder.words] with a well-typed `List<Word>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun words(words: JsonField<List<Word>>) = apply {
                this.words = words.map { it.toMutableList() }
            }

            /**
             * Adds a single [Word] to [words].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWord(word: Word) = apply {
                words =
                    (words ?: JsonField.of(mutableListOf())).also {
                        checkKnown("words", it).add(word)
                    }
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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page =
                Page(
                    page,
                    (words ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Page = apply {
            if (validated) {
                return@apply
            }

            page()
            words().ifPresent { it.forEach { it.validate() } }
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
            (if (page.asKnown().isPresent) 1 else 0) +
                (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Word
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bbox: JsonField<List<Double>>,
            private val confidence: JsonField<Double>,
            private val text: JsonField<String>,
            private val wordIndex: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bbox")
                @ExcludeMissing
                bbox: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("confidence")
                @ExcludeMissing
                confidence: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("wordIndex")
                @ExcludeMissing
                wordIndex: JsonField<Long> = JsonMissing.of(),
            ) : this(bbox, confidence, text, wordIndex, mutableMapOf())

            /**
             * Bounding box [x0, y0, x1, y1] normalized to 0-1 range
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bbox(): Optional<List<Double>> = bbox.getOptional("bbox")

            /**
             * OCR confidence score (0-1)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun confidence(): Optional<Double> = confidence.getOptional("confidence")

            /**
             * The word text
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Global word index across the entire document (0-based)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun wordIndex(): Optional<Long> = wordIndex.getOptional("wordIndex")

            /**
             * Returns the raw JSON value of [bbox].
             *
             * Unlike [bbox], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonField<List<Double>> = bbox

            /**
             * Returns the raw JSON value of [confidence].
             *
             * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("confidence")
            @ExcludeMissing
            fun _confidence(): JsonField<Double> = confidence

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [wordIndex].
             *
             * Unlike [wordIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("wordIndex") @ExcludeMissing fun _wordIndex(): JsonField<Long> = wordIndex

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

                /** Returns a mutable builder for constructing an instance of [Word]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Word]. */
            class Builder internal constructor() {

                private var bbox: JsonField<MutableList<Double>>? = null
                private var confidence: JsonField<Double> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var wordIndex: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(word: Word) = apply {
                    bbox = word.bbox.map { it.toMutableList() }
                    confidence = word.confidence
                    text = word.text
                    wordIndex = word.wordIndex
                    additionalProperties = word.additionalProperties.toMutableMap()
                }

                /** Bounding box [x0, y0, x1, y1] normalized to 0-1 range */
                fun bbox(bbox: List<Double>) = bbox(JsonField.of(bbox))

                /**
                 * Sets [Builder.bbox] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bbox] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bbox(bbox: JsonField<List<Double>>) = apply {
                    this.bbox = bbox.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.bbox].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBbox(bbox: Double) = apply {
                    this.bbox =
                        (this.bbox ?: JsonField.of(mutableListOf())).also {
                            checkKnown("bbox", it).add(bbox)
                        }
                }

                /** OCR confidence score (0-1) */
                fun confidence(confidence: Double?) = confidence(JsonField.ofNullable(confidence))

                /**
                 * Alias for [Builder.confidence].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun confidence(confidence: Double) = confidence(confidence as Double?)

                /** Alias for calling [Builder.confidence] with `confidence.orElse(null)`. */
                fun confidence(confidence: Optional<Double>) = confidence(confidence.getOrNull())

                /**
                 * Sets [Builder.confidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidence] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun confidence(confidence: JsonField<Double>) = apply {
                    this.confidence = confidence
                }

                /** The word text */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** Global word index across the entire document (0-based) */
                fun wordIndex(wordIndex: Long) = wordIndex(JsonField.of(wordIndex))

                /**
                 * Sets [Builder.wordIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wordIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun wordIndex(wordIndex: JsonField<Long>) = apply { this.wordIndex = wordIndex }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Word].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Word =
                    Word(
                        (bbox ?: JsonMissing.of()).map { it.toImmutable() },
                        confidence,
                        text,
                        wordIndex,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Word = apply {
                if (validated) {
                    return@apply
                }

                bbox()
                confidence()
                text()
                wordIndex()
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
                (bbox.asKnown().getOrNull()?.size ?: 0) +
                    (if (confidence.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (if (wordIndex.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Word &&
                    bbox == other.bbox &&
                    confidence == other.confidence &&
                    text == other.text &&
                    wordIndex == other.wordIndex &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bbox, confidence, text, wordIndex, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Word{bbox=$bbox, confidence=$confidence, text=$text, wordIndex=$wordIndex, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                page == other.page &&
                words == other.words &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(page, words, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{page=$page, words=$words, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetOcrWordsResponse &&
            createdAt == other.createdAt &&
            objectId == other.objectId &&
            pageCount == other.pageCount &&
            pages == other.pages &&
            totalWords == other.totalWords &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, objectId, pageCount, pages, totalWords, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectGetOcrWordsResponse{createdAt=$createdAt, objectId=$objectId, pageCount=$pageCount, pages=$pages, totalWords=$totalWords, additionalProperties=$additionalProperties}"
}
