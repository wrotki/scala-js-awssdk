package com.definitelyscala.awssdk.sts

import scala.scalajs.js

@js.native
trait GetSessionTokenParams extends js.Object {
  var DurationSeconds: Double = js.native
  var SerialNumber: String = js.native
  var TokenCode: String = js.native
}