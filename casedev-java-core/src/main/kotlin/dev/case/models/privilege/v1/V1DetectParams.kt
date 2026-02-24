// File generated from our OpenAPI spec by Stainless.

package dev.case.models.privilege.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.Enum
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.Params
import dev.case.core.checkKnown
import dev.case.core.http.Headers
import dev.case.core.http.QueryParams
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Analyzes text or vault documents for legal privilege. Detects attorney-client privilege, work
 * product doctrine, common interest privilege, and litigation hold materials.
 *
 * Returns structured privilege flags with confidence scores and policy-friendly rationale suitable
 * for discovery workflows and privilege logs.
 *
 * **Size Limit:** Maximum 200,000 characters (larger documents rejected).
 *
 * **Permissions:** Requires `chat` permission. When using `document_id`, also requires `vault`
 * permission.
 *
 * **Note:** When analyzing vault documents, results are automatically stored in the document's
 * `privilege_analysis` metadata field.
 */
class V1DetectParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Privilege categories to check. Defaults to all: attorney_client, work_product,
     * common_interest, litigation_hold
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<List<Category>> = body.categories()

    /**
     * Text content to analyze (required if document_id not provided)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = body.content()

    /**
     * Vault object ID to analyze (required if content not provided)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentId(): Optional<String> = body.documentId()

    /**
     * Include detailed rationale for each category
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeRationale(): Optional<Boolean> = body.includeRationale()

    /**
     * Jurisdiction for privilege rules
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdiction(): Optional<Jurisdiction> = body.jurisdiction()

    /**
     * LLM model to use for analysis
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Vault ID (required when using document_id)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultId(): Optional<String> = body.vaultId()

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _categories(): JsonField<List<Category>> = body._categories()

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _content(): JsonField<String> = body._content()

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentId(): JsonField<String> = body._documentId()

    /**
     * Returns the raw JSON value of [includeRationale].
     *
     * Unlike [includeRationale], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includeRationale(): JsonField<Boolean> = body._includeRationale()

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jurisdiction(): JsonField<Jurisdiction> = body._jurisdiction()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultId(): JsonField<String> = body._vaultId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1DetectParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1DetectParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DetectParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1DetectParams: V1DetectParams) = apply {
            body = v1DetectParams.body.toBuilder()
            additionalHeaders = v1DetectParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1DetectParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [categories]
         * - [content]
         * - [documentId]
         * - [includeRationale]
         * - [jurisdiction]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Privilege categories to check. Defaults to all: attorney_client, work_product,
         * common_interest, litigation_hold
         */
        fun categories(categories: List<Category>) = apply { body.categories(categories) }

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<Category>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<List<Category>>) = apply {
            body.categories(categories)
        }

        /**
         * Adds a single [Category] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: Category) = apply { body.addCategory(category) }

        /** Text content to analyze (required if document_id not provided) */
        fun content(content: String) = apply { body.content(content) }

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { body.content(content) }

        /** Vault object ID to analyze (required if content not provided) */
        fun documentId(documentId: String) = apply { body.documentId(documentId) }

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { body.documentId(documentId) }

        /** Include detailed rationale for each category */
        fun includeRationale(includeRationale: Boolean) = apply {
            body.includeRationale(includeRationale)
        }

        /**
         * Sets [Builder.includeRationale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeRationale] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeRationale(includeRationale: JsonField<Boolean>) = apply {
            body.includeRationale(includeRationale)
        }

        /** Jurisdiction for privilege rules */
        fun jurisdiction(jurisdiction: Jurisdiction) = apply { body.jurisdiction(jurisdiction) }

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [Jurisdiction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jurisdiction(jurisdiction: JsonField<Jurisdiction>) = apply {
            body.jurisdiction(jurisdiction)
        }

        /** LLM model to use for analysis */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Vault ID (required when using document_id) */
        fun vaultId(vaultId: String) = apply { body.vaultId(vaultId) }

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { body.vaultId(vaultId) }

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
         * Returns an immutable instance of [V1DetectParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1DetectParams =
            V1DetectParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val categories: JsonField<List<Category>>,
        private val content: JsonField<String>,
        private val documentId: JsonField<String>,
        private val includeRationale: JsonField<Boolean>,
        private val jurisdiction: JsonField<Jurisdiction>,
        private val model: JsonField<String>,
        private val vaultId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<Category>> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("include_rationale")
            @ExcludeMissing
            includeRationale: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("jurisdiction")
            @ExcludeMissing
            jurisdiction: JsonField<Jurisdiction> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
        ) : this(
            categories,
            content,
            documentId,
            includeRationale,
            jurisdiction,
            model,
            vaultId,
            mutableMapOf(),
        )

        /**
         * Privilege categories to check. Defaults to all: attorney_client, work_product,
         * common_interest, litigation_hold
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categories(): Optional<List<Category>> = categories.getOptional("categories")

        /**
         * Text content to analyze (required if document_id not provided)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * Vault object ID to analyze (required if content not provided)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentId(): Optional<String> = documentId.getOptional("document_id")

        /**
         * Include detailed rationale for each category
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeRationale(): Optional<Boolean> =
            includeRationale.getOptional("include_rationale")

        /**
         * Jurisdiction for privilege rules
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jurisdiction(): Optional<Jurisdiction> = jurisdiction.getOptional("jurisdiction")

        /**
         * LLM model to use for analysis
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Vault ID (required when using document_id)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultId(): Optional<String> = vaultId.getOptional("vault_id")

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<Category>> = categories

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        /**
         * Returns the raw JSON value of [includeRationale].
         *
         * Unlike [includeRationale], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_rationale")
        @ExcludeMissing
        fun _includeRationale(): JsonField<Boolean> = includeRationale

        /**
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<Jurisdiction> = jurisdiction

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

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

            private var categories: JsonField<MutableList<Category>>? = null
            private var content: JsonField<String> = JsonMissing.of()
            private var documentId: JsonField<String> = JsonMissing.of()
            private var includeRationale: JsonField<Boolean> = JsonMissing.of()
            private var jurisdiction: JsonField<Jurisdiction> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var vaultId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                categories = body.categories.map { it.toMutableList() }
                content = body.content
                documentId = body.documentId
                includeRationale = body.includeRationale
                jurisdiction = body.jurisdiction
                model = body.model
                vaultId = body.vaultId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Privilege categories to check. Defaults to all: attorney_client, work_product,
             * common_interest, litigation_hold
             */
            fun categories(categories: List<Category>) = categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<Category>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<List<Category>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [Category] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: Category) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** Text content to analyze (required if document_id not provided) */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** Vault object ID to analyze (required if content not provided) */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            /** Include detailed rationale for each category */
            fun includeRationale(includeRationale: Boolean) =
                includeRationale(JsonField.of(includeRationale))

            /**
             * Sets [Builder.includeRationale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeRationale] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeRationale(includeRationale: JsonField<Boolean>) = apply {
                this.includeRationale = includeRationale
            }

            /** Jurisdiction for privilege rules */
            fun jurisdiction(jurisdiction: Jurisdiction) = jurisdiction(JsonField.of(jurisdiction))

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [Jurisdiction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<Jurisdiction>) = apply {
                this.jurisdiction = jurisdiction
            }

            /** LLM model to use for analysis */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Vault ID (required when using document_id) */
            fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

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
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    content,
                    documentId,
                    includeRationale,
                    jurisdiction,
                    model,
                    vaultId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            categories().ifPresent { it.forEach { it.validate() } }
            content()
            documentId()
            includeRationale()
            jurisdiction().ifPresent { it.validate() }
            model()
            vaultId()
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
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (content.asKnown().isPresent) 1 else 0) +
                (if (documentId.asKnown().isPresent) 1 else 0) +
                (if (includeRationale.asKnown().isPresent) 1 else 0) +
                (jurisdiction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (vaultId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                categories == other.categories &&
                content == other.content &&
                documentId == other.documentId &&
                includeRationale == other.includeRationale &&
                jurisdiction == other.jurisdiction &&
                model == other.model &&
                vaultId == other.vaultId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                categories,
                content,
                documentId,
                includeRationale,
                jurisdiction,
                model,
                vaultId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{categories=$categories, content=$content, documentId=$documentId, includeRationale=$includeRationale, jurisdiction=$jurisdiction, model=$model, vaultId=$vaultId, additionalProperties=$additionalProperties}"
    }

    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ATTORNEY_CLIENT = of("attorney_client")

            @JvmField val WORK_PRODUCT = of("work_product")

            @JvmField val COMMON_INTEREST = of("common_interest")

            @JvmField val LITIGATION_HOLD = of("litigation_hold")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            ATTORNEY_CLIENT,
            WORK_PRODUCT,
            COMMON_INTEREST,
            LITIGATION_HOLD,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ATTORNEY_CLIENT,
            WORK_PRODUCT,
            COMMON_INTEREST,
            LITIGATION_HOLD,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                ATTORNEY_CLIENT -> Value.ATTORNEY_CLIENT
                WORK_PRODUCT -> Value.WORK_PRODUCT
                COMMON_INTEREST -> Value.COMMON_INTEREST
                LITIGATION_HOLD -> Value.LITIGATION_HOLD
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
                ATTORNEY_CLIENT -> Known.ATTORNEY_CLIENT
                WORK_PRODUCT -> Known.WORK_PRODUCT
                COMMON_INTEREST -> Known.COMMON_INTEREST
                LITIGATION_HOLD -> Known.LITIGATION_HOLD
                else -> throw CasedevInvalidDataException("Unknown Category: $value")
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

        fun validate(): Category = apply {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Jurisdiction for privilege rules */
    class Jurisdiction @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val US_FEDERAL = of("US-Federal")

            @JvmStatic fun of(value: String) = Jurisdiction(JsonField.of(value))
        }

        /** An enum containing [Jurisdiction]'s known values. */
        enum class Known {
            US_FEDERAL
        }

        /**
         * An enum containing [Jurisdiction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Jurisdiction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            US_FEDERAL,
            /**
             * An enum member indicating that [Jurisdiction] was instantiated with an unknown value.
             */
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
                US_FEDERAL -> Value.US_FEDERAL
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
                US_FEDERAL -> Known.US_FEDERAL
                else -> throw CasedevInvalidDataException("Unknown Jurisdiction: $value")
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

        fun validate(): Jurisdiction = apply {
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

            return other is Jurisdiction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DetectParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1DetectParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
