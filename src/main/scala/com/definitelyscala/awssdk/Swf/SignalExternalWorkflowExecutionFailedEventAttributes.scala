package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
  var workflowId: String = js.native
  var runId: String = js.native
  var cause: String = js.native
  var initiatedEventId: Double = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var control: String = js.native
}