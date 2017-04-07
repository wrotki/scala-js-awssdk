package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait CreateServicesParams extends js.Object {
  var desiredCount: Double = js.native
  var serviceName: String = js.native
  var taskDefinition: String = js.native
  var clientToken: String = js.native
  var cluster: String = js.native
  var deploymentConfiguration: js.Any = js.native
  var loadBalancers: js.Array[js.Any] = js.native
  var role: String = js.native
}