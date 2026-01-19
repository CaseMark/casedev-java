// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
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
internal class SecretServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.compute().v1().secrets()

        val secret =
            secretService.create(
                SecretCreateParams.builder()
                    .name("name")
                    .description("description")
                    .env("env")
                    .build()
            )

        secret.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.compute().v1().secrets()

        val secrets = secretService.list(SecretListParams.builder().env("env").build())

        secrets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteGroup() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.compute().v1().secrets()

        val response =
            secretService.deleteGroup(
                SecretDeleteGroupParams.builder().group("group").env("env").key("key").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveGroup() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.compute().v1().secrets()

        val response =
            secretService.retrieveGroup(
                SecretRetrieveGroupParams.builder().group("group").env("env").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateGroup() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.compute().v1().secrets()

        val response =
            secretService.updateGroup(
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

        response.validate()
    }
}
