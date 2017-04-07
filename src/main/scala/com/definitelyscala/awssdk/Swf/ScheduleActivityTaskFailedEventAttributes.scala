package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
  var activityType: ActivityType = js.native
  var activityId: String = js.native
  var cause: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
}