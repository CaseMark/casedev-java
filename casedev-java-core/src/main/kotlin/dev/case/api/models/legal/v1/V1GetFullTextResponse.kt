// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

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

class V1GetFullTextResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val author: JsonField<String>,
    private val characterCount: JsonField<Long>,
    private val highlights: JsonField<List<String>>,
    private val publishedDate: JsonField<String>,
    private val summary: JsonField<String>,
    private val text: JsonField<String>,
    private val title: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("author") @ExcludeMissing author: JsonField<String> = JsonMissing.of(),
        @JsonProperty("characterCount")
        @ExcludeMissing
        characterCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("highlights")
        @ExcludeMissing
        highlights: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("publishedDate")
        @ExcludeMissing
        publishedDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        author,
        characterCount,
        highlights,
        publishedDate,
        summary,
        text,
        title,
        url,
        mutableMapOf(),
    )

    /**
     * Author or court
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun author(): Optional<String> = author.getOptional("author")

    /**
     * Total characters in text
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun characterCount(): Optional<Long> = characterCount.getOptional("characterCount")

    /**
     * Highlighted relevant passages
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highlights(): Optional<List<String>> = highlights.getOptional("highlights")

    /**
     * Publication date
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishedDate(): Optional<String> = publishedDate.getOptional("publishedDate")

    /**
     * AI-generated summary
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<String> = summary.getOptional("summary")

    /**
     * Full document text
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Document title
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Document URL
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [author].
     *
     * Unlike [author], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author") @ExcludeMissing fun _author(): JsonField<String> = author

    /**
     * Returns the raw JSON value of [characterCount].
     *
     * Unlike [characterCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("characterCount")
    @ExcludeMissing
    fun _characterCount(): JsonField<Long> = characterCount

    /**
     * Returns the raw JSON value of [highlights].
     *
     * Unlike [highlights], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("highlights")
    @ExcludeMissing
    fun _highlights(): JsonField<List<String>> = highlights

    /**
     * Returns the raw JSON value of [publishedDate].
     *
     * Unlike [publishedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishedDate")
    @ExcludeMissing
    fun _publishedDate(): JsonField<String> = publishedDate

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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

        /** Returns a mutable builder for constructing an instance of [V1GetFullTextResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1GetFullTextResponse]. */
    class Builder internal constructor() {

        private var author: JsonField<String> = JsonMissing.of()
        private var characterCount: JsonField<Long> = JsonMissing.of()
        private var highlights: JsonField<MutableList<String>>? = null
        private var publishedDate: JsonField<String> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1GetFullTextResponse: V1GetFullTextResponse) = apply {
            author = v1GetFullTextResponse.author
            characterCount = v1GetFullTextResponse.characterCount
            highlights = v1GetFullTextResponse.highlights.map { it.toMutableList() }
            publishedDate = v1GetFullTextResponse.publishedDate
            summary = v1GetFullTextResponse.summary
            text = v1GetFullTextResponse.text
            title = v1GetFullTextResponse.title
            url = v1GetFullTextResponse.url
            additionalProperties = v1GetFullTextResponse.additionalProperties.toMutableMap()
        }

        /** Author or court */
        fun author(author: String?) = author(JsonField.ofNullable(author))

        /** Alias for calling [Builder.author] with `author.orElse(null)`. */
        fun author(author: Optional<String>) = author(author.getOrNull())

        /**
         * Sets [Builder.author] to an arbitrary JSON value.
         *
         * You should usually call [Builder.author] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun author(author: JsonField<String>) = apply { this.author = author }

        /** Total characters in text */
        fun characterCount(characterCount: Long) = characterCount(JsonField.of(characterCount))

        /**
         * Sets [Builder.characterCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun characterCount(characterCount: JsonField<Long>) = apply {
            this.characterCount = characterCount
        }

        /** Highlighted relevant passages */
        fun highlights(highlights: List<String>) = highlights(JsonField.of(highlights))

        /**
         * Sets [Builder.highlights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highlights] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highlights(highlights: JsonField<List<String>>) = apply {
            this.highlights = highlights.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [highlights].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHighlight(highlight: String) = apply {
            highlights =
                (highlights ?: JsonField.of(mutableListOf())).also {
                    checkKnown("highlights", it).add(highlight)
                }
        }

        /** Publication date */
        fun publishedDate(publishedDate: String?) =
            publishedDate(JsonField.ofNullable(publishedDate))

        /** Alias for calling [Builder.publishedDate] with `publishedDate.orElse(null)`. */
        fun publishedDate(publishedDate: Optional<String>) =
            publishedDate(publishedDate.getOrNull())

        /**
         * Sets [Builder.publishedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publishedDate(publishedDate: JsonField<String>) = apply {
            this.publishedDate = publishedDate
        }

        /** AI-generated summary */
        fun summary(summary: String?) = summary(JsonField.ofNullable(summary))

        /** Alias for calling [Builder.summary] with `summary.orElse(null)`. */
        fun summary(summary: Optional<String>) = summary(summary.getOrNull())

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /** Full document text */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Document title */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Document URL */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [V1GetFullTextResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1GetFullTextResponse =
            V1GetFullTextResponse(
                author,
                characterCount,
                (highlights ?: JsonMissing.of()).map { it.toImmutable() },
                publishedDate,
                summary,
                text,
                title,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1GetFullTextResponse = apply {
        if (validated) {
            return@apply
        }

        author()
        characterCount()
        highlights()
        publishedDate()
        summary()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (author.asKnown().isPresent) 1 else 0) +
            (if (characterCount.asKnown().isPresent) 1 else 0) +
            (highlights.asKnown().getOrNull()?.size ?: 0) +
            (if (publishedDate.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetFullTextResponse &&
            author == other.author &&
            characterCount == other.characterCount &&
            highlights == other.highlights &&
            publishedDate == other.publishedDate &&
            summary == other.summary &&
            text == other.text &&
            title == other.title &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            author,
            characterCount,
            highlights,
            publishedDate,
            summary,
            text,
            title,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1GetFullTextResponse{author=$author, characterCount=$characterCount, highlights=$highlights, publishedDate=$publishedDate, summary=$summary, text=$text, title=$title, url=$url, additionalProperties=$additionalProperties}"
}
