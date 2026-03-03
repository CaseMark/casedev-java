// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.llm.v1.chat

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
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
 * Create a completion for the provided prompt and parameters. Compatible with OpenAI's chat
 * completions API. Supports 40+ models including GPT-4, Claude, Gemini, and CaseMark legal AI
 * models. Includes streaming support, token counting, and usage tracking.
 */
class ChatCreateCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of messages comprising the conversation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * CaseMark-only: when true, allows reasoning fields in responses. Defaults to false (reasoning
     * is suppressed).
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun casemarkShowReasoning(): Optional<Boolean> = body.casemarkShowReasoning()

    /**
     * Frequency penalty parameter
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Optional<Double> = body.frequencyPenalty()

    /**
     * Maximum number of tokens to generate
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = body.maxTokens()

    /**
     * Model to use for completion. Defaults to casemark/casemark-core-6 if not specified
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Presence penalty parameter
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Optional<Double> = body.presencePenalty()

    /**
     * Whether to stream back partial progress
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * Sampling temperature between 0 and 2
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = body.temperature()

    /**
     * Nucleus sampling parameter
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Double> = body.topP()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [casemarkShowReasoning].
     *
     * Unlike [casemarkShowReasoning], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _casemarkShowReasoning(): JsonField<Boolean> = body._casemarkShowReasoning()

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frequencyPenalty(): JsonField<Double> = body._frequencyPenalty()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _presencePenalty(): JsonField<Double> = body._presencePenalty()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Double> = body._topP()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatCreateCompletionParams].
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCreateCompletionParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chatCreateCompletionParams: ChatCreateCompletionParams) = apply {
            body = chatCreateCompletionParams.body.toBuilder()
            additionalHeaders = chatCreateCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = chatCreateCompletionParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [casemarkShowReasoning]
         * - [frequencyPenalty]
         * - [maxTokens]
         * - [model]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of messages comprising the conversation */
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

        /**
         * CaseMark-only: when true, allows reasoning fields in responses. Defaults to false
         * (reasoning is suppressed).
         */
        fun casemarkShowReasoning(casemarkShowReasoning: Boolean) = apply {
            body.casemarkShowReasoning(casemarkShowReasoning)
        }

        /**
         * Sets [Builder.casemarkShowReasoning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.casemarkShowReasoning] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun casemarkShowReasoning(casemarkShowReasoning: JsonField<Boolean>) = apply {
            body.casemarkShowReasoning(casemarkShowReasoning)
        }

        /** Frequency penalty parameter */
        fun frequencyPenalty(frequencyPenalty: Double) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /** Maximum number of tokens to generate */
        fun maxTokens(maxTokens: Long) = apply { body.maxTokens(maxTokens) }

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        /** Model to use for completion. Defaults to casemark/casemark-core-6 if not specified */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Presence penalty parameter */
        fun presencePenalty(presencePenalty: Double) = apply {
            body.presencePenalty(presencePenalty)
        }

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            body.presencePenalty(presencePenalty)
        }

        /** Whether to stream back partial progress */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /** Sampling temperature between 0 and 2 */
        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        /** Nucleus sampling parameter */
        fun topP(topP: Double) = apply { body.topP(topP) }

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { body.topP(topP) }

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
         * Returns an immutable instance of [ChatCreateCompletionParams].
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
        fun build(): ChatCreateCompletionParams =
            ChatCreateCompletionParams(
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
        private val messages: JsonField<List<Message>>,
        private val casemarkShowReasoning: JsonField<Boolean>,
        private val frequencyPenalty: JsonField<Double>,
        private val maxTokens: JsonField<Long>,
        private val model: JsonField<String>,
        private val presencePenalty: JsonField<Double>,
        private val stream: JsonField<Boolean>,
        private val temperature: JsonField<Double>,
        private val topP: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("casemark_show_reasoning")
            @ExcludeMissing
            casemarkShowReasoning: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        ) : this(
            messages,
            casemarkShowReasoning,
            frequencyPenalty,
            maxTokens,
            model,
            presencePenalty,
            stream,
            temperature,
            topP,
            mutableMapOf(),
        )

        /**
         * List of messages comprising the conversation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * CaseMark-only: when true, allows reasoning fields in responses. Defaults to false
         * (reasoning is suppressed).
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun casemarkShowReasoning(): Optional<Boolean> =
            casemarkShowReasoning.getOptional("casemark_show_reasoning")

        /**
         * Frequency penalty parameter
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequencyPenalty(): Optional<Double> = frequencyPenalty.getOptional("frequency_penalty")

        /**
         * Maximum number of tokens to generate
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxTokens(): Optional<Long> = maxTokens.getOptional("max_tokens")

        /**
         * Model to use for completion. Defaults to casemark/casemark-core-6 if not specified
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Presence penalty parameter
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun presencePenalty(): Optional<Double> = presencePenalty.getOptional("presence_penalty")

        /**
         * Whether to stream back partial progress
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stream(): Optional<Boolean> = stream.getOptional("stream")

        /**
         * Sampling temperature between 0 and 2
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Double> = temperature.getOptional("temperature")

        /**
         * Nucleus sampling parameter
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topP(): Optional<Double> = topP.getOptional("top_p")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [casemarkShowReasoning].
         *
         * Unlike [casemarkShowReasoning], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("casemark_show_reasoning")
        @ExcludeMissing
        fun _casemarkShowReasoning(): JsonField<Boolean> = casemarkShowReasoning

        /**
         * Returns the raw JSON value of [frequencyPenalty].
         *
         * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

        /**
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [presencePenalty].
         *
         * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        fun _presencePenalty(): JsonField<Double> = presencePenalty

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

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
            private var casemarkShowReasoning: JsonField<Boolean> = JsonMissing.of()
            private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var presencePenalty: JsonField<Double> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                casemarkShowReasoning = body.casemarkShowReasoning
                frequencyPenalty = body.frequencyPenalty
                maxTokens = body.maxTokens
                model = body.model
                presencePenalty = body.presencePenalty
                stream = body.stream
                temperature = body.temperature
                topP = body.topP
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of messages comprising the conversation */
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

            /**
             * CaseMark-only: when true, allows reasoning fields in responses. Defaults to false
             * (reasoning is suppressed).
             */
            fun casemarkShowReasoning(casemarkShowReasoning: Boolean) =
                casemarkShowReasoning(JsonField.of(casemarkShowReasoning))

            /**
             * Sets [Builder.casemarkShowReasoning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.casemarkShowReasoning] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun casemarkShowReasoning(casemarkShowReasoning: JsonField<Boolean>) = apply {
                this.casemarkShowReasoning = casemarkShowReasoning
            }

            /** Frequency penalty parameter */
            fun frequencyPenalty(frequencyPenalty: Double) =
                frequencyPenalty(JsonField.of(frequencyPenalty))

            /**
             * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                this.frequencyPenalty = frequencyPenalty
            }

            /** Maximum number of tokens to generate */
            fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

            /**
             * Model to use for completion. Defaults to casemark/casemark-core-6 if not specified
             */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Presence penalty parameter */
            fun presencePenalty(presencePenalty: Double) =
                presencePenalty(JsonField.of(presencePenalty))

            /**
             * Sets [Builder.presencePenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                this.presencePenalty = presencePenalty
            }

            /** Whether to stream back partial progress */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /** Sampling temperature between 0 and 2 */
            fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            /** Nucleus sampling parameter */
            fun topP(topP: Double) = topP(JsonField.of(topP))

            /**
             * Sets [Builder.topP] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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
                    casemarkShowReasoning,
                    frequencyPenalty,
                    maxTokens,
                    model,
                    presencePenalty,
                    stream,
                    temperature,
                    topP,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            casemarkShowReasoning()
            frequencyPenalty()
            maxTokens()
            model()
            presencePenalty()
            stream()
            temperature()
            topP()
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
                (if (casemarkShowReasoning.asKnown().isPresent) 1 else 0) +
                (if (frequencyPenalty.asKnown().isPresent) 1 else 0) +
                (if (maxTokens.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (presencePenalty.asKnown().isPresent) 1 else 0) +
                (if (stream.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (if (topP.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messages == other.messages &&
                casemarkShowReasoning == other.casemarkShowReasoning &&
                frequencyPenalty == other.frequencyPenalty &&
                maxTokens == other.maxTokens &&
                model == other.model &&
                presencePenalty == other.presencePenalty &&
                stream == other.stream &&
                temperature == other.temperature &&
                topP == other.topP &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messages,
                casemarkShowReasoning,
                frequencyPenalty,
                maxTokens,
                model,
                presencePenalty,
                stream,
                temperature,
                topP,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, casemarkShowReasoning=$casemarkShowReasoning, frequencyPenalty=$frequencyPenalty, maxTokens=$maxTokens, model=$model, presencePenalty=$presencePenalty, stream=$stream, temperature=$temperature, topP=$topP, additionalProperties=$additionalProperties}"
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
         * The contents of the message
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * The role of the message author
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): Optional<Role> = role.getOptional("role")

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

            /** Returns a mutable builder for constructing an instance of [Message]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var content: JsonField<String> = JsonMissing.of()
            private var role: JsonField<Role> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                content = message.content
                role = message.role
                additionalProperties = message.additionalProperties.toMutableMap()
            }

            /** The contents of the message */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** The role of the message author */
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
             */
            fun build(): Message = Message(content, role, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            content()
            role().ifPresent { it.validate() }
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

        /** The role of the message author */
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

                @JvmField val SYSTEM = of("system")

                @JvmField val USER = of("user")

                @JvmField val ASSISTANT = of("assistant")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                SYSTEM,
                USER,
                ASSISTANT,
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
                SYSTEM,
                USER,
                ASSISTANT,
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
                    SYSTEM -> Value.SYSTEM
                    USER -> Value.USER
                    ASSISTANT -> Value.ASSISTANT
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
                    SYSTEM -> Known.SYSTEM
                    USER -> Known.USER
                    ASSISTANT -> Known.ASSISTANT
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCreateCompletionParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChatCreateCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
