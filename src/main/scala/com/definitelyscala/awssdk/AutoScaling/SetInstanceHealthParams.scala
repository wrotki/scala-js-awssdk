package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait SetInstanceHealthParams extends js.Object {
  var HealthStatus: String = js.native
  var InstanceId: String = js.native
  var ShouldRespectGracePeriod: Boolean = js.native
}