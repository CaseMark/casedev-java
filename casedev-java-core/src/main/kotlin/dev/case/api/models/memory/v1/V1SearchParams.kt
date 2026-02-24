// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.memory.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Search memories using semantic similarity. Filter by tag fields to narrow results.
 *
 * Use tag_1 through tag_12 for filtering - these are generic indexed fields you define:
 * - Legal app: tag_1=client_id, tag_2=matter_id
 * - Healthcare: tag_1=patient_id, tag_2=encounter_id
 */
class V1SearchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Search query for semantic matching
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Filter by category
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<String> = body.category()

    /**
     * Filter by tag_1
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag1(): Optional<String> = body.tag1()

    /**
     * Filter by tag_10
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag10(): Optional<String> = body.tag10()

    /**
     * Filter by tag_11
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag11(): Optional<String> = body.tag11()

    /**
     * Filter by tag_12
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag12(): Optional<String> = body.tag12()

    /**
     * Filter by tag_2
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag2(): Optional<String> = body.tag2()

    /**
     * Filter by tag_3
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag3(): Optional<String> = body.tag3()

    /**
     * Filter by tag_4
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag4(): Optional<String> = body.tag4()

    /**
     * Filter by tag_5
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag5(): Optional<String> = body.tag5()

    /**
     * Filter by tag_6
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag6(): Optional<String> = body.tag6()

    /**
     * Filter by tag_7
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag7(): Optional<String> = body.tag7()

    /**
     * Filter by tag_8
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag8(): Optional<String> = body.tag8()

    /**
     * Filter by tag_9
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag9(): Optional<String> = body.tag9()

    /**
     * Maximum number of results to return
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Optional<Long> = body.topK()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<String> = body._category()

    /**
     * Returns the raw JSON value of [tag1].
     *
     * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag1(): JsonField<String> = body._tag1()

    /**
     * Returns the raw JSON value of [tag10].
     *
     * Unlike [tag10], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag10(): JsonField<String> = body._tag10()

    /**
     * Returns the raw JSON value of [tag11].
     *
     * Unlike [tag11], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag11(): JsonField<String> = body._tag11()

    /**
     * Returns the raw JSON value of [tag12].
     *
     * Unlike [tag12], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag12(): JsonField<String> = body._tag12()

    /**
     * Returns the raw JSON value of [tag2].
     *
     * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag2(): JsonField<String> = body._tag2()

    /**
     * Returns the raw JSON value of [tag3].
     *
     * Unlike [tag3], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag3(): JsonField<String> = body._tag3()

    /**
     * Returns the raw JSON value of [tag4].
     *
     * Unlike [tag4], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag4(): JsonField<String> = body._tag4()

    /**
     * Returns the raw JSON value of [tag5].
     *
     * Unlike [tag5], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag5(): JsonField<String> = body._tag5()

    /**
     * Returns the raw JSON value of [tag6].
     *
     * Unlike [tag6], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag6(): JsonField<String> = body._tag6()

    /**
     * Returns the raw JSON value of [tag7].
     *
     * Unlike [tag7], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag7(): JsonField<String> = body._tag7()

    /**
     * Returns the raw JSON value of [tag8].
     *
     * Unlike [tag8], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag8(): JsonField<String> = body._tag8()

    /**
     * Returns the raw JSON value of [tag9].
     *
     * Unlike [tag9], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag9(): JsonField<String> = body._tag9()

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topK(): JsonField<Long> = body._topK()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1SearchParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SearchParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1SearchParams: V1SearchParams) = apply {
            body = v1SearchParams.body.toBuilder()
            additionalHeaders = v1SearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1SearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [category]
         * - [tag1]
         * - [tag10]
         * - [tag11]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Search query for semantic matching */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Filter by category */
        fun category(category: String) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { body.category(category) }

        /** Filter by tag_1 */
        fun tag1(tag1: String) = apply { body.tag1(tag1) }

        /**
         * Sets [Builder.tag1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag1(tag1: JsonField<String>) = apply { body.tag1(tag1) }

        /** Filter by tag_10 */
        fun tag10(tag10: String) = apply { body.tag10(tag10) }

        /**
         * Sets [Builder.tag10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag10] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag10(tag10: JsonField<String>) = apply { body.tag10(tag10) }

        /** Filter by tag_11 */
        fun tag11(tag11: String) = apply { body.tag11(tag11) }

        /**
         * Sets [Builder.tag11] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag11] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag11(tag11: JsonField<String>) = apply { body.tag11(tag11) }

        /** Filter by tag_12 */
        fun tag12(tag12: String) = apply { body.tag12(tag12) }

        /**
         * Sets [Builder.tag12] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag12] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag12(tag12: JsonField<String>) = apply { body.tag12(tag12) }

        /** Filter by tag_2 */
        fun tag2(tag2: String) = apply { body.tag2(tag2) }

        /**
         * Sets [Builder.tag2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag2(tag2: JsonField<String>) = apply { body.tag2(tag2) }

        /** Filter by tag_3 */
        fun tag3(tag3: String) = apply { body.tag3(tag3) }

        /**
         * Sets [Builder.tag3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag3] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag3(tag3: JsonField<String>) = apply { body.tag3(tag3) }

        /** Filter by tag_4 */
        fun tag4(tag4: String) = apply { body.tag4(tag4) }

        /**
         * Sets [Builder.tag4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag4(tag4: JsonField<String>) = apply { body.tag4(tag4) }

        /** Filter by tag_5 */
        fun tag5(tag5: String) = apply { body.tag5(tag5) }

        /**
         * Sets [Builder.tag5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag5(tag5: JsonField<String>) = apply { body.tag5(tag5) }

        /** Filter by tag_6 */
        fun tag6(tag6: String) = apply { body.tag6(tag6) }

        /**
         * Sets [Builder.tag6] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag6] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag6(tag6: JsonField<String>) = apply { body.tag6(tag6) }

        /** Filter by tag_7 */
        fun tag7(tag7: String) = apply { body.tag7(tag7) }

        /**
         * Sets [Builder.tag7] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag7] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag7(tag7: JsonField<String>) = apply { body.tag7(tag7) }

        /** Filter by tag_8 */
        fun tag8(tag8: String) = apply { body.tag8(tag8) }

        /**
         * Sets [Builder.tag8] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag8] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag8(tag8: JsonField<String>) = apply { body.tag8(tag8) }

        /** Filter by tag_9 */
        fun tag9(tag9: String) = apply { body.tag9(tag9) }

        /**
         * Sets [Builder.tag9] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag9] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag9(tag9: JsonField<String>) = apply { body.tag9(tag9) }

        /** Maximum number of results to return */
        fun topK(topK: Long) = apply { body.topK(topK) }

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { body.topK(topK) }

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
         * Returns an immutable instance of [V1SearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1SearchParams =
            V1SearchParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<String>,
        private val category: JsonField<String>,
        private val tag1: JsonField<String>,
        private val tag10: JsonField<String>,
        private val tag11: JsonField<String>,
        private val tag12: JsonField<String>,
        private val tag2: JsonField<String>,
        private val tag3: JsonField<String>,
        private val tag4: JsonField<String>,
        private val tag5: JsonField<String>,
        private val tag6: JsonField<String>,
        private val tag7: JsonField<String>,
        private val tag8: JsonField<String>,
        private val tag9: JsonField<String>,
        private val topK: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_10") @ExcludeMissing tag10: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_11") @ExcludeMissing tag11: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_12") @ExcludeMissing tag12: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_3") @ExcludeMissing tag3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_4") @ExcludeMissing tag4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_5") @ExcludeMissing tag5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_6") @ExcludeMissing tag6: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_7") @ExcludeMissing tag7: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_8") @ExcludeMissing tag8: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_9") @ExcludeMissing tag9: JsonField<String> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
        ) : this(
            query,
            category,
            tag1,
            tag10,
            tag11,
            tag12,
            tag2,
            tag3,
            tag4,
            tag5,
            tag6,
            tag7,
            tag8,
            tag9,
            topK,
            mutableMapOf(),
        )

        /**
         * Search query for semantic matching
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Filter by category
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Filter by tag_1
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag1(): Optional<String> = tag1.getOptional("tag_1")

        /**
         * Filter by tag_10
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag10(): Optional<String> = tag10.getOptional("tag_10")

        /**
         * Filter by tag_11
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag11(): Optional<String> = tag11.getOptional("tag_11")

        /**
         * Filter by tag_12
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag12(): Optional<String> = tag12.getOptional("tag_12")

        /**
         * Filter by tag_2
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag2(): Optional<String> = tag2.getOptional("tag_2")

        /**
         * Filter by tag_3
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag3(): Optional<String> = tag3.getOptional("tag_3")

        /**
         * Filter by tag_4
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag4(): Optional<String> = tag4.getOptional("tag_4")

        /**
         * Filter by tag_5
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag5(): Optional<String> = tag5.getOptional("tag_5")

        /**
         * Filter by tag_6
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag6(): Optional<String> = tag6.getOptional("tag_6")

        /**
         * Filter by tag_7
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag7(): Optional<String> = tag7.getOptional("tag_7")

        /**
         * Filter by tag_8
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag8(): Optional<String> = tag8.getOptional("tag_8")

        /**
         * Filter by tag_9
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag9(): Optional<String> = tag9.getOptional("tag_9")

        /**
         * Maximum number of results to return
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topK(): Optional<Long> = topK.getOptional("top_k")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [tag1].
         *
         * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_1") @ExcludeMissing fun _tag1(): JsonField<String> = tag1

        /**
         * Returns the raw JSON value of [tag10].
         *
         * Unlike [tag10], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_10") @ExcludeMissing fun _tag10(): JsonField<String> = tag10

        /**
         * Returns the raw JSON value of [tag11].
         *
         * Unlike [tag11], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_11") @ExcludeMissing fun _tag11(): JsonField<String> = tag11

        /**
         * Returns the raw JSON value of [tag12].
         *
         * Unlike [tag12], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_12") @ExcludeMissing fun _tag12(): JsonField<String> = tag12

        /**
         * Returns the raw JSON value of [tag2].
         *
         * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_2") @ExcludeMissing fun _tag2(): JsonField<String> = tag2

        /**
         * Returns the raw JSON value of [tag3].
         *
         * Unlike [tag3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_3") @ExcludeMissing fun _tag3(): JsonField<String> = tag3

        /**
         * Returns the raw JSON value of [tag4].
         *
         * Unlike [tag4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_4") @ExcludeMissing fun _tag4(): JsonField<String> = tag4

        /**
         * Returns the raw JSON value of [tag5].
         *
         * Unlike [tag5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_5") @ExcludeMissing fun _tag5(): JsonField<String> = tag5

        /**
         * Returns the raw JSON value of [tag6].
         *
         * Unlike [tag6], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_6") @ExcludeMissing fun _tag6(): JsonField<String> = tag6

        /**
         * Returns the raw JSON value of [tag7].
         *
         * Unlike [tag7], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_7") @ExcludeMissing fun _tag7(): JsonField<String> = tag7

        /**
         * Returns the raw JSON value of [tag8].
         *
         * Unlike [tag8], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_8") @ExcludeMissing fun _tag8(): JsonField<String> = tag8

        /**
         * Returns the raw JSON value of [tag9].
         *
         * Unlike [tag9], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_9") @ExcludeMissing fun _tag9(): JsonField<String> = tag9

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

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
             * .query()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var query: JsonField<String>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var tag1: JsonField<String> = JsonMissing.of()
            private var tag10: JsonField<String> = JsonMissing.of()
            private var tag11: JsonField<String> = JsonMissing.of()
            private var tag12: JsonField<String> = JsonMissing.of()
            private var tag2: JsonField<String> = JsonMissing.of()
            private var tag3: JsonField<String> = JsonMissing.of()
            private var tag4: JsonField<String> = JsonMissing.of()
            private var tag5: JsonField<String> = JsonMissing.of()
            private var tag6: JsonField<String> = JsonMissing.of()
            private var tag7: JsonField<String> = JsonMissing.of()
            private var tag8: JsonField<String> = JsonMissing.of()
            private var tag9: JsonField<String> = JsonMissing.of()
            private var topK: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                category = body.category
                tag1 = body.tag1
                tag10 = body.tag10
                tag11 = body.tag11
                tag12 = body.tag12
                tag2 = body.tag2
                tag3 = body.tag3
                tag4 = body.tag4
                tag5 = body.tag5
                tag6 = body.tag6
                tag7 = body.tag7
                tag8 = body.tag8
                tag9 = body.tag9
                topK = body.topK
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Search query for semantic matching */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Filter by category */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Filter by tag_1 */
            fun tag1(tag1: String) = tag1(JsonField.of(tag1))

            /**
             * Sets [Builder.tag1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

            /** Filter by tag_10 */
            fun tag10(tag10: String) = tag10(JsonField.of(tag10))

            /**
             * Sets [Builder.tag10] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag10] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag10(tag10: JsonField<String>) = apply { this.tag10 = tag10 }

            /** Filter by tag_11 */
            fun tag11(tag11: String) = tag11(JsonField.of(tag11))

            /**
             * Sets [Builder.tag11] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag11] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag11(tag11: JsonField<String>) = apply { this.tag11 = tag11 }

            /** Filter by tag_12 */
            fun tag12(tag12: String) = tag12(JsonField.of(tag12))

            /**
             * Sets [Builder.tag12] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag12] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag12(tag12: JsonField<String>) = apply { this.tag12 = tag12 }

            /** Filter by tag_2 */
            fun tag2(tag2: String) = tag2(JsonField.of(tag2))

            /**
             * Sets [Builder.tag2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

            /** Filter by tag_3 */
            fun tag3(tag3: String) = tag3(JsonField.of(tag3))

            /**
             * Sets [Builder.tag3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag3] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag3(tag3: JsonField<String>) = apply { this.tag3 = tag3 }

            /** Filter by tag_4 */
            fun tag4(tag4: String) = tag4(JsonField.of(tag4))

            /**
             * Sets [Builder.tag4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag4] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag4(tag4: JsonField<String>) = apply { this.tag4 = tag4 }

            /** Filter by tag_5 */
            fun tag5(tag5: String) = tag5(JsonField.of(tag5))

            /**
             * Sets [Builder.tag5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag5] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag5(tag5: JsonField<String>) = apply { this.tag5 = tag5 }

            /** Filter by tag_6 */
            fun tag6(tag6: String) = tag6(JsonField.of(tag6))

            /**
             * Sets [Builder.tag6] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag6] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag6(tag6: JsonField<String>) = apply { this.tag6 = tag6 }

            /** Filter by tag_7 */
            fun tag7(tag7: String) = tag7(JsonField.of(tag7))

            /**
             * Sets [Builder.tag7] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag7] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag7(tag7: JsonField<String>) = apply { this.tag7 = tag7 }

            /** Filter by tag_8 */
            fun tag8(tag8: String) = tag8(JsonField.of(tag8))

            /**
             * Sets [Builder.tag8] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag8] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag8(tag8: JsonField<String>) = apply { this.tag8 = tag8 }

            /** Filter by tag_9 */
            fun tag9(tag9: String) = tag9(JsonField.of(tag9))

            /**
             * Sets [Builder.tag9] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag9] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag9(tag9: JsonField<String>) = apply { this.tag9 = tag9 }

            /** Maximum number of results to return */
            fun topK(topK: Long) = topK(JsonField.of(topK))

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

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
             * .query()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("query", query),
                    category,
                    tag1,
                    tag10,
                    tag11,
                    tag12,
                    tag2,
                    tag3,
                    tag4,
                    tag5,
                    tag6,
                    tag7,
                    tag8,
                    tag9,
                    topK,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query()
            category()
            tag1()
            tag10()
            tag11()
            tag12()
            tag2()
            tag3()
            tag4()
            tag5()
            tag6()
            tag7()
            tag8()
            tag9()
            topK()
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
            (if (query.asKnown().isPresent) 1 else 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (tag1.asKnown().isPresent) 1 else 0) +
                (if (tag10.asKnown().isPresent) 1 else 0) +
                (if (tag11.asKnown().isPresent) 1 else 0) +
                (if (tag12.asKnown().isPresent) 1 else 0) +
                (if (tag2.asKnown().isPresent) 1 else 0) +
                (if (tag3.asKnown().isPresent) 1 else 0) +
                (if (tag4.asKnown().isPresent) 1 else 0) +
                (if (tag5.asKnown().isPresent) 1 else 0) +
                (if (tag6.asKnown().isPresent) 1 else 0) +
                (if (tag7.asKnown().isPresent) 1 else 0) +
                (if (tag8.asKnown().isPresent) 1 else 0) +
                (if (tag9.asKnown().isPresent) 1 else 0) +
                (if (topK.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                category == other.category &&
                tag1 == other.tag1 &&
                tag10 == other.tag10 &&
                tag11 == other.tag11 &&
                tag12 == other.tag12 &&
                tag2 == other.tag2 &&
                tag3 == other.tag3 &&
                tag4 == other.tag4 &&
                tag5 == other.tag5 &&
                tag6 == other.tag6 &&
                tag7 == other.tag7 &&
                tag8 == other.tag8 &&
                tag9 == other.tag9 &&
                topK == other.topK &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                query,
                category,
                tag1,
                tag10,
                tag11,
                tag12,
                tag2,
                tag3,
                tag4,
                tag5,
                tag6,
                tag7,
                tag8,
                tag9,
                topK,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, category=$category, tag1=$tag1, tag10=$tag10, tag11=$tag11, tag12=$tag12, tag2=$tag2, tag3=$tag3, tag4=$tag4, tag5=$tag5, tag6=$tag6, tag7=$tag7, tag8=$tag8, tag9=$tag9, topK=$topK, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SearchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1SearchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
