package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageBatchResultEntry extends js.Object {
  var Id: String = js.native
  var MessageId: String = js.native
  var MD5OfMessageBody: String = js.native
  var MD5OfMessageAttributes: String = js.native
}