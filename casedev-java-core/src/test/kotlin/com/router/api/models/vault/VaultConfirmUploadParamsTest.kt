// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultConfirmUploadParamsTest {

    @Test
    fun create() {
        VaultConfirmUploadParams.builder()
            .id("id")
            .objectId("objectId")
            .body(
                VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                    .sizeBytes(1L)
                    .success(VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE)
                    .etag("etag")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VaultConfirmUploadParams.builder()
                .id("id")
                .objectId("objectId")
                .body(
                    VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                        .sizeBytes(1L)
                        .success(
                            VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VaultConfirmUploadParams.builder()
                .id("id")
                .objectId("objectId")
                .body(
                    VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                        .sizeBytes(1L)
                        .success(
                            VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                        )
                        .etag("etag")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VaultConfirmUploadParams.Body.ofVaultConfirmUploadSuccess(
                    VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                        .sizeBytes(1L)
                        .success(
                            VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                        )
                        .etag("etag")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VaultConfirmUploadParams.builder()
                .id("id")
                .objectId("objectId")
                .body(
                    VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                        .sizeBytes(1L)
                        .success(
                            VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VaultConfirmUploadParams.Body.ofVaultConfirmUploadSuccess(
                    VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                        .sizeBytes(1L)
                        .success(
                            VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                        )
                        .build()
                )
            )
    }
}
