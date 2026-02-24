// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.compute.v1.secrets.SecretCreateParams
import dev.case.api.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.case.api.models.compute.v1.secrets.SecretListParams
import dev.case.api.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.case.api.models.compute.v1.secrets.SecretUpdateGroupParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val secretFuture =
            secretServiceAsync.create(
                SecretCreateParams.builder()
                    .name("name")
                    .description("description")
                    .env("env")
                    .build()
            )

        val secret = secretFuture.get()
        secret.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val secretsFuture = secretServiceAsync.list(SecretListParams.builder().env("env").build())

        val secrets = secretsFuture.get()
        secrets.validate()
    }

    @Test
    fun deleteGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val responseFuture =
            secretServiceAsync.deleteGroup(
                SecretDeleteGroupParams.builder().group("group").env("env").key("key").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val responseFuture =
            secretServiceAsync.retrieveGroup(
                SecretRetrieveGroupParams.builder().group("group").env("env").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val responseFuture =
            secretServiceAsync.updateGroup(
                SecretUpdateGroupParams.builder()
                    .group("litigation-apis")
                    .secrets(
                        SecretUpdateGroupParams.Secrets.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .env("env")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
