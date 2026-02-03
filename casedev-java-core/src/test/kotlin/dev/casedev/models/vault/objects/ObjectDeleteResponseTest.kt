// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectDeleteResponseTest {

    @Test
    fun create() {
        val objectDeleteResponse =
            ObjectDeleteResponse.builder()
                .deletedObject(
                    ObjectDeleteResponse.DeletedObject.builder()
                        .id("id")
                        .filename("filename")
                        .sizeBytes(0L)
                        .vectorsDeleted(0L)
                        .build()
                )
                .success(true)
                .build()

        assertThat(objectDeleteResponse.deletedObject())
            .contains(
                ObjectDeleteResponse.DeletedObject.builder()
                    .id("id")
                    .filename("filename")
                    .sizeBytes(0L)
                    .vectorsDeleted(0L)
                    .build()
            )
        assertThat(objectDeleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectDeleteResponse =
            ObjectDeleteResponse.builder()
                .deletedObject(
                    ObjectDeleteResponse.DeletedObject.builder()
                        .id("id")
                        .filename("filename")
                        .sizeBytes(0L)
                        .vectorsDeleted(0L)
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedObjectDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectDeleteResponse),
                jacksonTypeRef<ObjectDeleteResponse>(),
            )

        assertThat(roundtrippedObjectDeleteResponse).isEqualTo(objectDeleteResponse)
    }
}
