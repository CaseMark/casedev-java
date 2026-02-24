// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.Params
import dev.case.core.checkKnown
import dev.case.core.checkRequired
import dev.case.core.http.Headers
import dev.case.core.http.QueryParams
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new agent definition with a scoped API key. The agent can then be used to create and
 * execute runs.
 */
class AgentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * System instructions that define agent behavior
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = body.instructions()

    /**
     * Display name for the agent
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Optional description of the agent
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Denylist of tools the agent cannot use
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabledTools(): Optional<List<String>> = body.disabledTools()

    /**
     * Allowlist of tools the agent can use
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledTools(): Optional<List<String>> = body.enabledTools()

    /**
     * LLM model identifier (e.g. anthropic/claude-sonnet-4.6). Defaults to
     * anthropic/claude-sonnet-4.6
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Custom sandbox configuration (cpu, memoryMiB)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandbox(): Optional<Sandbox> = body.sandbox()

    /**
     * Restrict agent to specific vault IDs
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultIds(): Optional<List<String>> = body.vaultIds()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

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
     * Returns the raw JSON value of [disabledTools].
     *
     * Unlike [disabledTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disabledTools(): JsonField<List<String>> = body._disabledTools()

    /**
     * Returns the raw JSON value of [enabledTools].
     *
     * Unlike [enabledTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabledTools(): JsonField<List<String>> = body._enabledTools()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [sandbox].
     *
     * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sandbox(): JsonField<Sandbox> = body._sandbox()

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

        /**
         * Returns a mutable builder for constructing an instance of [AgentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentCreateParams: AgentCreateParams) = apply {
            body = agentCreateParams.body.toBuilder()
            additionalHeaders = agentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [instructions]
         * - [name]
         * - [description]
         * - [disabledTools]
         * - [enabledTools]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** System instructions that define agent behavior */
        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        /** Display name for the agent */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Optional description of the agent */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Denylist of tools the agent cannot use */
        fun disabledTools(disabledTools: List<String>?) = apply {
            body.disabledTools(disabledTools)
        }

        /** Alias for calling [Builder.disabledTools] with `disabledTools.orElse(null)`. */
        fun disabledTools(disabledTools: Optional<List<String>>) =
            disabledTools(disabledTools.getOrNull())

        /**
         * Sets [Builder.disabledTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabledTools] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disabledTools(disabledTools: JsonField<List<String>>) = apply {
            body.disabledTools(disabledTools)
        }

        /**
         * Adds a single [String] to [disabledTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDisabledTool(disabledTool: String) = apply { body.addDisabledTool(disabledTool) }

        /** Allowlist of tools the agent can use */
        fun enabledTools(enabledTools: List<String>?) = apply { body.enabledTools(enabledTools) }

        /** Alias for calling [Builder.enabledTools] with `enabledTools.orElse(null)`. */
        fun enabledTools(enabledTools: Optional<List<String>>) =
            enabledTools(enabledTools.getOrNull())

        /**
         * Sets [Builder.enabledTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledTools] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enabledTools(enabledTools: JsonField<List<String>>) = apply {
            body.enabledTools(enabledTools)
        }

        /**
         * Adds a single [String] to [enabledTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledTool(enabledTool: String) = apply { body.addEnabledTool(enabledTool) }

        /**
         * LLM model identifier (e.g. anthropic/claude-sonnet-4.6). Defaults to
         * anthropic/claude-sonnet-4.6
         */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Custom sandbox configuration (cpu, memoryMiB) */
        fun sandbox(sandbox: Sandbox?) = apply { body.sandbox(sandbox) }

        /** Alias for calling [Builder.sandbox] with `sandbox.orElse(null)`. */
        fun sandbox(sandbox: Optional<Sandbox>) = sandbox(sandbox.getOrNull())

        /**
         * Sets [Builder.sandbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sandbox(sandbox: JsonField<Sandbox>) = apply { body.sandbox(sandbox) }

        /** Restrict agent to specific vault IDs */
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
         * Returns an immutable instance of [AgentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentCreateParams =
            AgentCreateParams(
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
        private val instructions: JsonField<String>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val disabledTools: JsonField<List<String>>,
        private val enabledTools: JsonField<List<String>>,
        private val model: JsonField<String>,
        private val sandbox: JsonField<Sandbox>,
        private val vaultIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disabledTools")
            @ExcludeMissing
            disabledTools: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("enabledTools")
            @ExcludeMissing
            enabledTools: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Sandbox> = JsonMissing.of(),
            @JsonProperty("vaultIds")
            @ExcludeMissing
            vaultIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            instructions,
            name,
            description,
            disabledTools,
            enabledTools,
            model,
            sandbox,
            vaultIds,
            mutableMapOf(),
        )

        /**
         * System instructions that define agent behavior
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructions(): String = instructions.getRequired("instructions")

        /**
         * Display name for the agent
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional description of the agent
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Denylist of tools the agent cannot use
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disabledTools(): Optional<List<String>> = disabledTools.getOptional("disabledTools")

        /**
         * Allowlist of tools the agent can use
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabledTools(): Optional<List<String>> = enabledTools.getOptional("enabledTools")

        /**
         * LLM model identifier (e.g. anthropic/claude-sonnet-4.6). Defaults to
         * anthropic/claude-sonnet-4.6
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Custom sandbox configuration (cpu, memoryMiB)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sandbox(): Optional<Sandbox> = sandbox.getOptional("sandbox")

        /**
         * Restrict agent to specific vault IDs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

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
         * Returns the raw JSON value of [disabledTools].
         *
         * Unlike [disabledTools], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disabledTools")
        @ExcludeMissing
        fun _disabledTools(): JsonField<List<String>> = disabledTools

        /**
         * Returns the raw JSON value of [enabledTools].
         *
         * Unlike [enabledTools], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enabledTools")
        @ExcludeMissing
        fun _enabledTools(): JsonField<List<String>> = enabledTools

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [sandbox].
         *
         * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonField<Sandbox> = sandbox

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var instructions: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var disabledTools: JsonField<MutableList<String>>? = null
            private var enabledTools: JsonField<MutableList<String>>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var sandbox: JsonField<Sandbox> = JsonMissing.of()
            private var vaultIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                instructions = body.instructions
                name = body.name
                description = body.description
                disabledTools = body.disabledTools.map { it.toMutableList() }
                enabledTools = body.enabledTools.map { it.toMutableList() }
                model = body.model
                sandbox = body.sandbox
                vaultIds = body.vaultIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** System instructions that define agent behavior */
            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            /** Display name for the agent */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Optional description of the agent */
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

            /** Denylist of tools the agent cannot use */
            fun disabledTools(disabledTools: List<String>?) =
                disabledTools(JsonField.ofNullable(disabledTools))

            /** Alias for calling [Builder.disabledTools] with `disabledTools.orElse(null)`. */
            fun disabledTools(disabledTools: Optional<List<String>>) =
                disabledTools(disabledTools.getOrNull())

            /**
             * Sets [Builder.disabledTools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disabledTools] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disabledTools(disabledTools: JsonField<List<String>>) = apply {
                this.disabledTools = disabledTools.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [disabledTools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDisabledTool(disabledTool: String) = apply {
                disabledTools =
                    (disabledTools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("disabledTools", it).add(disabledTool)
                    }
            }

            /** Allowlist of tools the agent can use */
            fun enabledTools(enabledTools: List<String>?) =
                enabledTools(JsonField.ofNullable(enabledTools))

            /** Alias for calling [Builder.enabledTools] with `enabledTools.orElse(null)`. */
            fun enabledTools(enabledTools: Optional<List<String>>) =
                enabledTools(enabledTools.getOrNull())

            /**
             * Sets [Builder.enabledTools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabledTools] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabledTools(enabledTools: JsonField<List<String>>) = apply {
                this.enabledTools = enabledTools.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enabledTools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnabledTool(enabledTool: String) = apply {
                enabledTools =
                    (enabledTools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enabledTools", it).add(enabledTool)
                    }
            }

            /**
             * LLM model identifier (e.g. anthropic/claude-sonnet-4.6). Defaults to
             * anthropic/claude-sonnet-4.6
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

            /** Custom sandbox configuration (cpu, memoryMiB) */
            fun sandbox(sandbox: Sandbox?) = sandbox(JsonField.ofNullable(sandbox))

            /** Alias for calling [Builder.sandbox] with `sandbox.orElse(null)`. */
            fun sandbox(sandbox: Optional<Sandbox>) = sandbox(sandbox.getOrNull())

            /**
             * Sets [Builder.sandbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandbox(sandbox: JsonField<Sandbox>) = apply { this.sandbox = sandbox }

            /** Restrict agent to specific vault IDs */
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
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("instructions", instructions),
                    checkRequired("name", name),
                    description,
                    (disabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                    (enabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                    model,
                    sandbox,
                    (vaultIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            instructions()
            name()
            description()
            disabledTools()
            enabledTools()
            model()
            sandbox().ifPresent { it.validate() }
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
            (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (disabledTools.asKnown().getOrNull()?.size ?: 0) +
                (enabledTools.asKnown().getOrNull()?.size ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (sandbox.asKnown().getOrNull()?.validity() ?: 0) +
                (vaultIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                instructions == other.instructions &&
                name == other.name &&
                description == other.description &&
                disabledTools == other.disabledTools &&
                enabledTools == other.enabledTools &&
                model == other.model &&
                sandbox == other.sandbox &&
                vaultIds == other.vaultIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                instructions,
                name,
                description,
                disabledTools,
                enabledTools,
                model,
                sandbox,
                vaultIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{instructions=$instructions, name=$name, description=$description, disabledTools=$disabledTools, enabledTools=$enabledTools, model=$model, sandbox=$sandbox, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
    }

    /** Custom sandbox configuration (cpu, memoryMiB) */
    class Sandbox
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cpu: JsonField<Long>,
        private val memoryMiB: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cpu") @ExcludeMissing cpu: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("memoryMiB") @ExcludeMissing memoryMiB: JsonField<Long> = JsonMissing.of(),
        ) : this(cpu, memoryMiB, mutableMapOf())

        /**
         * Number of CPUs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cpu(): Optional<Long> = cpu.getOptional("cpu")

        /**
         * Memory in MiB
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memoryMiB(): Optional<Long> = memoryMiB.getOptional("memoryMiB")

        /**
         * Returns the raw JSON value of [cpu].
         *
         * Unlike [cpu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cpu") @ExcludeMissing fun _cpu(): JsonField<Long> = cpu

        /**
         * Returns the raw JSON value of [memoryMiB].
         *
         * Unlike [memoryMiB], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memoryMiB") @ExcludeMissing fun _memoryMiB(): JsonField<Long> = memoryMiB

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

            /** Returns a mutable builder for constructing an instance of [Sandbox]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sandbox]. */
        class Builder internal constructor() {

            private var cpu: JsonField<Long> = JsonMissing.of()
            private var memoryMiB: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandbox: Sandbox) = apply {
                cpu = sandbox.cpu
                memoryMiB = sandbox.memoryMiB
                additionalProperties = sandbox.additionalProperties.toMutableMap()
            }

            /** Number of CPUs */
            fun cpu(cpu: Long) = cpu(JsonField.of(cpu))

            /**
             * Sets [Builder.cpu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cpu] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cpu(cpu: JsonField<Long>) = apply { this.cpu = cpu }

            /** Memory in MiB */
            fun memoryMiB(memoryMiB: Long) = memoryMiB(JsonField.of(memoryMiB))

            /**
             * Sets [Builder.memoryMiB] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryMiB] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryMiB(memoryMiB: JsonField<Long>) = apply { this.memoryMiB = memoryMiB }

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
             * Returns an immutable instance of [Sandbox].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sandbox = Sandbox(cpu, memoryMiB, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Sandbox = apply {
            if (validated) {
                return@apply
            }

            cpu()
            memoryMiB()
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
            (if (cpu.asKnown().isPresent) 1 else 0) + (if (memoryMiB.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sandbox &&
                cpu == other.cpu &&
                memoryMiB == other.memoryMiB &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(cpu, memoryMiB, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sandbox{cpu=$cpu, memoryMiB=$memoryMiB, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
