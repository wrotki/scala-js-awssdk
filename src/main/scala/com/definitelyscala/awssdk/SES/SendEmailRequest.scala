package com.definitelyscala.awssdk.SES

import scala.scalajs.js

@js.native
trait SendEmailRequest extends js.Object {
  var Source: String = js.native
  var Destination: Destination = js.native
  var Message: Message = js.native
  var ReplyToAddresses: js.Array[String] = js.native
  var ReturnPath: String = js.native
}