package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait TimerCanceledEventAttributes extends js.Object {
  var timerId: String = js.native
  var startedEventId: Double = js.native
  var decisionTaskCompletedEventId: Double = js.native
}