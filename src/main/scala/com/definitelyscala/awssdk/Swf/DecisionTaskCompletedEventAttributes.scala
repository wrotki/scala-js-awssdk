package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait DecisionTaskCompletedEventAttributes extends js.Object {
  var executionContext: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
}