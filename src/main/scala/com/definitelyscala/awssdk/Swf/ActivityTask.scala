package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ActivityTask extends js.Object {
  var taskToken: String = js.native
  var activityId: String = js.native
  var startedEventId: Double = js.native
  var workflowExecution: WorkflowExecution = js.native
  var activityType: ActivityType = js.native
  var input: String = js.native
}