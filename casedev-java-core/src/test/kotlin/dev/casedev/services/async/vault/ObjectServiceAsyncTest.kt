// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.casedev.models.vault.objects.ObjectDownloadParams
import dev.casedev.models.vault.objects.ObjectGetTextParams
import dev.casedev.models.vault.objects.ObjectRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ObjectServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val future =
            objectServiceAsync.retrieve(
                ObjectRetrieveParams.builder().id("id").objectId("objectId").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val future = objectServiceAsync.list("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createPresignedUrl() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.createPresignedUrl(
                ObjectCreatePresignedUrlParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .contentType("contentType")
                    .expiresIn(60L)
                    .operation(ObjectCreatePresignedUrlParams.Operation.GET)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val future =
            objectServiceAsync.download(
                ObjectDownloadParams.builder().id("id").objectId("objectId").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getText() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val future =
            objectServiceAsync.getText(
                ObjectGetTextParams.builder().id("id").objectId("objectId").build()
            )

        val response = future.get()
    }
}
