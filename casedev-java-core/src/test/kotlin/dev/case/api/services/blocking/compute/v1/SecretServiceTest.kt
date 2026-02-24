// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.compute.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.compute.v1.secrets.SecretCreateParams
import dev.case.api.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.case.api.models.compute.v1.secrets.SecretListParams
import dev.case.api.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.case.api.models.compute.v1.secrets.SecretUpdateGroupParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceTest {

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
