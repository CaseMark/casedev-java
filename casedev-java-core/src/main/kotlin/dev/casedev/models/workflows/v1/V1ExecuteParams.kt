// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Execute a deployed workflow. Supports three modes:
 * - **Fire-and-forget** (default): Returns immediately with executionId. Poll /executions/{id} for
 *   status.
 * - **Callback**: Returns immediately, POSTs result to callbackUrl when workflow completes.
 * - **Sync wait**: Blocks until workflow completes (max 5 minutes).
 */
class V1ExecuteParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Headers to include in callback request (e.g., Authorization) */
    fun _callbackHeaders(): JsonValue = body._callbackHeaders()

    /**
     * URL to POST results when workflow completes (enables callback mode)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /** Input data to pass to the workflow */
    fun _input(): JsonValue = body._input()

    /**
     * Timeout for sync wait mode (e.g., '30s', '2m'). Max 5m. Default: 30s
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<String> = body.timeout()

    /**
     * Wait for completion (default: false, max 5 min)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wait(): Optional<Boolean> = body.wait()

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeout(): JsonField<String> = body._timeout()

    /**
     * Returns the raw JSON value of [wait].
     *
     * Unlike [wait], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _wait(): JsonField<Boolean> = body._wait()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1ExecuteParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1ExecuteParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ExecuteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ExecuteParams: V1ExecuteParams) = apply {
            id = v1ExecuteParams.id
            body = v1ExecuteParams.body.toBuilder()
            additionalHeaders = v1ExecuteParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ExecuteParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callbackHeaders]
         * - [callbackUrl]
         * - [input]
         * - [timeout]
         * - [wait]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Headers to include in callback request (e.g., Authorization) */
        fun callbackHeaders(callbackHeaders: JsonValue) = apply {
            body.callbackHeaders(callbackHeaders)
        }

        /** URL to POST results when workflow completes (enables callback mode) */
        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

        /** Input data to pass to the workflow */
        fun input(input: JsonValue) = apply { body.input(input) }

        /** Timeout for sync wait mode (e.g., '30s', '2m'). Max 5m. Default: 30s */
        fun timeout(timeout: String) = apply { body.timeout(timeout) }

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<String>) = apply { body.timeout(timeout) }

        /** Wait for completion (default: false, max 5 min) */
        fun wait(wait: Boolean) = apply { body.wait(wait) }

        /**
         * Sets [Builder.wait] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wait] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wait(wait: JsonField<Boolean>) = apply { body.wait(wait) }

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
         * Returns an immutable instance of [V1ExecuteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ExecuteParams =
            V1ExecuteParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callbackHeaders: JsonValue,
        private val callbackUrl: JsonField<String>,
        private val input: JsonValue,
        private val timeout: JsonField<String>,
        private val wait: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("callbackHeaders")
            @ExcludeMissing
            callbackHeaders: JsonValue = JsonMissing.of(),
            @JsonProperty("callbackUrl")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input") @ExcludeMissing input: JsonValue = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wait") @ExcludeMissing wait: JsonField<Boolean> = JsonMissing.of(),
        ) : this(callbackHeaders, callbackUrl, input, timeout, wait, mutableMapOf())

        /** Headers to include in callback request (e.g., Authorization) */
        @JsonProperty("callbackHeaders")
        @ExcludeMissing
        fun _callbackHeaders(): JsonValue = callbackHeaders

        /**
         * URL to POST results when workflow completes (enables callback mode)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callbackUrl")

        /** Input data to pass to the workflow */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

        /**
         * Timeout for sync wait mode (e.g., '30s', '2m'). Max 5m. Default: 30s
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<String> = timeout.getOptional("timeout")

        /**
         * Wait for completion (default: false, max 5 min)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wait(): Optional<Boolean> = wait.getOptional("wait")

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callbackUrl")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<String> = timeout

        /**
         * Returns the raw JSON value of [wait].
         *
         * Unlike [wait], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wait") @ExcludeMissing fun _wait(): JsonField<Boolean> = wait

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var callbackHeaders: JsonValue = JsonMissing.of()
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var input: JsonValue = JsonMissing.of()
            private var timeout: JsonField<String> = JsonMissing.of()
            private var wait: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callbackHeaders = body.callbackHeaders
                callbackUrl = body.callbackUrl
                input = body.input
                timeout = body.timeout
                wait = body.wait
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Headers to include in callback request (e.g., Authorization) */
            fun callbackHeaders(callbackHeaders: JsonValue) = apply {
                this.callbackHeaders = callbackHeaders
            }

            /** URL to POST results when workflow completes (enables callback mode) */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /** Input data to pass to the workflow */
            fun input(input: JsonValue) = apply { this.input = input }

            /** Timeout for sync wait mode (e.g., '30s', '2m'). Max 5m. Default: 30s */
            fun timeout(timeout: String) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<String>) = apply { this.timeout = timeout }

            /** Wait for completion (default: false, max 5 min) */
            fun wait(wait: Boolean) = wait(JsonField.of(wait))

            /**
             * Sets [Builder.wait] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wait] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wait(wait: JsonField<Boolean>) = apply { this.wait = wait }

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
             */
            fun build(): Body =
                Body(
                    callbackHeaders,
                    callbackUrl,
                    input,
                    timeout,
                    wait,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callbackUrl()
            timeout()
            wait()
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
            (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (wait.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callbackHeaders == other.callbackHeaders &&
                callbackUrl == other.callbackUrl &&
                input == other.input &&
                timeout == other.timeout &&
                wait == other.wait &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(callbackHeaders, callbackUrl, input, timeout, wait, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callbackHeaders=$callbackHeaders, callbackUrl=$callbackUrl, input=$input, timeout=$timeout, wait=$wait, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ExecuteParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ExecuteParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
