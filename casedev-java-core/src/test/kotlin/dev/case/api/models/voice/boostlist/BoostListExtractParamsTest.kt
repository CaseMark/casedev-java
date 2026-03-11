// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.boostlist

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoostListExtractParamsTest {

    @Test
    fun create() {
        BoostListExtractParams.builder()
            .addCategory(BoostListExtractParams.Category.PERSON)
            .addObjectId("string")
            .text("text")
            .vaultId("vault_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            BoostListExtractParams.builder()
                .addCategory(BoostListExtractParams.Category.PERSON)
                .addObjectId("string")
                .text("text")
                .vaultId("vault_id")
                .build()

        val body = params._body()

        assertThat(body.categories().getOrNull())
            .containsExactly(BoostListExtractParams.Category.PERSON)
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
        assertThat(body.text()).contains("text")
        assertThat(body.vaultId()).contains("vault_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoostListExtractParams.builder().build()

        val body = params._body()
    }
}
