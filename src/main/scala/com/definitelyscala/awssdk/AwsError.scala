package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait AwsError extends js.Error {
  var stack: String = js.native
}