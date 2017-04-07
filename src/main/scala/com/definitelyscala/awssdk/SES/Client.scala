package com.definitelyscala.awssdk.SES

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait Client extends js.Object {
  var config: com.definitelyscala.awssdk.ClientConfig = js.native
  def sendEmail(params: js.Any, callback: js.Function2[js.Any, SendEmailResult, Unit]): Unit = js.native
}