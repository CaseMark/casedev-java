// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.BaseDeserializer
import dev.case.api.core.BaseSerializer
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.allMaxBy
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.getOrThrow
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SkillReadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorName: JsonField<String>,
    private val bundle: JsonField<Bundle>,
    private val content: JsonField<String>,
    private val license: JsonField<String>,
    private val metadata: JsonValue,
    private val name: JsonField<String>,
    private val slug: JsonField<String>,
    private val source: JsonField<Source>,
    private val summary: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("author_name")
        @ExcludeMissing
        authorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bundle") @ExcludeMissing bundle: JsonField<Bundle> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license") @ExcludeMissing license: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(
        authorName,
        bundle,
        content,
        license,
        metadata,
        name,
        slug,
        source,
        summary,
        tags,
        version,
        mutableMapOf(),
    )

    /**
     * Skill author
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorName(): Optional<String> = authorName.getOptional("author_name")

    /**
     * Skill bundle metadata for root skills and companion file rows
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bundle(): Optional<Bundle> = bundle.getOptional("bundle")

    /**
     * Full skill content in markdown
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * Skill license
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun license(): Optional<String> = license.getOptional("license")

    /**
     * Custom metadata (custom skills only)
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = skillReadResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Skill name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Unique skill identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slug(): Optional<String> = slug.getOptional("slug")

    /**
     * Skill source (authenticated requests only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

    /**
     * Brief skill description
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<String> = summary.getOptional("summary")

    /**
     * Skill tags
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Skill version
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [authorName].
     *
     * Unlike [authorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_name") @ExcludeMissing fun _authorName(): JsonField<String> = authorName

    /**
     * Returns the raw JSON value of [bundle].
     *
     * Unlike [bundle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bundle") @ExcludeMissing fun _bundle(): JsonField<Bundle> = bundle

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [license].
     *
     * Unlike [license], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("license") @ExcludeMissing fun _license(): JsonField<String> = license

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

        /** Returns a mutable builder for constructing an instance of [SkillReadResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SkillReadResponse]. */
    class Builder internal constructor() {

        private var authorName: JsonField<String> = JsonMissing.of()
        private var bundle: JsonField<Bundle> = JsonMissing.of()
        private var content: JsonField<String> = JsonMissing.of()
        private var license: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(skillReadResponse: SkillReadResponse) = apply {
            authorName = skillReadResponse.authorName
            bundle = skillReadResponse.bundle
            content = skillReadResponse.content
            license = skillReadResponse.license
            metadata = skillReadResponse.metadata
            name = skillReadResponse.name
            slug = skillReadResponse.slug
            source = skillReadResponse.source
            summary = skillReadResponse.summary
            tags = skillReadResponse.tags.map { it.toMutableList() }
            version = skillReadResponse.version
            additionalProperties = skillReadResponse.additionalProperties.toMutableMap()
        }

        /** Skill author */
        fun authorName(authorName: String) = authorName(JsonField.of(authorName))

        /**
         * Sets [Builder.authorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

        /** Skill bundle metadata for root skills and companion file rows */
        fun bundle(bundle: Bundle?) = bundle(JsonField.ofNullable(bundle))

        /** Alias for calling [Builder.bundle] with `bundle.orElse(null)`. */
        fun bundle(bundle: Optional<Bundle>) = bundle(bundle.getOrNull())

        /**
         * Sets [Builder.bundle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bundle] with a well-typed [Bundle] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bundle(bundle: JsonField<Bundle>) = apply { this.bundle = bundle }

        /** Alias for calling [bundle] with `Bundle.ofUnionMember0(unionMember0)`. */
        fun bundle(unionMember0: Bundle.UnionMember0) = bundle(Bundle.ofUnionMember0(unionMember0))

        /** Alias for calling [bundle] with `Bundle.ofUnionMember1(unionMember1)`. */
        fun bundle(unionMember1: Bundle.UnionMember1) = bundle(Bundle.ofUnionMember1(unionMember1))

        /** Full skill content in markdown */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** Skill license */
        fun license(license: String) = license(JsonField.of(license))

        /**
         * Sets [Builder.license] to an arbitrary JSON value.
         *
         * You should usually call [Builder.license] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun license(license: JsonField<String>) = apply { this.license = license }

        /** Custom metadata (custom skills only) */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** Skill name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique skill identifier */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Skill source (authenticated requests only) */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** Brief skill description */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /** Skill tags */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Skill version */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [SkillReadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SkillReadResponse =
            SkillReadResponse(
                authorName,
                bundle,
                content,
                license,
                metadata,
                name,
                slug,
                source,
                summary,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SkillReadResponse = apply {
        if (validated) {
            return@apply
        }

        authorName()
        bundle().ifPresent { it.validate() }
        content()
        license()
        name()
        slug()
        source().ifPresent { it.validate() }
        summary()
        tags()
        version()
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
        (if (authorName.asKnown().isPresent) 1 else 0) +
            (bundle.asKnown().getOrNull()?.validity() ?: 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (license.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** Skill bundle metadata for root skills and companion file rows */
    @JsonDeserialize(using = Bundle.Deserializer::class)
    @JsonSerialize(using = Bundle.Serializer::class)
    class Bundle
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Bundle = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Bundle &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Bundle{unionMember0=$unionMember0}"
                unionMember1 != null -> "Bundle{unionMember1=$unionMember1}"
                _json != null -> "Bundle{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Bundle")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Bundle(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Bundle(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Bundle] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Bundle] to a value of type [T].
             *
             * An instance of [Bundle] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws CasedevInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CasedevInvalidDataException("Unknown Bundle: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Bundle>(Bundle::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Bundle {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Bundle(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Bundle(unionMember1 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Bundle(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Bundle>(Bundle::class) {

            override fun serialize(
                value: Bundle,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Bundle")
                }
            }
        }

        class UnionMember0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val files: JsonField<List<File>>,
            private val role: JsonField<Role>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("files")
                @ExcludeMissing
                files: JsonField<List<File>> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
            ) : this(files, role, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun files(): List<File> = files.getRequired("files")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): Role = role.getRequired("role")

            /**
             * Returns the raw JSON value of [files].
             *
             * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
                 *
                 * The following fields are required:
                 * ```java
                 * .files()
                 * .role()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var files: JsonField<MutableList<File>>? = null
                private var role: JsonField<Role>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    files = unionMember0.files.map { it.toMutableList() }
                    role = unionMember0.role
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun files(files: List<File>) = files(JsonField.of(files))

                /**
                 * Sets [Builder.files] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.files] with a well-typed `List<File>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun files(files: JsonField<List<File>>) = apply {
                    this.files = files.map { it.toMutableList() }
                }

                /**
                 * Adds a single [File] to [files].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFile(file: File) = apply {
                    files =
                        (files ?: JsonField.of(mutableListOf())).also {
                            checkKnown("files", it).add(file)
                        }
                }

                fun role(role: Role) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [Role] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .files()
                 * .role()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("files", files).map { it.toImmutable() },
                        checkRequired("role", role),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                files().forEach { it.validate() }
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
                (files.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (role.asKnown().getOrNull()?.validity() ?: 0)

            class File
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val path: JsonField<String>,
                private val slug: JsonField<String>,
                private val contentType: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("path")
                    @ExcludeMissing
                    path: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("slug")
                    @ExcludeMissing
                    slug: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("content_type")
                    @ExcludeMissing
                    contentType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(path, slug, contentType, name, mutableMapOf())

                /**
                 * @throws CasedevInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun path(): String = path.getRequired("path")

                /**
                 * @throws CasedevInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun slug(): String = slug.getRequired("slug")

                /**
                 * @throws CasedevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun contentType(): Optional<String> = contentType.getOptional("content_type")

                /**
                 * @throws CasedevInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [path].
                 *
                 * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

                /**
                 * Returns the raw JSON value of [slug].
                 *
                 * Unlike [slug], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

                /**
                 * Returns the raw JSON value of [contentType].
                 *
                 * Unlike [contentType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("content_type")
                @ExcludeMissing
                fun _contentType(): JsonField<String> = contentType

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns a mutable builder for constructing an instance of [File].
                     *
                     * The following fields are required:
                     * ```java
                     * .path()
                     * .slug()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [File]. */
                class Builder internal constructor() {

                    private var path: JsonField<String>? = null
                    private var slug: JsonField<String>? = null
                    private var contentType: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(file: File) = apply {
                        path = file.path
                        slug = file.slug
                        contentType = file.contentType
                        name = file.name
                        additionalProperties = file.additionalProperties.toMutableMap()
                    }

                    fun path(path: String) = path(JsonField.of(path))

                    /**
                     * Sets [Builder.path] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.path] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun path(path: JsonField<String>) = apply { this.path = path }

                    fun slug(slug: String) = slug(JsonField.of(slug))

                    /**
                     * Sets [Builder.slug] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.slug] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                    fun contentType(contentType: String?) =
                        contentType(JsonField.ofNullable(contentType))

                    /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
                    fun contentType(contentType: Optional<String>) =
                        contentType(contentType.getOrNull())

                    /**
                     * Sets [Builder.contentType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contentType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contentType(contentType: JsonField<String>) = apply {
                        this.contentType = contentType
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [File].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .path()
                     * .slug()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): File =
                        File(
                            checkRequired("path", path),
                            checkRequired("slug", slug),
                            contentType,
                            name,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): File = apply {
                    if (validated) {
                        return@apply
                    }

                    path()
                    slug()
                    contentType()
                    name()
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
                    (if (path.asKnown().isPresent) 1 else 0) +
                        (if (slug.asKnown().isPresent) 1 else 0) +
                        (if (contentType.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is File &&
                        path == other.path &&
                        slug == other.slug &&
                        contentType == other.contentType &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(path, slug, contentType, name, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "File{path=$path, slug=$slug, contentType=$contentType, name=$name, additionalProperties=$additionalProperties}"
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ROOT = of("root")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    ROOT
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ROOT,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ROOT -> Value.ROOT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ROOT -> Known.ROOT
                        else -> throw CasedevInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is UnionMember0 &&
                    files == other.files &&
                    role == other.role &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(files, role, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{files=$files, role=$role, additionalProperties=$additionalProperties}"
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val path: JsonField<String>,
            private val role: JsonField<Role>,
            private val rootSlug: JsonField<String>,
            private val contentType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
                @JsonProperty("root_slug")
                @ExcludeMissing
                rootSlug: JsonField<String> = JsonMissing.of(),
                @JsonProperty("content_type")
                @ExcludeMissing
                contentType: JsonField<String> = JsonMissing.of(),
            ) : this(path, role, rootSlug, contentType, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): String = path.getRequired("path")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): Role = role.getRequired("role")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rootSlug(): String = rootSlug.getRequired("root_slug")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contentType(): Optional<String> = contentType.getOptional("content_type")

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            /**
             * Returns the raw JSON value of [rootSlug].
             *
             * Unlike [rootSlug], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("root_slug") @ExcludeMissing fun _rootSlug(): JsonField<String> = rootSlug

            /**
             * Returns the raw JSON value of [contentType].
             *
             * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("content_type")
            @ExcludeMissing
            fun _contentType(): JsonField<String> = contentType

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```java
                 * .path()
                 * .role()
                 * .rootSlug()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var path: JsonField<String>? = null
                private var role: JsonField<Role>? = null
                private var rootSlug: JsonField<String>? = null
                private var contentType: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    path = unionMember1.path
                    role = unionMember1.role
                    rootSlug = unionMember1.rootSlug
                    contentType = unionMember1.contentType
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun path(path: String) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<String>) = apply { this.path = path }

                fun role(role: Role) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [Role] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun rootSlug(rootSlug: String) = rootSlug(JsonField.of(rootSlug))

                /**
                 * Sets [Builder.rootSlug] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rootSlug] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rootSlug(rootSlug: JsonField<String>) = apply { this.rootSlug = rootSlug }

                fun contentType(contentType: String?) =
                    contentType(JsonField.ofNullable(contentType))

                /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
                fun contentType(contentType: Optional<String>) =
                    contentType(contentType.getOrNull())

                /**
                 * Sets [Builder.contentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contentType(contentType: JsonField<String>) = apply {
                    this.contentType = contentType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .path()
                 * .role()
                 * .rootSlug()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("path", path),
                        checkRequired("role", role),
                        checkRequired("rootSlug", rootSlug),
                        contentType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                path()
                role().validate()
                rootSlug()
                contentType()
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
                (if (path.asKnown().isPresent) 1 else 0) +
                    (role.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rootSlug.asKnown().isPresent) 1 else 0) +
                    (if (contentType.asKnown().isPresent) 1 else 0)

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FILE = of("file")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    FILE
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FILE,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FILE -> Value.FILE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FILE -> Known.FILE
                        else -> throw CasedevInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is UnionMember1 &&
                    path == other.path &&
                    role == other.role &&
                    rootSlug == other.rootSlug &&
                    contentType == other.contentType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(path, role, rootSlug, contentType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{path=$path, role=$role, rootSlug=$rootSlug, contentType=$contentType, additionalProperties=$additionalProperties}"
        }
    }

    /** Skill source (authenticated requests only) */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CURATED = of("curated")

            @JvmField val CUSTOM = of("custom")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            CURATED,
            CUSTOM,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CURATED,
            CUSTOM,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                CURATED -> Value.CURATED
                CUSTOM -> Value.CUSTOM
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
                CURATED -> Known.CURATED
                CUSTOM -> Known.CUSTOM
                else -> throw CasedevInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SkillReadResponse &&
            authorName == other.authorName &&
            bundle == other.bundle &&
            content == other.content &&
            license == other.license &&
            metadata == other.metadata &&
            name == other.name &&
            slug == other.slug &&
            source == other.source &&
            summary == other.summary &&
            tags == other.tags &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authorName,
            bundle,
            content,
            license,
            metadata,
            name,
            slug,
            source,
            summary,
            tags,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SkillReadResponse{authorName=$authorName, bundle=$bundle, content=$content, license=$license, metadata=$metadata, name=$name, slug=$slug, source=$source, summary=$summary, tags=$tags, version=$version, additionalProperties=$additionalProperties}"
}
