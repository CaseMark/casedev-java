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
 * Returns CourtListener court IDs and names for docket filtering. Use these IDs in legal.docket()
 * as the court parameter.
 */
class V1ListCourtsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Only return courts currently in use by CourtListener
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inUseOnly(): Optional<Boolean> = body.inUseOnly()

    /**
     * Optional CourtListener jurisdiction code filter (e.g. FD, F, S)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdiction(): Optional<String> = body.jurisdiction()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * Search by court name or slug (e.g. "Northern District", "nysd", "ca9")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = body.query()

    /**
     * Returns the raw JSON value of [inUseOnly].
     *
     * Unlike [inUseOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inUseOnly(): JsonField<Boolean> = body._inUseOnly()

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jurisdiction(): JsonField<String> = body._jurisdiction()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1ListCourtsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1ListCourtsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListCourtsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ListCourtsParams: V1ListCourtsParams) = apply {
            body = v1ListCourtsParams.body.toBuilder()
            additionalHeaders = v1ListCourtsParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ListCourtsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inUseOnly]
         * - [jurisdiction]
         * - [limit]
         * - [offset]
         * - [query]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Only return courts currently in use by CourtListener */
        fun inUseOnly(inUseOnly: Boolean) = apply { body.inUseOnly(inUseOnly) }

        /**
         * Sets [Builder.inUseOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inUseOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inUseOnly(inUseOnly: JsonField<Boolean>) = apply { body.inUseOnly(inUseOnly) }

        /** Optional CourtListener jurisdiction code filter (e.g. FD, F, S) */
        fun jurisdiction(jurisdiction: String) = apply { body.jurisdiction(jurisdiction) }

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            body.jurisdiction(jurisdiction)
        }

        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        /** Search by court name or slug (e.g. "Northern District", "nysd", "ca9") */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

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
         * Returns an immutable instance of [V1ListCourtsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListCourtsParams =
            V1ListCourtsParams(
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
        private val inUseOnly: JsonField<Boolean>,
        private val jurisdiction: JsonField<String>,
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val query: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inUseOnly")
            @ExcludeMissing
            inUseOnly: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("jurisdiction")
            @ExcludeMissing
            jurisdiction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        ) : this(inUseOnly, jurisdiction, limit, offset, query, mutableMapOf())

        /**
         * Only return courts currently in use by CourtListener
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inUseOnly(): Optional<Boolean> = inUseOnly.getOptional("inUseOnly")

        /**
         * Optional CourtListener jurisdiction code filter (e.g. FD, F, S)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jurisdiction(): Optional<String> = jurisdiction.getOptional("jurisdiction")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Search by court name or slug (e.g. "Northern District", "nysd", "ca9")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun query(): Optional<String> = query.getOptional("query")

        /**
         * Returns the raw JSON value of [inUseOnly].
         *
         * Unlike [inUseOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inUseOnly") @ExcludeMissing fun _inUseOnly(): JsonField<Boolean> = inUseOnly

        /**
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<String> = jurisdiction

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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

            private var inUseOnly: JsonField<Boolean> = JsonMissing.of()
            private var jurisdiction: JsonField<String> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var query: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inUseOnly = body.inUseOnly
                jurisdiction = body.jurisdiction
                limit = body.limit
                offset = body.offset
                query = body.query
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Only return courts currently in use by CourtListener */
            fun inUseOnly(inUseOnly: Boolean) = inUseOnly(JsonField.of(inUseOnly))

            /**
             * Sets [Builder.inUseOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inUseOnly] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inUseOnly(inUseOnly: JsonField<Boolean>) = apply { this.inUseOnly = inUseOnly }

            /** Optional CourtListener jurisdiction code filter (e.g. FD, F, S) */
            fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<String>) = apply {
                this.jurisdiction = jurisdiction
            }

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** Search by court name or slug (e.g. "Northern District", "nysd", "ca9") */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

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
                    inUseOnly,
                    jurisdiction,
                    limit,
                    offset,
                    query,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inUseOnly()
            jurisdiction()
            limit()
            offset()
            query()
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
            (if (inUseOnly.asKnown().isPresent) 1 else 0) +
                (if (jurisdiction.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (query.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                inUseOnly == other.inUseOnly &&
                jurisdiction == other.jurisdiction &&
                limit == other.limit &&
                offset == other.offset &&
                query == other.query &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inUseOnly, jurisdiction, limit, offset, query, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inUseOnly=$inUseOnly, jurisdiction=$jurisdiction, limit=$limit, offset=$offset, query=$query, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListCourtsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ListCourtsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
