// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.compute.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import com.router.api.models.compute.v1.instances.InstanceCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstanceServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceService = client.compute().v1().instances()

        val instance =
            instanceService.create(
                InstanceCreateParams.builder()
                    .instanceType("gpu_1x_a10")
                    .name("ocr-batch-job")
                    .region("us-west-1")
                    .autoShutdownMinutes(120L)
                    .addVaultId("vault_abc123")
                    .build()
            )

        instance.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceService = client.compute().v1().instances()

        val instance = instanceService.retrieve("id")

        instance.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceService = client.compute().v1().instances()

        val instances = instanceService.list()

        instances.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceService = client.compute().v1().instances()

        val instance = instanceService.delete("id")

        instance.validate()
    }
}
