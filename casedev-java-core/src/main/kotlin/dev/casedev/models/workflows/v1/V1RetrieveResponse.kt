// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1RetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val deployedAt: JsonField<String>,
    private val deploymentUrl: JsonField<String>,
    private val description: JsonField<String>,
    private val edges: JsonField<List<JsonValue>>,
    private val name: JsonField<String>,
    private val nodes: JsonField<List<JsonValue>>,
    private val triggerConfig: JsonValue,
    private val triggerType: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val visibility: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deployedAt")
        @ExcludeMissing
        deployedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deploymentUrl")
        @ExcludeMissing
        deploymentUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("edges") @ExcludeMissing edges: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("triggerConfig") @ExcludeMissing triggerConfig: JsonValue = JsonMissing.of(),
        @JsonProperty("triggerType")
        @ExcludeMissing
        triggerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("visibility") @ExcludeMissing visibility: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        deployedAt,
        deploymentUrl,
        description,
        edges,
        name,
        nodes,
        triggerConfig,
        triggerType,
        updatedAt,
        visibility,
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
    fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deployedAt(): Optional<String> = deployedAt.getOptional("deployedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deploymentUrl(): Optional<String> = deploymentUrl.getOptional("deploymentUrl")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun edges(): Optional<List<JsonValue>> = edges.getOptional("edges")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nodes(): Optional<List<JsonValue>> = nodes.getOptional("nodes")

    @JsonProperty("triggerConfig") @ExcludeMissing fun _triggerConfig(): JsonValue = triggerConfig

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerType(): Optional<String> = triggerType.getOptional("triggerType")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visibility(): Optional<String> = visibility.getOptional("visibility")

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
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [deployedAt].
     *
     * Unlike [deployedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deployedAt") @ExcludeMissing fun _deployedAt(): JsonField<String> = deployedAt

    /**
     * Returns the raw JSON value of [deploymentUrl].
     *
     * Unlike [deploymentUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deploymentUrl")
    @ExcludeMissing
    fun _deploymentUrl(): JsonField<String> = deploymentUrl

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [edges].
     *
     * Unlike [edges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("edges") @ExcludeMissing fun _edges(): JsonField<List<JsonValue>> = edges

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nodes].
     *
     * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<JsonValue>> = nodes

    /**
     * Returns the raw JSON value of [triggerType].
     *
     * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggerType") @ExcludeMissing fun _triggerType(): JsonField<String> = triggerType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility") @ExcludeMissing fun _visibility(): JsonField<String> = visibility

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

        /** Returns a mutable builder for constructing an instance of [V1RetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var deployedAt: JsonField<String> = JsonMissing.of()
        private var deploymentUrl: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var edges: JsonField<MutableList<JsonValue>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var nodes: JsonField<MutableList<JsonValue>>? = null
        private var triggerConfig: JsonValue = JsonMissing.of()
        private var triggerType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var visibility: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1RetrieveResponse: V1RetrieveResponse) = apply {
            id = v1RetrieveResponse.id
            createdAt = v1RetrieveResponse.createdAt
            deployedAt = v1RetrieveResponse.deployedAt
            deploymentUrl = v1RetrieveResponse.deploymentUrl
            description = v1RetrieveResponse.description
            edges = v1RetrieveResponse.edges.map { it.toMutableList() }
            name = v1RetrieveResponse.name
            nodes = v1RetrieveResponse.nodes.map { it.toMutableList() }
            triggerConfig = v1RetrieveResponse.triggerConfig
            triggerType = v1RetrieveResponse.triggerType
            updatedAt = v1RetrieveResponse.updatedAt
            visibility = v1RetrieveResponse.visibility
            additionalProperties = v1RetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun deployedAt(deployedAt: String) = deployedAt(JsonField.of(deployedAt))

        /**
         * Sets [Builder.deployedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deployedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deployedAt(deployedAt: JsonField<String>) = apply { this.deployedAt = deployedAt }

        fun deploymentUrl(deploymentUrl: String) = deploymentUrl(JsonField.of(deploymentUrl))

        /**
         * Sets [Builder.deploymentUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deploymentUrl(deploymentUrl: JsonField<String>) = apply {
            this.deploymentUrl = deploymentUrl
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun edges(edges: List<JsonValue>) = edges(JsonField.of(edges))

        /**
         * Sets [Builder.edges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edges] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun edges(edges: JsonField<List<JsonValue>>) = apply {
            this.edges = edges.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [edges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEdge(edge: JsonValue) = apply {
            edges =
                (edges ?: JsonField.of(mutableListOf())).also { checkKnown("edges", it).add(edge) }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun nodes(nodes: List<JsonValue>) = nodes(JsonField.of(nodes))

        /**
         * Sets [Builder.nodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nodes] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nodes(nodes: JsonField<List<JsonValue>>) = apply {
            this.nodes = nodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [nodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNode(node: JsonValue) = apply {
            nodes =
                (nodes ?: JsonField.of(mutableListOf())).also { checkKnown("nodes", it).add(node) }
        }

        fun triggerConfig(triggerConfig: JsonValue) = apply { this.triggerConfig = triggerConfig }

        fun triggerType(triggerType: String) = triggerType(JsonField.of(triggerType))

        /**
         * Sets [Builder.triggerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggerType(triggerType: JsonField<String>) = apply { this.triggerType = triggerType }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        fun visibility(visibility: String) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun visibility(visibility: JsonField<String>) = apply { this.visibility = visibility }

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
         * Returns an immutable instance of [V1RetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1RetrieveResponse =
            V1RetrieveResponse(
                id,
                createdAt,
                deployedAt,
                deploymentUrl,
                description,
                (edges ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                (nodes ?: JsonMissing.of()).map { it.toImmutable() },
                triggerConfig,
                triggerType,
                updatedAt,
                visibility,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1RetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        deployedAt()
        deploymentUrl()
        description()
        edges()
        name()
        nodes()
        triggerType()
        updatedAt()
        visibility()
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
            (if (deployedAt.asKnown().isPresent) 1 else 0) +
            (if (deploymentUrl.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (edges.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (nodes.asKnown().getOrNull()?.size ?: 0) +
            (if (triggerType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (visibility.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1RetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            deployedAt == other.deployedAt &&
            deploymentUrl == other.deploymentUrl &&
            description == other.description &&
            edges == other.edges &&
            name == other.name &&
            nodes == other.nodes &&
            triggerConfig == other.triggerConfig &&
            triggerType == other.triggerType &&
            updatedAt == other.updatedAt &&
            visibility == other.visibility &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            deployedAt,
            deploymentUrl,
            description,
            edges,
            name,
            nodes,
            triggerConfig,
            triggerType,
            updatedAt,
            visibility,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1RetrieveResponse{id=$id, createdAt=$createdAt, deployedAt=$deployedAt, deploymentUrl=$deploymentUrl, description=$description, edges=$edges, name=$name, nodes=$nodes, triggerConfig=$triggerConfig, triggerType=$triggerType, updatedAt=$updatedAt, visibility=$visibility, additionalProperties=$additionalProperties}"
}
