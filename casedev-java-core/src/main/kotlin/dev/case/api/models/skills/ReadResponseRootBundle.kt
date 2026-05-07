// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReadResponseRootBundle
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val files: JsonField<List<File>>,
    private val role: JsonField<Role>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("files") @ExcludeMissing files: JsonField<List<File>> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
    ) : this(files, role, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun files(): List<File> = files.getRequired("files")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * Returns a mutable builder for constructing an instance of [ReadResponseRootBundle].
         *
         * The following fields are required:
         * ```java
         * .files()
         * .role()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReadResponseRootBundle]. */
    class Builder internal constructor() {

        private var files: JsonField<MutableList<File>>? = null
        private var role: JsonField<Role>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(readResponseRootBundle: ReadResponseRootBundle) = apply {
            files = readResponseRootBundle.files.map { it.toMutableList() }
            role = readResponseRootBundle.role
            additionalProperties = readResponseRootBundle.additionalProperties.toMutableMap()
        }

        fun files(files: List<File>) = files(JsonField.of(files))

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed `List<File>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (files ?: JsonField.of(mutableListOf())).also { checkKnown("files", it).add(file) }
        }

        fun role(role: Role) = role(JsonField.of(role))

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [Role] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<Role>) = apply { this.role = role }

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
         * Returns an immutable instance of [ReadResponseRootBundle].
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
        fun build(): ReadResponseRootBundle =
            ReadResponseRootBundle(
                checkRequired("files", files).map { it.toImmutable() },
                checkRequired("role", role),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CasedevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ReadResponseRootBundle = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(path, slug, contentType, name, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun contentType(contentType: String?) = contentType(JsonField.ofNullable(contentType))

            /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
            fun contentType(contentType: Optional<String>) = contentType(contentType.getOrNull())

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROOT,
            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                ROOT -> Value.ROOT
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
                ROOT -> Known.ROOT
                else -> throw CasedevInvalidDataException("Unknown Role: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is ReadResponseRootBundle &&
            files == other.files &&
            role == other.role &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(files, role, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReadResponseRootBundle{files=$files, role=$role, additionalProperties=$additionalProperties}"
}
