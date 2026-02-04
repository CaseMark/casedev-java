// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

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

class MultipartGetPartUrlsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val urls: JsonField<List<Url>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<Url>> = JsonMissing.of()
    ) : this(urls, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urls(): Optional<List<Url>> = urls.getOptional("urls")

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<Url>> = urls

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
         * Returns a mutable builder for constructing an instance of [MultipartGetPartUrlsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultipartGetPartUrlsResponse]. */
    class Builder internal constructor() {

        private var urls: JsonField<MutableList<Url>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multipartGetPartUrlsResponse: MultipartGetPartUrlsResponse) = apply {
            urls = multipartGetPartUrlsResponse.urls.map { it.toMutableList() }
            additionalProperties = multipartGetPartUrlsResponse.additionalProperties.toMutableMap()
        }

        fun urls(urls: List<Url>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<Url>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun urls(urls: JsonField<List<Url>>) = apply { this.urls = urls.map { it.toMutableList() } }

        /**
         * Adds a single [Url] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: Url) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
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
         * Returns an immutable instance of [MultipartGetPartUrlsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MultipartGetPartUrlsResponse =
            MultipartGetPartUrlsResponse(
                (urls ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MultipartGetPartUrlsResponse = apply {
        if (validated) {
            return@apply
        }

        urls().ifPresent { it.forEach { it.validate() } }
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
        (urls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Url
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val partNumber: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("partNumber")
            @ExcludeMissing
            partNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(partNumber, url, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun partNumber(): Optional<Long> = partNumber.getOptional("partNumber")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [partNumber].
         *
         * Unlike [partNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("partNumber") @ExcludeMissing fun _partNumber(): JsonField<Long> = partNumber

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Url]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Url]. */
        class Builder internal constructor() {

            private var partNumber: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(url: Url) = apply {
                partNumber = url.partNumber
                this.url = url.url
                additionalProperties = url.additionalProperties.toMutableMap()
            }

            fun partNumber(partNumber: Long) = partNumber(JsonField.of(partNumber))

            /**
             * Sets [Builder.partNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partNumber(partNumber: JsonField<Long>) = apply { this.partNumber = partNumber }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Url].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Url = Url(partNumber, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Url = apply {
            if (validated) {
                return@apply
            }

            partNumber()
            url()
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
            (if (partNumber.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Url &&
                partNumber == other.partNumber &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(partNumber, url, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Url{partNumber=$partNumber, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipartGetPartUrlsResponse &&
            urls == other.urls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(urls, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultipartGetPartUrlsResponse{urls=$urls, additionalProperties=$additionalProperties}"
}
