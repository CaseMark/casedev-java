// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.search.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1AnswerResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val answer: JsonField<String>,
    private val citations: JsonField<List<Citation>>,
    private val model: JsonField<String>,
    private val searchType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("answer") @ExcludeMissing answer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<List<Citation>> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("searchType") @ExcludeMissing searchType: JsonField<String> = JsonMissing.of(),
    ) : this(answer, citations, model, searchType, mutableMapOf())

    /**
     * The generated answer with citations
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answer(): Optional<String> = answer.getOptional("answer")

    /**
     * Sources used to generate the answer
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<List<Citation>> = citations.getOptional("citations")

    /**
     * Model used for answer generation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * Type of search performed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchType(): Optional<String> = searchType.getOptional("searchType")

    /**
     * Returns the raw JSON value of [answer].
     *
     * Unlike [answer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("answer") @ExcludeMissing fun _answer(): JsonField<String> = answer

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations")
    @ExcludeMissing
    fun _citations(): JsonField<List<Citation>> = citations

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [searchType].
     *
     * Unlike [searchType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("searchType") @ExcludeMissing fun _searchType(): JsonField<String> = searchType

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

        /** Returns a mutable builder for constructing an instance of [V1AnswerResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1AnswerResponse]. */
    class Builder internal constructor() {

        private var answer: JsonField<String> = JsonMissing.of()
        private var citations: JsonField<MutableList<Citation>>? = null
        private var model: JsonField<String> = JsonMissing.of()
        private var searchType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1AnswerResponse: V1AnswerResponse) = apply {
            answer = v1AnswerResponse.answer
            citations = v1AnswerResponse.citations.map { it.toMutableList() }
            model = v1AnswerResponse.model
            searchType = v1AnswerResponse.searchType
            additionalProperties = v1AnswerResponse.additionalProperties.toMutableMap()
        }

        /** The generated answer with citations */
        fun answer(answer: String) = answer(JsonField.of(answer))

        /**
         * Sets [Builder.answer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun answer(answer: JsonField<String>) = apply { this.answer = answer }

        /** Sources used to generate the answer */
        fun citations(citations: List<Citation>) = citations(JsonField.of(citations))

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed `List<Citation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citations(citations: JsonField<List<Citation>>) = apply {
            this.citations = citations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Citation] to [citations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCitation(citation: Citation) = apply {
            citations =
                (citations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("citations", it).add(citation)
                }
        }

        /** Model used for answer generation */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Type of search performed */
        fun searchType(searchType: String) = searchType(JsonField.of(searchType))

        /**
         * Sets [Builder.searchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun searchType(searchType: JsonField<String>) = apply { this.searchType = searchType }

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
         * Returns an immutable instance of [V1AnswerResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1AnswerResponse =
            V1AnswerResponse(
                answer,
                (citations ?: JsonMissing.of()).map { it.toImmutable() },
                model,
                searchType,
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
    fun validate(): V1AnswerResponse = apply {
        if (validated) {
            return@apply
        }

        answer()
        citations().ifPresent { it.forEach { it.validate() } }
        model()
        searchType()
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
        (if (answer.asKnown().isPresent) 1 else 0) +
            (citations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (searchType.asKnown().isPresent) 1 else 0)

    class Citation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val publishedDate: JsonField<String>,
        private val text: JsonField<String>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("publishedDate")
            @ExcludeMissing
            publishedDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(id, publishedDate, text, title, url, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publishedDate(): Optional<String> = publishedDate.getOptional("publishedDate")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [publishedDate].
         *
         * Unlike [publishedDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("publishedDate")
        @ExcludeMissing
        fun _publishedDate(): JsonField<String> = publishedDate

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Citation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Citation]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var publishedDate: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(citation: Citation) = apply {
                id = citation.id
                publishedDate = citation.publishedDate
                text = citation.text
                title = citation.title
                url = citation.url
                additionalProperties = citation.additionalProperties.toMutableMap()
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

            fun publishedDate(publishedDate: String) = publishedDate(JsonField.of(publishedDate))

            /**
             * Sets [Builder.publishedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publishedDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publishedDate(publishedDate: JsonField<String>) = apply {
                this.publishedDate = publishedDate
            }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Citation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Citation =
                Citation(id, publishedDate, text, title, url, additionalProperties.toMutableMap())
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
        fun validate(): Citation = apply {
            if (validated) {
                return@apply
            }

            id()
            publishedDate()
            text()
            title()
            url()
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
                (if (publishedDate.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Citation &&
                id == other.id &&
                publishedDate == other.publishedDate &&
                text == other.text &&
                title == other.title &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, publishedDate, text, title, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Citation{id=$id, publishedDate=$publishedDate, text=$text, title=$title, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1AnswerResponse &&
            answer == other.answer &&
            citations == other.citations &&
            model == other.model &&
            searchType == other.searchType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(answer, citations, model, searchType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1AnswerResponse{answer=$answer, citations=$citations, model=$model, searchType=$searchType, additionalProperties=$additionalProperties}"
}
