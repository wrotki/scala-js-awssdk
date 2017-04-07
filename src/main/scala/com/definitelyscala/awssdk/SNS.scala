package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("SNS")
class SNS protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def publish(request: Sns.PublishRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}