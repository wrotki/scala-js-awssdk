package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait WorkflowExecutionSignaledEventAttributes extends js.Object {
  var signalName: String = js.native
  var input: String = js.native
  var externalWorkflowExecution: WorkflowExecution = js.native
  var externalInitiatedEventId: Double = js.native
}