// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.matterparties.MatterPartyCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MatterPartyServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val matterPartyServiceAsync = client.matters().v1().matterParties()

        val future =
            matterPartyServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val matterPartyServiceAsync = client.matters().v1().matterParties()

        val future = matterPartyServiceAsync.list("id")

        val response = future.get()
    }
}
