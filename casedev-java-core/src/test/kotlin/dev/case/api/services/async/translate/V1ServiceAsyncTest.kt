// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.translate

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.translate.v1.V1DetectParams
import dev.case.api.models.translate.v1.V1ListLanguagesParams
import dev.case.api.models.translate.v1.V1TranslateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun detect() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.translate().v1()

        val responseFuture = v1ServiceAsync.detect(V1DetectParams.builder().q("string").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listLanguages() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.translate().v1()

        val responseFuture =
            v1ServiceAsync.listLanguages(
                V1ListLanguagesParams.builder()
                    .model(V1ListLanguagesParams.Model.NMT)
                    .target("target")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun translate() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.translate().v1()

        val responseFuture =
            v1ServiceAsync.translate(
                V1TranslateParams.builder()
                    .q("string")
                    .target("es")
                    .format(V1TranslateParams.Format.TEXT)
                    .model(V1TranslateParams.Model.NMT)
                    .source("en")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
