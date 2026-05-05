// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat.files

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

class FileListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatId: JsonField<String>,
    private val files: JsonField<List<File>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chatId") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("files") @ExcludeMissing files: JsonField<List<File>> = JsonMissing.of(),
    ) : this(chatId, files, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chatId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun files(): Optional<List<File>> = files.getOptional("files")

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chatId") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

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

        /** Returns a mutable builder for constructing an instance of [FileListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileListResponse]. */
    class Builder internal constructor() {

        private var chatId: JsonField<String> = JsonMissing.of()
        private var files: JsonField<MutableList<File>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileListResponse: FileListResponse) = apply {
            chatId = fileListResponse.chatId
            files = fileListResponse.files.map { it.toMutableList() }
            additionalProperties = fileListResponse.additionalProperties.toMutableMap()
        }

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

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
         * Returns an immutable instance of [FileListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileListResponse =
            FileListResponse(
                chatId,
                (files ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): FileListResponse = apply {
        if (validated) {
            return@apply
        }

        chatId()
        files().ifPresent { it.forEach { it.validate() } }
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
        (if (chatId.asKnown().isPresent) 1 else 0) +
            (files.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class File
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val path: JsonField<String>,
        private val sizeBytes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        ) : this(name, path, sizeBytes, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Relative path from /workspace
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun path(): Optional<String> = path.getOptional("path")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [sizeBytes].
         *
         * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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

            /** Returns a mutable builder for constructing an instance of [File]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [File]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var path: JsonField<String> = JsonMissing.of()
            private var sizeBytes: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(file: File) = apply {
                name = file.name
                path = file.path
                sizeBytes = file.sizeBytes
                additionalProperties = file.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Relative path from /workspace */
            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
             */
            fun build(): File = File(name, path, sizeBytes, additionalProperties.toMutableMap())
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

            name()
            path()
            sizeBytes()
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
                (if (path.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is File &&
                name == other.name &&
                path == other.path &&
                sizeBytes == other.sizeBytes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, path, sizeBytes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "File{name=$name, path=$path, sizeBytes=$sizeBytes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListResponse &&
            chatId == other.chatId &&
            files == other.files &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(chatId, files, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileListResponse{chatId=$chatId, files=$files, additionalProperties=$additionalProperties}"
}
