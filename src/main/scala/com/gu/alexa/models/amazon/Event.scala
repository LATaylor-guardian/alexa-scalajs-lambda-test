package com.gu.alexa.models.amazon

import scala.scalajs.js.annotation.JSName
import scalajs.js

@js.native
trait Slots extends js.Object {}

@js.native
trait Intent extends js.Object {
  val name: String = js.native
  val slots: Slots = js.native
}

@js.native
trait Request extends js.Object {
  @JSName("type")
  val requestType: String = js.native
  val requestId: String = js.native
  val locale: String = js.native
  val timestamp: String = js.native
  val intent: Intent = js.native
}

@js.native
trait User extends js.Object {
  val userId: String
}

@js.native
trait Attributes extends js.Object {}

@js.native
trait Application extends js.Object {
  val applicationId: String = js.native
}

@js.native
trait Session extends js.Object {
  val sessionId: String = js.native
  val application: Application = js.native
  val attributes: Attributes = js.native
  @JSName("new")
  val isNew: Boolean = js.native

}

@js.native
trait Event extends js.Object {
  val session: Session = js.native
  val request: Request = js.native
  val version: String = js.native
}
