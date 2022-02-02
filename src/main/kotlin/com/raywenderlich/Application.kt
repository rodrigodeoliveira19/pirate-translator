package com.raywenderlich

import io.micronaut.runtime.Micronaut.*
//import jdk.nashorn.internal.runtime.FunctionInitializer


//class AppFunction: FunctionInitializer(), Function<HandlerInput, HandlerOutput> {
//	val translator : PirateTranslator =  DefaultPirateTranslator()
//
//	override fun apply(input: HandlerInput): HandlerOutput {
//		return HandlerOutput(input.message, translator.translate(input.message))
//	}
//}

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.raywenderlich")
		.start()
}

