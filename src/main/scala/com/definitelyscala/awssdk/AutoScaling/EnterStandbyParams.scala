package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait EnterStandbyParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ShouldDecrementDesiredCapacity: Boolean = js.native
  var InstanceIds: js.Array[String] = js.native
}