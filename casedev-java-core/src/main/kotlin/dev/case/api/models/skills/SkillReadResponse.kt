// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
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
    private val content: JsonField<String>,
    private val license: JsonField<String>,
    private val name: JsonField<String>,
    private val slug: JsonField<String>,
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
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license") @ExcludeMissing license: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(authorName, content, license, name, slug, summary, tags, version, mutableMapOf())

    /**
     * Skill author
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorName(): Optional<String> = authorName.getOptional("author_name")

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
        private var content: JsonField<String> = JsonMissing.of()
        private var license: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(skillReadResponse: SkillReadResponse) = apply {
            authorName = skillReadResponse.authorName
            content = skillReadResponse.content
            license = skillReadResponse.license
            name = skillReadResponse.name
            slug = skillReadResponse.slug
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
                content,
                license,
                name,
                slug,
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
        content()
        license()
        name()
        slug()
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
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (license.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SkillReadResponse &&
            authorName == other.authorName &&
            content == other.content &&
            license == other.license &&
            name == other.name &&
            slug == other.slug &&
            summary == other.summary &&
            tags == other.tags &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authorName,
            content,
            license,
            name,
            slug,
            summary,
            tags,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SkillReadResponse{authorName=$authorName, content=$content, license=$license, name=$name, slug=$slug, summary=$summary, tags=$tags, version=$version, additionalProperties=$additionalProperties}"
}
