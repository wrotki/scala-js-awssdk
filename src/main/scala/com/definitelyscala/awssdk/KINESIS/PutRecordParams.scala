package com.definitelyscala.awssdk.KINESIS

import scala.scalajs.js

@js.native
trait PutRecordParams extends Record {
  var StreamName: String = js.native
  var SequenceNumberForOrdering: String = js.native
}