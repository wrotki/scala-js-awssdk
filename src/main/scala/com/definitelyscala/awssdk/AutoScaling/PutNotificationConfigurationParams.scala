package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait PutNotificationConfigurationParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var NotificationTypes: js.Array[String] = js.native
  var TopicARN: String = js.native
}