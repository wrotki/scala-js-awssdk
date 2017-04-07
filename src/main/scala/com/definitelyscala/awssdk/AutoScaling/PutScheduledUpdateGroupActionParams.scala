package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import scala.scalajs.js.Date

@js.native
trait PutScheduledUpdateGroupActionParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ScheduledActionName: String = js.native
  var Time: Date = js.native
  var StartTime: Date = js.native
  var EndTime: Date = js.native
  var Recurrence: String = js.native
  var MinSize: Double = js.native
  var MaxSize: Double = js.native
  var DesiredCapacity: Double = js.native
}