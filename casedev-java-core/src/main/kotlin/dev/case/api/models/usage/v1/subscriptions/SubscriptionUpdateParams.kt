// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.usage.v1.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.checkKnown
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates callback URL, event filters, active state, or signing secret. */
class SubscriptionUpdateParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clearSigningSecret(): Optional<Boolean> = body.clearSigningSecret()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventTypes(): Optional<List<String>> = body.eventTypes()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signingSecret(): Optional<String> = body.signingSecret()

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    /**
     * Returns the raw JSON value of [clearSigningSecret].
     *
     * Unlike [clearSigningSecret], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _clearSigningSecret(): JsonField<Boolean> = body._clearSigningSecret()

    /**
     * Returns the raw JSON value of [eventTypes].
     *
     * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventTypes(): JsonField<List<String>> = body._eventTypes()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [signingSecret].
     *
     * Unlike [signingSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signingSecret(): JsonField<String> = body._signingSecret()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            subscriptionId = subscriptionUpdateParams.subscriptionId
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callbackUrl]
         * - [clearSigningSecret]
         * - [eventTypes]
         * - [isActive]
         * - [signingSecret]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

        fun clearSigningSecret(clearSigningSecret: Boolean) = apply {
            body.clearSigningSecret(clearSigningSecret)
        }

        /**
         * Sets [Builder.clearSigningSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clearSigningSecret] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clearSigningSecret(clearSigningSecret: JsonField<Boolean>) = apply {
            body.clearSigningSecret(clearSigningSecret)
        }

        fun eventTypes(eventTypes: List<String>) = apply { body.eventTypes(eventTypes) }

        /**
         * Sets [Builder.eventTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTypes(eventTypes: JsonField<List<String>>) = apply { body.eventTypes(eventTypes) }

        /**
         * Adds a single [String] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: String) = apply { body.addEventType(eventType) }

        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        fun signingSecret(signingSecret: String) = apply { body.signingSecret(signingSecret) }

        /**
         * Sets [Builder.signingSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signingSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signingSecret(signingSecret: JsonField<String>) = apply {
            body.signingSecret(signingSecret)
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
         * Returns an immutable instance of [SubscriptionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callbackUrl: JsonField<String>,
        private val clearSigningSecret: JsonField<Boolean>,
        private val eventTypes: JsonField<List<String>>,
        private val isActive: JsonField<Boolean>,
        private val signingSecret: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("callbackUrl")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clearSigningSecret")
            @ExcludeMissing
            clearSigningSecret: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("eventTypes")
            @ExcludeMissing
            eventTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("isActive")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("signingSecret")
            @ExcludeMissing
            signingSecret: JsonField<String> = JsonMissing.of(),
        ) : this(
            callbackUrl,
            clearSigningSecret,
            eventTypes,
            isActive,
            signingSecret,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callbackUrl")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clearSigningSecret(): Optional<Boolean> =
            clearSigningSecret.getOptional("clearSigningSecret")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventTypes(): Optional<List<String>> = eventTypes.getOptional("eventTypes")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signingSecret(): Optional<String> = signingSecret.getOptional("signingSecret")

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callbackUrl")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [clearSigningSecret].
         *
         * Unlike [clearSigningSecret], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("clearSigningSecret")
        @ExcludeMissing
        fun _clearSigningSecret(): JsonField<Boolean> = clearSigningSecret

        /**
         * Returns the raw JSON value of [eventTypes].
         *
         * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventTypes")
        @ExcludeMissing
        fun _eventTypes(): JsonField<List<String>> = eventTypes

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [signingSecret].
         *
         * Unlike [signingSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signingSecret")
        @ExcludeMissing
        fun _signingSecret(): JsonField<String> = signingSecret

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

            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var clearSigningSecret: JsonField<Boolean> = JsonMissing.of()
            private var eventTypes: JsonField<MutableList<String>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var signingSecret: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callbackUrl = body.callbackUrl
                clearSigningSecret = body.clearSigningSecret
                eventTypes = body.eventTypes.map { it.toMutableList() }
                isActive = body.isActive
                signingSecret = body.signingSecret
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            fun clearSigningSecret(clearSigningSecret: Boolean) =
                clearSigningSecret(JsonField.of(clearSigningSecret))

            /**
             * Sets [Builder.clearSigningSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clearSigningSecret] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun clearSigningSecret(clearSigningSecret: JsonField<Boolean>) = apply {
                this.clearSigningSecret = clearSigningSecret
            }

            fun eventTypes(eventTypes: List<String>) = eventTypes(JsonField.of(eventTypes))

            /**
             * Sets [Builder.eventTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTypes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventTypes(eventTypes: JsonField<List<String>>) = apply {
                this.eventTypes = eventTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [eventTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEventType(eventType: String) = apply {
                eventTypes =
                    (eventTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eventTypes", it).add(eventType)
                    }
            }

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun signingSecret(signingSecret: String) = signingSecret(JsonField.of(signingSecret))

            /**
             * Sets [Builder.signingSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signingSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signingSecret(signingSecret: JsonField<String>) = apply {
                this.signingSecret = signingSecret
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
                Body(
                    callbackUrl,
                    clearSigningSecret,
                    (eventTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    isActive,
                    signingSecret,
                    additionalProperties.toMutableMap(),
                )
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

            callbackUrl()
            clearSigningSecret()
            eventTypes()
            isActive()
            signingSecret()
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
                (if (clearSigningSecret.asKnown().isPresent) 1 else 0) +
                (eventTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (signingSecret.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callbackUrl == other.callbackUrl &&
                clearSigningSecret == other.clearSigningSecret &&
                eventTypes == other.eventTypes &&
                isActive == other.isActive &&
                signingSecret == other.signingSecret &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callbackUrl,
                clearSigningSecret,
                eventTypes,
                isActive,
                signingSecret,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callbackUrl=$callbackUrl, clearSigningSecret=$clearSigningSecret, eventTypes=$eventTypes, isActive=$isActive, signingSecret=$signingSecret, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpdateParams &&
            subscriptionId == other.subscriptionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdateParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
