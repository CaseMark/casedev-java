// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.worker

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.worker.v1.V1ProxyDeleteParams
import dev.case.api.models.worker.v1.V1ProxyGetParams
import dev.case.api.models.worker.v1.V1ProxyPatchParams
import dev.case.api.models.worker.v1.V1ProxyPostParams
import dev.case.api.models.worker.v1.V1ProxyPutParams
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
        val v1Service = client.worker().v1()

        v1Service.create()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.retrieve("id")
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.delete("id")
    }

    @Test
    fun boot() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.boot("id")
    }

    @Test
    fun proxyDelete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.proxyDelete(
            V1ProxyDeleteParams.builder().id("id").workerPath("workerPath").build()
        )
    }

    @Test
    fun proxyGet() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.proxyGet(V1ProxyGetParams.builder().id("id").workerPath("workerPath").build())
    }

    @Test
    fun proxyPatch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.proxyPatch(V1ProxyPatchParams.builder().id("id").workerPath("workerPath").build())
    }

    @Test
    fun proxyPost() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.proxyPost(V1ProxyPostParams.builder().id("id").workerPath("workerPath").build())
    }

    @Test
    fun proxyPut() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.worker().v1()

        v1Service.proxyPut(V1ProxyPutParams.builder().id("id").workerPath("workerPath").build())
    }
}
