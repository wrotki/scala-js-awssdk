package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait UpdateServiceParams extends js.Object {
  var service: String = js.native
  var cluster: String = js.native
  var deploymentConfiguration: js.Any = js.native
  var desiredCount: Double = js.native
  var taskDefinition: String = js.native
}