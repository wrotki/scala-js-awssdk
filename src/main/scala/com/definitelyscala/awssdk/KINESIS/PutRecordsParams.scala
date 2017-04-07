package com.definitelyscala.awssdk.KINESIS

import scala.scalajs.js

@js.native
trait PutRecordsParams extends js.Object {
  var StreamName: String = js.native
  var Records: js.Array[Record] = js.native
}