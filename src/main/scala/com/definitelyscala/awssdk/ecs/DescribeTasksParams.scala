package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait DescribeTasksParams extends js.Object {
  /**
   * A space-separated list of task IDs or full Amazon Resource Name (ARN) entries.
   */
  var tasks: js.Array[String] = js.native
  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you do not specify a cluster, the default cluster is assumed.
   */
  var cluster: String = js.native
}