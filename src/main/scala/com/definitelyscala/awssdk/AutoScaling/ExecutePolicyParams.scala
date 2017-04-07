package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait ExecutePolicyParams extends js.Object {
  var PolicyName: String = js.native
  var AutoScalingGroupName: String = js.native
  var HonorCooldown: Boolean = js.native
  var MetricValue: Double = js.native
  var BreachThreshold: Double = js.native
}