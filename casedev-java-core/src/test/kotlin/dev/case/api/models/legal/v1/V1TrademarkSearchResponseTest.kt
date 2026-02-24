// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1TrademarkSearchResponseTest {

    @Test
    fun create() {
        val v1TrademarkSearchResponse =
            V1TrademarkSearchResponse.builder()
                .attorney("attorney")
                .filingDate(LocalDate.parse("2019-12-27"))
                .addGoodsAndService(
                    V1TrademarkSearchResponse.GoodsAndService.builder()
                        .classNumber("classNumber")
                        .description("description")
                        .build()
                )
                .imageUrl("imageUrl")
                .markText("markText")
                .markType("markType")
                .addNiceClass(0L)
                .owner(
                    V1TrademarkSearchResponse.Owner.builder()
                        .address("address")
                        .entityType("entityType")
                        .name("name")
                        .build()
                )
                .registrationDate(LocalDate.parse("2019-12-27"))
                .registrationNumber("registrationNumber")
                .serialNumber("serialNumber")
                .status("status")
                .statusDate(LocalDate.parse("2019-12-27"))
                .usptoUrl("usptoUrl")
                .build()

        assertThat(v1TrademarkSearchResponse.attorney()).contains("attorney")
        assertThat(v1TrademarkSearchResponse.filingDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1TrademarkSearchResponse.goodsAndServices().getOrNull())
            .containsExactly(
                V1TrademarkSearchResponse.GoodsAndService.builder()
                    .classNumber("classNumber")
                    .description("description")
                    .build()
            )
        assertThat(v1TrademarkSearchResponse.imageUrl()).contains("imageUrl")
        assertThat(v1TrademarkSearchResponse.markText()).contains("markText")
        assertThat(v1TrademarkSearchResponse.markType()).contains("markType")
        assertThat(v1TrademarkSearchResponse.niceClasses().getOrNull()).containsExactly(0L)
        assertThat(v1TrademarkSearchResponse.owner())
            .contains(
                V1TrademarkSearchResponse.Owner.builder()
                    .address("address")
                    .entityType("entityType")
                    .name("name")
                    .build()
            )
        assertThat(v1TrademarkSearchResponse.registrationDate())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(v1TrademarkSearchResponse.registrationNumber()).contains("registrationNumber")
        assertThat(v1TrademarkSearchResponse.serialNumber()).contains("serialNumber")
        assertThat(v1TrademarkSearchResponse.status()).contains("status")
        assertThat(v1TrademarkSearchResponse.statusDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1TrademarkSearchResponse.usptoUrl()).contains("usptoUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1TrademarkSearchResponse =
            V1TrademarkSearchResponse.builder()
                .attorney("attorney")
                .filingDate(LocalDate.parse("2019-12-27"))
                .addGoodsAndService(
                    V1TrademarkSearchResponse.GoodsAndService.builder()
                        .classNumber("classNumber")
                        .description("description")
                        .build()
                )
                .imageUrl("imageUrl")
                .markText("markText")
                .markType("markType")
                .addNiceClass(0L)
                .owner(
                    V1TrademarkSearchResponse.Owner.builder()
                        .address("address")
                        .entityType("entityType")
                        .name("name")
                        .build()
                )
                .registrationDate(LocalDate.parse("2019-12-27"))
                .registrationNumber("registrationNumber")
                .serialNumber("serialNumber")
                .status("status")
                .statusDate(LocalDate.parse("2019-12-27"))
                .usptoUrl("usptoUrl")
                .build()

        val roundtrippedV1TrademarkSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1TrademarkSearchResponse),
                jacksonTypeRef<V1TrademarkSearchResponse>(),
            )

        assertThat(roundtrippedV1TrademarkSearchResponse).isEqualTo(v1TrademarkSearchResponse)
    }
}
