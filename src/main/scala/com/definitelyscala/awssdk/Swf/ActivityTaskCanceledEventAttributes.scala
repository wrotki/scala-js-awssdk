package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTaskCanceledEventAttributes extends js.Object {
  var details: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
  var latestCancelRequestedEventId: Double = js.native
}