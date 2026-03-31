// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.matterparties.MatterPartyCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MatterPartyServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val matterPartyService = client.matters().v1().matterParties()

        matterPartyService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val matterPartyService = client.matters().v1().matterParties()

        matterPartyService.list("id")
    }
}
