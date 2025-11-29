// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.secrets

import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve the keys (names) of secrets in a specified group within a compute environment. For
 * security reasons, actual secret values are not returned - only the keys and metadata.
 */
class SecretRetrieveGroupParams
private constructor(
    private val group: String?,
    private val env: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun group(): Optional<String> = Optional.ofNullable(group)

    /** Environment name. If not specified, uses the default environment */
    fun env(): Optional<String> = Optional.ofNullable(env)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SecretRetrieveGroupParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SecretRetrieveGroupParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretRetrieveGroupParams]. */
    class Builder internal constructor() {

        private var group: String? = null
        private var env: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(secretRetrieveGroupParams: SecretRetrieveGroupParams) = apply {
            group = secretRetrieveGroupParams.group
            env = secretRetrieveGroupParams.env
            additionalHeaders = secretRetrieveGroupParams.additionalHeaders.toBuilder()
            additionalQueryParams = secretRetrieveGroupParams.additionalQueryParams.toBuilder()
        }

        fun group(group: String?) = apply { this.group = group }

        /** Alias for calling [Builder.group] with `group.orElse(null)`. */
        fun group(group: Optional<String>) = group(group.getOrNull())

        /** Environment name. If not specified, uses the default environment */
        fun env(env: String?) = apply { this.env = env }

        /** Alias for calling [Builder.env] with `env.orElse(null)`. */
        fun env(env: Optional<String>) = env(env.getOrNull())

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
         * Returns an immutable instance of [SecretRetrieveGroupParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecretRetrieveGroupParams =
            SecretRetrieveGroupParams(
                group,
                env,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> group ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                env?.let { put("env", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretRetrieveGroupParams &&
            group == other.group &&
            env == other.env &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(group, env, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SecretRetrieveGroupParams{group=$group, env=$env, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
