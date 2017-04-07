package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTaskScheduledEventAttributes extends js.Object {
  var activityType: ActivityType = js.native
  var activityId: String = js.native
  var input: String = js.native
  var control: String = js.native
  var scheduleToStartTimeout: String = js.native
  var scheduleToCloseTimeout: String = js.native
  var startToCloseTimeout: String = js.native
  var taskList: TaskList = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var heartbeatTimeout: String = js.native
}