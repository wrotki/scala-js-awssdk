package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait DescribeScalingActivitiesParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ActivityIds: js.Array[String] = js.native
  var NextToken: String = js.native
  var MaxRecords: Double = js.native
}