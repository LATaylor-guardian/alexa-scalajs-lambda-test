package com.gu.alexa.models.amazon

import scala.scalajs._

@js.native
trait LambdaLogger extends js.Object {
  def log(string: String): Unit = js.native
}

@js.native
trait CognitoIdentity extends js.Object {
  val identityId: String = js.native
  val identityPoolId: String = js.native
}

@js.native
trait Client extends js.Object {
  val installationId: String = js.native
  val appTitle: String = js.native
  val appVersionName: String = js.native
  val appVersionCode: String = js.native
  val appPackageName: String = js.native
}

@js.native
trait ClientContext extends js.Object {
  val client: Client = js.native
  val getCustom: Map[String, String] = js.native
  val getEnvironment: Map[String, String] = js.native
}

@js.native
trait Context extends js.Object {
  val awsRequestId: String = js.native
  val logGroupName: String = js.native
  val logStreamName: String = js.native
  val functionName: String = js.native
  val functionVersion: String = js.native
  val invokedFunctionArn: String = js.native
  val identity: CognitoIdentity = js.native
  val clientContext: ClientContext = js.native
  val remainingTimeInMillis: Int = js.native
  val memoryLimitInMB: Int = js.native
  val logger: LambdaLogger = js.native
}
