// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1

import dev.case.api.core.Params
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List matters for the authenticated organization. */
class V1ListParams
private constructor(
    private val matterType: String?,
    private val practiceArea: String?,
    private val query: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun matterType(): Optional<String> = Optional.ofNullable(matterType)

    fun practiceArea(): Optional<String> = Optional.ofNullable(practiceArea)

    fun query(): Optional<String> = Optional.ofNullable(query)

    fun status(): Optional<String> = Optional.ofNullable(status)

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

        private var matterType: String? = null
        private var practiceArea: String? = null
        private var query: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ListParams: V1ListParams) = apply {
            matterType = v1ListParams.matterType
            practiceArea = v1ListParams.practiceArea
            query = v1ListParams.query
            status = v1ListParams.status
            additionalHeaders = v1ListParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ListParams.additionalQueryParams.toBuilder()
        }

        fun matterType(matterType: String?) = apply { this.matterType = matterType }

        /** Alias for calling [Builder.matterType] with `matterType.orElse(null)`. */
        fun matterType(matterType: Optional<String>) = matterType(matterType.getOrNull())

        fun practiceArea(practiceArea: String?) = apply { this.practiceArea = practiceArea }

        /** Alias for calling [Builder.practiceArea] with `practiceArea.orElse(null)`. */
        fun practiceArea(practiceArea: Optional<String>) = practiceArea(practiceArea.getOrNull())

        fun query(query: String?) = apply { this.query = query }

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

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
                matterType,
                practiceArea,
                query,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                matterType?.let { put("matter_type", it) }
                practiceArea?.let { put("practice_area", it) }
                query?.let { put("query", it) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListParams &&
            matterType == other.matterType &&
            practiceArea == other.practiceArea &&
            query == other.query &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            matterType,
            practiceArea,
            query,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V1ListParams{matterType=$matterType, practiceArea=$practiceArea, query=$query, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
