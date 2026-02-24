// File generated from our OpenAPI spec by Stainless.

package dev.case.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.client.CasedevClient
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.core.JsonValue
import dev.case.core.http.Headers
import dev.case.core.jsonMapper
import dev.case.errors.BadRequestException
import dev.case.errors.CasedevException
import dev.case.errors.InternalServerException
import dev.case.errors.NotFoundException
import dev.case.errors.PermissionDeniedException
import dev.case.errors.RateLimitException
import dev.case.errors.UnauthorizedException
import dev.case.errors.UnexpectedStatusCodeException
import dev.case.errors.UnprocessableEntityException
import dev.case.models.vault.VaultCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: CasedevClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun vaultCreate400() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate400WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate401() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate401WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate403() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate403WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate404() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate404WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate422() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate422WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate429() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate429WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate500() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate500WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate999() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreate999WithRawResponse() {
        val vaultService = client.vault().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun vaultCreateInvalidJsonBody() {
        val vaultService = client.vault()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<CasedevException> {
                vaultService.create(
                    VaultCreateParams.builder()
                        .name("Contract Review Archive")
                        .description("Repository for all client contract reviews and analysis")
                        .enableGraph(true)
                        .enableIndexing(true)
                        .groupId("grp_abc123")
                        .metadata(
                            JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
