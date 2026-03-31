// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.matterparties

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatterPartyCreateParamsTest {

    @Test
    fun create() {
        MatterPartyCreateParams.builder()
            .id("id")
            .partyId("party_id")
            .role(MatterPartyCreateParams.Role.CLIENT)
            .customFields(
                MatterPartyCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .isPrimary(true)
            .metadata(
                MatterPartyCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .notes("notes")
            .setAsClient(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MatterPartyCreateParams.builder()
                .id("id")
                .partyId("party_id")
                .role(MatterPartyCreateParams.Role.CLIENT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MatterPartyCreateParams.builder()
                .id("id")
                .partyId("party_id")
                .role(MatterPartyCreateParams.Role.CLIENT)
                .customFields(
                    MatterPartyCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isPrimary(true)
                .metadata(
                    MatterPartyCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .notes("notes")
                .setAsClient(true)
                .build()

        val body = params._body()

        assertThat(body.partyId()).isEqualTo("party_id")
        assertThat(body.role()).isEqualTo(MatterPartyCreateParams.Role.CLIENT)
        assertThat(body.customFields())
            .contains(
                MatterPartyCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.isPrimary()).contains(true)
        assertThat(body.metadata())
            .contains(
                MatterPartyCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.notes()).contains("notes")
        assertThat(body.setAsClient()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MatterPartyCreateParams.builder()
                .id("id")
                .partyId("party_id")
                .role(MatterPartyCreateParams.Role.CLIENT)
                .build()

        val body = params._body()

        assertThat(body.partyId()).isEqualTo("party_id")
        assertThat(body.role()).isEqualTo(MatterPartyCreateParams.Role.CLIENT)
    }
}
