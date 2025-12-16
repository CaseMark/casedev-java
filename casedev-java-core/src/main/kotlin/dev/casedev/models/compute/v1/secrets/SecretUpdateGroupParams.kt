// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.secrets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set or update secrets in a compute secret group. Secrets are encrypted with AES-256-GCM. Use this
 * to manage environment variables and API keys for your compute workloads.
 */
class SecretUpdateGroupParams
private constructor(
    private val group: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun group(): Optional<String> = Optional.ofNullable(group)

    /**
     * Key-value pairs of secrets to set
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secrets(): Secrets = body.secrets()

    /**
     * Environment name (optional, uses default if not specified)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun env(): Optional<String> = body.env()

    /**
     * Returns the raw JSON value of [secrets].
     *
     * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secrets(): JsonField<Secrets> = body._secrets()

    /**
     * Returns the raw JSON value of [env].
     *
     * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _env(): JsonField<String> = body._env()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SecretUpdateGroupParams].
         *
         * The following fields are required:
         * ```java
         * .secrets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretUpdateGroupParams]. */
    class Builder internal constructor() {

        private var group: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(secretUpdateGroupParams: SecretUpdateGroupParams) = apply {
            group = secretUpdateGroupParams.group
            body = secretUpdateGroupParams.body.toBuilder()
            additionalHeaders = secretUpdateGroupParams.additionalHeaders.toBuilder()
            additionalQueryParams = secretUpdateGroupParams.additionalQueryParams.toBuilder()
        }

        fun group(group: String?) = apply { this.group = group }

        /** Alias for calling [Builder.group] with `group.orElse(null)`. */
        fun group(group: Optional<String>) = group(group.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [secrets]
         * - [env]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Key-value pairs of secrets to set */
        fun secrets(secrets: Secrets) = apply { body.secrets(secrets) }

        /**
         * Sets [Builder.secrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secrets(secrets: JsonField<Secrets>) = apply { body.secrets(secrets) }

        /** Environment name (optional, uses default if not specified) */
        fun env(env: String) = apply { body.env(env) }

        /**
         * Sets [Builder.env] to an arbitrary JSON value.
         *
         * You should usually call [Builder.env] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun env(env: JsonField<String>) = apply { body.env(env) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [SecretUpdateGroupParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .secrets()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecretUpdateGroupParams =
            SecretUpdateGroupParams(
                group,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> group ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val secrets: JsonField<Secrets>,
        private val env: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<Secrets> = JsonMissing.of(),
            @JsonProperty("env") @ExcludeMissing env: JsonField<String> = JsonMissing.of(),
        ) : this(secrets, env, mutableMapOf())

        /**
         * Key-value pairs of secrets to set
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun secrets(): Secrets = secrets.getRequired("secrets")

        /**
         * Environment name (optional, uses default if not specified)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun env(): Optional<String> = env.getOptional("env")

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        /**
         * Returns the raw JSON value of [env].
         *
         * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<String> = env

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .secrets()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var secrets: JsonField<Secrets>? = null
            private var env: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                secrets = body.secrets
                env = body.env
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Key-value pairs of secrets to set */
            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            /** Environment name (optional, uses default if not specified) */
            fun env(env: String) = env(JsonField.of(env))

            /**
             * Sets [Builder.env] to an arbitrary JSON value.
             *
             * You should usually call [Builder.env] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun env(env: JsonField<String>) = apply { this.env = env }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .secrets()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("secrets", secrets), env, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            secrets().validate()
            env()
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
            (secrets.asKnown().getOrNull()?.validity() ?: 0) +
                (if (env.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                secrets == other.secrets &&
                env == other.env &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(secrets, env, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{secrets=$secrets, env=$env, additionalProperties=$additionalProperties}"
    }

    /** Key-value pairs of secrets to set */
    class Secrets
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Secrets]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Secrets]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(secrets: Secrets) = apply {
                additionalProperties = secrets.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Secrets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Secrets = Secrets(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Secrets = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Secrets && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Secrets{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretUpdateGroupParams &&
            group == other.group &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(group, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SecretUpdateGroupParams{group=$group, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
