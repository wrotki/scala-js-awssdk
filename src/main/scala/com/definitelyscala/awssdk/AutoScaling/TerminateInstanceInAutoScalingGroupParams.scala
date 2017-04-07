package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait TerminateInstanceInAutoScalingGroupParams extends js.Object {
  var InstanceId: String = js.native
  var ShouldDecrementDesiredCapacity: Boolean = js.native
}