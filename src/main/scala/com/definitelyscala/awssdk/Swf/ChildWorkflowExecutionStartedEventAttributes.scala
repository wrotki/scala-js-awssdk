package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
  var workflowExecution: WorkflowExecution = js.native
  var workflowType: WorkflowType = js.native
  var initiatedEventId: Double = js.native
}