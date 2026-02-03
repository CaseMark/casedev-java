// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.superdoc.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonValue
import dev.casedev.core.MultipartField
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Convert documents between formats using SuperDoc. Supports DOCX to PDF, Markdown to DOCX, and
 * HTML to DOCX conversions.
 */
class V1ConvertParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Source format of the document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): From = body.from()

    /**
     * Base64-encoded document content
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentBase64(): Optional<String> = body.documentBase64()

    /**
     * URL to the document to convert
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentUrl(): Optional<String> = body.documentUrl()

    /**
     * Target format for conversion
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<To> = body.to()

    /**
     * Returns the raw multipart value of [from].
     *
     * Unlike [from], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _from(): MultipartField<From> = body._from()

    /**
     * Returns the raw multipart value of [documentBase64].
     *
     * Unlike [documentBase64], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentBase64(): MultipartField<String> = body._documentBase64()

    /**
     * Returns the raw multipart value of [documentUrl].
     *
     * Unlike [documentUrl], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentUrl(): MultipartField<String> = body._documentUrl()

    /**
     * Returns the raw multipart value of [to].
     *
     * Unlike [to], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _to(): MultipartField<To> = body._to()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1ConvertParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ConvertParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ConvertParams: V1ConvertParams) = apply {
            body = v1ConvertParams.body.toBuilder()
            additionalHeaders = v1ConvertParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ConvertParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [from]
         * - [documentBase64]
         * - [documentUrl]
         * - [to]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Source format of the document */
        fun from(from: From) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary multipart value.
         *
         * You should usually call [Builder.from] with a well-typed [From] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: MultipartField<From>) = apply { body.from(from) }

        /** Base64-encoded document content */
        fun documentBase64(documentBase64: String) = apply { body.documentBase64(documentBase64) }

        /**
         * Sets [Builder.documentBase64] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentBase64] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentBase64(documentBase64: MultipartField<String>) = apply {
            body.documentBase64(documentBase64)
        }

        /** URL to the document to convert */
        fun documentUrl(documentUrl: String) = apply { body.documentUrl(documentUrl) }

        /**
         * Sets [Builder.documentUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentUrl(documentUrl: MultipartField<String>) = apply {
            body.documentUrl(documentUrl)
        }

        /** Target format for conversion */
        fun to(to: To) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary multipart value.
         *
         * You should usually call [Builder.to] with a well-typed [To] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: MultipartField<To>) = apply { body.to(to) }

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
         * Returns an immutable instance of [V1ConvertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1ConvertParams =
            V1ConvertParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "from" to _from(),
                "document_base64" to _documentBase64(),
                "document_url" to _documentUrl(),
                "to" to _to(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val from: MultipartField<From>,
        private val documentBase64: MultipartField<String>,
        private val documentUrl: MultipartField<String>,
        private val to: MultipartField<To>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Source format of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): From = from.value.getRequired("from")

        /**
         * Base64-encoded document content
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentBase64(): Optional<String> = documentBase64.value.getOptional("document_base64")

        /**
         * URL to the document to convert
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentUrl(): Optional<String> = documentUrl.value.getOptional("document_url")

        /**
         * Target format for conversion
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<To> = to.value.getOptional("to")

        /**
         * Returns the raw multipart value of [from].
         *
         * Unlike [from], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): MultipartField<From> = from

        /**
         * Returns the raw multipart value of [documentBase64].
         *
         * Unlike [documentBase64], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("document_base64")
        @ExcludeMissing
        fun _documentBase64(): MultipartField<String> = documentBase64

        /**
         * Returns the raw multipart value of [documentUrl].
         *
         * Unlike [documentUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document_url")
        @ExcludeMissing
        fun _documentUrl(): MultipartField<String> = documentUrl

        /**
         * Returns the raw multipart value of [to].
         *
         * Unlike [to], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): MultipartField<To> = to

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
             * .from()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: MultipartField<From>? = null
            private var documentBase64: MultipartField<String> = MultipartField.of(null)
            private var documentUrl: MultipartField<String> = MultipartField.of(null)
            private var to: MultipartField<To> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                documentBase64 = body.documentBase64
                documentUrl = body.documentUrl
                to = body.to
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Source format of the document */
            fun from(from: From) = from(MultipartField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary multipart value.
             *
             * You should usually call [Builder.from] with a well-typed [From] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: MultipartField<From>) = apply { this.from = from }

            /** Base64-encoded document content */
            fun documentBase64(documentBase64: String) =
                documentBase64(MultipartField.of(documentBase64))

            /**
             * Sets [Builder.documentBase64] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentBase64] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentBase64(documentBase64: MultipartField<String>) = apply {
                this.documentBase64 = documentBase64
            }

            /** URL to the document to convert */
            fun documentUrl(documentUrl: String) = documentUrl(MultipartField.of(documentUrl))

            /**
             * Sets [Builder.documentUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentUrl(documentUrl: MultipartField<String>) = apply {
                this.documentUrl = documentUrl
            }

            /** Target format for conversion */
            fun to(to: To) = to(MultipartField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary multipart value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: MultipartField<To>) = apply { this.to = to }

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
             * .from()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    documentBase64,
                    documentUrl,
                    to,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            from().validate()
            documentBase64()
            documentUrl()
            to().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CasedevInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                documentBase64 == other.documentBase64 &&
                documentUrl == other.documentUrl &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(from, documentBase64, documentUrl, to, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, documentBase64=$documentBase64, documentUrl=$documentUrl, to=$to, additionalProperties=$additionalProperties}"
    }

    /** Source format of the document */
    class From @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DOCX = of("docx")

            @JvmField val MD = of("md")

            @JvmField val HTML = of("html")

            @JvmStatic fun of(value: String) = From(JsonField.of(value))
        }

        /** An enum containing [From]'s known values. */
        enum class Known {
            DOCX,
            MD,
            HTML,
        }

        /**
         * An enum containing [From]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [From] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOCX,
            MD,
            HTML,
            /** An enum member indicating that [From] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DOCX -> Value.DOCX
                MD -> Value.MD
                HTML -> Value.HTML
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DOCX -> Known.DOCX
                MD -> Known.MD
                HTML -> Known.HTML
                else -> throw CasedevInvalidDataException("Unknown From: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): From = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is From && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Target format for conversion */
    class To @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PDF = of("pdf")

            @JvmField val DOCX = of("docx")

            @JvmStatic fun of(value: String) = To(JsonField.of(value))
        }

        /** An enum containing [To]'s known values. */
        enum class Known {
            PDF,
            DOCX,
        }

        /**
         * An enum containing [To]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [To] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PDF,
            DOCX,
            /** An enum member indicating that [To] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PDF -> Value.PDF
                DOCX -> Value.DOCX
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PDF -> Known.PDF
                DOCX -> Known.DOCX
                else -> throw CasedevInvalidDataException("Unknown To: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): To = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is To && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ConvertParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ConvertParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
