package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("SWF")
class SWF protected () extends js.Object {
  def this(options: js.Any = js.native) = this()
  var endpoint: Endpoint = js.native
  def countClosedWorkflowExecutions(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def countOpenWorkflowExecutions(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def countPendingActivityTasks(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def countPendingDecisionTasks(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def deprecateActivityType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def deprecateDomain(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def deprecateWorkflowType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def describeActivityType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def describeDomain(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def describeWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def describeWorkflowType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def getWorkflowExecutionHistory(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def listActivityTypes(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def listClosedWorkflowExecutions(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def listDomains(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def listOpenWorkflowExecutions(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def listWorkflowTypes(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def pollForActivityTask(params: js.Any, callback: js.Function2[js.Any, Swf.ActivityTask, Unit]): Unit = js.native
  def pollForDecisionTask(params: js.Any, callback: js.Function2[js.Any, Swf.DecisionTask, Unit]): Unit = js.native
  def recordActivityTaskHeartbeat(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerActivityType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerDomain(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerWorkflowType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def requestCancelWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskCanceled(params: Swf.RespondActivityTaskCanceledRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskCompleted(params: Swf.RespondActivityTaskCompletedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskFailed(params: Swf.RespondActivityTaskFailedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondDecisionTaskCompleted(params: Swf.RespondDecisionTaskCompletedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def signalWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def startWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, Swf.StartWorkflowExecutionResult, Unit]): Unit = js.native
  def terminateWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}