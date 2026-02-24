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
import dev.case.core.checkKnown
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val disabledTools: JsonField<List<String>>,
    private val enabledTools: JsonField<List<String>>,
    private val instructions: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val sandbox: JsonValue,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vaultIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonValue = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vaultIds")
        @ExcludeMissing
        vaultIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        disabledTools,
        enabledTools,
        instructions,
        isActive,
        model,
        name,
        sandbox,
        updatedAt,
        vaultIds,
        mutableMapOf(),
    )

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabledTools(): Optional<List<String>> = disabledTools.getOptional("disabledTools")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabledTools(): Optional<List<String>> = enabledTools.getOptional("enabledTools")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = agentRetrieveResponse.sandbox().convert(MyClass.class);
     * ```
     */
    @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonValue = sandbox

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [disabledTools].
     *
     * Unlike [disabledTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disabledTools")
    @ExcludeMissing
    fun _disabledTools(): JsonField<List<String>> = disabledTools

    /**
     * Returns the raw JSON value of [enabledTools].
     *
     * Unlike [enabledTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabledTools")
    @ExcludeMissing
    fun _enabledTools(): JsonField<List<String>> = enabledTools

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vaultIds].
     *
     * Unlike [vaultIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaultIds") @ExcludeMissing fun _vaultIds(): JsonField<List<String>> = vaultIds

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

        /** Returns a mutable builder for constructing an instance of [AgentRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var disabledTools: JsonField<MutableList<String>>? = null
        private var enabledTools: JsonField<MutableList<String>>? = null
        private var instructions: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var sandbox: JsonValue = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var vaultIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentRetrieveResponse: AgentRetrieveResponse) = apply {
            id = agentRetrieveResponse.id
            createdAt = agentRetrieveResponse.createdAt
            description = agentRetrieveResponse.description
            disabledTools = agentRetrieveResponse.disabledTools.map { it.toMutableList() }
            enabledTools = agentRetrieveResponse.enabledTools.map { it.toMutableList() }
            instructions = agentRetrieveResponse.instructions
            isActive = agentRetrieveResponse.isActive
            model = agentRetrieveResponse.model
            name = agentRetrieveResponse.name
            sandbox = agentRetrieveResponse.sandbox
            updatedAt = agentRetrieveResponse.updatedAt
            vaultIds = agentRetrieveResponse.vaultIds.map { it.toMutableList() }
            additionalProperties = agentRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun disabledTools(disabledTools: List<String>?) =
            disabledTools(JsonField.ofNullable(disabledTools))

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

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sandbox(sandbox: JsonValue) = apply { this.sandbox = sandbox }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [AgentRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentRetrieveResponse =
            AgentRetrieveResponse(
                id,
                createdAt,
                description,
                (disabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                (enabledTools ?: JsonMissing.of()).map { it.toImmutable() },
                instructions,
                isActive,
                model,
                name,
                sandbox,
                updatedAt,
                (vaultIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AgentRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        disabledTools()
        enabledTools()
        instructions()
        isActive()
        model()
        name()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (disabledTools.asKnown().getOrNull()?.size ?: 0) +
            (enabledTools.asKnown().getOrNull()?.size ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (vaultIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            description == other.description &&
            disabledTools == other.disabledTools &&
            enabledTools == other.enabledTools &&
            instructions == other.instructions &&
            isActive == other.isActive &&
            model == other.model &&
            name == other.name &&
            sandbox == other.sandbox &&
            updatedAt == other.updatedAt &&
            vaultIds == other.vaultIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            description,
            disabledTools,
            enabledTools,
            instructions,
            isActive,
            model,
            name,
            sandbox,
            updatedAt,
            vaultIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentRetrieveResponse{id=$id, createdAt=$createdAt, description=$description, disabledTools=$disabledTools, enabledTools=$enabledTools, instructions=$instructions, isActive=$isActive, model=$model, name=$name, sandbox=$sandbox, updatedAt=$updatedAt, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
}
