// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

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
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new secure vault with dedicated S3 storage and vector search capabilities. Each vault
 * provides isolated document storage with semantic search, OCR processing, and optional GraphRAG
 * knowledge graph features for legal document analysis and discovery.
 */
class VaultCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Display name for the vault
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Optional description of the vault's purpose
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional embedding model for this vault. Defaults to casemark/embed-v1. Determines the S3
     * Vectors index dimension and which model is used at both ingest and search time. The vault is
     * locked to this model after creation — use a re-embed flow to change later. Ignored when
     * enableIndexing is false. Note: `casemark/llama-nemotron-embed-vl-1b-v2` is a deprecated alias
     * for `casemark/embed-v1` (retained for SDK backward compatibility); new integrations should
     * use `casemark/embed-v1` directly.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingModel(): Optional<EmbeddingModel> = body.embeddingModel()

    /**
     * Enable knowledge graph for entity relationship mapping. Only applies when enableIndexing is
     * true.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableGraph(): Optional<Boolean> = body.enableGraph()

    /**
     * Enable vector indexing and search capabilities. Set to false for storage-only vaults.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableIndexing(): Optional<Boolean> = body.enableIndexing()

    /**
     * Assign the vault to a vault group for access control. Required when using a group-scoped API
     * key.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = body.groupId()

    /**
     * Optional metadata to attach to the vault (e.g., { containsPHI: true } for HIPAA compliance
     * tracking)
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = vaultCreateParams.metadata().convert(MyClass.class);
     * ```
     */
    fun _metadata(): JsonValue = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [embeddingModel].
     *
     * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddingModel(): JsonField<EmbeddingModel> = body._embeddingModel()

    /**
     * Returns the raw JSON value of [enableGraph].
     *
     * Unlike [enableGraph], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableGraph(): JsonField<Boolean> = body._enableGraph()

    /**
     * Returns the raw JSON value of [enableIndexing].
     *
     * Unlike [enableIndexing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableIndexing(): JsonField<Boolean> = body._enableIndexing()

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupId(): JsonField<String> = body._groupId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VaultCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(vaultCreateParams: VaultCreateParams) = apply {
            body = vaultCreateParams.body.toBuilder()
            additionalHeaders = vaultCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = vaultCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [description]
         * - [embeddingModel]
         * - [enableGraph]
         * - [enableIndexing]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Display name for the vault */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Optional description of the vault's purpose */
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
         * Optional embedding model for this vault. Defaults to casemark/embed-v1. Determines the S3
         * Vectors index dimension and which model is used at both ingest and search time. The vault
         * is locked to this model after creation — use a re-embed flow to change later. Ignored
         * when enableIndexing is false. Note: `casemark/llama-nemotron-embed-vl-1b-v2` is a
         * deprecated alias for `casemark/embed-v1` (retained for SDK backward compatibility); new
         * integrations should use `casemark/embed-v1` directly.
         */
        fun embeddingModel(embeddingModel: EmbeddingModel) = apply {
            body.embeddingModel(embeddingModel)
        }

        /**
         * Sets [Builder.embeddingModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModel] with a well-typed [EmbeddingModel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingModel(embeddingModel: JsonField<EmbeddingModel>) = apply {
            body.embeddingModel(embeddingModel)
        }

        /**
         * Enable knowledge graph for entity relationship mapping. Only applies when enableIndexing
         * is true.
         */
        fun enableGraph(enableGraph: Boolean) = apply { body.enableGraph(enableGraph) }

        /**
         * Sets [Builder.enableGraph] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableGraph] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enableGraph(enableGraph: JsonField<Boolean>) = apply { body.enableGraph(enableGraph) }

        /** Enable vector indexing and search capabilities. Set to false for storage-only vaults. */
        fun enableIndexing(enableIndexing: Boolean) = apply { body.enableIndexing(enableIndexing) }

        /**
         * Sets [Builder.enableIndexing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableIndexing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableIndexing(enableIndexing: JsonField<Boolean>) = apply {
            body.enableIndexing(enableIndexing)
        }

        /**
         * Assign the vault to a vault group for access control. Required when using a group-scoped
         * API key.
         */
        fun groupId(groupId: String) = apply { body.groupId(groupId) }

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { body.groupId(groupId) }

        /**
         * Optional metadata to attach to the vault (e.g., { containsPHI: true } for HIPAA
         * compliance tracking)
         */
        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [VaultCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VaultCreateParams =
            VaultCreateParams(
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
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val embeddingModel: JsonField<EmbeddingModel>,
        private val enableGraph: JsonField<Boolean>,
        private val enableIndexing: JsonField<Boolean>,
        private val groupId: JsonField<String>,
        private val metadata: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("embeddingModel")
            @ExcludeMissing
            embeddingModel: JsonField<EmbeddingModel> = JsonMissing.of(),
            @JsonProperty("enableGraph")
            @ExcludeMissing
            enableGraph: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enableIndexing")
            @ExcludeMissing
            enableIndexing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("groupId") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        ) : this(
            name,
            description,
            embeddingModel,
            enableGraph,
            enableIndexing,
            groupId,
            metadata,
            mutableMapOf(),
        )

        /**
         * Display name for the vault
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional description of the vault's purpose
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional embedding model for this vault. Defaults to casemark/embed-v1. Determines the S3
         * Vectors index dimension and which model is used at both ingest and search time. The vault
         * is locked to this model after creation — use a re-embed flow to change later. Ignored
         * when enableIndexing is false. Note: `casemark/llama-nemotron-embed-vl-1b-v2` is a
         * deprecated alias for `casemark/embed-v1` (retained for SDK backward compatibility); new
         * integrations should use `casemark/embed-v1` directly.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embeddingModel(): Optional<EmbeddingModel> =
            embeddingModel.getOptional("embeddingModel")

        /**
         * Enable knowledge graph for entity relationship mapping. Only applies when enableIndexing
         * is true.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableGraph(): Optional<Boolean> = enableGraph.getOptional("enableGraph")

        /**
         * Enable vector indexing and search capabilities. Set to false for storage-only vaults.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableIndexing(): Optional<Boolean> = enableIndexing.getOptional("enableIndexing")

        /**
         * Assign the vault to a vault group for access control. Required when using a group-scoped
         * API key.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = groupId.getOptional("groupId")

        /**
         * Optional metadata to attach to the vault (e.g., { containsPHI: true } for HIPAA
         * compliance tracking)
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.metadata().convert(MyClass.class);
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [embeddingModel].
         *
         * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embeddingModel")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<EmbeddingModel> = embeddingModel

        /**
         * Returns the raw JSON value of [enableGraph].
         *
         * Unlike [enableGraph], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enableGraph")
        @ExcludeMissing
        fun _enableGraph(): JsonField<Boolean> = enableGraph

        /**
         * Returns the raw JSON value of [enableIndexing].
         *
         * Unlike [enableIndexing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enableIndexing")
        @ExcludeMissing
        fun _enableIndexing(): JsonField<Boolean> = enableIndexing

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groupId") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var embeddingModel: JsonField<EmbeddingModel> = JsonMissing.of()
            private var enableGraph: JsonField<Boolean> = JsonMissing.of()
            private var enableIndexing: JsonField<Boolean> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                description = body.description
                embeddingModel = body.embeddingModel
                enableGraph = body.enableGraph
                enableIndexing = body.enableIndexing
                groupId = body.groupId
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Display name for the vault */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Optional description of the vault's purpose */
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
             * Optional embedding model for this vault. Defaults to casemark/embed-v1. Determines
             * the S3 Vectors index dimension and which model is used at both ingest and search
             * time. The vault is locked to this model after creation — use a re-embed flow to
             * change later. Ignored when enableIndexing is false. Note:
             * `casemark/llama-nemotron-embed-vl-1b-v2` is a deprecated alias for
             * `casemark/embed-v1` (retained for SDK backward compatibility); new integrations
             * should use `casemark/embed-v1` directly.
             */
            fun embeddingModel(embeddingModel: EmbeddingModel) =
                embeddingModel(JsonField.of(embeddingModel))

            /**
             * Sets [Builder.embeddingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingModel] with a well-typed [EmbeddingModel]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun embeddingModel(embeddingModel: JsonField<EmbeddingModel>) = apply {
                this.embeddingModel = embeddingModel
            }

            /**
             * Enable knowledge graph for entity relationship mapping. Only applies when
             * enableIndexing is true.
             */
            fun enableGraph(enableGraph: Boolean) = enableGraph(JsonField.of(enableGraph))

            /**
             * Sets [Builder.enableGraph] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableGraph] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableGraph(enableGraph: JsonField<Boolean>) = apply {
                this.enableGraph = enableGraph
            }

            /**
             * Enable vector indexing and search capabilities. Set to false for storage-only vaults.
             */
            fun enableIndexing(enableIndexing: Boolean) =
                enableIndexing(JsonField.of(enableIndexing))

            /**
             * Sets [Builder.enableIndexing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableIndexing] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableIndexing(enableIndexing: JsonField<Boolean>) = apply {
                this.enableIndexing = enableIndexing
            }

            /**
             * Assign the vault to a vault group for access control. Required when using a
             * group-scoped API key.
             */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Optional metadata to attach to the vault (e.g., { containsPHI: true } for HIPAA
             * compliance tracking)
             */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    description,
                    embeddingModel,
                    enableGraph,
                    enableIndexing,
                    groupId,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            embeddingModel().ifPresent { it.validate() }
            enableGraph()
            enableIndexing()
            groupId()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (embeddingModel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (enableGraph.asKnown().isPresent) 1 else 0) +
                (if (enableIndexing.asKnown().isPresent) 1 else 0) +
                (if (groupId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                description == other.description &&
                embeddingModel == other.embeddingModel &&
                enableGraph == other.enableGraph &&
                enableIndexing == other.enableIndexing &&
                groupId == other.groupId &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                description,
                embeddingModel,
                enableGraph,
                enableIndexing,
                groupId,
                metadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, description=$description, embeddingModel=$embeddingModel, enableGraph=$enableGraph, enableIndexing=$enableIndexing, groupId=$groupId, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional embedding model for this vault. Defaults to casemark/embed-v1. Determines the S3
     * Vectors index dimension and which model is used at both ingest and search time. The vault is
     * locked to this model after creation — use a re-embed flow to change later. Ignored when
     * enableIndexing is false. Note: `casemark/llama-nemotron-embed-vl-1b-v2` is a deprecated alias
     * for `casemark/embed-v1` (retained for SDK backward compatibility); new integrations should
     * use `casemark/embed-v1` directly.
     */
    class EmbeddingModel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val OPENAI_TEXT_EMBEDDING_3_SMALL = of("openai/text-embedding-3-small")

            @JvmField val OPENAI_TEXT_EMBEDDING_3_LARGE = of("openai/text-embedding-3-large")

            @JvmField val VOYAGE_VOYAGE_3_5 = of("voyage/voyage-3.5")

            @JvmField val VOYAGE_VOYAGE_LAW_2 = of("voyage/voyage-law-2")

            @JvmField val COHERE_EMBED_V4_0 = of("cohere/embed-v4.0")

            @JvmField val GOOGLE_GEMINI_EMBEDDING_2 = of("google/gemini-embedding-2")

            @JvmField val CASEMARK_EMBED_V1 = of("casemark/embed-v1")

            @JvmField
            val CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2 =
                of("casemark/llama-nemotron-embed-vl-1b-v2")

            @JvmStatic fun of(value: String) = EmbeddingModel(JsonField.of(value))
        }

        /** An enum containing [EmbeddingModel]'s known values. */
        enum class Known {
            OPENAI_TEXT_EMBEDDING_3_SMALL,
            OPENAI_TEXT_EMBEDDING_3_LARGE,
            VOYAGE_VOYAGE_3_5,
            VOYAGE_VOYAGE_LAW_2,
            COHERE_EMBED_V4_0,
            GOOGLE_GEMINI_EMBEDDING_2,
            CASEMARK_EMBED_V1,
            CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2,
        }

        /**
         * An enum containing [EmbeddingModel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmbeddingModel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI_TEXT_EMBEDDING_3_SMALL,
            OPENAI_TEXT_EMBEDDING_3_LARGE,
            VOYAGE_VOYAGE_3_5,
            VOYAGE_VOYAGE_LAW_2,
            COHERE_EMBED_V4_0,
            GOOGLE_GEMINI_EMBEDDING_2,
            CASEMARK_EMBED_V1,
            CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2,
            /**
             * An enum member indicating that [EmbeddingModel] was instantiated with an unknown
             * value.
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
                OPENAI_TEXT_EMBEDDING_3_SMALL -> Value.OPENAI_TEXT_EMBEDDING_3_SMALL
                OPENAI_TEXT_EMBEDDING_3_LARGE -> Value.OPENAI_TEXT_EMBEDDING_3_LARGE
                VOYAGE_VOYAGE_3_5 -> Value.VOYAGE_VOYAGE_3_5
                VOYAGE_VOYAGE_LAW_2 -> Value.VOYAGE_VOYAGE_LAW_2
                COHERE_EMBED_V4_0 -> Value.COHERE_EMBED_V4_0
                GOOGLE_GEMINI_EMBEDDING_2 -> Value.GOOGLE_GEMINI_EMBEDDING_2
                CASEMARK_EMBED_V1 -> Value.CASEMARK_EMBED_V1
                CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2 ->
                    Value.CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2
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
                OPENAI_TEXT_EMBEDDING_3_SMALL -> Known.OPENAI_TEXT_EMBEDDING_3_SMALL
                OPENAI_TEXT_EMBEDDING_3_LARGE -> Known.OPENAI_TEXT_EMBEDDING_3_LARGE
                VOYAGE_VOYAGE_3_5 -> Known.VOYAGE_VOYAGE_3_5
                VOYAGE_VOYAGE_LAW_2 -> Known.VOYAGE_VOYAGE_LAW_2
                COHERE_EMBED_V4_0 -> Known.COHERE_EMBED_V4_0
                GOOGLE_GEMINI_EMBEDDING_2 -> Known.GOOGLE_GEMINI_EMBEDDING_2
                CASEMARK_EMBED_V1 -> Known.CASEMARK_EMBED_V1
                CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2 ->
                    Known.CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2
                else -> throw CasedevInvalidDataException("Unknown EmbeddingModel: $value")
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

        fun validate(): EmbeddingModel = apply {
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

            return other is EmbeddingModel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VaultCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
