// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import dev.case.api.core.Params
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves the raw text of a processed vault object split by page. The object must have completed
 * ingestion before pages can be retrieved — for PDFs this requires the OCR pipeline to have
 * finished writing the per-page sidecar, so freshly uploaded PDFs return 400 with the current
 * `ingestionStatus` until processing completes. For PDFs this returns the per-page OCR text. For
 * plain text files (txt, md, source code, court reporter transcripts) the text is split using
 * right-aligned page-number markers when present (preserving the original document numbering,
 * including continuations like Volume 2 starting at page 234), falling back to form-feed (\f)
 * page-break characters, and finally a single page if neither signal is present. Use the optional
 * `start` and `end` query parameters to fetch a specific inclusive page range. Pages with no text
 * are omitted.
 */
class ObjectGetPagesParams
private constructor(
    private val id: String,
    private val objectId: String?,
    private val end: Long?,
    private val start: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    /**
     * Last page to return (inclusive, 1-indexed). If omitted, returns through the last page with
     * text.
     */
    fun end(): Optional<Long> = Optional.ofNullable(end)

    /**
     * First page to return (inclusive, 1-indexed). If omitted, starts at the first page with text.
     */
    fun start(): Optional<Long> = Optional.ofNullable(start)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectGetPagesParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetPagesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var objectId: String? = null
        private var end: Long? = null
        private var start: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(objectGetPagesParams: ObjectGetPagesParams) = apply {
            id = objectGetPagesParams.id
            objectId = objectGetPagesParams.objectId
            end = objectGetPagesParams.end
            start = objectGetPagesParams.start
            additionalHeaders = objectGetPagesParams.additionalHeaders.toBuilder()
            additionalQueryParams = objectGetPagesParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        /**
         * Last page to return (inclusive, 1-indexed). If omitted, returns through the last page
         * with text.
         */
        fun end(end: Long?) = apply { this.end = end }

        /**
         * Alias for [Builder.end].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun end(end: Long) = end(end as Long?)

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<Long>) = end(end.getOrNull())

        /**
         * First page to return (inclusive, 1-indexed). If omitted, starts at the first page with
         * text.
         */
        fun start(start: Long?) = apply { this.start = start }

        /**
         * Alias for [Builder.start].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun start(start: Long) = start(start as Long?)

        /** Alias for calling [Builder.start] with `start.orElse(null)`. */
        fun start(start: Optional<Long>) = start(start.getOrNull())

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
         * Returns an immutable instance of [ObjectGetPagesParams].
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
        fun build(): ObjectGetPagesParams =
            ObjectGetPagesParams(
                checkRequired("id", id),
                objectId,
                end,
                start,
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
                end?.let { put("end", it.toString()) }
                start?.let { put("start", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectGetPagesParams &&
            id == other.id &&
            objectId == other.objectId &&
            end == other.end &&
            start == other.start &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, objectId, end, start, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ObjectGetPagesParams{id=$id, objectId=$objectId, end=$end, start=$start, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
