package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTaskFailedEventAttributes extends js.Object {
  var reason: String = js.native
  var details: String = js.native
  var scheduledEventId: Double = js.native
  var startedEventId: Double = js.native
}