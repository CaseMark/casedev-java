// File generated from our OpenAPI spec by Stainless.

package dev.case.models.memory.v1

import dev.case.core.Params
import dev.case.core.http.Headers
import dev.case.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all memories with optional filtering by tags and category. */
class V1ListParams
private constructor(
    private val category: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val tag1: String?,
    private val tag10: String?,
    private val tag11: String?,
    private val tag12: String?,
    private val tag2: String?,
    private val tag3: String?,
    private val tag4: String?,
    private val tag5: String?,
    private val tag6: String?,
    private val tag7: String?,
    private val tag8: String?,
    private val tag9: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by category */
    fun category(): Optional<String> = Optional.ofNullable(category)

    /** Number of results */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Pagination offset */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by tag_1 */
    fun tag1(): Optional<String> = Optional.ofNullable(tag1)

    /** Filter by tag_10 */
    fun tag10(): Optional<String> = Optional.ofNullable(tag10)

    /** Filter by tag_11 */
    fun tag11(): Optional<String> = Optional.ofNullable(tag11)

    /** Filter by tag_12 */
    fun tag12(): Optional<String> = Optional.ofNullable(tag12)

    /** Filter by tag_2 */
    fun tag2(): Optional<String> = Optional.ofNullable(tag2)

    /** Filter by tag_3 */
    fun tag3(): Optional<String> = Optional.ofNullable(tag3)

    /** Filter by tag_4 */
    fun tag4(): Optional<String> = Optional.ofNullable(tag4)

    /** Filter by tag_5 */
    fun tag5(): Optional<String> = Optional.ofNullable(tag5)

    /** Filter by tag_6 */
    fun tag6(): Optional<String> = Optional.ofNullable(tag6)

    /** Filter by tag_7 */
    fun tag7(): Optional<String> = Optional.ofNullable(tag7)

    /** Filter by tag_8 */
    fun tag8(): Optional<String> = Optional.ofNullable(tag8)

    /** Filter by tag_9 */
    fun tag9(): Optional<String> = Optional.ofNullable(tag9)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1ListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1ListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListParams]. */
    class Builder internal constructor() {

        private var category: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var tag1: String? = null
        private var tag10: String? = null
        private var tag11: String? = null
        private var tag12: String? = null
        private var tag2: String? = null
        private var tag3: String? = null
        private var tag4: String? = null
        private var tag5: String? = null
        private var tag6: String? = null
        private var tag7: String? = null
        private var tag8: String? = null
        private var tag9: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ListParams: V1ListParams) = apply {
            category = v1ListParams.category
            limit = v1ListParams.limit
            offset = v1ListParams.offset
            tag1 = v1ListParams.tag1
            tag10 = v1ListParams.tag10
            tag11 = v1ListParams.tag11
            tag12 = v1ListParams.tag12
            tag2 = v1ListParams.tag2
            tag3 = v1ListParams.tag3
            tag4 = v1ListParams.tag4
            tag5 = v1ListParams.tag5
            tag6 = v1ListParams.tag6
            tag7 = v1ListParams.tag7
            tag8 = v1ListParams.tag8
            tag9 = v1ListParams.tag9
            additionalHeaders = v1ListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by category */
        fun category(category: String?) = apply { this.category = category }

        /** Alias for calling [Builder.category] with `category.orElse(null)`. */
        fun category(category: Optional<String>) = category(category.getOrNull())

        /** Number of results */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Pagination offset */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by tag_1 */
        fun tag1(tag1: String?) = apply { this.tag1 = tag1 }

        /** Alias for calling [Builder.tag1] with `tag1.orElse(null)`. */
        fun tag1(tag1: Optional<String>) = tag1(tag1.getOrNull())

        /** Filter by tag_10 */
        fun tag10(tag10: String?) = apply { this.tag10 = tag10 }

        /** Alias for calling [Builder.tag10] with `tag10.orElse(null)`. */
        fun tag10(tag10: Optional<String>) = tag10(tag10.getOrNull())

        /** Filter by tag_11 */
        fun tag11(tag11: String?) = apply { this.tag11 = tag11 }

        /** Alias for calling [Builder.tag11] with `tag11.orElse(null)`. */
        fun tag11(tag11: Optional<String>) = tag11(tag11.getOrNull())

        /** Filter by tag_12 */
        fun tag12(tag12: String?) = apply { this.tag12 = tag12 }

        /** Alias for calling [Builder.tag12] with `tag12.orElse(null)`. */
        fun tag12(tag12: Optional<String>) = tag12(tag12.getOrNull())

        /** Filter by tag_2 */
        fun tag2(tag2: String?) = apply { this.tag2 = tag2 }

        /** Alias for calling [Builder.tag2] with `tag2.orElse(null)`. */
        fun tag2(tag2: Optional<String>) = tag2(tag2.getOrNull())

        /** Filter by tag_3 */
        fun tag3(tag3: String?) = apply { this.tag3 = tag3 }

        /** Alias for calling [Builder.tag3] with `tag3.orElse(null)`. */
        fun tag3(tag3: Optional<String>) = tag3(tag3.getOrNull())

        /** Filter by tag_4 */
        fun tag4(tag4: String?) = apply { this.tag4 = tag4 }

        /** Alias for calling [Builder.tag4] with `tag4.orElse(null)`. */
        fun tag4(tag4: Optional<String>) = tag4(tag4.getOrNull())

        /** Filter by tag_5 */
        fun tag5(tag5: String?) = apply { this.tag5 = tag5 }

        /** Alias for calling [Builder.tag5] with `tag5.orElse(null)`. */
        fun tag5(tag5: Optional<String>) = tag5(tag5.getOrNull())

        /** Filter by tag_6 */
        fun tag6(tag6: String?) = apply { this.tag6 = tag6 }

        /** Alias for calling [Builder.tag6] with `tag6.orElse(null)`. */
        fun tag6(tag6: Optional<String>) = tag6(tag6.getOrNull())

        /** Filter by tag_7 */
        fun tag7(tag7: String?) = apply { this.tag7 = tag7 }

        /** Alias for calling [Builder.tag7] with `tag7.orElse(null)`. */
        fun tag7(tag7: Optional<String>) = tag7(tag7.getOrNull())

        /** Filter by tag_8 */
        fun tag8(tag8: String?) = apply { this.tag8 = tag8 }

        /** Alias for calling [Builder.tag8] with `tag8.orElse(null)`. */
        fun tag8(tag8: Optional<String>) = tag8(tag8.getOrNull())

        /** Filter by tag_9 */
        fun tag9(tag9: String?) = apply { this.tag9 = tag9 }

        /** Alias for calling [Builder.tag9] with `tag9.orElse(null)`. */
        fun tag9(tag9: Optional<String>) = tag9(tag9.getOrNull())

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
         * Returns an immutable instance of [V1ListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListParams =
            V1ListParams(
                category,
                limit,
                offset,
                tag1,
                tag10,
                tag11,
                tag12,
                tag2,
                tag3,
                tag4,
                tag5,
                tag6,
                tag7,
                tag8,
                tag9,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                category?.let { put("category", it) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                tag1?.let { put("tag_1", it) }
                tag10?.let { put("tag_10", it) }
                tag11?.let { put("tag_11", it) }
                tag12?.let { put("tag_12", it) }
                tag2?.let { put("tag_2", it) }
                tag3?.let { put("tag_3", it) }
                tag4?.let { put("tag_4", it) }
                tag5?.let { put("tag_5", it) }
                tag6?.let { put("tag_6", it) }
                tag7?.let { put("tag_7", it) }
                tag8?.let { put("tag_8", it) }
                tag9?.let { put("tag_9", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListParams &&
            category == other.category &&
            limit == other.limit &&
            offset == other.offset &&
            tag1 == other.tag1 &&
            tag10 == other.tag10 &&
            tag11 == other.tag11 &&
            tag12 == other.tag12 &&
            tag2 == other.tag2 &&
            tag3 == other.tag3 &&
            tag4 == other.tag4 &&
            tag5 == other.tag5 &&
            tag6 == other.tag6 &&
            tag7 == other.tag7 &&
            tag8 == other.tag8 &&
            tag9 == other.tag9 &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            limit,
            offset,
            tag1,
            tag10,
            tag11,
            tag12,
            tag2,
            tag3,
            tag4,
            tag5,
            tag6,
            tag7,
            tag8,
            tag9,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V1ListParams{category=$category, limit=$limit, offset=$offset, tag1=$tag1, tag10=$tag10, tag11=$tag11, tag12=$tag12, tag2=$tag2, tag3=$tag3, tag4=$tag4, tag5=$tag5, tag6=$tag6, tag7=$tag7, tag8=$tag8, tag9=$tag9, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
