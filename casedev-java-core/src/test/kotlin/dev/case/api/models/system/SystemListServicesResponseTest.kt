// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.system

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemListServicesResponseTest {

    @Test
    fun create() {
        val systemListServicesResponse =
            SystemListServicesResponse.builder()
                .addService(
                    SystemListServicesResponse.Service.builder()
                        .id("id")
                        .description("description")
                        .href("href")
                        .icon("icon")
                        .name("name")
                        .order(0L)
                        .build()
                )
                .build()

        assertThat(systemListServicesResponse.services())
            .containsExactly(
                SystemListServicesResponse.Service.builder()
                    .id("id")
                    .description("description")
                    .href("href")
                    .icon("icon")
                    .name("name")
                    .order(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemListServicesResponse =
            SystemListServicesResponse.builder()
                .addService(
                    SystemListServicesResponse.Service.builder()
                        .id("id")
                        .description("description")
                        .href("href")
                        .icon("icon")
                        .name("name")
                        .order(0L)
                        .build()
                )
                .build()

        val roundtrippedSystemListServicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemListServicesResponse),
                jacksonTypeRef<SystemListServicesResponse>(),
            )

        assertThat(roundtrippedSystemListServicesResponse).isEqualTo(systemListServicesResponse)
    }
}
