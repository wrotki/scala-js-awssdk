package com.definitelyscala.awssdk.ecs

import scala.scalajs.js

@js.native
trait DescribeTaskDefinitionParams extends js.Object {
  /**
         * The `family` for the latest `ACTIVE` revision, `family` and `revision` (`family:revision`) for a specific revision in the family, or full Amazon Resource Name (ARN) of the task definition to describe.
         */
  var taskDefinition: String = js.native
}