package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
  var workflowType: WorkflowType = js.native
  var cause: String = js.native
  var workflowId: String = js.native
  var initiatedEventId: Double = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var control: String = js.native
}