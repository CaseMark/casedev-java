// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.V1CreateParams
import dev.case.api.models.matters.v1.V1ListParams
import dev.case.api.models.matters.v1.V1UpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.matters().v1()

        v1Service.create(
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
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.matters().v1()

        v1Service.retrieve("id")
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.matters().v1()

        v1Service.update(
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
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.matters().v1()

        v1Service.list(
            V1ListParams.builder()
                .matterType("matter_type")
                .practiceArea("practice_area")
                .query("query")
                .status("status")
                .build()
        )
    }
}
