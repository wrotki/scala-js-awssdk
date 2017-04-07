package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait SetDesiredCapacityParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var DesiredCapacity: Double = js.native
  var HonorCooldown: Boolean = js.native
}