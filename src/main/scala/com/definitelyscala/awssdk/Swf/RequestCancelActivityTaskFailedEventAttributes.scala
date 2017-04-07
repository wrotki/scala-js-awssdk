package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
  var activityId: String = js.native
  var cause: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
}