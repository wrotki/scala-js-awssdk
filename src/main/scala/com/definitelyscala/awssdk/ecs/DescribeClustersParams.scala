package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait DescribeClustersParams extends js.Object {
  /**
         * A space-separated list of cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
         */
  var clusters: js.Array[String] = js.native
}