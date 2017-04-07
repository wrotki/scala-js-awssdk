package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait DeleteMessageBatchResult extends js.Object {
  var Successful: js.Array[DeleteMessageBatchResultEntry] = js.native
  var Failed: js.Array[BatchResultErrorEntry] = js.native
}