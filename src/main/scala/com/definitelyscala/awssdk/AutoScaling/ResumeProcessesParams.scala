package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait ResumeProcessesParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var ScalingProcesses: js.Array[String] = js.native
}