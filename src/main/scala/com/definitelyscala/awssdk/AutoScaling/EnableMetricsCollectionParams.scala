package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait EnableMetricsCollectionParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var Granularity: String = js.native
  var Metrics: js.Array[String] = js.native
}