// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.checkKnown
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1SearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of()
    ) : this(results, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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

        /** Returns a mutable builder for constructing an instance of [V1SearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SearchResponse]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1SearchResponse: V1SearchResponse) = apply {
            results = v1SearchResponse.results.map { it.toMutableList() }
            additionalProperties = v1SearchResponse.additionalProperties.toMutableMap()
        }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [V1SearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1SearchResponse =
            V1SearchResponse(
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1SearchResponse = apply {
        if (validated) {
            return@apply
        }

        results().ifPresent { it.forEach { it.validate() } }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val memory: JsonField<String>,
        private val metadata: JsonValue,
        private val score: JsonField<Double>,
        private val tags: JsonField<Tags>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("memory") @ExcludeMissing memory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, createdAt, memory, metadata, score, tags, updatedAt, mutableMapOf())

        /**
         * Memory ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Memory content
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memory(): Optional<String> = memory.getOptional("memory")

        /**
         * Additional metadata
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = result.metadata().convert(MyClass.class);
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Similarity score (0-1)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Tag values for this memory
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<Tags> = tags.getOptional("tags")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [memory].
         *
         * Unlike [memory], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memory") @ExcludeMissing fun _memory(): JsonField<String> = memory

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var memory: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var tags: JsonField<Tags> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                id = result.id
                createdAt = result.createdAt
                memory = result.memory
                metadata = result.metadata
                score = result.score
                tags = result.tags
                updatedAt = result.updatedAt
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Memory ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Memory content */
            fun memory(memory: String) = memory(JsonField.of(memory))

            /**
             * Sets [Builder.memory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memory] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memory(memory: JsonField<String>) = apply { this.memory = memory }

            /** Additional metadata */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /** Similarity score (0-1) */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Tag values for this memory */
            fun tags(tags: Tags) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    id,
                    createdAt,
                    memory,
                    metadata,
                    score,
                    tags,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            memory()
            score()
            tags().ifPresent { it.validate() }
            updatedAt()
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
                (if (memory.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Tag values for this memory */
        class Tags
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val tag1: JsonField<String>,
            private val tag10: JsonField<String>,
            private val tag11: JsonField<String>,
            private val tag12: JsonField<String>,
            private val tag2: JsonField<String>,
            private val tag3: JsonField<String>,
            private val tag4: JsonField<String>,
            private val tag5: JsonField<String>,
            private val tag6: JsonField<String>,
            private val tag7: JsonField<String>,
            private val tag8: JsonField<String>,
            private val tag9: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tag_1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_10") @ExcludeMissing tag10: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_11") @ExcludeMissing tag11: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_12") @ExcludeMissing tag12: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_3") @ExcludeMissing tag3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_4") @ExcludeMissing tag4: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_5") @ExcludeMissing tag5: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_6") @ExcludeMissing tag6: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_7") @ExcludeMissing tag7: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_8") @ExcludeMissing tag8: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tag_9") @ExcludeMissing tag9: JsonField<String> = JsonMissing.of(),
            ) : this(
                tag1,
                tag10,
                tag11,
                tag12,
                tag2,
                tag3,
                tag4,
                tag5,
                tag6,
                tag7,
                tag8,
                tag9,
                mutableMapOf(),
            )

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag1(): Optional<String> = tag1.getOptional("tag_1")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag10(): Optional<String> = tag10.getOptional("tag_10")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag11(): Optional<String> = tag11.getOptional("tag_11")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag12(): Optional<String> = tag12.getOptional("tag_12")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag2(): Optional<String> = tag2.getOptional("tag_2")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag3(): Optional<String> = tag3.getOptional("tag_3")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag4(): Optional<String> = tag4.getOptional("tag_4")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag5(): Optional<String> = tag5.getOptional("tag_5")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag6(): Optional<String> = tag6.getOptional("tag_6")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag7(): Optional<String> = tag7.getOptional("tag_7")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag8(): Optional<String> = tag8.getOptional("tag_8")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tag9(): Optional<String> = tag9.getOptional("tag_9")

            /**
             * Returns the raw JSON value of [tag1].
             *
             * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_1") @ExcludeMissing fun _tag1(): JsonField<String> = tag1

            /**
             * Returns the raw JSON value of [tag10].
             *
             * Unlike [tag10], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_10") @ExcludeMissing fun _tag10(): JsonField<String> = tag10

            /**
             * Returns the raw JSON value of [tag11].
             *
             * Unlike [tag11], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_11") @ExcludeMissing fun _tag11(): JsonField<String> = tag11

            /**
             * Returns the raw JSON value of [tag12].
             *
             * Unlike [tag12], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_12") @ExcludeMissing fun _tag12(): JsonField<String> = tag12

            /**
             * Returns the raw JSON value of [tag2].
             *
             * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_2") @ExcludeMissing fun _tag2(): JsonField<String> = tag2

            /**
             * Returns the raw JSON value of [tag3].
             *
             * Unlike [tag3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_3") @ExcludeMissing fun _tag3(): JsonField<String> = tag3

            /**
             * Returns the raw JSON value of [tag4].
             *
             * Unlike [tag4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_4") @ExcludeMissing fun _tag4(): JsonField<String> = tag4

            /**
             * Returns the raw JSON value of [tag5].
             *
             * Unlike [tag5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_5") @ExcludeMissing fun _tag5(): JsonField<String> = tag5

            /**
             * Returns the raw JSON value of [tag6].
             *
             * Unlike [tag6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_6") @ExcludeMissing fun _tag6(): JsonField<String> = tag6

            /**
             * Returns the raw JSON value of [tag7].
             *
             * Unlike [tag7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_7") @ExcludeMissing fun _tag7(): JsonField<String> = tag7

            /**
             * Returns the raw JSON value of [tag8].
             *
             * Unlike [tag8], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_8") @ExcludeMissing fun _tag8(): JsonField<String> = tag8

            /**
             * Returns the raw JSON value of [tag9].
             *
             * Unlike [tag9], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tag_9") @ExcludeMissing fun _tag9(): JsonField<String> = tag9

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

                /** Returns a mutable builder for constructing an instance of [Tags]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tags]. */
            class Builder internal constructor() {

                private var tag1: JsonField<String> = JsonMissing.of()
                private var tag10: JsonField<String> = JsonMissing.of()
                private var tag11: JsonField<String> = JsonMissing.of()
                private var tag12: JsonField<String> = JsonMissing.of()
                private var tag2: JsonField<String> = JsonMissing.of()
                private var tag3: JsonField<String> = JsonMissing.of()
                private var tag4: JsonField<String> = JsonMissing.of()
                private var tag5: JsonField<String> = JsonMissing.of()
                private var tag6: JsonField<String> = JsonMissing.of()
                private var tag7: JsonField<String> = JsonMissing.of()
                private var tag8: JsonField<String> = JsonMissing.of()
                private var tag9: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tags: Tags) = apply {
                    tag1 = tags.tag1
                    tag10 = tags.tag10
                    tag11 = tags.tag11
                    tag12 = tags.tag12
                    tag2 = tags.tag2
                    tag3 = tags.tag3
                    tag4 = tags.tag4
                    tag5 = tags.tag5
                    tag6 = tags.tag6
                    tag7 = tags.tag7
                    tag8 = tags.tag8
                    tag9 = tags.tag9
                    additionalProperties = tags.additionalProperties.toMutableMap()
                }

                fun tag1(tag1: String) = tag1(JsonField.of(tag1))

                /**
                 * Sets [Builder.tag1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

                fun tag10(tag10: String) = tag10(JsonField.of(tag10))

                /**
                 * Sets [Builder.tag10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag10] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag10(tag10: JsonField<String>) = apply { this.tag10 = tag10 }

                fun tag11(tag11: String) = tag11(JsonField.of(tag11))

                /**
                 * Sets [Builder.tag11] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag11] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag11(tag11: JsonField<String>) = apply { this.tag11 = tag11 }

                fun tag12(tag12: String) = tag12(JsonField.of(tag12))

                /**
                 * Sets [Builder.tag12] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag12] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag12(tag12: JsonField<String>) = apply { this.tag12 = tag12 }

                fun tag2(tag2: String) = tag2(JsonField.of(tag2))

                /**
                 * Sets [Builder.tag2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

                fun tag3(tag3: String) = tag3(JsonField.of(tag3))

                /**
                 * Sets [Builder.tag3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag3(tag3: JsonField<String>) = apply { this.tag3 = tag3 }

                fun tag4(tag4: String) = tag4(JsonField.of(tag4))

                /**
                 * Sets [Builder.tag4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag4] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag4(tag4: JsonField<String>) = apply { this.tag4 = tag4 }

                fun tag5(tag5: String) = tag5(JsonField.of(tag5))

                /**
                 * Sets [Builder.tag5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag5] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag5(tag5: JsonField<String>) = apply { this.tag5 = tag5 }

                fun tag6(tag6: String) = tag6(JsonField.of(tag6))

                /**
                 * Sets [Builder.tag6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag6] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag6(tag6: JsonField<String>) = apply { this.tag6 = tag6 }

                fun tag7(tag7: String) = tag7(JsonField.of(tag7))

                /**
                 * Sets [Builder.tag7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag7] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag7(tag7: JsonField<String>) = apply { this.tag7 = tag7 }

                fun tag8(tag8: String) = tag8(JsonField.of(tag8))

                /**
                 * Sets [Builder.tag8] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag8] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag8(tag8: JsonField<String>) = apply { this.tag8 = tag8 }

                fun tag9(tag9: String) = tag9(JsonField.of(tag9))

                /**
                 * Sets [Builder.tag9] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tag9] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tag9(tag9: JsonField<String>) = apply { this.tag9 = tag9 }

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
                 * Returns an immutable instance of [Tags].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tags =
                    Tags(
                        tag1,
                        tag10,
                        tag11,
                        tag12,
                        tag2,
                        tag3,
                        tag4,
                        tag5,
                        tag6,
                        tag7,
                        tag8,
                        tag9,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tags = apply {
                if (validated) {
                    return@apply
                }

                tag1()
                tag10()
                tag11()
                tag12()
                tag2()
                tag3()
                tag4()
                tag5()
                tag6()
                tag7()
                tag8()
                tag9()
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
                (if (tag1.asKnown().isPresent) 1 else 0) +
                    (if (tag10.asKnown().isPresent) 1 else 0) +
                    (if (tag11.asKnown().isPresent) 1 else 0) +
                    (if (tag12.asKnown().isPresent) 1 else 0) +
                    (if (tag2.asKnown().isPresent) 1 else 0) +
                    (if (tag3.asKnown().isPresent) 1 else 0) +
                    (if (tag4.asKnown().isPresent) 1 else 0) +
                    (if (tag5.asKnown().isPresent) 1 else 0) +
                    (if (tag6.asKnown().isPresent) 1 else 0) +
                    (if (tag7.asKnown().isPresent) 1 else 0) +
                    (if (tag8.asKnown().isPresent) 1 else 0) +
                    (if (tag9.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tags &&
                    tag1 == other.tag1 &&
                    tag10 == other.tag10 &&
                    tag11 == other.tag11 &&
                    tag12 == other.tag12 &&
                    tag2 == other.tag2 &&
                    tag3 == other.tag3 &&
                    tag4 == other.tag4 &&
                    tag5 == other.tag5 &&
                    tag6 == other.tag6 &&
                    tag7 == other.tag7 &&
                    tag8 == other.tag8 &&
                    tag9 == other.tag9 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    tag1,
                    tag10,
                    tag11,
                    tag12,
                    tag2,
                    tag3,
                    tag4,
                    tag5,
                    tag6,
                    tag7,
                    tag8,
                    tag9,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tags{tag1=$tag1, tag10=$tag10, tag11=$tag11, tag12=$tag12, tag2=$tag2, tag3=$tag3, tag4=$tag4, tag5=$tag5, tag6=$tag6, tag7=$tag7, tag8=$tag8, tag9=$tag9, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                id == other.id &&
                createdAt == other.createdAt &&
                memory == other.memory &&
                metadata == other.metadata &&
                score == other.score &&
                tags == other.tags &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                memory,
                metadata,
                score,
                tags,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{id=$id, createdAt=$createdAt, memory=$memory, metadata=$metadata, score=$score, tags=$tags, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SearchResponse &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1SearchResponse{results=$results, additionalProperties=$additionalProperties}"
}
