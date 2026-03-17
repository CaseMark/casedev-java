// File generated from our OpenAPI spec by Stainless.

package dev.case.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.jsonMapper
import dev.case.api.models.vault.VaultCreateResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/casedev-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = CasedevOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.agent()).isNotNull()
        assertThat(client.system()).isNotNull()
        assertThat(client.applications()).isNotNull()
        assertThat(client.compute()).isNotNull()
        assertThat(client.database()).isNotNull()
        assertThat(client.format()).isNotNull()
        assertThat(client.legal()).isNotNull()
        assertThat(client.llm()).isNotNull()
        assertThat(client.memory()).isNotNull()
        assertThat(client.ocr()).isNotNull()
        assertThat(client.privilege()).isNotNull()
        assertThat(client.mail()).isNotNull()
        assertThat(client.skills()).isNotNull()
        assertThat(client.search()).isNotNull()
        assertThat(client.superdoc()).isNotNull()
        assertThat(client.translate()).isNotNull()
        assertThat(client.vault()).isNotNull()
        assertThat(client.voice()).isNotNull()
    }

    @Test
    fun vaultCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val vaultCreateResponse =
            VaultCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .enableIndexing(true)
                .filesBucket("filesBucket")
                .indexName("indexName")
                .name("name")
                .region("region")
                .vectorBucket("vectorBucket")
                .build()

        val roundtrippedVaultCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultCreateResponse),
                jacksonTypeRef<VaultCreateResponse>(),
            )

        assertThat(roundtrippedVaultCreateResponse).isEqualTo(vaultCreateResponse)
    }
}
