package com.definitelyscala.awssdk.KINESIS

import scala.scalajs.js

@js.native
trait PutRecordsResult extends js.Object {
  var FailedRecordCount: Double = js.native
  var Records: js.Array[RecordResult] = js.native
}