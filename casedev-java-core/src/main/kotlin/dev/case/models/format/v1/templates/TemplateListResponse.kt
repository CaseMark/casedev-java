// File generated from our OpenAPI spec by Stainless.

package dev.case.models.format.v1.templates

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

class TemplateListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val templates: JsonField<List<Template>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("templates")
        @ExcludeMissing
        templates: JsonField<List<Template>> = JsonMissing.of()
    ) : this(templates, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templates(): Optional<List<Template>> = templates.getOptional("templates")

    /**
     * Returns the raw JSON value of [templates].
     *
     * Unlike [templates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templates")
    @ExcludeMissing
    fun _templates(): JsonField<List<Template>> = templates

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

        /** Returns a mutable builder for constructing an instance of [TemplateListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateListResponse]. */
    class Builder internal constructor() {

        private var templates: JsonField<MutableList<Template>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(templateListResponse: TemplateListResponse) = apply {
            templates = templateListResponse.templates.map { it.toMutableList() }
            additionalProperties = templateListResponse.additionalProperties.toMutableMap()
        }

        fun templates(templates: List<Template>) = templates(JsonField.of(templates))

        /**
         * Sets [Builder.templates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templates] with a well-typed `List<Template>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templates(templates: JsonField<List<Template>>) = apply {
            this.templates = templates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Template] to [templates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTemplate(template: Template) = apply {
            templates =
                (templates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("templates", it).add(template)
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
         * Returns an immutable instance of [TemplateListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TemplateListResponse =
            TemplateListResponse(
                (templates ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TemplateListResponse = apply {
        if (validated) {
            return@apply
        }

        templates().ifPresent { it.forEach { it.validate() } }
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
        (templates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Template
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val tags: JsonField<List<JsonValue>>,
        private val type: JsonField<String>,
        private val usageCount: JsonField<Long>,
        private val variables: JsonField<List<JsonValue>>,
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usageCount")
            @ExcludeMissing
            usageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("variables")
            @ExcludeMissing
            variables: JsonField<List<JsonValue>> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            description,
            name,
            tags,
            type,
            usageCount,
            variables,
            mutableMapOf(),
        )

        /**
         * Unique template identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Template creation timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Template description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Template name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Template tags for organization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<JsonValue>> = tags.getOptional("tags")

        /**
         * Template type/category
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Number of times template has been used
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCount(): Optional<Long> = usageCount.getOptional("usageCount")

        /**
         * Template variables for customization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun variables(): Optional<List<JsonValue>> = variables.getOptional("variables")

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [usageCount].
         *
         * Unlike [usageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usageCount") @ExcludeMissing fun _usageCount(): JsonField<Long> = usageCount

        /**
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<List<JsonValue>> = variables

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

            /** Returns a mutable builder for constructing an instance of [Template]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Template]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var type: JsonField<String> = JsonMissing.of()
            private var usageCount: JsonField<Long> = JsonMissing.of()
            private var variables: JsonField<MutableList<JsonValue>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(template: Template) = apply {
                id = template.id
                createdAt = template.createdAt
                description = template.description
                name = template.name
                tags = template.tags.map { it.toMutableList() }
                type = template.type
                usageCount = template.usageCount
                variables = template.variables.map { it.toMutableList() }
                additionalProperties = template.additionalProperties.toMutableMap()
            }

            /** Unique template identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Template creation timestamp */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Template description */
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

            /** Template name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Template tags for organization */
            fun tags(tags: List<JsonValue>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Template type/category */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Number of times template has been used */
            fun usageCount(usageCount: Long) = usageCount(JsonField.of(usageCount))

            /**
             * Sets [Builder.usageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageCount(usageCount: JsonField<Long>) = apply { this.usageCount = usageCount }

            /** Template variables for customization */
            fun variables(variables: List<JsonValue>) = variables(JsonField.of(variables))

            /**
             * Sets [Builder.variables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variables] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun variables(variables: JsonField<List<JsonValue>>) = apply {
                this.variables = variables.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [variables].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVariable(variable: JsonValue) = apply {
                variables =
                    (variables ?: JsonField.of(mutableListOf())).also {
                        checkKnown("variables", it).add(variable)
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
             * Returns an immutable instance of [Template].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Template =
                Template(
                    id,
                    createdAt,
                    description,
                    name,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    usageCount,
                    (variables ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Template = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            description()
            name()
            tags()
            type()
            usageCount()
            variables()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (usageCount.asKnown().isPresent) 1 else 0) +
                (variables.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Template &&
                id == other.id &&
                createdAt == other.createdAt &&
                description == other.description &&
                name == other.name &&
                tags == other.tags &&
                type == other.type &&
                usageCount == other.usageCount &&
                variables == other.variables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                description,
                name,
                tags,
                type,
                usageCount,
                variables,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Template{id=$id, createdAt=$createdAt, description=$description, name=$name, tags=$tags, type=$type, usageCount=$usageCount, variables=$variables, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateListResponse &&
            templates == other.templates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(templates, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TemplateListResponse{templates=$templates, additionalProperties=$additionalProperties}"
}
