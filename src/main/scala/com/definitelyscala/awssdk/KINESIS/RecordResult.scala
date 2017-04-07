package com.definitelyscala.awssdk.KINESIS

import scala.scalajs.js

@js.native
trait RecordResult extends js.Object {
  var SequenceNumber: String = js.native
  var ShardId: String = js.native
  var ErrorCode: String = js.native
  var ErrorMessage: String = js.native
}