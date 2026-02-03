// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.translate

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.translate.v1.V1DetectParams
import dev.casedev.models.translate.v1.V1ListLanguagesParams
import dev.casedev.models.translate.v1.V1TranslateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
