// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.ocr.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit a document for OCR processing to extract text, detect tables, forms, and other features.
 * Supports PDFs, images, and scanned documents. Returns a job ID that can be used to track
 * processing status.
 */
class V1ProcessParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL or S3 path to the document to process
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentUrl(): String = body.documentUrl()

    /**
     * URL to receive completion webhook
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /**
     * Optional custom document identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentId(): Optional<String> = body.documentId()

    /**
     * OCR engine to use
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun engine(): Optional<Engine> = body.engine()

    /**
     * Additional processing options
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun features(): Optional<Features> = body.features()

    /**
     * S3 bucket to store results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultBucket(): Optional<String> = body.resultBucket()

    /**
     * S3 key prefix for results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultPrefix(): Optional<String> = body.resultPrefix()

    /**
     * Returns the raw JSON value of [documentUrl].
     *
     * Unlike [documentUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentUrl(): JsonField<String> = body._documentUrl()

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentId(): JsonField<String> = body._documentId()

    /**
     * Returns the raw JSON value of [engine].
     *
     * Unlike [engine], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _engine(): JsonField<Engine> = body._engine()

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _features(): JsonField<Features> = body._features()

    /**
     * Returns the raw JSON value of [resultBucket].
     *
     * Unlike [resultBucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resultBucket(): JsonField<String> = body._resultBucket()

    /**
     * Returns the raw JSON value of [resultPrefix].
     *
     * Unlike [resultPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resultPrefix(): JsonField<String> = body._resultPrefix()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1ProcessParams].
         *
         * The following fields are required:
         * ```java
         * .documentUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ProcessParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ProcessParams: V1ProcessParams) = apply {
            body = v1ProcessParams.body.toBuilder()
            additionalHeaders = v1ProcessParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ProcessParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentUrl]
         * - [callbackUrl]
         * - [documentId]
         * - [engine]
         * - [features]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL or S3 path to the document to process */
        fun documentUrl(documentUrl: String) = apply { body.documentUrl(documentUrl) }

        /**
         * Sets [Builder.documentUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentUrl(documentUrl: JsonField<String>) = apply { body.documentUrl(documentUrl) }

        /** URL to receive completion webhook */
        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

        /** Optional custom document identifier */
        fun documentId(documentId: String) = apply { body.documentId(documentId) }

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { body.documentId(documentId) }

        /** OCR engine to use */
        fun engine(engine: Engine) = apply { body.engine(engine) }

        /**
         * Sets [Builder.engine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engine] with a well-typed [Engine] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun engine(engine: JsonField<Engine>) = apply { body.engine(engine) }

        /** Additional processing options */
        fun features(features: Features) = apply { body.features(features) }

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed [Features] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun features(features: JsonField<Features>) = apply { body.features(features) }

        /** S3 bucket to store results */
        fun resultBucket(resultBucket: String) = apply { body.resultBucket(resultBucket) }

        /**
         * Sets [Builder.resultBucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultBucket] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resultBucket(resultBucket: JsonField<String>) = apply {
            body.resultBucket(resultBucket)
        }

        /** S3 key prefix for results */
        fun resultPrefix(resultPrefix: String) = apply { body.resultPrefix(resultPrefix) }

        /**
         * Sets [Builder.resultPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resultPrefix(resultPrefix: JsonField<String>) = apply {
            body.resultPrefix(resultPrefix)
        }

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
         * Returns an immutable instance of [V1ProcessParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1ProcessParams =
            V1ProcessParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentUrl: JsonField<String>,
        private val callbackUrl: JsonField<String>,
        private val documentId: JsonField<String>,
        private val engine: JsonField<Engine>,
        private val features: JsonField<Features>,
        private val resultBucket: JsonField<String>,
        private val resultPrefix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_url")
            @ExcludeMissing
            documentUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("engine") @ExcludeMissing engine: JsonField<Engine> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<Features> = JsonMissing.of(),
            @JsonProperty("result_bucket")
            @ExcludeMissing
            resultBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result_prefix")
            @ExcludeMissing
            resultPrefix: JsonField<String> = JsonMissing.of(),
        ) : this(
            documentUrl,
            callbackUrl,
            documentId,
            engine,
            features,
            resultBucket,
            resultPrefix,
            mutableMapOf(),
        )

        /**
         * URL or S3 path to the document to process
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentUrl(): String = documentUrl.getRequired("document_url")

        /**
         * URL to receive completion webhook
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * Optional custom document identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentId(): Optional<String> = documentId.getOptional("document_id")

        /**
         * OCR engine to use
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun engine(): Optional<Engine> = engine.getOptional("engine")

        /**
         * Additional processing options
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Optional<Features> = features.getOptional("features")

        /**
         * S3 bucket to store results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resultBucket(): Optional<String> = resultBucket.getOptional("result_bucket")

        /**
         * S3 key prefix for results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resultPrefix(): Optional<String> = resultPrefix.getOptional("result_prefix")

        /**
         * Returns the raw JSON value of [documentUrl].
         *
         * Unlike [documentUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_url")
        @ExcludeMissing
        fun _documentUrl(): JsonField<String> = documentUrl

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        /**
         * Returns the raw JSON value of [engine].
         *
         * Unlike [engine], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("engine") @ExcludeMissing fun _engine(): JsonField<Engine> = engine

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<Features> = features

        /**
         * Returns the raw JSON value of [resultBucket].
         *
         * Unlike [resultBucket], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("result_bucket")
        @ExcludeMissing
        fun _resultBucket(): JsonField<String> = resultBucket

        /**
         * Returns the raw JSON value of [resultPrefix].
         *
         * Unlike [resultPrefix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("result_prefix")
        @ExcludeMissing
        fun _resultPrefix(): JsonField<String> = resultPrefix

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
             * .documentUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentUrl: JsonField<String>? = null
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var documentId: JsonField<String> = JsonMissing.of()
            private var engine: JsonField<Engine> = JsonMissing.of()
            private var features: JsonField<Features> = JsonMissing.of()
            private var resultBucket: JsonField<String> = JsonMissing.of()
            private var resultPrefix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                documentUrl = body.documentUrl
                callbackUrl = body.callbackUrl
                documentId = body.documentId
                engine = body.engine
                features = body.features
                resultBucket = body.resultBucket
                resultPrefix = body.resultPrefix
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL or S3 path to the document to process */
            fun documentUrl(documentUrl: String) = documentUrl(JsonField.of(documentUrl))

            /**
             * Sets [Builder.documentUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentUrl(documentUrl: JsonField<String>) = apply {
                this.documentUrl = documentUrl
            }

            /** URL to receive completion webhook */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /** Optional custom document identifier */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            /** OCR engine to use */
            fun engine(engine: Engine) = engine(JsonField.of(engine))

            /**
             * Sets [Builder.engine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.engine] with a well-typed [Engine] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun engine(engine: JsonField<Engine>) = apply { this.engine = engine }

            /** Additional processing options */
            fun features(features: Features) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed [Features] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<Features>) = apply { this.features = features }

            /** S3 bucket to store results */
            fun resultBucket(resultBucket: String) = resultBucket(JsonField.of(resultBucket))

            /**
             * Sets [Builder.resultBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resultBucket] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resultBucket(resultBucket: JsonField<String>) = apply {
                this.resultBucket = resultBucket
            }

            /** S3 key prefix for results */
            fun resultPrefix(resultPrefix: String) = resultPrefix(JsonField.of(resultPrefix))

            /**
             * Sets [Builder.resultPrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resultPrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resultPrefix(resultPrefix: JsonField<String>) = apply {
                this.resultPrefix = resultPrefix
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentUrl", documentUrl),
                    callbackUrl,
                    documentId,
                    engine,
                    features,
                    resultBucket,
                    resultPrefix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            documentUrl()
            callbackUrl()
            documentId()
            engine().ifPresent { it.validate() }
            features().ifPresent { it.validate() }
            resultBucket()
            resultPrefix()
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
            (if (documentUrl.asKnown().isPresent) 1 else 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (documentId.asKnown().isPresent) 1 else 0) +
                (engine.asKnown().getOrNull()?.validity() ?: 0) +
                (features.asKnown().getOrNull()?.validity() ?: 0) +
                (if (resultBucket.asKnown().isPresent) 1 else 0) +
                (if (resultPrefix.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                documentUrl == other.documentUrl &&
                callbackUrl == other.callbackUrl &&
                documentId == other.documentId &&
                engine == other.engine &&
                features == other.features &&
                resultBucket == other.resultBucket &&
                resultPrefix == other.resultPrefix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                documentUrl,
                callbackUrl,
                documentId,
                engine,
                features,
                resultBucket,
                resultPrefix,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentUrl=$documentUrl, callbackUrl=$callbackUrl, documentId=$documentId, engine=$engine, features=$features, resultBucket=$resultBucket, resultPrefix=$resultPrefix, additionalProperties=$additionalProperties}"
    }

    /** OCR engine to use */
    class Engine @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DOCTR = of("doctr")

            @JvmField val PADDLEOCR = of("paddleocr")

            @JvmStatic fun of(value: String) = Engine(JsonField.of(value))
        }

        /** An enum containing [Engine]'s known values. */
        enum class Known {
            DOCTR,
            PADDLEOCR,
        }

        /**
         * An enum containing [Engine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Engine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOCTR,
            PADDLEOCR,
            /** An enum member indicating that [Engine] was instantiated with an unknown value. */
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
                DOCTR -> Value.DOCTR
                PADDLEOCR -> Value.PADDLEOCR
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
                DOCTR -> Known.DOCTR
                PADDLEOCR -> Known.PADDLEOCR
                else -> throw CasedevInvalidDataException("Unknown Engine: $value")
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

        fun validate(): Engine = apply {
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

            return other is Engine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional processing options */
    class Features
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val embed: JsonField<Embed>,
        private val forms: JsonField<Forms>,
        private val tables: JsonField<Tables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("embed") @ExcludeMissing embed: JsonField<Embed> = JsonMissing.of(),
            @JsonProperty("forms") @ExcludeMissing forms: JsonField<Forms> = JsonMissing.of(),
            @JsonProperty("tables") @ExcludeMissing tables: JsonField<Tables> = JsonMissing.of(),
        ) : this(embed, forms, tables, mutableMapOf())

        /**
         * Generate searchable PDF with text layer
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embed(): Optional<Embed> = embed.getOptional("embed")

        /**
         * Detect and extract form fields
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forms(): Optional<Forms> = forms.getOptional("forms")

        /**
         * Extract tables as structured data
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tables(): Optional<Tables> = tables.getOptional("tables")

        /**
         * Returns the raw JSON value of [embed].
         *
         * Unlike [embed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("embed") @ExcludeMissing fun _embed(): JsonField<Embed> = embed

        /**
         * Returns the raw JSON value of [forms].
         *
         * Unlike [forms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("forms") @ExcludeMissing fun _forms(): JsonField<Forms> = forms

        /**
         * Returns the raw JSON value of [tables].
         *
         * Unlike [tables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tables") @ExcludeMissing fun _tables(): JsonField<Tables> = tables

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

            /** Returns a mutable builder for constructing an instance of [Features]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Features]. */
        class Builder internal constructor() {

            private var embed: JsonField<Embed> = JsonMissing.of()
            private var forms: JsonField<Forms> = JsonMissing.of()
            private var tables: JsonField<Tables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(features: Features) = apply {
                embed = features.embed
                forms = features.forms
                tables = features.tables
                additionalProperties = features.additionalProperties.toMutableMap()
            }

            /** Generate searchable PDF with text layer */
            fun embed(embed: Embed) = embed(JsonField.of(embed))

            /**
             * Sets [Builder.embed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embed] with a well-typed [Embed] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun embed(embed: JsonField<Embed>) = apply { this.embed = embed }

            /** Detect and extract form fields */
            fun forms(forms: Forms) = forms(JsonField.of(forms))

            /**
             * Sets [Builder.forms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forms] with a well-typed [Forms] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun forms(forms: JsonField<Forms>) = apply { this.forms = forms }

            /** Extract tables as structured data */
            fun tables(tables: Tables) = tables(JsonField.of(tables))

            /**
             * Sets [Builder.tables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tables] with a well-typed [Tables] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tables(tables: JsonField<Tables>) = apply { this.tables = tables }

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
             * Returns an immutable instance of [Features].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Features =
                Features(embed, forms, tables, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Features = apply {
            if (validated) {
                return@apply
            }

            embed().ifPresent { it.validate() }
            forms().ifPresent { it.validate() }
            tables().ifPresent { it.validate() }
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
            (embed.asKnown().getOrNull()?.validity() ?: 0) +
                (forms.asKnown().getOrNull()?.validity() ?: 0) +
                (tables.asKnown().getOrNull()?.validity() ?: 0)

        /** Generate searchable PDF with text layer */
        class Embed
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Embed]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Embed]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(embed: Embed) = apply {
                    additionalProperties = embed.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Embed].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Embed = Embed(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Embed = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Embed && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Embed{additionalProperties=$additionalProperties}"
        }

        /** Detect and extract form fields */
        class Forms
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Forms]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Forms]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(forms: Forms) = apply {
                    additionalProperties = forms.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Forms].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Forms = Forms(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Forms = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Forms && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Forms{additionalProperties=$additionalProperties}"
        }

        /** Extract tables as structured data */
        class Tables
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val format: JsonField<Format>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of()
            ) : this(format, mutableMapOf())

            /**
             * Output format for extracted tables
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun format(): Optional<Format> = format.getOptional("format")

            /**
             * Returns the raw JSON value of [format].
             *
             * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

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

                /** Returns a mutable builder for constructing an instance of [Tables]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tables]. */
            class Builder internal constructor() {

                private var format: JsonField<Format> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tables: Tables) = apply {
                    format = tables.format
                    additionalProperties = tables.additionalProperties.toMutableMap()
                }

                /** Output format for extracted tables */
                fun format(format: Format) = format(JsonField.of(format))

                /**
                 * Sets [Builder.format] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.format] with a well-typed [Format] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun format(format: JsonField<Format>) = apply { this.format = format }

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
                 * Returns an immutable instance of [Tables].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tables = Tables(format, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Tables = apply {
                if (validated) {
                    return@apply
                }

                format().ifPresent { it.validate() }
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
            internal fun validity(): Int = (format.asKnown().getOrNull()?.validity() ?: 0)

            /** Output format for extracted tables */
            class Format @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CSV = of("csv")

                    @JvmField val JSON = of("json")

                    @JvmStatic fun of(value: String) = Format(JsonField.of(value))
                }

                /** An enum containing [Format]'s known values. */
                enum class Known {
                    CSV,
                    JSON,
                }

                /**
                 * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Format] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CSV,
                    JSON,
                    /**
                     * An enum member indicating that [Format] was instantiated with an unknown
                     * value.
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
                        CSV -> Value.CSV
                        JSON -> Value.JSON
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
                        CSV -> Known.CSV
                        JSON -> Known.JSON
                        else -> throw CasedevInvalidDataException("Unknown Format: $value")
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

                fun validate(): Format = apply {
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

                    return other is Format && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tables &&
                    format == other.format &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(format, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tables{format=$format, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Features &&
                embed == other.embed &&
                forms == other.forms &&
                tables == other.tables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(embed, forms, tables, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Features{embed=$embed, forms=$forms, tables=$tables, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ProcessParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ProcessParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
