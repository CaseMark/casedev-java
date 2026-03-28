// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1

import dev.case.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UpdateParamsTest {

    @Test
    fun create() {
        V1UpdateParams.builder()
            .id("id")
            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .billing(
                V1UpdateParams.Billing.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .clientName("client_name")
            .clientPartyId("client_party_id")
            .customFields(
                V1UpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .description("description")
            .displayId("display_id")
            .importantDates(
                V1UpdateParams.ImportantDates.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .jurisdiction(
                V1UpdateParams.Jurisdiction.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .matterType("matter_type")
            .metadata(
                V1UpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .practiceArea("practice_area")
            .responsibleAttorneyId("responsible_attorney_id")
            .status(V1UpdateParams.Status.INTAKE)
            .subtype("subtype")
            .title("title")
            .build()
    }

    @Test
    fun pathParams() {
        val params = V1UpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1UpdateParams.builder()
                .id("id")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billing(
                    V1UpdateParams.Billing.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .clientName("client_name")
                .clientPartyId("client_party_id")
                .customFields(
                    V1UpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .description("description")
                .displayId("display_id")
                .importantDates(
                    V1UpdateParams.ImportantDates.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .jurisdiction(
                    V1UpdateParams.Jurisdiction.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .matterType("matter_type")
                .metadata(
                    V1UpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .practiceArea("practice_area")
                .responsibleAttorneyId("responsible_attorney_id")
                .status(V1UpdateParams.Status.INTAKE)
                .subtype("subtype")
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.billing())
            .contains(
                V1UpdateParams.Billing.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.clientName()).contains("client_name")
        assertThat(body.clientPartyId()).contains("client_party_id")
        assertThat(body.customFields())
            .contains(
                V1UpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.displayId()).contains("display_id")
        assertThat(body.importantDates())
            .contains(
                V1UpdateParams.ImportantDates.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.jurisdiction())
            .contains(
                V1UpdateParams.Jurisdiction.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.matterType()).contains("matter_type")
        assertThat(body.metadata())
            .contains(
                V1UpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.practiceArea()).contains("practice_area")
        assertThat(body.responsibleAttorneyId()).contains("responsible_attorney_id")
        assertThat(body.status()).contains(V1UpdateParams.Status.INTAKE)
        assertThat(body.subtype()).contains("subtype")
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1UpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
