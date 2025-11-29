// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.invoke

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import dev.casedev.errors.CasedevInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class InvokeRunResponseTest {

    @Test
    fun ofSynchronous() {
        val synchronous =
            InvokeRunResponse.SynchronousResponse.builder()
                .duration(0.0)
                .error("error")
                .output(JsonValue.from(mapOf<String, Any>()))
                .runId("runId")
                .status(InvokeRunResponse.SynchronousResponse.Status.COMPLETED)
                .build()

        val invokeRunResponse = InvokeRunResponse.ofSynchronous(synchronous)

        assertThat(invokeRunResponse.synchronous()).contains(synchronous)
        assertThat(invokeRunResponse.asynchronous()).isEmpty
    }

    @Test
    fun ofSynchronousRoundtrip() {
        val jsonMapper = jsonMapper()
        val invokeRunResponse =
            InvokeRunResponse.ofSynchronous(
                InvokeRunResponse.SynchronousResponse.builder()
                    .duration(0.0)
                    .error("error")
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .runId("runId")
                    .status(InvokeRunResponse.SynchronousResponse.Status.COMPLETED)
                    .build()
            )

        val roundtrippedInvokeRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invokeRunResponse),
                jacksonTypeRef<InvokeRunResponse>(),
            )

        assertThat(roundtrippedInvokeRunResponse).isEqualTo(invokeRunResponse)
    }

    @Test
    fun ofAsynchronous() {
        val asynchronous =
            InvokeRunResponse.AsynchronousResponse.builder()
                .logsUrl("logsUrl")
                .runId("runId")
                .status(InvokeRunResponse.AsynchronousResponse.Status.RUNNING)
                .build()

        val invokeRunResponse = InvokeRunResponse.ofAsynchronous(asynchronous)

        assertThat(invokeRunResponse.synchronous()).isEmpty
        assertThat(invokeRunResponse.asynchronous()).contains(asynchronous)
    }

    @Test
    fun ofAsynchronousRoundtrip() {
        val jsonMapper = jsonMapper()
        val invokeRunResponse =
            InvokeRunResponse.ofAsynchronous(
                InvokeRunResponse.AsynchronousResponse.builder()
                    .logsUrl("logsUrl")
                    .runId("runId")
                    .status(InvokeRunResponse.AsynchronousResponse.Status.RUNNING)
                    .build()
            )

        val roundtrippedInvokeRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invokeRunResponse),
                jacksonTypeRef<InvokeRunResponse>(),
            )

        assertThat(roundtrippedInvokeRunResponse).isEqualTo(invokeRunResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val invokeRunResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<InvokeRunResponse>())

        val e = assertThrows<CasedevInvalidDataException> { invokeRunResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
