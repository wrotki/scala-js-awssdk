package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
  var workflowExecution: WorkflowExecution = js.native
  var workflowType: WorkflowType = js.native
  var initiatedEventId: Double = js.native
  var startedEventId: Double = js.native
}