package com.raywenderlich

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

/*
* Create a RequestHandler. Lambda stream request handlers implement AWS Lambda Function
* application logic using input and output streams.*/

class App : RequestHandler<HandlerInput, HandlerOutput> {

    val translator : PirateTranslator =   DefaultPirateTranslator()

    override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {

        input?.let {
            return HandlerOutput(it.message,translator.translate(it.message))
        }
        return HandlerOutput("","")
    }
}