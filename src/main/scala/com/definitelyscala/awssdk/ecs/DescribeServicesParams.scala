package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait DescribeServicesParams extends js.Object {
  /**
         * A list of services to describe.
         */
  var services: js.Array[String] = js.native
  /**
         * The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster is assumed.
         */
  var cluster: String = js.native
}