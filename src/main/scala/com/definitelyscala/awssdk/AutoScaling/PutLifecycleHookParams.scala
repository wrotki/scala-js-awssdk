package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait PutLifecycleHookParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var LifecycleHookName: String = js.native
  var LifecycleTransition: String = js.native
  var RoleARN: String = js.native
  var NotificationTargetARN: String = js.native
  var NotificationMetadata: String = js.native
  var HeartbeatTimeout: Double = js.native
  var DefaultResult: String = js.native
}