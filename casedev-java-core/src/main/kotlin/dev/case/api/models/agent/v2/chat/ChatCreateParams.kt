// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

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

/**
 * Creates a persistent OpenCode chat session backed by a Daytona runtime. Session state is retained
 * and can be resumed or recovered across requests.
 */
class ChatCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Idle timeout before the runtime is eligible to stop. Defaults to 15 minutes.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idleTimeoutMs(): Optional<Long> = body.idleTimeoutMs()

    /**
     * Optional model override for the OpenCode session
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Optional human-readable session title
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * Restrict the chat session to specific vault IDs
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultIds(): Optional<List<String>> = body.vaultIds()

    /**
     * Returns the raw JSON value of [idleTimeoutMs].
     *
     * Unlike [idleTimeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idleTimeoutMs(): JsonField<Long> = body._idleTimeoutMs()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [vaultIds].
     *
     * Unlike [vaultIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultIds(): JsonField<List<String>> = body._vaultIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ChatCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChatCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chatCreateParams: ChatCreateParams) = apply {
            body = chatCreateParams.body.toBuilder()
            additionalHeaders = chatCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = chatCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [idleTimeoutMs]
         * - [model]
         * - [title]
         * - [vaultIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Idle timeout before the runtime is eligible to stop. Defaults to 15 minutes. */
        fun idleTimeoutMs(idleTimeoutMs: Long?) = apply { body.idleTimeoutMs(idleTimeoutMs) }

        /**
         * Alias for [Builder.idleTimeoutMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun idleTimeoutMs(idleTimeoutMs: Long) = idleTimeoutMs(idleTimeoutMs as Long?)

        /** Alias for calling [Builder.idleTimeoutMs] with `idleTimeoutMs.orElse(null)`. */
        fun idleTimeoutMs(idleTimeoutMs: Optional<Long>) = idleTimeoutMs(idleTimeoutMs.getOrNull())

        /**
         * Sets [Builder.idleTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleTimeoutMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idleTimeoutMs(idleTimeoutMs: JsonField<Long>) = apply {
            body.idleTimeoutMs(idleTimeoutMs)
        }

        /** Optional model override for the OpenCode session */
        fun model(model: String?) = apply { body.model(model) }

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Optional human-readable session title */
        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /** Restrict the chat session to specific vault IDs */
        fun vaultIds(vaultIds: List<String>?) = apply { body.vaultIds(vaultIds) }

        /** Alias for calling [Builder.vaultIds] with `vaultIds.orElse(null)`. */
        fun vaultIds(vaultIds: Optional<List<String>>) = vaultIds(vaultIds.getOrNull())

        /**
         * Sets [Builder.vaultIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vaultIds(vaultIds: JsonField<List<String>>) = apply { body.vaultIds(vaultIds) }

        /**
         * Adds a single [String] to [vaultIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVaultId(vaultId: String) = apply { body.addVaultId(vaultId) }

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
         * Returns an immutable instance of [ChatCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatCreateParams =
            ChatCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idleTimeoutMs: JsonField<Long>,
        private val model: JsonField<String>,
        private val title: JsonField<String>,
        private val vaultIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("idleTimeoutMs")
            @ExcludeMissing
            idleTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vaultIds")
            @ExcludeMissing
            vaultIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(idleTimeoutMs, model, title, vaultIds, mutableMapOf())

        /**
         * Idle timeout before the runtime is eligible to stop. Defaults to 15 minutes.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idleTimeoutMs(): Optional<Long> = idleTimeoutMs.getOptional("idleTimeoutMs")

        /**
         * Optional model override for the OpenCode session
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Optional human-readable session title
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Restrict the chat session to specific vault IDs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

        /**
         * Returns the raw JSON value of [idleTimeoutMs].
         *
         * Unlike [idleTimeoutMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idleTimeoutMs")
        @ExcludeMissing
        fun _idleTimeoutMs(): JsonField<Long> = idleTimeoutMs

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var idleTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var vaultIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                idleTimeoutMs = body.idleTimeoutMs
                model = body.model
                title = body.title
                vaultIds = body.vaultIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Idle timeout before the runtime is eligible to stop. Defaults to 15 minutes. */
            fun idleTimeoutMs(idleTimeoutMs: Long?) =
                idleTimeoutMs(JsonField.ofNullable(idleTimeoutMs))

            /**
             * Alias for [Builder.idleTimeoutMs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun idleTimeoutMs(idleTimeoutMs: Long) = idleTimeoutMs(idleTimeoutMs as Long?)

            /** Alias for calling [Builder.idleTimeoutMs] with `idleTimeoutMs.orElse(null)`. */
            fun idleTimeoutMs(idleTimeoutMs: Optional<Long>) =
                idleTimeoutMs(idleTimeoutMs.getOrNull())

            /**
             * Sets [Builder.idleTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idleTimeoutMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idleTimeoutMs(idleTimeoutMs: JsonField<Long>) = apply {
                this.idleTimeoutMs = idleTimeoutMs
            }

            /** Optional model override for the OpenCode session */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Optional human-readable session title */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** Restrict the chat session to specific vault IDs */
            fun vaultIds(vaultIds: List<String>?) = vaultIds(JsonField.ofNullable(vaultIds))

            /** Alias for calling [Builder.vaultIds] with `vaultIds.orElse(null)`. */
            fun vaultIds(vaultIds: Optional<List<String>>) = vaultIds(vaultIds.getOrNull())

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    idleTimeoutMs,
                    model,
                    title,
                    (vaultIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            idleTimeoutMs()
            model()
            title()
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
            (if (idleTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (vaultIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                idleTimeoutMs == other.idleTimeoutMs &&
                model == other.model &&
                title == other.title &&
                vaultIds == other.vaultIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idleTimeoutMs, model, title, vaultIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{idleTimeoutMs=$idleTimeoutMs, model=$model, title=$title, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChatCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
