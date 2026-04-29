// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.worker

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.worker.v1.V1ProxyDeleteParams
import dev.case.api.models.worker.v1.V1ProxyGetParams
import dev.case.api.models.worker.v1.V1ProxyPatchParams
import dev.case.api.models.worker.v1.V1ProxyPostParams
import dev.case.api.models.worker.v1.V1ProxyPutParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future = v1ServiceAsync.create()

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future = v1ServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future = v1ServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun proxyDelete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future =
            v1ServiceAsync.proxyDelete(
                V1ProxyDeleteParams.builder().id("id").workerPath("workerPath").build()
            )

        val response = future.get()
    }

    @Test
    fun proxyGet() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future =
            v1ServiceAsync.proxyGet(
                V1ProxyGetParams.builder().id("id").workerPath("workerPath").build()
            )

        val response = future.get()
    }

    @Test
    fun proxyPatch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future =
            v1ServiceAsync.proxyPatch(
                V1ProxyPatchParams.builder().id("id").workerPath("workerPath").build()
            )

        val response = future.get()
    }

    @Test
    fun proxyPost() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future =
            v1ServiceAsync.proxyPost(
                V1ProxyPostParams.builder().id("id").workerPath("workerPath").build()
            )

        val response = future.get()
    }

    @Test
    fun proxyPut() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.worker().v1()

        val future =
            v1ServiceAsync.proxyPut(
                V1ProxyPutParams.builder().id("id").workerPath("workerPath").build()
            )

        val response = future.get()
    }
}
