package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait RecordLifecycleActionHeartbeatParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var LifecycleHookName: String = js.native
  var LifecycleActionToken: String = js.native
  var InstanceId: String = js.native
}