// File generated from our OpenAPI spec by Stainless.

package dev.case.models.privilege.v1

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DetectParamsTest {

    @Test
    fun create() {
        V1DetectParams.builder()
            .addCategory(V1DetectParams.Category.ATTORNEY_CLIENT)
            .content("content")
            .documentId("document_id")
            .includeRationale(true)
            .jurisdiction(V1DetectParams.Jurisdiction.US_FEDERAL)
            .model("model")
            .vaultId("vault_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1DetectParams.builder()
                .addCategory(V1DetectParams.Category.ATTORNEY_CLIENT)
                .content("content")
                .documentId("document_id")
                .includeRationale(true)
                .jurisdiction(V1DetectParams.Jurisdiction.US_FEDERAL)
                .model("model")
                .vaultId("vault_id")
                .build()

        val body = params._body()

        assertThat(body.categories().getOrNull())
            .containsExactly(V1DetectParams.Category.ATTORNEY_CLIENT)
        assertThat(body.content()).contains("content")
        assertThat(body.documentId()).contains("document_id")
        assertThat(body.includeRationale()).contains(true)
        assertThat(body.jurisdiction()).contains(V1DetectParams.Jurisdiction.US_FEDERAL)
        assertThat(body.model()).contains("model")
        assertThat(body.vaultId()).contains("vault_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1DetectParams.builder().build()

        val body = params._body()
    }
}
