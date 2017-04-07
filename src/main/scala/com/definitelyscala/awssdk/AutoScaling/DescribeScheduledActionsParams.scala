package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js
import scala.scalajs.js.Date

@js.native
trait DescribeScheduledActionsParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ScheduledActionNames: js.Array[String] = js.native
  var StartTime: Date = js.native
  var EndTime: Date = js.native
  var NextToken: String = js.native
  var MaxRecords: Double = js.native
}