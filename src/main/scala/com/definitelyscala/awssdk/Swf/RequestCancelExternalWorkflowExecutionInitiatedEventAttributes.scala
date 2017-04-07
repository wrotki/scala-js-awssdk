package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  var workflowId: String = js.native
  var runId: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var control: String = js.native
}