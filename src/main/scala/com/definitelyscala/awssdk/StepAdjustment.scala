package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait StepAdjustment extends js.Object {
  var scalingAdjustment: Double = js.native
  var metricIntervalLowerBound: Double = js.native
  var metricIntervalUpperBound: Double = js.native
}