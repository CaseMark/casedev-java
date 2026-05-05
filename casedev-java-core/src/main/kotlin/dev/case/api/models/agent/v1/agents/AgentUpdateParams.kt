// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.agents

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

/** Updates an agent definition. Only provided fields are changed. */
class AgentUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Updated agent description. Pass null to clear if supported by the client.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Denylist of tools the agent cannot use. Mutually exclusive with enabledTools — set one or the
     * other, not both. Pass null to clear.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabledTools(): Optional<List<String>> = body.disabledTools()

    /**
     * Allowlist of tools the agent can use. Mutually exclusive with disabledTools — set one or the
     * other, not both. Pass null to clear.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledTools(): Optional<List<String>> = body.enabledTools()

    /**
     * Updated system instructions that guide agent behavior
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * Model identifier the agent should use for future runs
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Updated agent display name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Sandbox configuration override for future agent runs. Pass null to clear.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = agentUpdateParams.sandbox().convert(MyClass.class);
     * ```
     */
    fun _sandbox(): JsonValue = body._sandbox()

    /**
     * Vault group IDs the agent can access. Pass null to clear.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultGroups(): Optional<List<String>> = body.vaultGroups()

    /**
     * Vault IDs the agent can access directly. Pass null to clear.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultIds(): Optional<List<String>> = body.vaultIds()

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
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [vaultGroups].
     *
     * Unlike [vaultGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultGroups(): JsonField<List<String>> = body._vaultGroups()

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

        @JvmStatic fun none(): AgentUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AgentUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentUpdateParams: AgentUpdateParams) = apply {
            id = agentUpdateParams.id
            body = agentUpdateParams.body.toBuilder()
            additionalHeaders = agentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [disabledTools]
         * - [enabledTools]
         * - [instructions]
         * - [model]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updated agent description. Pass null to clear if supported by the client. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Denylist of tools the agent cannot use. Mutually exclusive with enabledTools — set one or
         * the other, not both. Pass null to clear.
         */
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

        /**
         * Allowlist of tools the agent can use. Mutually exclusive with disabledTools — set one or
         * the other, not both. Pass null to clear.
         */
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

        /** Updated system instructions that guide agent behavior */
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

        /** Model identifier the agent should use for future runs */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Updated agent display name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Sandbox configuration override for future agent runs. Pass null to clear. */
        fun sandbox(sandbox: JsonValue) = apply { body.sandbox(sandbox) }

        /** Vault group IDs the agent can access. Pass null to clear. */
        fun vaultGroups(vaultGroups: List<String>?) = apply { body.vaultGroups(vaultGroups) }

        /** Alias for calling [Builder.vaultGroups] with `vaultGroups.orElse(null)`. */
        fun vaultGroups(vaultGroups: Optional<List<String>>) = vaultGroups(vaultGroups.getOrNull())

        /**
         * Sets [Builder.vaultGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultGroups] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vaultGroups(vaultGroups: JsonField<List<String>>) = apply {
            body.vaultGroups(vaultGroups)
        }

        /**
         * Adds a single [String] to [vaultGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVaultGroup(vaultGroup: String) = apply { body.addVaultGroup(vaultGroup) }

        /** Vault IDs the agent can access directly. Pass null to clear. */
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
         * Returns an immutable instance of [AgentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentUpdateParams =
            AgentUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val disabledTools: JsonField<List<String>>,
        private val enabledTools: JsonField<List<String>>,
        private val instructions: JsonField<String>,
        private val model: JsonField<String>,
        private val name: JsonField<String>,
        private val sandbox: JsonValue,
        private val vaultGroups: JsonField<List<String>>,
        private val vaultIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disabledTools")
            @ExcludeMissing
            disabledTools: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("enabledTools")
            @ExcludeMissing
            enabledTools: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonValue = JsonMissing.of(),
            @JsonProperty("vaultGroups")
            @ExcludeMissing
            vaultGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("vaultIds")
            @ExcludeMissing
            vaultIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            description,
            disabledTools,
            enabledTools,
            instructions,
            model,
            name,
            sandbox,
            vaultGroups,
            vaultIds,
            mutableMapOf(),
        )

        /**
         * Updated agent description. Pass null to clear if supported by the client.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Denylist of tools the agent cannot use. Mutually exclusive with enabledTools — set one or
         * the other, not both. Pass null to clear.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disabledTools(): Optional<List<String>> = disabledTools.getOptional("disabledTools")

        /**
         * Allowlist of tools the agent can use. Mutually exclusive with disabledTools — set one or
         * the other, not both. Pass null to clear.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabledTools(): Optional<List<String>> = enabledTools.getOptional("enabledTools")

        /**
         * Updated system instructions that guide agent behavior
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * Model identifier the agent should use for future runs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Updated agent display name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Sandbox configuration override for future agent runs. Pass null to clear.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.sandbox().convert(MyClass.class);
         * ```
         */
        @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonValue = sandbox

        /**
         * Vault group IDs the agent can access. Pass null to clear.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultGroups(): Optional<List<String>> = vaultGroups.getOptional("vaultGroups")

        /**
         * Vault IDs the agent can access directly. Pass null to clear.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

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
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [vaultGroups].
         *
         * Unlike [vaultGroups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vaultGroups")
        @ExcludeMissing
        fun _vaultGroups(): JsonField<List<String>> = vaultGroups

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

            private var description: JsonField<String> = JsonMissing.of()
            private var disabledTools: JsonField<MutableList<String>>? = null
            private var enabledTools: JsonField<MutableList<String>>? = null
            private var instructions: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var sandbox: JsonValue = JsonMissing.of()
            private var vaultGroups: JsonField<MutableList<String>>? = null
            private var vaultIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                disabledTools = body.disabledTools.map { it.toMutableList() }
                enabledTools = body.enabledTools.map { it.toMutableList() }
                instructions = body.instructions
                model = body.model
                name = body.name
                sandbox = body.sandbox
                vaultGroups = body.vaultGroups.map { it.toMutableList() }
                vaultIds = body.vaultIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updated agent description. Pass null to clear if supported by the client. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

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
             * Denylist of tools the agent cannot use. Mutually exclusive with enabledTools — set
             * one or the other, not both. Pass null to clear.
             */
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

            /**
             * Allowlist of tools the agent can use. Mutually exclusive with disabledTools — set one
             * or the other, not both. Pass null to clear.
             */
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

            /** Updated system instructions that guide agent behavior */
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

            /** Model identifier the agent should use for future runs */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Updated agent display name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Sandbox configuration override for future agent runs. Pass null to clear. */
            fun sandbox(sandbox: JsonValue) = apply { this.sandbox = sandbox }

            /** Vault group IDs the agent can access. Pass null to clear. */
            fun vaultGroups(vaultGroups: List<String>?) =
                vaultGroups(JsonField.ofNullable(vaultGroups))

            /** Alias for calling [Builder.vaultGroups] with `vaultGroups.orElse(null)`. */
            fun vaultGroups(vaultGroups: Optional<List<String>>) =
                vaultGroups(vaultGroups.getOrNull())

            /**
             * Sets [Builder.vaultGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultGroups] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultGroups(vaultGroups: JsonField<List<String>>) = apply {
                this.vaultGroups = vaultGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vaultGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVaultGroup(vaultGroup: String) = apply {
                vaultGroups =
                    (vaultGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vaultGroups", it).add(vaultGroup)
                    }
            }

            /** Vault IDs the agent can access directly. Pass null to clear. */
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
                    description,
                    (disabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                    (enabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                    instructions,
                    model,
                    name,
                    sandbox,
                    (vaultGroups ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            disabledTools()
            enabledTools()
            instructions()
            model()
            name()
            vaultGroups()
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (disabledTools.asKnown().getOrNull()?.size ?: 0) +
                (enabledTools.asKnown().getOrNull()?.size ?: 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (vaultGroups.asKnown().getOrNull()?.size ?: 0) +
                (vaultIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                disabledTools == other.disabledTools &&
                enabledTools == other.enabledTools &&
                instructions == other.instructions &&
                model == other.model &&
                name == other.name &&
                sandbox == other.sandbox &&
                vaultGroups == other.vaultGroups &&
                vaultIds == other.vaultIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                disabledTools,
                enabledTools,
                instructions,
                model,
                name,
                sandbox,
                vaultGroups,
                vaultIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, disabledTools=$disabledTools, enabledTools=$enabledTools, instructions=$instructions, model=$model, name=$name, sandbox=$sandbox, vaultGroups=$vaultGroups, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
