// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.secrets

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretUpdateGroupParamsTest {

    @Test
    fun create() {
        SecretUpdateGroupParams.builder()
            .group("litigation-apis")
            .secrets(
                SecretUpdateGroupParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .env("env")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SecretUpdateGroupParams.builder()
                .group("litigation-apis")
                .secrets(
                    SecretUpdateGroupParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("litigation-apis")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SecretUpdateGroupParams.builder()
                .group("litigation-apis")
                .secrets(
                    SecretUpdateGroupParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .env("env")
                .build()

        val body = params._body()

        assertThat(body.secrets())
            .isEqualTo(
                SecretUpdateGroupParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.env()).contains("env")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SecretUpdateGroupParams.builder()
                .group("litigation-apis")
                .secrets(
                    SecretUpdateGroupParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.secrets())
            .isEqualTo(
                SecretUpdateGroupParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
