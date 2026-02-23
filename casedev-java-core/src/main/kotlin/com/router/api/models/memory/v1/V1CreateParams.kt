// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.Enum
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.Params
import com.router.api.core.checkKnown
import com.router.api.core.checkRequired
import com.router.api.core.http.Headers
import com.router.api.core.http.QueryParams
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Store memories from conversation messages. Automatically extracts facts and handles
 * deduplication.
 *
 * Use tag_1 through tag_12 for filtering - these are generic indexed fields you can use for any
 * purpose:
 * - Legal app: tag_1=client_id, tag_2=matter_id
 * - Healthcare: tag_1=patient_id, tag_2=encounter_id
 * - E-commerce: tag_1=customer_id, tag_2=order_id
 */
class V1CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Conversation messages to extract memories from
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * Custom category (e.g., "fact", "preference", "deadline")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<String> = body.category()

    /**
     * Optional custom prompt for fact extraction
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extractionPrompt(): Optional<String> = body.extractionPrompt()

    /**
     * Whether to extract facts from messages (default: true)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun infer(): Optional<Boolean> = body.infer()

    /**
     * Additional metadata (not indexed)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Generic indexed filter field 1 (you decide what it means)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag1(): Optional<String> = body.tag1()

    /**
     * Generic indexed filter field 10
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag10(): Optional<String> = body.tag10()

    /**
     * Generic indexed filter field 11
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag11(): Optional<String> = body.tag11()

    /**
     * Generic indexed filter field 12
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag12(): Optional<String> = body.tag12()

    /**
     * Generic indexed filter field 2
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag2(): Optional<String> = body.tag2()

    /**
     * Generic indexed filter field 3
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag3(): Optional<String> = body.tag3()

    /**
     * Generic indexed filter field 4
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag4(): Optional<String> = body.tag4()

    /**
     * Generic indexed filter field 5
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag5(): Optional<String> = body.tag5()

    /**
     * Generic indexed filter field 6
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag6(): Optional<String> = body.tag6()

    /**
     * Generic indexed filter field 7
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag7(): Optional<String> = body.tag7()

    /**
     * Generic indexed filter field 8
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag8(): Optional<String> = body.tag8()

    /**
     * Generic indexed filter field 9
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag9(): Optional<String> = body.tag9()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<String> = body._category()

    /**
     * Returns the raw JSON value of [extractionPrompt].
     *
     * Unlike [extractionPrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _extractionPrompt(): JsonField<String> = body._extractionPrompt()

    /**
     * Returns the raw JSON value of [infer].
     *
     * Unlike [infer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _infer(): JsonField<Boolean> = body._infer()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1CreateParams].
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CreateParams: V1CreateParams) = apply {
            body = v1CreateParams.body.toBuilder()
            additionalHeaders = v1CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [category]
         * - [extractionPrompt]
         * - [infer]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Conversation messages to extract memories from */
        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** Custom category (e.g., "fact", "preference", "deadline") */
        fun category(category: String) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { body.category(category) }

        /** Optional custom prompt for fact extraction */
        fun extractionPrompt(extractionPrompt: String) = apply {
            body.extractionPrompt(extractionPrompt)
        }

        /**
         * Sets [Builder.extractionPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractionPrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extractionPrompt(extractionPrompt: JsonField<String>) = apply {
            body.extractionPrompt(extractionPrompt)
        }

        /** Whether to extract facts from messages (default: true) */
        fun infer(infer: Boolean) = apply { body.infer(infer) }

        /**
         * Sets [Builder.infer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infer] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun infer(infer: JsonField<Boolean>) = apply { body.infer(infer) }

        /** Additional metadata (not indexed) */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Generic indexed filter field 1 (you decide what it means) */
        fun tag1(tag1: String) = apply { body.tag1(tag1) }

        /**
         * Sets [Builder.tag1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag1(tag1: JsonField<String>) = apply { body.tag1(tag1) }

        /** Generic indexed filter field 10 */
        fun tag10(tag10: String) = apply { body.tag10(tag10) }

        /**
         * Sets [Builder.tag10] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag10] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag10(tag10: JsonField<String>) = apply { body.tag10(tag10) }

        /** Generic indexed filter field 11 */
        fun tag11(tag11: String) = apply { body.tag11(tag11) }

        /**
         * Sets [Builder.tag11] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag11] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag11(tag11: JsonField<String>) = apply { body.tag11(tag11) }

        /** Generic indexed filter field 12 */
        fun tag12(tag12: String) = apply { body.tag12(tag12) }

        /**
         * Sets [Builder.tag12] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag12] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag12(tag12: JsonField<String>) = apply { body.tag12(tag12) }

        /** Generic indexed filter field 2 */
        fun tag2(tag2: String) = apply { body.tag2(tag2) }

        /**
         * Sets [Builder.tag2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag2(tag2: JsonField<String>) = apply { body.tag2(tag2) }

        /** Generic indexed filter field 3 */
        fun tag3(tag3: String) = apply { body.tag3(tag3) }

        /**
         * Sets [Builder.tag3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag3] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag3(tag3: JsonField<String>) = apply { body.tag3(tag3) }

        /** Generic indexed filter field 4 */
        fun tag4(tag4: String) = apply { body.tag4(tag4) }

        /**
         * Sets [Builder.tag4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag4(tag4: JsonField<String>) = apply { body.tag4(tag4) }

        /** Generic indexed filter field 5 */
        fun tag5(tag5: String) = apply { body.tag5(tag5) }

        /**
         * Sets [Builder.tag5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag5(tag5: JsonField<String>) = apply { body.tag5(tag5) }

        /** Generic indexed filter field 6 */
        fun tag6(tag6: String) = apply { body.tag6(tag6) }

        /**
         * Sets [Builder.tag6] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag6] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag6(tag6: JsonField<String>) = apply { body.tag6(tag6) }

        /** Generic indexed filter field 7 */
        fun tag7(tag7: String) = apply { body.tag7(tag7) }

        /**
         * Sets [Builder.tag7] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag7] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag7(tag7: JsonField<String>) = apply { body.tag7(tag7) }

        /** Generic indexed filter field 8 */
        fun tag8(tag8: String) = apply { body.tag8(tag8) }

        /**
         * Sets [Builder.tag8] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag8] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag8(tag8: JsonField<String>) = apply { body.tag8(tag8) }

        /** Generic indexed filter field 9 */
        fun tag9(tag9: String) = apply { body.tag9(tag9) }

        /**
         * Sets [Builder.tag9] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag9] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag9(tag9: JsonField<String>) = apply { body.tag9(tag9) }

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
         * Returns an immutable instance of [V1CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1CreateParams =
            V1CreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val messages: JsonField<List<Message>>,
        private val category: JsonField<String>,
        private val extractionPrompt: JsonField<String>,
        private val infer: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extraction_prompt")
            @ExcludeMissing
            extractionPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("infer") @ExcludeMissing infer: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
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
        ) : this(
            messages,
            category,
            extractionPrompt,
            infer,
            metadata,
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
            mutableMapOf(),
        )

        /**
         * Conversation messages to extract memories from
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * Custom category (e.g., "fact", "preference", "deadline")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Optional custom prompt for fact extraction
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extractionPrompt(): Optional<String> = extractionPrompt.getOptional("extraction_prompt")

        /**
         * Whether to extract facts from messages (default: true)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun infer(): Optional<Boolean> = infer.getOptional("infer")

        /**
         * Additional metadata (not indexed)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Generic indexed filter field 1 (you decide what it means)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag1(): Optional<String> = tag1.getOptional("tag_1")

        /**
         * Generic indexed filter field 10
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag10(): Optional<String> = tag10.getOptional("tag_10")

        /**
         * Generic indexed filter field 11
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag11(): Optional<String> = tag11.getOptional("tag_11")

        /**
         * Generic indexed filter field 12
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag12(): Optional<String> = tag12.getOptional("tag_12")

        /**
         * Generic indexed filter field 2
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag2(): Optional<String> = tag2.getOptional("tag_2")

        /**
         * Generic indexed filter field 3
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag3(): Optional<String> = tag3.getOptional("tag_3")

        /**
         * Generic indexed filter field 4
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag4(): Optional<String> = tag4.getOptional("tag_4")

        /**
         * Generic indexed filter field 5
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag5(): Optional<String> = tag5.getOptional("tag_5")

        /**
         * Generic indexed filter field 6
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag6(): Optional<String> = tag6.getOptional("tag_6")

        /**
         * Generic indexed filter field 7
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag7(): Optional<String> = tag7.getOptional("tag_7")

        /**
         * Generic indexed filter field 8
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag8(): Optional<String> = tag8.getOptional("tag_8")

        /**
         * Generic indexed filter field 9
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tag9(): Optional<String> = tag9.getOptional("tag_9")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [extractionPrompt].
         *
         * Unlike [extractionPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extraction_prompt")
        @ExcludeMissing
        fun _extractionPrompt(): JsonField<String> = extractionPrompt

        /**
         * Returns the raw JSON value of [infer].
         *
         * Unlike [infer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("infer") @ExcludeMissing fun _infer(): JsonField<Boolean> = infer

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * .messages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var extractionPrompt: JsonField<String> = JsonMissing.of()
            private var infer: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                category = body.category
                extractionPrompt = body.extractionPrompt
                infer = body.infer
                metadata = body.metadata
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
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Conversation messages to extract memories from */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /** Custom category (e.g., "fact", "preference", "deadline") */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Optional custom prompt for fact extraction */
            fun extractionPrompt(extractionPrompt: String) =
                extractionPrompt(JsonField.of(extractionPrompt))

            /**
             * Sets [Builder.extractionPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractionPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extractionPrompt(extractionPrompt: JsonField<String>) = apply {
                this.extractionPrompt = extractionPrompt
            }

            /** Whether to extract facts from messages (default: true) */
            fun infer(infer: Boolean) = infer(JsonField.of(infer))

            /**
             * Sets [Builder.infer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.infer] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun infer(infer: JsonField<Boolean>) = apply { this.infer = infer }

            /** Additional metadata (not indexed) */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Generic indexed filter field 1 (you decide what it means) */
            fun tag1(tag1: String) = tag1(JsonField.of(tag1))

            /**
             * Sets [Builder.tag1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

            /** Generic indexed filter field 10 */
            fun tag10(tag10: String) = tag10(JsonField.of(tag10))

            /**
             * Sets [Builder.tag10] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag10] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag10(tag10: JsonField<String>) = apply { this.tag10 = tag10 }

            /** Generic indexed filter field 11 */
            fun tag11(tag11: String) = tag11(JsonField.of(tag11))

            /**
             * Sets [Builder.tag11] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag11] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag11(tag11: JsonField<String>) = apply { this.tag11 = tag11 }

            /** Generic indexed filter field 12 */
            fun tag12(tag12: String) = tag12(JsonField.of(tag12))

            /**
             * Sets [Builder.tag12] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag12] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tag12(tag12: JsonField<String>) = apply { this.tag12 = tag12 }

            /** Generic indexed filter field 2 */
            fun tag2(tag2: String) = tag2(JsonField.of(tag2))

            /**
             * Sets [Builder.tag2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

            /** Generic indexed filter field 3 */
            fun tag3(tag3: String) = tag3(JsonField.of(tag3))

            /**
             * Sets [Builder.tag3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag3] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag3(tag3: JsonField<String>) = apply { this.tag3 = tag3 }

            /** Generic indexed filter field 4 */
            fun tag4(tag4: String) = tag4(JsonField.of(tag4))

            /**
             * Sets [Builder.tag4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag4] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag4(tag4: JsonField<String>) = apply { this.tag4 = tag4 }

            /** Generic indexed filter field 5 */
            fun tag5(tag5: String) = tag5(JsonField.of(tag5))

            /**
             * Sets [Builder.tag5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag5] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag5(tag5: JsonField<String>) = apply { this.tag5 = tag5 }

            /** Generic indexed filter field 6 */
            fun tag6(tag6: String) = tag6(JsonField.of(tag6))

            /**
             * Sets [Builder.tag6] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag6] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag6(tag6: JsonField<String>) = apply { this.tag6 = tag6 }

            /** Generic indexed filter field 7 */
            fun tag7(tag7: String) = tag7(JsonField.of(tag7))

            /**
             * Sets [Builder.tag7] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag7] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag7(tag7: JsonField<String>) = apply { this.tag7 = tag7 }

            /** Generic indexed filter field 8 */
            fun tag8(tag8: String) = tag8(JsonField.of(tag8))

            /**
             * Sets [Builder.tag8] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag8] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag8(tag8: JsonField<String>) = apply { this.tag8 = tag8 }

            /** Generic indexed filter field 9 */
            fun tag9(tag9: String) = tag9(JsonField.of(tag9))

            /**
             * Sets [Builder.tag9] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag9] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag9(tag9: JsonField<String>) = apply { this.tag9 = tag9 }

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
             * .messages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    category,
                    extractionPrompt,
                    infer,
                    metadata,
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            category()
            extractionPrompt()
            infer()
            metadata().ifPresent { it.validate() }
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
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (extractionPrompt.asKnown().isPresent) 1 else 0) +
                (if (infer.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
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
                (if (tag9.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messages == other.messages &&
                category == other.category &&
                extractionPrompt == other.extractionPrompt &&
                infer == other.infer &&
                metadata == other.metadata &&
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
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messages,
                category,
                extractionPrompt,
                infer,
                metadata,
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, category=$category, extractionPrompt=$extractionPrompt, infer=$infer, metadata=$metadata, tag1=$tag1, tag10=$tag10, tag11=$tag11, tag12=$tag12, tag2=$tag2, tag3=$tag3, tag4=$tag4, tag5=$tag5, tag6=$tag6, tag7=$tag7, tag8=$tag8, tag9=$tag9, additionalProperties=$additionalProperties}"
    }

    class Message
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<String>,
        private val role: JsonField<Role>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        ) : this(content, role, mutableMapOf())

        /**
         * Message content
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): String = content.getRequired("content")

        /**
         * Message role
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): Role = role.getRequired("role")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

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
             * Returns a mutable builder for constructing an instance of [Message].
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var content: JsonField<String>? = null
            private var role: JsonField<Role>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                content = message.content
                role = message.role
                additionalProperties = message.additionalProperties.toMutableMap()
            }

            /** Message content */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** Message role */
            fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Message =
                Message(
                    checkRequired("content", content),
                    checkRequired("role", role),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            content()
            role().validate()
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
            (if (content.asKnown().isPresent) 1 else 0) +
                (role.asKnown().getOrNull()?.validity() ?: 0)

        /** Message role */
        class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val USER = of("user")

                @JvmField val ASSISTANT = of("assistant")

                @JvmField val SYSTEM = of("system")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                USER,
                ASSISTANT,
                SYSTEM,
            }

            /**
             * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Role] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USER,
                ASSISTANT,
                SYSTEM,
                /** An enum member indicating that [Role] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    USER -> Value.USER
                    ASSISTANT -> Value.ASSISTANT
                    SYSTEM -> Value.SYSTEM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    USER -> Known.USER
                    ASSISTANT -> Known.ASSISTANT
                    SYSTEM -> Known.SYSTEM
                    else -> throw CasedevInvalidDataException("Unknown Role: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Role = apply {
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

                return other is Role && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                content == other.content &&
                role == other.role &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata (not indexed) */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1CreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1CreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
