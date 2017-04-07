package com.definitelyscala.awssdk.sts

import scala.scalajs.js

@js.native
trait GetFederationTokenParams extends js.Object {
  var Name: String = js.native
  var DurationSeconds: Double = js.native
  var Policy: String = js.native
}