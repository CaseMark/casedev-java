// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.translate

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.translate.v1.V1DetectParams
import dev.case.models.translate.v1.V1ListLanguagesParams
import dev.case.models.translate.v1.V1TranslateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun detect() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.translate().v1()

        val response = v1Service.detect(V1DetectParams.builder().q("string").build())

        response.validate()
    }

    @Test
    fun listLanguages() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.translate().v1()

        val response =
            v1Service.listLanguages(
                V1ListLanguagesParams.builder()
                    .model(V1ListLanguagesParams.Model.NMT)
                    .target("target")
                    .build()
            )

        response.validate()
    }

    @Test
    fun translate() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.translate().v1()

        val response =
            v1Service.translate(
                V1TranslateParams.builder()
                    .q("string")
                    .target("es")
                    .format(V1TranslateParams.Format.TEXT)
                    .model(V1TranslateParams.Model.NMT)
                    .source("en")
                    .build()
            )

        response.validate()
    }
}
