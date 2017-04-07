package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
  var externalWorkflowExecution: WorkflowExecution = js.native
  var externalInitiatedEventId: Double = js.native
  var cause: String = js.native
}