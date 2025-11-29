// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.compute.v1.invoke.InvokeRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvokeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun run() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invokeServiceAsync = client.compute().v1().invoke()

        val responseFuture =
            invokeServiceAsync.run(
                InvokeRunParams.builder()
                    .functionId("func_abc123 or document-analyzer")
                    .input(
                        InvokeRunParams.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .async(true)
                    .functionSuffix(InvokeRunParams.FunctionSuffix._MODAL)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
