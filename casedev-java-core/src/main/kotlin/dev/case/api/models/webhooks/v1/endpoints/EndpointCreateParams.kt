// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

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
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a webhook endpoint that receives platform events matching the supplied event-type
 * filters. Returns the generated signing secret ONCE — the response is the only time it is shown in
 * plaintext.
 */
class EndpointCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Glob patterns of event types to deliver (e.g. "vault.*", "ocr.job.completed", "*")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeFilters(): List<String> = body.eventTypeFilters()

    /**
     * HTTPS callback URL that will receive event deliveries
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Human-readable label for this endpoint
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional per-resource allowlists. If vaultIds is set, only events for those vaults are
     * delivered. Same for matterIds.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceScopes(): Optional<ResourceScopes> = body.resourceScopes()

    /**
     * Returns the raw JSON value of [eventTypeFilters].
     *
     * Unlike [eventTypeFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _eventTypeFilters(): JsonField<List<String>> = body._eventTypeFilters()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [resourceScopes].
     *
     * Unlike [resourceScopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resourceScopes(): JsonField<ResourceScopes> = body._resourceScopes()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EndpointCreateParams].
         *
         * The following fields are required:
         * ```java
         * .eventTypeFilters()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EndpointCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(endpointCreateParams: EndpointCreateParams) = apply {
            body = endpointCreateParams.body.toBuilder()
            additionalHeaders = endpointCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = endpointCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [eventTypeFilters]
         * - [url]
         * - [description]
         * - [resourceScopes]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Glob patterns of event types to deliver (e.g. "vault.*", "ocr.job.completed", "*") */
        fun eventTypeFilters(eventTypeFilters: List<String>) = apply {
            body.eventTypeFilters(eventTypeFilters)
        }

        /**
         * Sets [Builder.eventTypeFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeFilters] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTypeFilters(eventTypeFilters: JsonField<List<String>>) = apply {
            body.eventTypeFilters(eventTypeFilters)
        }

        /**
         * Adds a single [String] to [eventTypeFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventTypeFilter(eventTypeFilter: String) = apply {
            body.addEventTypeFilter(eventTypeFilter)
        }

        /** HTTPS callback URL that will receive event deliveries */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Human-readable label for this endpoint */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Optional per-resource allowlists. If vaultIds is set, only events for those vaults are
         * delivered. Same for matterIds.
         */
        fun resourceScopes(resourceScopes: ResourceScopes) = apply {
            body.resourceScopes(resourceScopes)
        }

        /**
         * Sets [Builder.resourceScopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceScopes] with a well-typed [ResourceScopes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resourceScopes(resourceScopes: JsonField<ResourceScopes>) = apply {
            body.resourceScopes(resourceScopes)
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
         * Returns an immutable instance of [EndpointCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventTypeFilters()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EndpointCreateParams =
            EndpointCreateParams(
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
        private val eventTypeFilters: JsonField<List<String>>,
        private val url: JsonField<String>,
        private val description: JsonField<String>,
        private val resourceScopes: JsonField<ResourceScopes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("eventTypeFilters")
            @ExcludeMissing
            eventTypeFilters: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resourceScopes")
            @ExcludeMissing
            resourceScopes: JsonField<ResourceScopes> = JsonMissing.of(),
        ) : this(eventTypeFilters, url, description, resourceScopes, mutableMapOf())

        /**
         * Glob patterns of event types to deliver (e.g. "vault.*", "ocr.job.completed", "*")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventTypeFilters(): List<String> = eventTypeFilters.getRequired("eventTypeFilters")

        /**
         * HTTPS callback URL that will receive event deliveries
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Human-readable label for this endpoint
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional per-resource allowlists. If vaultIds is set, only events for those vaults are
         * delivered. Same for matterIds.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resourceScopes(): Optional<ResourceScopes> =
            resourceScopes.getOptional("resourceScopes")

        /**
         * Returns the raw JSON value of [eventTypeFilters].
         *
         * Unlike [eventTypeFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eventTypeFilters")
        @ExcludeMissing
        fun _eventTypeFilters(): JsonField<List<String>> = eventTypeFilters

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [resourceScopes].
         *
         * Unlike [resourceScopes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resourceScopes")
        @ExcludeMissing
        fun _resourceScopes(): JsonField<ResourceScopes> = resourceScopes

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
             * .eventTypeFilters()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var eventTypeFilters: JsonField<MutableList<String>>? = null
            private var url: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var resourceScopes: JsonField<ResourceScopes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                eventTypeFilters = body.eventTypeFilters.map { it.toMutableList() }
                url = body.url
                description = body.description
                resourceScopes = body.resourceScopes
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Glob patterns of event types to deliver (e.g. "vault.*", "ocr.job.completed", "*")
             */
            fun eventTypeFilters(eventTypeFilters: List<String>) =
                eventTypeFilters(JsonField.of(eventTypeFilters))

            /**
             * Sets [Builder.eventTypeFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTypeFilters] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventTypeFilters(eventTypeFilters: JsonField<List<String>>) = apply {
                this.eventTypeFilters = eventTypeFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [eventTypeFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEventTypeFilter(eventTypeFilter: String) = apply {
                eventTypeFilters =
                    (eventTypeFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eventTypeFilters", it).add(eventTypeFilter)
                    }
            }

            /** HTTPS callback URL that will receive event deliveries */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Human-readable label for this endpoint */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Optional per-resource allowlists. If vaultIds is set, only events for those vaults
             * are delivered. Same for matterIds.
             */
            fun resourceScopes(resourceScopes: ResourceScopes) =
                resourceScopes(JsonField.of(resourceScopes))

            /**
             * Sets [Builder.resourceScopes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceScopes] with a well-typed [ResourceScopes]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resourceScopes(resourceScopes: JsonField<ResourceScopes>) = apply {
                this.resourceScopes = resourceScopes
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
             * .eventTypeFilters()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("eventTypeFilters", eventTypeFilters).map { it.toImmutable() },
                    checkRequired("url", url),
                    description,
                    resourceScopes,
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

            eventTypeFilters()
            url()
            description()
            resourceScopes().ifPresent { it.validate() }
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
            (eventTypeFilters.asKnown().getOrNull()?.size ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (resourceScopes.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                eventTypeFilters == other.eventTypeFilters &&
                url == other.url &&
                description == other.description &&
                resourceScopes == other.resourceScopes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventTypeFilters, url, description, resourceScopes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{eventTypeFilters=$eventTypeFilters, url=$url, description=$description, resourceScopes=$resourceScopes, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional per-resource allowlists. If vaultIds is set, only events for those vaults are
     * delivered. Same for matterIds.
     */
    class ResourceScopes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val matterIds: JsonField<List<String>>,
        private val vaultIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("matterIds")
            @ExcludeMissing
            matterIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("vaultIds")
            @ExcludeMissing
            vaultIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(matterIds, vaultIds, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun matterIds(): Optional<List<String>> = matterIds.getOptional("matterIds")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

        /**
         * Returns the raw JSON value of [matterIds].
         *
         * Unlike [matterIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("matterIds")
        @ExcludeMissing
        fun _matterIds(): JsonField<List<String>> = matterIds

        /**
         * Returns the raw JSON value of [vaultIds].
         *
         * Unlike [vaultIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vaultIds")
        @ExcludeMissing
        fun _vaultIds(): JsonField<List<String>> = vaultIds

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

            /** Returns a mutable builder for constructing an instance of [ResourceScopes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResourceScopes]. */
        class Builder internal constructor() {

            private var matterIds: JsonField<MutableList<String>>? = null
            private var vaultIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resourceScopes: ResourceScopes) = apply {
                matterIds = resourceScopes.matterIds.map { it.toMutableList() }
                vaultIds = resourceScopes.vaultIds.map { it.toMutableList() }
                additionalProperties = resourceScopes.additionalProperties.toMutableMap()
            }

            fun matterIds(matterIds: List<String>) = matterIds(JsonField.of(matterIds))

            /**
             * Sets [Builder.matterIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matterIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matterIds(matterIds: JsonField<List<String>>) = apply {
                this.matterIds = matterIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matterIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatterId(matterId: String) = apply {
                matterIds =
                    (matterIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matterIds", it).add(matterId)
                    }
            }

            fun vaultIds(vaultIds: List<String>) = vaultIds(JsonField.of(vaultIds))

            /**
             * Sets [Builder.vaultIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultIds(vaultIds: JsonField<List<String>>) = apply {
                this.vaultIds = vaultIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vaultIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVaultId(vaultId: String) = apply {
                vaultIds =
                    (vaultIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vaultIds", it).add(vaultId)
                    }
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
             * Returns an immutable instance of [ResourceScopes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResourceScopes =
                ResourceScopes(
                    (matterIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (vaultIds ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): ResourceScopes = apply {
            if (validated) {
                return@apply
            }

            matterIds()
            vaultIds()
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
            (matterIds.asKnown().getOrNull()?.size ?: 0) +
                (vaultIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourceScopes &&
                matterIds == other.matterIds &&
                vaultIds == other.vaultIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(matterIds, vaultIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResourceScopes{matterIds=$matterIds, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EndpointCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EndpointCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
