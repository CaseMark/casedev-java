// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1TrademarkSearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attorney: JsonField<String>,
    private val filingDate: JsonField<LocalDate>,
    private val goodsAndServices: JsonField<List<GoodsAndService>>,
    private val imageUrl: JsonField<String>,
    private val markText: JsonField<String>,
    private val markType: JsonField<String>,
    private val niceClasses: JsonField<List<Long>>,
    private val owner: JsonField<Owner>,
    private val registrationDate: JsonField<LocalDate>,
    private val registrationNumber: JsonField<String>,
    private val serialNumber: JsonField<String>,
    private val status: JsonField<String>,
    private val statusDate: JsonField<LocalDate>,
    private val usptoUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attorney") @ExcludeMissing attorney: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filingDate")
        @ExcludeMissing
        filingDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("goodsAndServices")
        @ExcludeMissing
        goodsAndServices: JsonField<List<GoodsAndService>> = JsonMissing.of(),
        @JsonProperty("imageUrl") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("markText") @ExcludeMissing markText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("markType") @ExcludeMissing markType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("niceClasses")
        @ExcludeMissing
        niceClasses: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<Owner> = JsonMissing.of(),
        @JsonProperty("registrationDate")
        @ExcludeMissing
        registrationDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        registrationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serialNumber")
        @ExcludeMissing
        serialNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusDate")
        @ExcludeMissing
        statusDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("usptoUrl") @ExcludeMissing usptoUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        attorney,
        filingDate,
        goodsAndServices,
        imageUrl,
        markText,
        markType,
        niceClasses,
        owner,
        registrationDate,
        registrationNumber,
        serialNumber,
        status,
        statusDate,
        usptoUrl,
        mutableMapOf(),
    )

    /**
     * Attorney of record
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attorney(): Optional<String> = attorney.getOptional("attorney")

    /**
     * Date the application was filed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filingDate(): Optional<LocalDate> = filingDate.getOptional("filingDate")

    /**
     * Goods and services descriptions with class numbers
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goodsAndServices(): Optional<List<GoodsAndService>> =
        goodsAndServices.getOptional("goodsAndServices")

    /**
     * URL to the mark image on USPTO CDN
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageUrl(): Optional<String> = imageUrl.getOptional("imageUrl")

    /**
     * The text of the trademark
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markText(): Optional<String> = markText.getOptional("markText")

    /**
     * Type of mark (e.g. "Standard Character Mark", "Design Mark")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markType(): Optional<String> = markType.getOptional("markType")

    /**
     * Nice classification class numbers
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun niceClasses(): Optional<List<Long>> = niceClasses.getOptional("niceClasses")

    /**
     * Current owner/applicant information
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun owner(): Optional<Owner> = owner.getOptional("owner")

    /**
     * Date the mark was registered
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationDate(): Optional<LocalDate> = registrationDate.getOptional("registrationDate")

    /**
     * USPTO registration number (if registered)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationNumber(): Optional<String> =
        registrationNumber.getOptional("registrationNumber")

    /**
     * USPTO serial number
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serialNumber(): Optional<String> = serialNumber.getOptional("serialNumber")

    /**
     * Current status (e.g. "Registered", "Pending", "Abandoned", "Cancelled")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Date of most recent status update
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusDate(): Optional<LocalDate> = statusDate.getOptional("statusDate")

    /**
     * Canonical TSDR link for this mark
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usptoUrl(): Optional<String> = usptoUrl.getOptional("usptoUrl")

    /**
     * Returns the raw JSON value of [attorney].
     *
     * Unlike [attorney], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attorney") @ExcludeMissing fun _attorney(): JsonField<String> = attorney

    /**
     * Returns the raw JSON value of [filingDate].
     *
     * Unlike [filingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filingDate") @ExcludeMissing fun _filingDate(): JsonField<LocalDate> = filingDate

    /**
     * Returns the raw JSON value of [goodsAndServices].
     *
     * Unlike [goodsAndServices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("goodsAndServices")
    @ExcludeMissing
    fun _goodsAndServices(): JsonField<List<GoodsAndService>> = goodsAndServices

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageUrl") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

    /**
     * Returns the raw JSON value of [markText].
     *
     * Unlike [markText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markText") @ExcludeMissing fun _markText(): JsonField<String> = markText

    /**
     * Returns the raw JSON value of [markType].
     *
     * Unlike [markType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markType") @ExcludeMissing fun _markType(): JsonField<String> = markType

    /**
     * Returns the raw JSON value of [niceClasses].
     *
     * Unlike [niceClasses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("niceClasses")
    @ExcludeMissing
    fun _niceClasses(): JsonField<List<Long>> = niceClasses

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<Owner> = owner

    /**
     * Returns the raw JSON value of [registrationDate].
     *
     * Unlike [registrationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registrationDate")
    @ExcludeMissing
    fun _registrationDate(): JsonField<LocalDate> = registrationDate

    /**
     * Returns the raw JSON value of [registrationNumber].
     *
     * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registrationNumber")
    @ExcludeMissing
    fun _registrationNumber(): JsonField<String> = registrationNumber

    /**
     * Returns the raw JSON value of [serialNumber].
     *
     * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialNumber")
    @ExcludeMissing
    fun _serialNumber(): JsonField<String> = serialNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [statusDate].
     *
     * Unlike [statusDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusDate") @ExcludeMissing fun _statusDate(): JsonField<LocalDate> = statusDate

    /**
     * Returns the raw JSON value of [usptoUrl].
     *
     * Unlike [usptoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usptoUrl") @ExcludeMissing fun _usptoUrl(): JsonField<String> = usptoUrl

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
         * Returns a mutable builder for constructing an instance of [V1TrademarkSearchResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1TrademarkSearchResponse]. */
    class Builder internal constructor() {

        private var attorney: JsonField<String> = JsonMissing.of()
        private var filingDate: JsonField<LocalDate> = JsonMissing.of()
        private var goodsAndServices: JsonField<MutableList<GoodsAndService>>? = null
        private var imageUrl: JsonField<String> = JsonMissing.of()
        private var markText: JsonField<String> = JsonMissing.of()
        private var markType: JsonField<String> = JsonMissing.of()
        private var niceClasses: JsonField<MutableList<Long>>? = null
        private var owner: JsonField<Owner> = JsonMissing.of()
        private var registrationDate: JsonField<LocalDate> = JsonMissing.of()
        private var registrationNumber: JsonField<String> = JsonMissing.of()
        private var serialNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusDate: JsonField<LocalDate> = JsonMissing.of()
        private var usptoUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1TrademarkSearchResponse: V1TrademarkSearchResponse) = apply {
            attorney = v1TrademarkSearchResponse.attorney
            filingDate = v1TrademarkSearchResponse.filingDate
            goodsAndServices = v1TrademarkSearchResponse.goodsAndServices.map { it.toMutableList() }
            imageUrl = v1TrademarkSearchResponse.imageUrl
            markText = v1TrademarkSearchResponse.markText
            markType = v1TrademarkSearchResponse.markType
            niceClasses = v1TrademarkSearchResponse.niceClasses.map { it.toMutableList() }
            owner = v1TrademarkSearchResponse.owner
            registrationDate = v1TrademarkSearchResponse.registrationDate
            registrationNumber = v1TrademarkSearchResponse.registrationNumber
            serialNumber = v1TrademarkSearchResponse.serialNumber
            status = v1TrademarkSearchResponse.status
            statusDate = v1TrademarkSearchResponse.statusDate
            usptoUrl = v1TrademarkSearchResponse.usptoUrl
            additionalProperties = v1TrademarkSearchResponse.additionalProperties.toMutableMap()
        }

        /** Attorney of record */
        fun attorney(attorney: String?) = attorney(JsonField.ofNullable(attorney))

        /** Alias for calling [Builder.attorney] with `attorney.orElse(null)`. */
        fun attorney(attorney: Optional<String>) = attorney(attorney.getOrNull())

        /**
         * Sets [Builder.attorney] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attorney] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attorney(attorney: JsonField<String>) = apply { this.attorney = attorney }

        /** Date the application was filed */
        fun filingDate(filingDate: LocalDate?) = filingDate(JsonField.ofNullable(filingDate))

        /** Alias for calling [Builder.filingDate] with `filingDate.orElse(null)`. */
        fun filingDate(filingDate: Optional<LocalDate>) = filingDate(filingDate.getOrNull())

        /**
         * Sets [Builder.filingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filingDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filingDate(filingDate: JsonField<LocalDate>) = apply { this.filingDate = filingDate }

        /** Goods and services descriptions with class numbers */
        fun goodsAndServices(goodsAndServices: List<GoodsAndService>) =
            goodsAndServices(JsonField.of(goodsAndServices))

        /**
         * Sets [Builder.goodsAndServices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goodsAndServices] with a well-typed
         * `List<GoodsAndService>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun goodsAndServices(goodsAndServices: JsonField<List<GoodsAndService>>) = apply {
            this.goodsAndServices = goodsAndServices.map { it.toMutableList() }
        }

        /**
         * Adds a single [GoodsAndService] to [goodsAndServices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGoodsAndService(goodsAndService: GoodsAndService) = apply {
            goodsAndServices =
                (goodsAndServices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("goodsAndServices", it).add(goodsAndService)
                }
        }

        /** URL to the mark image on USPTO CDN */
        fun imageUrl(imageUrl: String?) = imageUrl(JsonField.ofNullable(imageUrl))

        /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
        fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

        /** The text of the trademark */
        fun markText(markText: String?) = markText(JsonField.ofNullable(markText))

        /** Alias for calling [Builder.markText] with `markText.orElse(null)`. */
        fun markText(markText: Optional<String>) = markText(markText.getOrNull())

        /**
         * Sets [Builder.markText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun markText(markText: JsonField<String>) = apply { this.markText = markText }

        /** Type of mark (e.g. "Standard Character Mark", "Design Mark") */
        fun markType(markType: String?) = markType(JsonField.ofNullable(markType))

        /** Alias for calling [Builder.markType] with `markType.orElse(null)`. */
        fun markType(markType: Optional<String>) = markType(markType.getOrNull())

        /**
         * Sets [Builder.markType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun markType(markType: JsonField<String>) = apply { this.markType = markType }

        /** Nice classification class numbers */
        fun niceClasses(niceClasses: List<Long>) = niceClasses(JsonField.of(niceClasses))

        /**
         * Sets [Builder.niceClasses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.niceClasses] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun niceClasses(niceClasses: JsonField<List<Long>>) = apply {
            this.niceClasses = niceClasses.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [niceClasses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNiceClass(niceClass: Long) = apply {
            niceClasses =
                (niceClasses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("niceClasses", it).add(niceClass)
                }
        }

        /** Current owner/applicant information */
        fun owner(owner: Owner?) = owner(JsonField.ofNullable(owner))

        /** Alias for calling [Builder.owner] with `owner.orElse(null)`. */
        fun owner(owner: Optional<Owner>) = owner(owner.getOrNull())

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [Owner] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<Owner>) = apply { this.owner = owner }

        /** Date the mark was registered */
        fun registrationDate(registrationDate: LocalDate?) =
            registrationDate(JsonField.ofNullable(registrationDate))

        /** Alias for calling [Builder.registrationDate] with `registrationDate.orElse(null)`. */
        fun registrationDate(registrationDate: Optional<LocalDate>) =
            registrationDate(registrationDate.getOrNull())

        /**
         * Sets [Builder.registrationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationDate(registrationDate: JsonField<LocalDate>) = apply {
            this.registrationDate = registrationDate
        }

        /** USPTO registration number (if registered) */
        fun registrationNumber(registrationNumber: String?) =
            registrationNumber(JsonField.ofNullable(registrationNumber))

        /**
         * Alias for calling [Builder.registrationNumber] with `registrationNumber.orElse(null)`.
         */
        fun registrationNumber(registrationNumber: Optional<String>) =
            registrationNumber(registrationNumber.getOrNull())

        /**
         * Sets [Builder.registrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationNumber(registrationNumber: JsonField<String>) = apply {
            this.registrationNumber = registrationNumber
        }

        /** USPTO serial number */
        fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

        /**
         * Sets [Builder.serialNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serialNumber(serialNumber: JsonField<String>) = apply {
            this.serialNumber = serialNumber
        }

        /** Current status (e.g. "Registered", "Pending", "Abandoned", "Cancelled") */
        fun status(status: String?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Date of most recent status update */
        fun statusDate(statusDate: LocalDate?) = statusDate(JsonField.ofNullable(statusDate))

        /** Alias for calling [Builder.statusDate] with `statusDate.orElse(null)`. */
        fun statusDate(statusDate: Optional<LocalDate>) = statusDate(statusDate.getOrNull())

        /**
         * Sets [Builder.statusDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusDate(statusDate: JsonField<LocalDate>) = apply { this.statusDate = statusDate }

        /** Canonical TSDR link for this mark */
        fun usptoUrl(usptoUrl: String) = usptoUrl(JsonField.of(usptoUrl))

        /**
         * Sets [Builder.usptoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usptoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usptoUrl(usptoUrl: JsonField<String>) = apply { this.usptoUrl = usptoUrl }

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
         * Returns an immutable instance of [V1TrademarkSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1TrademarkSearchResponse =
            V1TrademarkSearchResponse(
                attorney,
                filingDate,
                (goodsAndServices ?: JsonMissing.of()).map { it.toImmutable() },
                imageUrl,
                markText,
                markType,
                (niceClasses ?: JsonMissing.of()).map { it.toImmutable() },
                owner,
                registrationDate,
                registrationNumber,
                serialNumber,
                status,
                statusDate,
                usptoUrl,
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
    fun validate(): V1TrademarkSearchResponse = apply {
        if (validated) {
            return@apply
        }

        attorney()
        filingDate()
        goodsAndServices().ifPresent { it.forEach { it.validate() } }
        imageUrl()
        markText()
        markType()
        niceClasses()
        owner().ifPresent { it.validate() }
        registrationDate()
        registrationNumber()
        serialNumber()
        status()
        statusDate()
        usptoUrl()
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
        (if (attorney.asKnown().isPresent) 1 else 0) +
            (if (filingDate.asKnown().isPresent) 1 else 0) +
            (goodsAndServices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (imageUrl.asKnown().isPresent) 1 else 0) +
            (if (markText.asKnown().isPresent) 1 else 0) +
            (if (markType.asKnown().isPresent) 1 else 0) +
            (niceClasses.asKnown().getOrNull()?.size ?: 0) +
            (owner.asKnown().getOrNull()?.validity() ?: 0) +
            (if (registrationDate.asKnown().isPresent) 1 else 0) +
            (if (registrationNumber.asKnown().isPresent) 1 else 0) +
            (if (serialNumber.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusDate.asKnown().isPresent) 1 else 0) +
            (if (usptoUrl.asKnown().isPresent) 1 else 0)

    class GoodsAndService
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classNumber: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classNumber")
            @ExcludeMissing
            classNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(classNumber, description, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classNumber(): Optional<String> = classNumber.getOptional("classNumber")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [classNumber].
         *
         * Unlike [classNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classNumber")
        @ExcludeMissing
        fun _classNumber(): JsonField<String> = classNumber

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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

            /** Returns a mutable builder for constructing an instance of [GoodsAndService]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GoodsAndService]. */
        class Builder internal constructor() {

            private var classNumber: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(goodsAndService: GoodsAndService) = apply {
                classNumber = goodsAndService.classNumber
                description = goodsAndService.description
                additionalProperties = goodsAndService.additionalProperties.toMutableMap()
            }

            fun classNumber(classNumber: String?) = classNumber(JsonField.ofNullable(classNumber))

            /** Alias for calling [Builder.classNumber] with `classNumber.orElse(null)`. */
            fun classNumber(classNumber: Optional<String>) = classNumber(classNumber.getOrNull())

            /**
             * Sets [Builder.classNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classNumber(classNumber: JsonField<String>) = apply {
                this.classNumber = classNumber
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

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
             * Returns an immutable instance of [GoodsAndService].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GoodsAndService =
                GoodsAndService(classNumber, description, additionalProperties.toMutableMap())
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
        fun validate(): GoodsAndService = apply {
            if (validated) {
                return@apply
            }

            classNumber()
            description()
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
            (if (classNumber.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GoodsAndService &&
                classNumber == other.classNumber &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(classNumber, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GoodsAndService{classNumber=$classNumber, description=$description, additionalProperties=$additionalProperties}"
    }

    /** Current owner/applicant information */
    class Owner
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<String>,
        private val entityType: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityType")
            @ExcludeMissing
            entityType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, entityType, name, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entityType(): Optional<String> = entityType.getOptional("entityType")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [entityType].
         *
         * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityType")
        @ExcludeMissing
        fun _entityType(): JsonField<String> = entityType

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

            /** Returns a mutable builder for constructing an instance of [Owner]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Owner]. */
        class Builder internal constructor() {

            private var address: JsonField<String> = JsonMissing.of()
            private var entityType: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(owner: Owner) = apply {
                address = owner.address
                entityType = owner.entityType
                name = owner.name
                additionalProperties = owner.additionalProperties.toMutableMap()
            }

            fun address(address: String?) = address(JsonField.ofNullable(address))

            /** Alias for calling [Builder.address] with `address.orElse(null)`. */
            fun address(address: Optional<String>) = address(address.getOrNull())

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            fun entityType(entityType: String?) = entityType(JsonField.ofNullable(entityType))

            /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
            fun entityType(entityType: Optional<String>) = entityType(entityType.getOrNull())

            /**
             * Sets [Builder.entityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

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
             * Returns an immutable instance of [Owner].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Owner =
                Owner(address, entityType, name, additionalProperties.toMutableMap())
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
        fun validate(): Owner = apply {
            if (validated) {
                return@apply
            }

            address()
            entityType()
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
            (if (address.asKnown().isPresent) 1 else 0) +
                (if (entityType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Owner &&
                address == other.address &&
                entityType == other.entityType &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, entityType, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Owner{address=$address, entityType=$entityType, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1TrademarkSearchResponse &&
            attorney == other.attorney &&
            filingDate == other.filingDate &&
            goodsAndServices == other.goodsAndServices &&
            imageUrl == other.imageUrl &&
            markText == other.markText &&
            markType == other.markType &&
            niceClasses == other.niceClasses &&
            owner == other.owner &&
            registrationDate == other.registrationDate &&
            registrationNumber == other.registrationNumber &&
            serialNumber == other.serialNumber &&
            status == other.status &&
            statusDate == other.statusDate &&
            usptoUrl == other.usptoUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attorney,
            filingDate,
            goodsAndServices,
            imageUrl,
            markText,
            markType,
            niceClasses,
            owner,
            registrationDate,
            registrationNumber,
            serialNumber,
            status,
            statusDate,
            usptoUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1TrademarkSearchResponse{attorney=$attorney, filingDate=$filingDate, goodsAndServices=$goodsAndServices, imageUrl=$imageUrl, markText=$markText, markType=$markType, niceClasses=$niceClasses, owner=$owner, registrationDate=$registrationDate, registrationNumber=$registrationNumber, serialNumber=$serialNumber, status=$status, statusDate=$statusDate, usptoUrl=$usptoUrl, additionalProperties=$additionalProperties}"
}
