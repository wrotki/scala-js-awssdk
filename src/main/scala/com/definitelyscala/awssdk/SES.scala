package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("SES")
class SESObj protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def sendEmail(params: js.Any, callback: js.Function2[js.Any, SES.SendEmailResult, Unit]): Unit = js.native
}