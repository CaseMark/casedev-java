// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Look up trademark status and details from the USPTO Trademark Status & Document Retrieval (TSDR)
 * system. Supports lookup by serial number or registration number. Returns mark text, status,
 * owner, goods/services, Nice classification, filing/registration dates, and more.
 */
class V1TrademarkSearchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * USPTO registration number (e.g. "6123456"). Provide either serialNumber or
     * registrationNumber.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationNumber(): Optional<String> = body.registrationNumber()

    /**
     * USPTO serial number (e.g. "97123456"). Provide either serialNumber or registrationNumber.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serialNumber(): Optional<String> = body.serialNumber()

    /**
     * Returns the raw JSON value of [registrationNumber].
     *
     * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _registrationNumber(): JsonField<String> = body._registrationNumber()

    /**
     * Returns the raw JSON value of [serialNumber].
     *
     * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serialNumber(): JsonField<String> = body._serialNumber()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1TrademarkSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1TrademarkSearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1TrademarkSearchParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1TrademarkSearchParams: V1TrademarkSearchParams) = apply {
            body = v1TrademarkSearchParams.body.toBuilder()
            additionalHeaders = v1TrademarkSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1TrademarkSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [registrationNumber]
         * - [serialNumber]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * USPTO registration number (e.g. "6123456"). Provide either serialNumber or
         * registrationNumber.
         */
        fun registrationNumber(registrationNumber: String) = apply {
            body.registrationNumber(registrationNumber)
        }

        /**
         * Sets [Builder.registrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationNumber(registrationNumber: JsonField<String>) = apply {
            body.registrationNumber(registrationNumber)
        }

        /**
         * USPTO serial number (e.g. "97123456"). Provide either serialNumber or registrationNumber.
         */
        fun serialNumber(serialNumber: String) = apply { body.serialNumber(serialNumber) }

        /**
         * Sets [Builder.serialNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serialNumber(serialNumber: JsonField<String>) = apply {
            body.serialNumber(serialNumber)
        }

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
         * Returns an immutable instance of [V1TrademarkSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1TrademarkSearchParams =
            V1TrademarkSearchParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val registrationNumber: JsonField<String>,
        private val serialNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("registrationNumber")
            @ExcludeMissing
            registrationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serialNumber")
            @ExcludeMissing
            serialNumber: JsonField<String> = JsonMissing.of(),
        ) : this(registrationNumber, serialNumber, mutableMapOf())

        /**
         * USPTO registration number (e.g. "6123456"). Provide either serialNumber or
         * registrationNumber.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun registrationNumber(): Optional<String> =
            registrationNumber.getOptional("registrationNumber")

        /**
         * USPTO serial number (e.g. "97123456"). Provide either serialNumber or registrationNumber.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

        /**
         * Returns the raw JSON value of [registrationNumber].
         *
         * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        fun _registrationNumber(): JsonField<String> = registrationNumber

        /**
         * Returns the raw JSON value of [serialNumber].
         *
         * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("serialNumber")
        @ExcludeMissing
        fun _serialNumber(): JsonField<String> = serialNumber

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

            private var registrationNumber: JsonField<String> = JsonMissing.of()
            private var serialNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                registrationNumber = body.registrationNumber
                serialNumber = body.serialNumber
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * USPTO registration number (e.g. "6123456"). Provide either serialNumber or
             * registrationNumber.
             */
            fun registrationNumber(registrationNumber: String) =
                registrationNumber(JsonField.of(registrationNumber))

            /**
             * Sets [Builder.registrationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                this.registrationNumber = registrationNumber
            }

            /**
             * USPTO serial number (e.g. "97123456"). Provide either serialNumber or
             * registrationNumber.
             */
            fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

            /**
             * Sets [Builder.serialNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serialNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
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
             */
            fun build(): Body =
                Body(registrationNumber, serialNumber, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            registrationNumber()
            serialNumber()
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
            (if (registrationNumber.asKnown().isPresent) 1 else 0) +
                (if (serialNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                registrationNumber == other.registrationNumber &&
                serialNumber == other.serialNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(registrationNumber, serialNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{registrationNumber=$registrationNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1TrademarkSearchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1TrademarkSearchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
