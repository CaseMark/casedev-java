// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate a legal document with structured inputs. Powered by an agent that handles research,
 * formatting, citation verification, and vault upload. Returns a run ID for polling.
 */
class V1DraftParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * What to draft — the core task. E.g., "Motion to compel defendant to produce discovery
     * responses"
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = body.instructions()

    /**
     * Vault ID where the final document will be uploaded
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaultId(): String = body.vaultId()

    /**
     * Research and include legal citations
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<Boolean> = body.citations()

    /**
     * Court or jurisdiction formatting hint. Triggers a legal-skills search. E.g., "California
     * Superior Court", "SDNY", "federal pleading"
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<String> = body.format()

    /**
     * Target document length
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun length(): Optional<Length> = body.length()

    /**
     * LLM model override. Defaults to anthropic/claude-sonnet-4.6
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Vault object IDs to use as source/reference documents
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectIds(): Optional<List<String>> = body.objectIds()

    /**
     * Filename for the output document. Auto-generated if omitted.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputName(): Optional<String> = body.outputName()

    /**
     * Output file format
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputType(): Optional<OutputType> = body.outputType()

    /**
     * Verify all citations in a loop — re-run verification and repair bad citations until they pass
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verified(): Optional<Boolean> = body.verified()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [vaultId].
     *
     * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultId(): JsonField<String> = body._vaultId()

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _citations(): JsonField<Boolean> = body._citations()

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _format(): JsonField<String> = body._format()

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _length(): JsonField<Length> = body._length()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [objectIds].
     *
     * Unlike [objectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectIds(): JsonField<List<String>> = body._objectIds()

    /**
     * Returns the raw JSON value of [outputName].
     *
     * Unlike [outputName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputName(): JsonField<String> = body._outputName()

    /**
     * Returns the raw JSON value of [outputType].
     *
     * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputType(): JsonField<OutputType> = body._outputType()

    /**
     * Returns the raw JSON value of [verified].
     *
     * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _verified(): JsonField<Boolean> = body._verified()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1DraftParams].
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .vaultId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DraftParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1DraftParams: V1DraftParams) = apply {
            body = v1DraftParams.body.toBuilder()
            additionalHeaders = v1DraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1DraftParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [instructions]
         * - [vaultId]
         * - [citations]
         * - [format]
         * - [length]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * What to draft — the core task. E.g., "Motion to compel defendant to produce discovery
         * responses"
         */
        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        /** Vault ID where the final document will be uploaded */
        fun vaultId(vaultId: String) = apply { body.vaultId(vaultId) }

        /**
         * Sets [Builder.vaultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaultId(vaultId: JsonField<String>) = apply { body.vaultId(vaultId) }

        /** Research and include legal citations */
        fun citations(citations: Boolean) = apply { body.citations(citations) }

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun citations(citations: JsonField<Boolean>) = apply { body.citations(citations) }

        /**
         * Court or jurisdiction formatting hint. Triggers a legal-skills search. E.g., "California
         * Superior Court", "SDNY", "federal pleading"
         */
        fun format(format: String?) = apply { body.format(format) }

        /** Alias for calling [Builder.format] with `format.orElse(null)`. */
        fun format(format: Optional<String>) = format(format.getOrNull())

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<String>) = apply { body.format(format) }

        /** Target document length */
        fun length(length: Length?) = apply { body.length(length) }

        /** Alias for calling [Builder.length] with `length.orElse(null)`. */
        fun length(length: Optional<Length>) = length(length.getOrNull())

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Length] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Length>) = apply { body.length(length) }

        /** LLM model override. Defaults to anthropic/claude-sonnet-4.6 */
        fun model(model: String?) = apply { body.model(model) }

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Vault object IDs to use as source/reference documents */
        fun objectIds(objectIds: List<String>?) = apply { body.objectIds(objectIds) }

        /** Alias for calling [Builder.objectIds] with `objectIds.orElse(null)`. */
        fun objectIds(objectIds: Optional<List<String>>) = objectIds(objectIds.getOrNull())

        /**
         * Sets [Builder.objectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectIds(objectIds: JsonField<List<String>>) = apply { body.objectIds(objectIds) }

        /**
         * Adds a single [String] to [objectIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectId(objectId: String) = apply { body.addObjectId(objectId) }

        /** Filename for the output document. Auto-generated if omitted. */
        fun outputName(outputName: String?) = apply { body.outputName(outputName) }

        /** Alias for calling [Builder.outputName] with `outputName.orElse(null)`. */
        fun outputName(outputName: Optional<String>) = outputName(outputName.getOrNull())

        /**
         * Sets [Builder.outputName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputName(outputName: JsonField<String>) = apply { body.outputName(outputName) }

        /** Output file format */
        fun outputType(outputType: OutputType) = apply { body.outputType(outputType) }

        /**
         * Sets [Builder.outputType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputType] with a well-typed [OutputType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputType(outputType: JsonField<OutputType>) = apply { body.outputType(outputType) }

        /**
         * Verify all citations in a loop — re-run verification and repair bad citations until they
         * pass
         */
        fun verified(verified: Boolean) = apply { body.verified(verified) }

        /**
         * Sets [Builder.verified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verified(verified: JsonField<Boolean>) = apply { body.verified(verified) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [V1DraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .vaultId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1DraftParams =
            V1DraftParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instructions: JsonField<String>,
        private val vaultId: JsonField<String>,
        private val citations: JsonField<Boolean>,
        private val format: JsonField<String>,
        private val length: JsonField<Length>,
        private val model: JsonField<String>,
        private val objectIds: JsonField<List<String>>,
        private val outputName: JsonField<String>,
        private val outputType: JsonField<OutputType>,
        private val verified: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vault_id") @ExcludeMissing vaultId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("citations")
            @ExcludeMissing
            citations: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
            @JsonProperty("length") @ExcludeMissing length: JsonField<Length> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_ids")
            @ExcludeMissing
            objectIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("output_name")
            @ExcludeMissing
            outputName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_type")
            @ExcludeMissing
            outputType: JsonField<OutputType> = JsonMissing.of(),
            @JsonProperty("verified")
            @ExcludeMissing
            verified: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            instructions,
            vaultId,
            citations,
            format,
            length,
            model,
            objectIds,
            outputName,
            outputType,
            verified,
            mutableMapOf(),
        )

        /**
         * What to draft — the core task. E.g., "Motion to compel defendant to produce discovery
         * responses"
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructions(): String = instructions.getRequired("instructions")

        /**
         * Vault ID where the final document will be uploaded
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vaultId(): String = vaultId.getRequired("vault_id")

        /**
         * Research and include legal citations
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun citations(): Optional<Boolean> = citations.getOptional("citations")

        /**
         * Court or jurisdiction formatting hint. Triggers a legal-skills search. E.g., "California
         * Superior Court", "SDNY", "federal pleading"
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun format(): Optional<String> = format.getOptional("format")

        /**
         * Target document length
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun length(): Optional<Length> = length.getOptional("length")

        /**
         * LLM model override. Defaults to anthropic/claude-sonnet-4.6
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Vault object IDs to use as source/reference documents
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectIds(): Optional<List<String>> = objectIds.getOptional("object_ids")

        /**
         * Filename for the output document. Auto-generated if omitted.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputName(): Optional<String> = outputName.getOptional("output_name")

        /**
         * Output file format
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputType(): Optional<OutputType> = outputType.getOptional("output_type")

        /**
         * Verify all citations in a loop — re-run verification and repair bad citations until they
         * pass
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verified(): Optional<Boolean> = verified.getOptional("verified")

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [vaultId].
         *
         * Unlike [vaultId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vault_id") @ExcludeMissing fun _vaultId(): JsonField<String> = vaultId

        /**
         * Returns the raw JSON value of [citations].
         *
         * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("citations") @ExcludeMissing fun _citations(): JsonField<Boolean> = citations

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

        /**
         * Returns the raw JSON value of [length].
         *
         * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Length> = length

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [objectIds].
         *
         * Unlike [objectIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_ids")
        @ExcludeMissing
        fun _objectIds(): JsonField<List<String>> = objectIds

        /**
         * Returns the raw JSON value of [outputName].
         *
         * Unlike [outputName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_name")
        @ExcludeMissing
        fun _outputName(): JsonField<String> = outputName

        /**
         * Returns the raw JSON value of [outputType].
         *
         * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_type")
        @ExcludeMissing
        fun _outputType(): JsonField<OutputType> = outputType

        /**
         * Returns the raw JSON value of [verified].
         *
         * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Boolean> = verified

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .vaultId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var instructions: JsonField<String>? = null
            private var vaultId: JsonField<String>? = null
            private var citations: JsonField<Boolean> = JsonMissing.of()
            private var format: JsonField<String> = JsonMissing.of()
            private var length: JsonField<Length> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var objectIds: JsonField<MutableList<String>>? = null
            private var outputName: JsonField<String> = JsonMissing.of()
            private var outputType: JsonField<OutputType> = JsonMissing.of()
            private var verified: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                instructions = body.instructions
                vaultId = body.vaultId
                citations = body.citations
                format = body.format
                length = body.length
                model = body.model
                objectIds = body.objectIds.map { it.toMutableList() }
                outputName = body.outputName
                outputType = body.outputType
                verified = body.verified
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * What to draft — the core task. E.g., "Motion to compel defendant to produce discovery
             * responses"
             */
            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            /** Vault ID where the final document will be uploaded */
            fun vaultId(vaultId: String) = vaultId(JsonField.of(vaultId))

            /**
             * Sets [Builder.vaultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultId(vaultId: JsonField<String>) = apply { this.vaultId = vaultId }

            /** Research and include legal citations */
            fun citations(citations: Boolean) = citations(JsonField.of(citations))

            /**
             * Sets [Builder.citations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citations] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun citations(citations: JsonField<Boolean>) = apply { this.citations = citations }

            /**
             * Court or jurisdiction formatting hint. Triggers a legal-skills search. E.g.,
             * "California Superior Court", "SDNY", "federal pleading"
             */
            fun format(format: String?) = format(JsonField.ofNullable(format))

            /** Alias for calling [Builder.format] with `format.orElse(null)`. */
            fun format(format: Optional<String>) = format(format.getOrNull())

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<String>) = apply { this.format = format }

            /** Target document length */
            fun length(length: Length?) = length(JsonField.ofNullable(length))

            /** Alias for calling [Builder.length] with `length.orElse(null)`. */
            fun length(length: Optional<Length>) = length(length.getOrNull())

            /**
             * Sets [Builder.length] to an arbitrary JSON value.
             *
             * You should usually call [Builder.length] with a well-typed [Length] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun length(length: JsonField<Length>) = apply { this.length = length }

            /** LLM model override. Defaults to anthropic/claude-sonnet-4.6 */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Vault object IDs to use as source/reference documents */
            fun objectIds(objectIds: List<String>?) = objectIds(JsonField.ofNullable(objectIds))

            /** Alias for calling [Builder.objectIds] with `objectIds.orElse(null)`. */
            fun objectIds(objectIds: Optional<List<String>>) = objectIds(objectIds.getOrNull())

            /**
             * Sets [Builder.objectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectIds(objectIds: JsonField<List<String>>) = apply {
                this.objectIds = objectIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [objectIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addObjectId(objectId: String) = apply {
                objectIds =
                    (objectIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("objectIds", it).add(objectId)
                    }
            }

            /** Filename for the output document. Auto-generated if omitted. */
            fun outputName(outputName: String?) = outputName(JsonField.ofNullable(outputName))

            /** Alias for calling [Builder.outputName] with `outputName.orElse(null)`. */
            fun outputName(outputName: Optional<String>) = outputName(outputName.getOrNull())

            /**
             * Sets [Builder.outputName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputName(outputName: JsonField<String>) = apply { this.outputName = outputName }

            /** Output file format */
            fun outputType(outputType: OutputType) = outputType(JsonField.of(outputType))

            /**
             * Sets [Builder.outputType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputType] with a well-typed [OutputType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputType(outputType: JsonField<OutputType>) = apply {
                this.outputType = outputType
            }

            /**
             * Verify all citations in a loop — re-run verification and repair bad citations until
             * they pass
             */
            fun verified(verified: Boolean) = verified(JsonField.of(verified))

            /**
             * Sets [Builder.verified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verified(verified: JsonField<Boolean>) = apply { this.verified = verified }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .vaultId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("instructions", instructions),
                    checkRequired("vaultId", vaultId),
                    citations,
                    format,
                    length,
                    model,
                    (objectIds ?: JsonMissing.of()).map { it.toImmutable() },
                    outputName,
                    outputType,
                    verified,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            instructions()
            vaultId()
            citations()
            format()
            length().ifPresent { it.validate() }
            model()
            objectIds()
            outputName()
            outputType().ifPresent { it.validate() }
            verified()
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
            (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (vaultId.asKnown().isPresent) 1 else 0) +
                (if (citations.asKnown().isPresent) 1 else 0) +
                (if (format.asKnown().isPresent) 1 else 0) +
                (length.asKnown().getOrNull()?.validity() ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (objectIds.asKnown().getOrNull()?.size ?: 0) +
                (if (outputName.asKnown().isPresent) 1 else 0) +
                (outputType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (verified.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                instructions == other.instructions &&
                vaultId == other.vaultId &&
                citations == other.citations &&
                format == other.format &&
                length == other.length &&
                model == other.model &&
                objectIds == other.objectIds &&
                outputName == other.outputName &&
                outputType == other.outputType &&
                verified == other.verified &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                instructions,
                vaultId,
                citations,
                format,
                length,
                model,
                objectIds,
                outputName,
                outputType,
                verified,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{instructions=$instructions, vaultId=$vaultId, citations=$citations, format=$format, length=$length, model=$model, objectIds=$objectIds, outputName=$outputName, outputType=$outputType, verified=$verified, additionalProperties=$additionalProperties}"
    }

    /** Target document length */
    class Length
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val target: JsonField<Double>,
        private val unit: JsonField<Unit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("target") @ExcludeMissing target: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
        ) : this(target, unit, mutableMapOf())

        /**
         * Target value (e.g., 2000 words or 5 pages)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun target(): Optional<Double> = target.getOptional("target")

        /**
         * Whether the target length is measured in words or pages
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<Unit> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Double> = target

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

            /** Returns a mutable builder for constructing an instance of [Length]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Length]. */
        class Builder internal constructor() {

            private var target: JsonField<Double> = JsonMissing.of()
            private var unit: JsonField<Unit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(length: Length) = apply {
                target = length.target
                unit = length.unit
                additionalProperties = length.additionalProperties.toMutableMap()
            }

            /** Target value (e.g., 2000 words or 5 pages) */
            fun target(target: Double) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Double>) = apply { this.target = target }

            /** Whether the target length is measured in words or pages */
            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [Length].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Length = Length(target, unit, additionalProperties.toMutableMap())
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
        fun validate(): Length = apply {
            if (validated) {
                return@apply
            }

            target()
            unit().ifPresent { it.validate() }
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
            (if (target.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether the target length is measured in words or pages */
        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WORDS = of("words")

                @JvmField val PAGES = of("pages")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                WORDS,
                PAGES,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WORDS,
                PAGES,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WORDS -> Value.WORDS
                    PAGES -> Value.PAGES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WORDS -> Known.WORDS
                    PAGES -> Known.PAGES
                    else -> throw CasedevInvalidDataException("Unknown Unit: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Unit = apply {
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

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Length &&
                target == other.target &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(target, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Length{target=$target, unit=$unit, additionalProperties=$additionalProperties}"
    }

    /** Output file format */
    class OutputType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PDF = of("pdf")

            @JvmField val DOCX = of("docx")

            @JvmField val XLSX = of("xlsx")

            @JvmField val PPTX = of("pptx")

            @JvmField val MD = of("md")

            @JvmStatic fun of(value: String) = OutputType(JsonField.of(value))
        }

        /** An enum containing [OutputType]'s known values. */
        enum class Known {
            PDF,
            DOCX,
            XLSX,
            PPTX,
            MD,
        }

        /**
         * An enum containing [OutputType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OutputType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PDF,
            DOCX,
            XLSX,
            PPTX,
            MD,
            /**
             * An enum member indicating that [OutputType] was instantiated with an unknown value.
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
                PDF -> Value.PDF
                DOCX -> Value.DOCX
                XLSX -> Value.XLSX
                PPTX -> Value.PPTX
                MD -> Value.MD
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
                PDF -> Known.PDF
                DOCX -> Known.DOCX
                XLSX -> Known.XLSX
                PPTX -> Known.PPTX
                MD -> Known.MD
                else -> throw CasedevInvalidDataException("Unknown OutputType: $value")
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
        fun validate(): OutputType = apply {
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

            return other is OutputType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DraftParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1DraftParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
