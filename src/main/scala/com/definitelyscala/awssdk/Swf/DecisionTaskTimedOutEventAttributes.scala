package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait DecisionTaskTimedOutEventAttributes extends js.Object {
  var timeoutType: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
}