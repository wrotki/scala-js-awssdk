package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait CancelTimerFailedEventAttributes extends js.Object {
  var timerId: String = js.native
  var cause: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
}