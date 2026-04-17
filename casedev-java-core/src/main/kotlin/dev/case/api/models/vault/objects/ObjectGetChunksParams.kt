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
 * Retrieves full extracted chunk text for a processed vault object. Use this after search when a
 * truncated preview is not enough and you need the exact chunk text or adjacent chunks for
 * surrounding context such as tables, exhibit lists, or multi-part passages.
 */
class ObjectGetChunksParams
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
     * The last chunk index to return (inclusive). If omitted, only the `start` chunk is returned.
     * Ranges are limited to 10 chunks.
     */
    fun end(): Optional<Long> = Optional.ofNullable(end)

    /** The first chunk index to return (0-based). Defaults to 0. */
    fun start(): Optional<Long> = Optional.ofNullable(start)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectGetChunksParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectGetChunksParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var objectId: String? = null
        private var end: Long? = null
        private var start: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(objectGetChunksParams: ObjectGetChunksParams) = apply {
            id = objectGetChunksParams.id
            objectId = objectGetChunksParams.objectId
            end = objectGetChunksParams.end
            start = objectGetChunksParams.start
            additionalHeaders = objectGetChunksParams.additionalHeaders.toBuilder()
            additionalQueryParams = objectGetChunksParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        /**
         * The last chunk index to return (inclusive). If omitted, only the `start` chunk is
         * returned. Ranges are limited to 10 chunks.
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

        /** The first chunk index to return (0-based). Defaults to 0. */
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
         * Returns an immutable instance of [ObjectGetChunksParams].
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
        fun build(): ObjectGetChunksParams =
            ObjectGetChunksParams(
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

        return other is ObjectGetChunksParams &&
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
        "ObjectGetChunksParams{id=$id, objectId=$objectId, end=$end, start=$start, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
