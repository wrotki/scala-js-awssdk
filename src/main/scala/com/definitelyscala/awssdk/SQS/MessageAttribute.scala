package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait MessageAttribute extends js.Object {
  var StringValue: String = js.native
  var BinaryValue: js.Any = js.native
  //(Buffer, Typed Array, Blob, String)
  var StringListValues: js.Array[String] = js.native
  var BinaryListValues: js.Array[js.Any] = js.native
  var DataType: String = js.native
}