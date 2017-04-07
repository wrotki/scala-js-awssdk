package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageParams extends js.Object {
  var QueueUrl: String = js.native
  var MessageBody: String = js.native
  var DelaySeconds: Double = js.native
  var MessageAttributes: js.Dictionary[MessageAttribute] = js.native
}