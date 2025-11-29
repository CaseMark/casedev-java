// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.compute.v1.secrets.SecretCreateParams
import dev.casedev.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.casedev.models.compute.v1.secrets.SecretListParams
import dev.casedev.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.casedev.models.compute.v1.secrets.SecretUpdateGroupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val future = secretServiceAsync.list(SecretListParams.builder().env("env").build())

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val future =
            secretServiceAsync.deleteGroup(
                SecretDeleteGroupParams.builder().group("group").env("env").key("key").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val future =
            secretServiceAsync.retrieveGroup(
                SecretRetrieveGroupParams.builder().group("group").env("env").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateGroup() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.compute().v1().secrets()

        val future =
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

        val response = future.get()
    }
}
