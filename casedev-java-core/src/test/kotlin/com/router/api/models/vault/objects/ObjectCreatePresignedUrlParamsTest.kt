// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectCreatePresignedUrlParamsTest {

    @Test
    fun create() {
        ObjectCreatePresignedUrlParams.builder()
            .id("id")
            .objectId("objectId")
            .contentType("contentType")
            .expiresIn(60L)
            .operation(ObjectCreatePresignedUrlParams.Operation.GET)
            .sizeBytes(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectCreatePresignedUrlParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ObjectCreatePresignedUrlParams.builder()
                .id("id")
                .objectId("objectId")
                .contentType("contentType")
                .expiresIn(60L)
                .operation(ObjectCreatePresignedUrlParams.Operation.GET)
                .sizeBytes(1L)
                .build()

        val body = params._body()

        assertThat(body.contentType()).contains("contentType")
        assertThat(body.expiresIn()).contains(60L)
        assertThat(body.operation()).contains(ObjectCreatePresignedUrlParams.Operation.GET)
        assertThat(body.sizeBytes()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ObjectCreatePresignedUrlParams.builder().id("id").objectId("objectId").build()

        val body = params._body()
    }
}
