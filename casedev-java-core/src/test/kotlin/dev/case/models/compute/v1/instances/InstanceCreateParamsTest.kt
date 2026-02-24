// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.instances

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceCreateParamsTest {

    @Test
    fun create() {
        InstanceCreateParams.builder()
            .instanceType("gpu_1x_a10")
            .name("ocr-batch-job")
            .region("us-west-1")
            .autoShutdownMinutes(120L)
            .addVaultId("vault_abc123")
            .build()
    }

    @Test
    fun body() {
        val params =
            InstanceCreateParams.builder()
                .instanceType("gpu_1x_a10")
                .name("ocr-batch-job")
                .region("us-west-1")
                .autoShutdownMinutes(120L)
                .addVaultId("vault_abc123")
                .build()

        val body = params._body()

        assertThat(body.instanceType()).isEqualTo("gpu_1x_a10")
        assertThat(body.name()).isEqualTo("ocr-batch-job")
        assertThat(body.region()).isEqualTo("us-west-1")
        assertThat(body.autoShutdownMinutes()).contains(120L)
        assertThat(body.vaultIds().getOrNull()).containsExactly("vault_abc123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InstanceCreateParams.builder()
                .instanceType("gpu_1x_a10")
                .name("ocr-batch-job")
                .region("us-west-1")
                .build()

        val body = params._body()

        assertThat(body.instanceType()).isEqualTo("gpu_1x_a10")
        assertThat(body.name()).isEqualTo("ocr-batch-job")
        assertThat(body.region()).isEqualTo("us-west-1")
    }
}
