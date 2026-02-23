// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import com.router.api.core.Params
import com.router.api.core.checkRequired
import com.router.api.core.http.Headers
import com.router.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves word-level OCR bounding box data for a processed PDF document. Each word includes its
 * text, normalized bounding box coordinates (0-1 range), confidence score, and global word index.
 * Use this data to highlight specific text ranges in a PDF viewer based on word indices from search
 * results.
 */
class ObjectGetOcrWordsParams
private constructor(
    private val id: String,
    private val objectId: String?,
    private val page: Long?,
    private val wordEnd: Long?,
    private val wordStart: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    /** Filter to a specific page number (1-indexed). If omitted, returns all pages. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /**
     * Filter to words ending at this index (inclusive). Useful for retrieving words for a specific
     * chunk.
     */
    fun wordEnd(): Optional<Long> = Optional.ofNullable(wordEnd)

    /**
     * Filter to words starting at this index (inclusive). Useful for retrieving words for a
     * specific chunk.
     */
    fun wordStart(): Optional<Long> = Optional.ofNullable(wordStart)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectGetOcrWordsParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetOcrWordsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var objectId: String? = null
        private var page: Long? = null
        private var wordEnd: Long? = null
        private var wordStart: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(objectGetOcrWordsParams: ObjectGetOcrWordsParams) = apply {
            id = objectGetOcrWordsParams.id
            objectId = objectGetOcrWordsParams.objectId
            page = objectGetOcrWordsParams.page
            wordEnd = objectGetOcrWordsParams.wordEnd
            wordStart = objectGetOcrWordsParams.wordStart
            additionalHeaders = objectGetOcrWordsParams.additionalHeaders.toBuilder()
            additionalQueryParams = objectGetOcrWordsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        /** Filter to a specific page number (1-indexed). If omitted, returns all pages. */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /**
         * Filter to words ending at this index (inclusive). Useful for retrieving words for a
         * specific chunk.
         */
        fun wordEnd(wordEnd: Long?) = apply { this.wordEnd = wordEnd }

        /**
         * Alias for [Builder.wordEnd].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun wordEnd(wordEnd: Long) = wordEnd(wordEnd as Long?)

        /** Alias for calling [Builder.wordEnd] with `wordEnd.orElse(null)`. */
        fun wordEnd(wordEnd: Optional<Long>) = wordEnd(wordEnd.getOrNull())

        /**
         * Filter to words starting at this index (inclusive). Useful for retrieving words for a
         * specific chunk.
         */
        fun wordStart(wordStart: Long?) = apply { this.wordStart = wordStart }

        /**
         * Alias for [Builder.wordStart].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun wordStart(wordStart: Long) = wordStart(wordStart as Long?)

        /** Alias for calling [Builder.wordStart] with `wordStart.orElse(null)`. */
        fun wordStart(wordStart: Optional<Long>) = wordStart(wordStart.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ObjectGetOcrWordsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectGetOcrWordsParams =
            ObjectGetOcrWordsParams(
                checkRequired("id", id),
                objectId,
                page,
                wordEnd,
                wordStart,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> objectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                wordEnd?.let { put("wordEnd", it.toString()) }
                wordStart?.let { put("wordStart", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetOcrWordsParams &&
            id == other.id &&
            objectId == other.objectId &&
            page == other.page &&
            wordEnd == other.wordEnd &&
            wordStart == other.wordStart &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            objectId,
            page,
            wordEnd,
            wordStart,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ObjectGetOcrWordsParams{id=$id, objectId=$objectId, page=$page, wordEnd=$wordEnd, wordStart=$wordStart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
