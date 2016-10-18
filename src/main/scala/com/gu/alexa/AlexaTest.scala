package com.gu.alexa

import com.gu.alexa.models.amazon.{Context, Event}

import scala.scalajs.js.annotation.JSExport

@JSExport
object AlexaSuccess {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    println(context.invokedFunctionArn)
    println(event.request.intent.name)
    "Completed successful invocation."
  }
}

@JSExport
object AlexaFail {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    println("Invocation failed.")
    throw new IllegalArgumentException("failed from Scala")
  }
}