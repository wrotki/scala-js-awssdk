package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait ChangeMessageVisibilityBatchResponse extends js.Object {
  var Successful: js.Array[js.Any] = js.native
  var Failed: js.Array[BatchResultErrorEntry] = js.native
}