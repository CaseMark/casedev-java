// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a paginated list of available workflows with optional filtering by category,
 * subcategory, type, and publication status. Workflows are pre-built document processing pipelines
 * optimized for legal use cases.
 */
class V1ListParams
private constructor(
    private val category: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val published: Boolean?,
    private val subCategory: String?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter workflows by category (e.g., 'legal', 'compliance', 'contract') */
    fun category(): Optional<String> = Optional.ofNullable(category)

    /** Maximum number of workflows to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Number of workflows to skip for pagination */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Include only published workflows */
    fun published(): Optional<Boolean> = Optional.ofNullable(published)

    /** Filter workflows by subcategory (e.g., 'due-diligence', 'litigation', 'mergers') */
    fun subCategory(): Optional<String> = Optional.ofNullable(subCategory)

    /**
     * Filter workflows by type (e.g., 'document-review', 'contract-analysis', 'compliance-check')
     */
    fun type(): Optional<String> = Optional.ofNullable(type)

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
        private var published: Boolean? = null
        private var subCategory: String? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ListParams: V1ListParams) = apply {
            category = v1ListParams.category
            limit = v1ListParams.limit
            offset = v1ListParams.offset
            published = v1ListParams.published
            subCategory = v1ListParams.subCategory
            type = v1ListParams.type
            additionalHeaders = v1ListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ListParams.additionalQueryParams.toBuilder()
        }

        /** Filter workflows by category (e.g., 'legal', 'compliance', 'contract') */
        fun category(category: String?) = apply { this.category = category }

        /** Alias for calling [Builder.category] with `category.orElse(null)`. */
        fun category(category: Optional<String>) = category(category.getOrNull())

        /** Maximum number of workflows to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Number of workflows to skip for pagination */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Include only published workflows */
        fun published(published: Boolean?) = apply { this.published = published }

        /**
         * Alias for [Builder.published].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun published(published: Boolean) = published(published as Boolean?)

        /** Alias for calling [Builder.published] with `published.orElse(null)`. */
        fun published(published: Optional<Boolean>) = published(published.getOrNull())

        /** Filter workflows by subcategory (e.g., 'due-diligence', 'litigation', 'mergers') */
        fun subCategory(subCategory: String?) = apply { this.subCategory = subCategory }

        /** Alias for calling [Builder.subCategory] with `subCategory.orElse(null)`. */
        fun subCategory(subCategory: Optional<String>) = subCategory(subCategory.getOrNull())

        /**
         * Filter workflows by type (e.g., 'document-review', 'contract-analysis',
         * 'compliance-check')
         */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

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
                published,
                subCategory,
                type,
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
                published?.let { put("published", it.toString()) }
                subCategory?.let { put("sub_category", it) }
                type?.let { put("type", it) }
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
            published == other.published &&
            subCategory == other.subCategory &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            limit,
            offset,
            published,
            subCategory,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V1ListParams{category=$category, limit=$limit, offset=$offset, published=$published, subCategory=$subCategory, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
