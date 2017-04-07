package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait Message extends js.Object {
  var MessageId: String = js.native
  var ReceiptHandle: String = js.native
  var MD5OfBody: String = js.native
  var Body: String = js.native
  var Attributes: js.Dictionary[js.Any] = js.native
  var MD5OfMessageAttributes: String = js.native
  var MessageAttributes: js.Dictionary[MessageAttribute] = js.native
}