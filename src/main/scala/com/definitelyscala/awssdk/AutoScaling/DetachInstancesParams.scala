package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait DetachInstancesParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ShouldDecrementDesiredCapacity: Boolean = js.native
  var InstanceIds: js.Array[String] = js.native
}