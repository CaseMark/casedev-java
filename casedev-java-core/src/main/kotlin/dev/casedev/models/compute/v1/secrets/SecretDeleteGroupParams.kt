// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.secrets

import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Delete an entire secret group or a specific key within a secret group. When deleting a specific
 * key, the remaining secrets in the group are preserved. When deleting the entire group, all
 * secrets and the group itself are removed.
 */
class SecretDeleteGroupParams
private constructor(
    private val group: String?,
    private val env: String?,
    private val key: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun group(): Optional<String> = Optional.ofNullable(group)

    /** Environment name. If not provided, uses the default environment */
    fun env(): Optional<String> = Optional.ofNullable(env)

    /** Specific key to delete within the group. If not provided, the entire group is deleted */
    fun key(): Optional<String> = Optional.ofNullable(key)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SecretDeleteGroupParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SecretDeleteGroupParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretDeleteGroupParams]. */
    class Builder internal constructor() {

        private var group: String? = null
        private var env: String? = null
        private var key: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(secretDeleteGroupParams: SecretDeleteGroupParams) = apply {
            group = secretDeleteGroupParams.group
            env = secretDeleteGroupParams.env
            key = secretDeleteGroupParams.key
            additionalHeaders = secretDeleteGroupParams.additionalHeaders.toBuilder()
            additionalQueryParams = secretDeleteGroupParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                secretDeleteGroupParams.additionalBodyProperties.toMutableMap()
        }

        fun group(group: String?) = apply { this.group = group }

        /** Alias for calling [Builder.group] with `group.orElse(null)`. */
        fun group(group: Optional<String>) = group(group.getOrNull())

        /** Environment name. If not provided, uses the default environment */
        fun env(env: String?) = apply { this.env = env }

        /** Alias for calling [Builder.env] with `env.orElse(null)`. */
        fun env(env: Optional<String>) = env(env.getOrNull())

        /** Specific key to delete within the group. If not provided, the entire group is deleted */
        fun key(key: String?) = apply { this.key = key }

        /** Alias for calling [Builder.key] with `key.orElse(null)`. */
        fun key(key: Optional<String>) = key(key.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [SecretDeleteGroupParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecretDeleteGroupParams =
            SecretDeleteGroupParams(
                group,
                env,
                key,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

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
                key?.let { put("key", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretDeleteGroupParams &&
            group == other.group &&
            env == other.env &&
            key == other.key &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            group,
            env,
            key,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "SecretDeleteGroupParams{group=$group, env=$env, key=$key, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
