// File generated from our OpenAPI spec by Stainless.

package dev.case.models.voice.v1

import com.fasterxml.jackson.annotation.JsonCreator
import dev.case.core.Enum
import dev.case.core.JsonField
import dev.case.core.Params
import dev.case.core.http.Headers
import dev.case.core.http.QueryParams
import dev.case.errors.CasedevInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of available voices for text-to-speech synthesis. This endpoint provides access
 * to a comprehensive catalog of voices with various characteristics, languages, and styles suitable
 * for legal document narration, client presentations, and accessibility purposes.
 */
class V1ListVoicesParams
private constructor(
    private val category: String?,
    private val collectionId: String?,
    private val includeTotalCount: Boolean?,
    private val nextPageToken: String?,
    private val pageSize: Long?,
    private val search: String?,
    private val sort: Sort?,
    private val sortDirection: SortDirection?,
    private val voiceType: VoiceType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by voice category */
    fun category(): Optional<String> = Optional.ofNullable(category)

    /** Filter by voice collection ID */
    fun collectionId(): Optional<String> = Optional.ofNullable(collectionId)

    /** Whether to include total count in response */
    fun includeTotalCount(): Optional<Boolean> = Optional.ofNullable(includeTotalCount)

    /** Token for retrieving the next page of results */
    fun nextPageToken(): Optional<String> = Optional.ofNullable(nextPageToken)

    /** Number of voices to return per page (max 100) */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Search term to filter voices by name or description */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Field to sort by */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Sort direction */
    fun sortDirection(): Optional<SortDirection> = Optional.ofNullable(sortDirection)

    /** Filter by voice type */
    fun voiceType(): Optional<VoiceType> = Optional.ofNullable(voiceType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1ListVoicesParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1ListVoicesParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListVoicesParams]. */
    class Builder internal constructor() {

        private var category: String? = null
        private var collectionId: String? = null
        private var includeTotalCount: Boolean? = null
        private var nextPageToken: String? = null
        private var pageSize: Long? = null
        private var search: String? = null
        private var sort: Sort? = null
        private var sortDirection: SortDirection? = null
        private var voiceType: VoiceType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ListVoicesParams: V1ListVoicesParams) = apply {
            category = v1ListVoicesParams.category
            collectionId = v1ListVoicesParams.collectionId
            includeTotalCount = v1ListVoicesParams.includeTotalCount
            nextPageToken = v1ListVoicesParams.nextPageToken
            pageSize = v1ListVoicesParams.pageSize
            search = v1ListVoicesParams.search
            sort = v1ListVoicesParams.sort
            sortDirection = v1ListVoicesParams.sortDirection
            voiceType = v1ListVoicesParams.voiceType
            additionalHeaders = v1ListVoicesParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ListVoicesParams.additionalQueryParams.toBuilder()
        }

        /** Filter by voice category */
        fun category(category: String?) = apply { this.category = category }

        /** Alias for calling [Builder.category] with `category.orElse(null)`. */
        fun category(category: Optional<String>) = category(category.getOrNull())

        /** Filter by voice collection ID */
        fun collectionId(collectionId: String?) = apply { this.collectionId = collectionId }

        /** Alias for calling [Builder.collectionId] with `collectionId.orElse(null)`. */
        fun collectionId(collectionId: Optional<String>) = collectionId(collectionId.getOrNull())

        /** Whether to include total count in response */
        fun includeTotalCount(includeTotalCount: Boolean?) = apply {
            this.includeTotalCount = includeTotalCount
        }

        /**
         * Alias for [Builder.includeTotalCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTotalCount(includeTotalCount: Boolean) =
            includeTotalCount(includeTotalCount as Boolean?)

        /** Alias for calling [Builder.includeTotalCount] with `includeTotalCount.orElse(null)`. */
        fun includeTotalCount(includeTotalCount: Optional<Boolean>) =
            includeTotalCount(includeTotalCount.getOrNull())

        /** Token for retrieving the next page of results */
        fun nextPageToken(nextPageToken: String?) = apply { this.nextPageToken = nextPageToken }

        /** Alias for calling [Builder.nextPageToken] with `nextPageToken.orElse(null)`. */
        fun nextPageToken(nextPageToken: Optional<String>) =
            nextPageToken(nextPageToken.getOrNull())

        /** Number of voices to return per page (max 100) */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Search term to filter voices by name or description */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /** Field to sort by */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        /** Sort direction */
        fun sortDirection(sortDirection: SortDirection?) = apply {
            this.sortDirection = sortDirection
        }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<SortDirection>) =
            sortDirection(sortDirection.getOrNull())

        /** Filter by voice type */
        fun voiceType(voiceType: VoiceType?) = apply { this.voiceType = voiceType }

        /** Alias for calling [Builder.voiceType] with `voiceType.orElse(null)`. */
        fun voiceType(voiceType: Optional<VoiceType>) = voiceType(voiceType.getOrNull())

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
         * Returns an immutable instance of [V1ListVoicesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListVoicesParams =
            V1ListVoicesParams(
                category,
                collectionId,
                includeTotalCount,
                nextPageToken,
                pageSize,
                search,
                sort,
                sortDirection,
                voiceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                category?.let { put("category", it) }
                collectionId?.let { put("collection_id", it) }
                includeTotalCount?.let { put("include_total_count", it.toString()) }
                nextPageToken?.let { put("next_page_token", it) }
                pageSize?.let { put("page_size", it.toString()) }
                search?.let { put("search", it) }
                sort?.let { put("sort", it.toString()) }
                sortDirection?.let { put("sort_direction", it.toString()) }
                voiceType?.let { put("voice_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field to sort by */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NAME = of("name")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            NAME,
            CREATED_AT,
            UPDATED_AT,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            CREATED_AT,
            UPDATED_AT,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                NAME -> Value.NAME
                CREATED_AT -> Value.CREATED_AT
                UPDATED_AT -> Value.UPDATED_AT
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
                NAME -> Known.NAME
                CREATED_AT -> Known.CREATED_AT
                UPDATED_AT -> Known.UPDATED_AT
                else -> throw CasedevInvalidDataException("Unknown Sort: $value")
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

        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction */
    class SortDirection @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortDirection(JsonField.of(value))
        }

        /** An enum containing [SortDirection]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortDirection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortDirection] was instantiated with an unknown
             * value.
             */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw CasedevInvalidDataException("Unknown SortDirection: $value")
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

        fun validate(): SortDirection = apply {
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

            return other is SortDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by voice type */
    class VoiceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PREMADE = of("premade")

            @JvmField val CLONED = of("cloned")

            @JvmField val PROFESSIONAL = of("professional")

            @JvmStatic fun of(value: String) = VoiceType(JsonField.of(value))
        }

        /** An enum containing [VoiceType]'s known values. */
        enum class Known {
            PREMADE,
            CLONED,
            PROFESSIONAL,
        }

        /**
         * An enum containing [VoiceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VoiceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREMADE,
            CLONED,
            PROFESSIONAL,
            /**
             * An enum member indicating that [VoiceType] was instantiated with an unknown value.
             */
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
                PREMADE -> Value.PREMADE
                CLONED -> Value.CLONED
                PROFESSIONAL -> Value.PROFESSIONAL
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
                PREMADE -> Known.PREMADE
                CLONED -> Known.CLONED
                PROFESSIONAL -> Known.PROFESSIONAL
                else -> throw CasedevInvalidDataException("Unknown VoiceType: $value")
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

        fun validate(): VoiceType = apply {
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

            return other is VoiceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListVoicesParams &&
            category == other.category &&
            collectionId == other.collectionId &&
            includeTotalCount == other.includeTotalCount &&
            nextPageToken == other.nextPageToken &&
            pageSize == other.pageSize &&
            search == other.search &&
            sort == other.sort &&
            sortDirection == other.sortDirection &&
            voiceType == other.voiceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            collectionId,
            includeTotalCount,
            nextPageToken,
            pageSize,
            search,
            sort,
            sortDirection,
            voiceType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "V1ListVoicesParams{category=$category, collectionId=$collectionId, includeTotalCount=$includeTotalCount, nextPageToken=$nextPageToken, pageSize=$pageSize, search=$search, sort=$sort, sortDirection=$sortDirection, voiceType=$voiceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
