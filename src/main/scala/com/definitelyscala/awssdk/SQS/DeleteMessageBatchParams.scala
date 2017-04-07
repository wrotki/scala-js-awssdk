package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait DeleteMessageBatchParams extends js.Object {
  var QueueUrl: String = js.native
  var Entries: js.Array[DeleteMessageBatchRequestEntry] = js.native
}