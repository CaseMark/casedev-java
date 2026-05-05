// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
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

class ObjectGetPagesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val metadata: JsonField<Metadata>,
    private val pages: JsonField<List<Page>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of(),
    ) : this(metadata, pages, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Per-page OCR text in ascending page order
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pages(): List<Page> = pages.getRequired("pages")

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
         * Returns a mutable builder for constructing an instance of [ObjectGetPagesResponse].
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .pages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetPagesResponse]. */
    class Builder internal constructor() {

        private var metadata: JsonField<Metadata>? = null
        private var pages: JsonField<MutableList<Page>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectGetPagesResponse: ObjectGetPagesResponse) = apply {
            metadata = objectGetPagesResponse.metadata
            pages = objectGetPagesResponse.pages.map { it.toMutableList() }
            additionalProperties = objectGetPagesResponse.additionalProperties.toMutableMap()
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

        /** Per-page OCR text in ascending page order */
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
         * Returns an immutable instance of [ObjectGetPagesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .pages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectGetPagesResponse =
            ObjectGetPagesResponse(
                checkRequired("metadata", metadata),
                checkRequired("pages", pages).map { it.toImmutable() },
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
    fun validate(): ObjectGetPagesResponse = apply {
        if (validated) {
            return@apply
        }

        metadata().validate()
        pages().forEach { it.validate() }
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
        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filename: JsonField<String>,
        private val objectId: JsonField<String>,
        private val pageCount: JsonField<Long>,
        private val returnedPages: JsonField<Long>,
        private val source: JsonField<Source>,
        private val vaultId: JsonField<String>,
        private val end: JsonField<Long>,
        private val start: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_id")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_count")
            @ExcludeMissing
            pageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("returned_pages")
            @ExcludeMissing
            returnedPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end") @ExcludeMissing end: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        ) : this(
            filename,
            objectId,
            pageCount,
            returnedPages,
            source,
            vaultId,
            end,
            start,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("object_id")

        /**
         * Total number of pages with extracted text in the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageCount(): Long = pageCount.getRequired("page_count")

        /**
         * Number of pages returned after applying the range filter
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnedPages(): Long = returnedPages.getRequired("returned_pages")

        /**
         * Where the page text came from. `ocr` for PDFs (per-page OCR sidecar). `txt` for
         * plain-text files split on form-feed (\f) characters.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): Source = source.getRequired("source")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vaultId(): String = vaultId.getRequired("vault_id")

        /**
         * Echoes the end query param if provided
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun end(): Optional<Long> = end.getOptional("end")

        /**
         * Echoes the start query param if provided
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<Long> = start.getOptional("start")

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [pageCount].
         *
         * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

        /**
         * Returns the raw JSON value of [returnedPages].
         *
         * Unlike [returnedPages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("returned_pages")
        @ExcludeMissing
        fun _returnedPages(): JsonField<Long> = returnedPages

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Long> = end

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Long> = start

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
             * .filename()
             * .objectId()
             * .pageCount()
             * .returnedPages()
             * .source()
             * .vaultId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var filename: JsonField<String>? = null
            private var objectId: JsonField<String>? = null
            private var pageCount: JsonField<Long>? = null
            private var returnedPages: JsonField<Long>? = null
            private var source: JsonField<Source>? = null
            private var vaultId: JsonField<String>? = null
            private var end: JsonField<Long> = JsonMissing.of()
            private var start: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                filename = metadata.filename
                objectId = metadata.objectId
                pageCount = metadata.pageCount
                returnedPages = metadata.returnedPages
                source = metadata.source
                vaultId = metadata.vaultId
                end = metadata.end
                start = metadata.start
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Total number of pages with extracted text in the document */
            fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

            /**
             * Sets [Builder.pageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

            /** Number of pages returned after applying the range filter */
            fun returnedPages(returnedPages: Long) = returnedPages(JsonField.of(returnedPages))

            /**
             * Sets [Builder.returnedPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnedPages] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnedPages(returnedPages: JsonField<Long>) = apply {
                this.returnedPages = returnedPages
            }

            /**
             * Where the page text came from. `ocr` for PDFs (per-page OCR sidecar). `txt` for
             * plain-text files split on form-feed (\f) characters.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

            /** Echoes the end query param if provided */
            fun end(end: Long?) = end(JsonField.ofNullable(end))

            /**
             * Alias for [Builder.end].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun end(end: Long) = end(end as Long?)

            /** Alias for calling [Builder.end] with `end.orElse(null)`. */
            fun end(end: Optional<Long>) = end(end.getOrNull())

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun end(end: JsonField<Long>) = apply { this.end = end }

            /** Echoes the start query param if provided */
            fun start(start: Long?) = start(JsonField.ofNullable(start))

            /**
             * Alias for [Builder.start].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun start(start: Long) = start(start as Long?)

            /** Alias for calling [Builder.start] with `start.orElse(null)`. */
            fun start(start: Optional<Long>) = start(start.getOrNull())

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun start(start: JsonField<Long>) = apply { this.start = start }

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
             * .filename()
             * .objectId()
             * .pageCount()
             * .returnedPages()
             * .source()
             * .vaultId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("filename", filename),
                    checkRequired("objectId", objectId),
                    checkRequired("pageCount", pageCount),
                    checkRequired("returnedPages", returnedPages),
                    checkRequired("source", source),
                    checkRequired("vaultId", vaultId),
                    end,
                    start,
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            filename()
            objectId()
            pageCount()
            returnedPages()
            source().validate()
            vaultId()
            end()
            start()
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
            (if (filename.asKnown().isPresent) 1 else 0) +
                (if (objectId.asKnown().isPresent) 1 else 0) +
                (if (pageCount.asKnown().isPresent) 1 else 0) +
                (if (returnedPages.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (if (vaultId.asKnown().isPresent) 1 else 0) +
                (if (end.asKnown().isPresent) 1 else 0) +
                (if (start.asKnown().isPresent) 1 else 0)

        /**
         * Where the page text came from. `ocr` for PDFs (per-page OCR sidecar). `txt` for
         * plain-text files split on form-feed (\f) characters.
         */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val OCR = of("ocr")

                @JvmField val TXT = of("txt")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                OCR,
                TXT,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OCR,
                TXT,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    OCR -> Value.OCR
                    TXT -> Value.TXT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    OCR -> Known.OCR
                    TXT -> Known.TXT
                    else -> throw CasedevInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Source = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                filename == other.filename &&
                objectId == other.objectId &&
                pageCount == other.pageCount &&
                returnedPages == other.returnedPages &&
                source == other.source &&
                vaultId == other.vaultId &&
                end == other.end &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                filename,
                objectId,
                pageCount,
                returnedPages,
                source,
                vaultId,
                end,
                start,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{filename=$filename, objectId=$objectId, pageCount=$pageCount, returnedPages=$returnedPages, source=$source, vaultId=$vaultId, end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    class Page
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val page: JsonField<Long>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(page, text, mutableMapOf())

        /**
         * Page number (1-indexed)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * OCR text for this page
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

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
             * Returns a mutable builder for constructing an instance of [Page].
             *
             * The following fields are required:
             * ```java
             * .page()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var page: JsonField<Long>? = null
            private var text: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                this.page = page.page
                text = page.text
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

            /** OCR text for this page */
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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .page()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Page =
                Page(
                    checkRequired("page", page),
                    checkRequired("text", text),
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
        fun validate(): Page = apply {
            if (validated) {
                return@apply
            }

            page()
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
            (if (page.asKnown().isPresent) 1 else 0) + (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                page == other.page &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(page, text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{page=$page, text=$text, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetPagesResponse &&
            metadata == other.metadata &&
            pages == other.pages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(metadata, pages, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectGetPagesResponse{metadata=$metadata, pages=$pages, additionalProperties=$additionalProperties}"
}
