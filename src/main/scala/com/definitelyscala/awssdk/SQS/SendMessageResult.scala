package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageResult extends js.Object {
  var MessageId: String = js.native
  var MD5OfMessageBody: String = js.native
  var MD5OfMessageAttributes: String = js.native
}