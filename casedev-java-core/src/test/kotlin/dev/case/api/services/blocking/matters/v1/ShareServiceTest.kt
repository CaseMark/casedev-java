// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.matters.v1.shares.ShareCreateParams
import dev.case.api.models.matters.v1.shares.ShareDeleteParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShareServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shareService = client.matters().v1().shares()

        shareService.create(
            ShareCreateParams.builder()
                .id("id")
                .targetOrgId("target_org_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permission(ShareCreateParams.Permission.READ)
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
        val shareService = client.matters().v1().shares()

        shareService.list("id")
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shareService = client.matters().v1().shares()

        shareService.delete(ShareDeleteParams.builder().id("id").shareId("shareId").build())
    }
}
