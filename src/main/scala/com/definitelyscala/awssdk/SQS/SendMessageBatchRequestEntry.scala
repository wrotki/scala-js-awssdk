package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageBatchRequestEntry extends js.Object {
  var Id: String = js.native
  var MessageBody: String = js.native
  var DelaySeconds: Double = js.native
  var MessageAttributes: js.Dictionary[MessageAttribute] = js.native
}