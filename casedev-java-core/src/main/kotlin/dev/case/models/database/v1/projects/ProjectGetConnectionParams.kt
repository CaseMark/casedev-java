// File generated from our OpenAPI spec by Stainless.

package dev.case.models.database.v1.projects

import dev.case.core.Params
import dev.case.core.http.Headers
import dev.case.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves the PostgreSQL connection URI for a database project. Supports selecting specific
 * branches and pooled vs direct connections. Connection strings include credentials and should be
 * stored securely. Use for configuring applications and deployment environments.
 */
class ProjectGetConnectionParams
private constructor(
    private val id: String?,
    private val branch: String?,
    private val pooled: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Branch name (defaults to 'main') */
    fun branch(): Optional<String> = Optional.ofNullable(branch)

    /** Use pooled connection (PgBouncer) */
    fun pooled(): Optional<Boolean> = Optional.ofNullable(pooled)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProjectGetConnectionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ProjectGetConnectionParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectGetConnectionParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var branch: String? = null
        private var pooled: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectGetConnectionParams: ProjectGetConnectionParams) = apply {
            id = projectGetConnectionParams.id
            branch = projectGetConnectionParams.branch
            pooled = projectGetConnectionParams.pooled
            additionalHeaders = projectGetConnectionParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectGetConnectionParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Branch name (defaults to 'main') */
        fun branch(branch: String?) = apply { this.branch = branch }

        /** Alias for calling [Builder.branch] with `branch.orElse(null)`. */
        fun branch(branch: Optional<String>) = branch(branch.getOrNull())

        /** Use pooled connection (PgBouncer) */
        fun pooled(pooled: Boolean?) = apply { this.pooled = pooled }

        /**
         * Alias for [Builder.pooled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pooled(pooled: Boolean) = pooled(pooled as Boolean?)

        /** Alias for calling [Builder.pooled] with `pooled.orElse(null)`. */
        fun pooled(pooled: Optional<Boolean>) = pooled(pooled.getOrNull())

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
         * Returns an immutable instance of [ProjectGetConnectionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProjectGetConnectionParams =
            ProjectGetConnectionParams(
                id,
                branch,
                pooled,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                branch?.let { put("branch", it) }
                pooled?.let { put("pooled", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectGetConnectionParams &&
            id == other.id &&
            branch == other.branch &&
            pooled == other.pooled &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, branch, pooled, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProjectGetConnectionParams{id=$id, branch=$branch, pooled=$pooled, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
