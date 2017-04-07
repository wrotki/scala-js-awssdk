package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait RetryDelayOption extends js.Object {
  var base: Double = js.native
  var customBackoff: js.Function1[Double, Double] = js.native
}