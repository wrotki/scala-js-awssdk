package com.definitelyscala.awssdk.KINESIS

import scala.scalajs.js
import scala.scalajs.js.|
import org.scalajs.dom.raw.Blob

@js.native
trait Record extends js.Object {
  var Data: Array[_] | String | Blob = js.native
  var PartitionKey: String = js.native
  var ExplicitHashKey: String = js.native
}