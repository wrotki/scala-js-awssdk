package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait HistoryEvent extends js.Object {
  var eventTimestamp: js.Any = js.native
  var eventType: String = js.native
  var eventId: Double = js.native
  var workflowExecutionStartedEventAttributes: WorkflowExecutionStartedEventAttributes = js.native
  var workflowExecutionCompletedEventAttributes: WorkflowExecutionCompletedEventAttributes = js.native
  var completeWorkflowExecutionFailedEventAttributes: CompleteWorkflowExecutionFailedEventAttributes = js.native
  var workflowExecutionFailedEventAttributes: WorkflowExecutionFailedEventAttributes = js.native
  var failWorkflowExecutionFailedEventAttributes: FailWorkflowExecutionFailedEventAttributes = js.native
  var workflowExecutionTimedOutEventAttributes: WorkflowExecutionTimedOutEventAttributes = js.native
  var workflowExecutionCanceledEventAttributes: WorkflowExecutionCanceledEventAttributes = js.native
  var cancelWorkflowExecutionFailedEventAttributes: CancelWorkflowExecutionFailedEventAttributes = js.native
  var workflowExecutionContinuedAsNewEventAttributes: WorkflowExecutionContinuedAsNewEventAttributes = js.native
  var continueAsNewWorkflowExecutionFailedEventAttributes: ContinueAsNewWorkflowExecutionFailedEventAttributes = js.native
  var workflowExecutionTerminatedEventAttributes: WorkflowExecutionTerminatedEventAttributes = js.native
  var workflowExecutionCancelRequestedEventAttributes: WorkflowExecutionCancelRequestedEventAttributes = js.native
  var decisionTaskScheduledEventAttributes: DecisionTaskScheduledEventAttributes = js.native
  var decisionTaskStartedEventAttributes: DecisionTaskStartedEventAttributes = js.native
  var decisionTaskCompletedEventAttributes: DecisionTaskCompletedEventAttributes = js.native
  var decisionTaskTimedOutEventAttributes: DecisionTaskTimedOutEventAttributes = js.native
  var activityTaskScheduledEventAttributes: ActivityTaskScheduledEventAttributes = js.native
  var activityTaskStartedEventAttributes: ActivityTaskStartedEventAttributes = js.native
  var activityTaskCompletedEventAttributes: ActivityTaskCompletedEventAttributes = js.native
  var activityTaskFailedEventAttributes: ActivityTaskFailedEventAttributes = js.native
  var activityTaskTimedOutEventAttributes: ActivityTaskTimedOutEventAttributes = js.native
  var activityTaskCanceledEventAttributes: ActivityTaskCanceledEventAttributes = js.native
  var activityTaskCancelRequestedEventAttributes: ActivityTaskCancelRequestedEventAttributes = js.native
  var workflowExecutionSignaledEventAttributes: WorkflowExecutionSignaledEventAttributes = js.native
  var markerRecordedEventAttributes: MarkerRecordedEventAttributes = js.native
  var timerStartedEventAttributes: TimerStartedEventAttributes = js.native
  var timerFiredEventAttributes: TimerFiredEventAttributes = js.native
  var timerCanceledEventAttributes: TimerCanceledEventAttributes = js.native
  var startChildWorkflowExecutionInitiatedEventAttributes: StartChildWorkflowExecutionInitiatedEventAttributes = js.native
  var childWorkflowExecutionStartedEventAttributes: ChildWorkflowExecutionStartedEventAttributes = js.native
  var childWorkflowExecutionCompletedEventAttributes: ChildWorkflowExecutionCompletedEventAttributes = js.native
  var childWorkflowExecutionFailedEventAttributes: ChildWorkflowExecutionFailedEventAttributes = js.native
  var childWorkflowExecutionTimedOutEventAttributes: ChildWorkflowExecutionTimedOutEventAttributes = js.native
  var childWorkflowExecutionCanceledEventAttributes: ChildWorkflowExecutionCanceledEventAttributes = js.native
  var childWorkflowExecutionTerminatedEventAttributes: ChildWorkflowExecutionTerminatedEventAttributes = js.native
  var signalExternalWorkflowExecutionInitiatedEventAttributes: SignalExternalWorkflowExecutionInitiatedEventAttributes = js.native
  var externalWorkflowExecutionSignaledEventAttributes: ExternalWorkflowExecutionSignaledEventAttributes = js.native
  var signalExternalWorkflowExecutionFailedEventAttributes: SignalExternalWorkflowExecutionFailedEventAttributes = js.native
  var externalWorkflowExecutionCancelRequestedEventAttributes: ExternalWorkflowExecutionCancelRequestedEventAttributes = js.native
  var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = js.native
  var requestCancelExternalWorkflowExecutionFailedEventAttributes: RequestCancelExternalWorkflowExecutionFailedEventAttributes = js.native
  var scheduleActivityTaskFailedEventAttributes: ScheduleActivityTaskFailedEventAttributes = js.native
  var requestCancelActivityTaskFailedEventAttributes: RequestCancelActivityTaskFailedEventAttributes = js.native
  var startTimerFailedEventAttributes: StartTimerFailedEventAttributes = js.native
  var cancelTimerFailedEventAttributes: CancelTimerFailedEventAttributes = js.native
  var startChildWorkflowExecutionFailedEventAttributes: StartChildWorkflowExecutionFailedEventAttributes = js.native
}