package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait Decision extends js.Object {
  var decisionType: String = js.native
  var scheduleActivityTaskDecisionAttributes: ScheduleActivityTaskDecisionAttributes = js.native
  var requestCancelActivityTaskDecisionAttributes: RequestCancelActivityTaskDecisionAttributes = js.native
  var completeWorkflowExecutionDecisionAttributes: CompleteWorkflowExecutionDecisionAttributes = js.native
  var failWorkflowExecutionDecisionAttributes: FailWorkflowExecutionDecisionAttributes = js.native
  var cancelWorkflowExecutionDecisionAttributes: CancelWorkflowExecutionDecisionAttributes = js.native
  var continueAsNewWorkflowExecutionDecisionAttributes: ContinueAsNewWorkflowExecutionDecisionAttributes = js.native
  var recordMarkerDecisionAttributes: RecordMarkerDecisionAttributes = js.native
  var startTimerDecisionAttributes: StartTimerDecisionAttributes = js.native
  var cancelTimerDecisionAttributes: CancelTimerDecisionAttributes = js.native
  var signalExternalWorkflowExecutionDecisionAttributes: SignalExternalWorkflowExecutionDecisionAttributes = js.native
  var requestCancelExternalWorkflowExecutionDecisionAttributes: RequestCancelExternalWorkflowExecutionDecisionAttributes = js.native
  var startChildWorkflowExecutionDecisionAttributes: StartChildWorkflowExecutionDecisionAttributes = js.native
}