package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait AttachLoadBalancersParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var LoadBalancerNames: js.Array[String] = js.native
}