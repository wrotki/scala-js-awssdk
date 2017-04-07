package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait CompleteLifecycleActionParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var LifecycleActionResult: String = js.native
  var LifecycleHookName: String = js.native
  var lifecycleActionToken: String = js.native
  var InstanceId: String = js.native
}