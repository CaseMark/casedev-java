// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.compute.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import dev.case.models.compute.v1.instances.InstanceCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstanceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceServiceAsync = client.compute().v1().instances()

        val instanceFuture =
            instanceServiceAsync.create(
                InstanceCreateParams.builder()
                    .instanceType("gpu_1x_a10")
                    .name("ocr-batch-job")
                    .region("us-west-1")
                    .autoShutdownMinutes(120L)
                    .addVaultId("vault_abc123")
                    .build()
            )

        val instance = instanceFuture.get()
        instance.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceServiceAsync = client.compute().v1().instances()

        val instanceFuture = instanceServiceAsync.retrieve("id")

        val instance = instanceFuture.get()
        instance.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceServiceAsync = client.compute().v1().instances()

        val instancesFuture = instanceServiceAsync.list()

        val instances = instancesFuture.get()
        instances.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceServiceAsync = client.compute().v1().instances()

        val instanceFuture = instanceServiceAsync.delete("id")

        val instance = instanceFuture.get()
        instance.validate()
    }
}
