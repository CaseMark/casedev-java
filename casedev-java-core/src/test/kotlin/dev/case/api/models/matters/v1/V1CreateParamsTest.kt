// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .title("title")
            .billing(
                V1CreateParams.Billing.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .clientName("client_name")
            .clientPartyId("client_party_id")
            .customFields(
                V1CreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .description("description")
            .displayId("display_id")
            .importantDates(
                V1CreateParams.ImportantDates.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .jurisdiction(
                V1CreateParams.Jurisdiction.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .matterType("matter_type")
            .metadata(
                V1CreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .practiceArea("practice_area")
            .responsibleAttorneyId("responsible_attorney_id")
            .status(V1CreateParams.Status.INTAKE)
            .subtype("subtype")
            .vault(
                V1CreateParams.Vault.builder()
                    .description("description")
                    .enableGraph(true)
                    .enableIndexing(true)
                    .metadata(
                        V1CreateParams.Vault.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .vaultId("vault_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .title("title")
                .billing(
                    V1CreateParams.Billing.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .clientName("client_name")
                .clientPartyId("client_party_id")
                .customFields(
                    V1CreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .description("description")
                .displayId("display_id")
                .importantDates(
                    V1CreateParams.ImportantDates.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .jurisdiction(
                    V1CreateParams.Jurisdiction.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .matterType("matter_type")
                .metadata(
                    V1CreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .practiceArea("practice_area")
                .responsibleAttorneyId("responsible_attorney_id")
                .status(V1CreateParams.Status.INTAKE)
                .subtype("subtype")
                .vault(
                    V1CreateParams.Vault.builder()
                        .description("description")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .metadata(
                            V1CreateParams.Vault.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .vaultId("vault_id")
                .build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("title")
        assertThat(body.billing())
            .contains(
                V1CreateParams.Billing.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.clientName()).contains("client_name")
        assertThat(body.clientPartyId()).contains("client_party_id")
        assertThat(body.customFields())
            .contains(
                V1CreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.displayId()).contains("display_id")
        assertThat(body.importantDates())
            .contains(
                V1CreateParams.ImportantDates.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.jurisdiction())
            .contains(
                V1CreateParams.Jurisdiction.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.matterType()).contains("matter_type")
        assertThat(body.metadata())
            .contains(
                V1CreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.practiceArea()).contains("practice_area")
        assertThat(body.responsibleAttorneyId()).contains("responsible_attorney_id")
        assertThat(body.status()).contains(V1CreateParams.Status.INTAKE)
        assertThat(body.subtype()).contains("subtype")
        assertThat(body.vault())
            .contains(
                V1CreateParams.Vault.builder()
                    .description("description")
                    .enableGraph(true)
                    .enableIndexing(true)
                    .metadata(
                        V1CreateParams.Vault.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.vaultId()).contains("vault_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateParams.builder().title("title").build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("title")
    }
}
