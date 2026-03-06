// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DraftParamsTest {

    @Test
    fun create() {
        V1DraftParams.builder()
            .instructions("xxxxxxxxxx")
            .vaultId("vault_id")
            .citations(true)
            .format("format")
            .length(
                V1DraftParams.Length.builder()
                    .target(0.0)
                    .unit(V1DraftParams.Length.Unit.WORDS)
                    .build()
            )
            .model("model")
            .addObjectId("string")
            .outputName("output_name")
            .outputType(V1DraftParams.OutputType.PDF)
            .verified(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1DraftParams.builder()
                .instructions("xxxxxxxxxx")
                .vaultId("vault_id")
                .citations(true)
                .format("format")
                .length(
                    V1DraftParams.Length.builder()
                        .target(0.0)
                        .unit(V1DraftParams.Length.Unit.WORDS)
                        .build()
                )
                .model("model")
                .addObjectId("string")
                .outputName("output_name")
                .outputType(V1DraftParams.OutputType.PDF)
                .verified(true)
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("xxxxxxxxxx")
        assertThat(body.vaultId()).isEqualTo("vault_id")
        assertThat(body.citations()).contains(true)
        assertThat(body.format()).contains("format")
        assertThat(body.length())
            .contains(
                V1DraftParams.Length.builder()
                    .target(0.0)
                    .unit(V1DraftParams.Length.Unit.WORDS)
                    .build()
            )
        assertThat(body.model()).contains("model")
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
        assertThat(body.outputName()).contains("output_name")
        assertThat(body.outputType()).contains(V1DraftParams.OutputType.PDF)
        assertThat(body.verified()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1DraftParams.builder().instructions("xxxxxxxxxx").vaultId("vault_id").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("xxxxxxxxxx")
        assertThat(body.vaultId()).isEqualTo("vault_id")
    }
}
