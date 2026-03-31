// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.shares

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareCreateParamsTest {

    @Test
    fun create() {
        ShareCreateParams.builder()
            .id("id")
            .targetOrgId("target_org_id")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .permission(ShareCreateParams.Permission.READ)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ShareCreateParams.builder().id("id").targetOrgId("target_org_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ShareCreateParams.builder()
                .id("id")
                .targetOrgId("target_org_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permission(ShareCreateParams.Permission.READ)
                .build()

        val body = params._body()

        assertThat(body.targetOrgId()).isEqualTo("target_org_id")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.permission()).contains(ShareCreateParams.Permission.READ)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ShareCreateParams.builder().id("id").targetOrgId("target_org_id").build()

        val body = params._body()

        assertThat(body.targetOrgId()).isEqualTo("target_org_id")
    }
}
