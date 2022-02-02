package com.raywenderlich

import io.kotest.core.spec.style.StringSpec
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import org.junit.jupiter.api.Assertions

@MicronautTest
class AppTest : StringSpec({

    "testAppHasAGreeting"{
        val classUnderTest = App()
        val input = HandlerInput()
        input.message = "Hello"
        val expected = HandlerOutput("Hello", "Ahoy!")
        var output = classUnderTest.handleRequest(input, null)
        Assertions.assertEquals(expected, output)
    }
})