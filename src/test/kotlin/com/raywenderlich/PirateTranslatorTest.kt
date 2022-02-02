package com.raywenderlich
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import org.junit.jupiter.api.Assertions

@MicronautTest
class PirateTranslatorTest(private val application: EmbeddedApplication<*>): StringSpec({

//    "test the server is running" {
//        assert(application.isRunning)
//    }
    val classUnderTest : PirateTranslator = DefaultPirateTranslator()

    "testPirateTranslator"{
        Assertions.assertEquals("Ahoy!, I am Captain Jack Sparrow",
            classUnderTest.translate("Hello, I am Captain Jack Sparrow"))

        Assertions.assertEquals("Aye!",
            classUnderTest.translate("Yes"))
    }
})
