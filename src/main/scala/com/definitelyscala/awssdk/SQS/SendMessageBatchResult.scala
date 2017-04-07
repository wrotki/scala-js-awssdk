package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait SendMessageBatchResult extends js.Object {
  var Successful: js.Array[SendMessageBatchResultEntry] = js.native
  var Failed: js.Array[BatchResultErrorEntry] = js.native
}