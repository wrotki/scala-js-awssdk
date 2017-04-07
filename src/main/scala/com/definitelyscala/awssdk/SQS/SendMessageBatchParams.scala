package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageBatchParams extends js.Object {
  var QueueUrl: String = js.native
  var Entries: js.Array[SendMessageBatchRequestEntry] = js.native
}