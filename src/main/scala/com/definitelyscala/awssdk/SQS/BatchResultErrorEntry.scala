package com.definitelyscala.awssdk.SQS

import scala.scalajs.js

@js.native
trait BatchResultErrorEntry extends js.Object {
  var Id: String = js.native
  var Code: String = js.native
  var Message: String = js.native
  var SenderFault: Boolean = js.native
}