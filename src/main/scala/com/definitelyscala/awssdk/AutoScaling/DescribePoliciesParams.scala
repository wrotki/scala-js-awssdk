package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait DescribePoliciesParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var PolicyNames: js.Array[String] = js.native
  var PolicyTypes: js.Array[String] = js.native
  var NextToken: String = js.native
  var MaxRecords: Double = js.native
}