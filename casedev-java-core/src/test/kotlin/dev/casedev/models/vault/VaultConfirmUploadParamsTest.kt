// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultConfirmUploadParamsTest {

    @Test
    fun create() {
        VaultConfirmUploadParams.builder()
            .id("id")
            .objectId("objectId")
            .body(
                VaultConfirmUploadParams.Body.UnionMember0.builder()
                    .sizeBytes(1L)
                    .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
                    .errorCode("errorCode")
                    .errorMessage("errorMessage")
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
                    VaultConfirmUploadParams.Body.UnionMember0.builder()
                        .sizeBytes(1L)
                        .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
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
                    VaultConfirmUploadParams.Body.UnionMember0.builder()
                        .sizeBytes(1L)
                        .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
                        .errorCode("errorCode")
                        .errorMessage("errorMessage")
                        .etag("etag")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VaultConfirmUploadParams.Body.ofUnionMember0(
                    VaultConfirmUploadParams.Body.UnionMember0.builder()
                        .sizeBytes(1L)
                        .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
                        .errorCode("errorCode")
                        .errorMessage("errorMessage")
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
                    VaultConfirmUploadParams.Body.UnionMember0.builder()
                        .sizeBytes(1L)
                        .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VaultConfirmUploadParams.Body.ofUnionMember0(
                    VaultConfirmUploadParams.Body.UnionMember0.builder()
                        .sizeBytes(1L)
                        .success(VaultConfirmUploadParams.Body.UnionMember0.Success.TRUE)
                        .build()
                )
            )
    }
}
