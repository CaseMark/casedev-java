// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1

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
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Submit an FTR (ForensicTech Recording) file for conversion to M4A audio format. This endpoint is
 * commonly used to convert court recording files into standard audio formats for transcription or
 * playback. The conversion is processed asynchronously - you'll receive a job ID to track the
 * conversion status.
 *
 * **Supported Input**: FTR files via S3 presigned URLs **Output Format**: M4A audio **Processing**:
 * Asynchronous with webhook callbacks
 */
class V1ProcessParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * HTTPS URL to the FTR file (must be a valid S3 presigned URL)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputUrl(): String = body.inputUrl()

    /**
     * Optional webhook URL to receive conversion completion notification
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /**
     * Returns the raw JSON value of [inputUrl].
     *
     * Unlike [inputUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputUrl(): JsonField<String> = body._inputUrl()

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1ProcessParams].
         *
         * The following fields are required:
         * ```java
         * .inputUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ProcessParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ProcessParams: V1ProcessParams) = apply {
            body = v1ProcessParams.body.toBuilder()
            additionalHeaders = v1ProcessParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ProcessParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inputUrl]
         * - [callbackUrl]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** HTTPS URL to the FTR file (must be a valid S3 presigned URL) */
        fun inputUrl(inputUrl: String) = apply { body.inputUrl(inputUrl) }

        /**
         * Sets [Builder.inputUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inputUrl(inputUrl: JsonField<String>) = apply { body.inputUrl(inputUrl) }

        /** Optional webhook URL to receive conversion completion notification */
        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

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
         * Returns an immutable instance of [V1ProcessParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1ProcessParams =
            V1ProcessParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inputUrl: JsonField<String>,
        private val callbackUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input_url")
            @ExcludeMissing
            inputUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
        ) : this(inputUrl, callbackUrl, mutableMapOf())

        /**
         * HTTPS URL to the FTR file (must be a valid S3 presigned URL)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputUrl(): String = inputUrl.getRequired("input_url")

        /**
         * Optional webhook URL to receive conversion completion notification
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * Returns the raw JSON value of [inputUrl].
         *
         * Unlike [inputUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_url") @ExcludeMissing fun _inputUrl(): JsonField<String> = inputUrl

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

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
             * .inputUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inputUrl: JsonField<String>? = null
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inputUrl = body.inputUrl
                callbackUrl = body.callbackUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** HTTPS URL to the FTR file (must be a valid S3 presigned URL) */
            fun inputUrl(inputUrl: String) = inputUrl(JsonField.of(inputUrl))

            /**
             * Sets [Builder.inputUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputUrl(inputUrl: JsonField<String>) = apply { this.inputUrl = inputUrl }

            /** Optional webhook URL to receive conversion completion notification */
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
             * .inputUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("inputUrl", inputUrl),
                    callbackUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inputUrl()
            callbackUrl()
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
            (if (inputUrl.asKnown().isPresent) 1 else 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                inputUrl == other.inputUrl &&
                callbackUrl == other.callbackUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inputUrl, callbackUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inputUrl=$inputUrl, callbackUrl=$callbackUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ProcessParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ProcessParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
