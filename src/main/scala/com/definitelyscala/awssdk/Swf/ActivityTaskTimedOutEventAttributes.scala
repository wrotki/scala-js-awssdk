package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTaskTimedOutEventAttributes extends js.Object {
  var timeoutType: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
  var details: String = js.native
}