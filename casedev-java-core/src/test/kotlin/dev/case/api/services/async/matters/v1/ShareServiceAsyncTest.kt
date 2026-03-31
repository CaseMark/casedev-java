// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.matters.v1.shares.ShareCreateParams
import dev.case.api.models.matters.v1.shares.ShareDeleteParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShareServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shareServiceAsync = client.matters().v1().shares()

        val future =
            shareServiceAsync.create(
                ShareCreateParams.builder()
                    .id("id")
                    .targetOrgId("target_org_id")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .permission(ShareCreateParams.Permission.READ)
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
        val shareServiceAsync = client.matters().v1().shares()

        val future = shareServiceAsync.list("id")

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shareServiceAsync = client.matters().v1().shares()

        val future =
            shareServiceAsync.delete(
                ShareDeleteParams.builder().id("id").shareId("shareId").build()
            )

        val response = future.get()
    }
}
