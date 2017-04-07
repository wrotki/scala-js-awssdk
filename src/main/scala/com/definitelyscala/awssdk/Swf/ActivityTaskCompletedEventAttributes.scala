package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTaskCompletedEventAttributes extends js.Object {
  var result: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
}