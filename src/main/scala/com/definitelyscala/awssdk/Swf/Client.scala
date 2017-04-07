package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait Client extends js.Object {
  //constructor(options?: any);
  var config: com.definitelyscala.awssdk.ClientConfig = js.native
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
  def pollForActivityTask(params: js.Any, callback: js.Function2[js.Any, ActivityTask, Unit]): Unit = js.native
  def pollForDecisionTask(params: js.Any, callback: js.Function2[js.Any, DecisionTask, Unit]): Unit = js.native
  def recordActivityTaskHeartbeat(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerActivityType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerDomain(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerWorkflowType(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def requestCancelWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskCanceled(params: RespondActivityTaskCanceledRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskCompleted(params: RespondActivityTaskCompletedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondActivityTaskFailed(params: RespondActivityTaskFailedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedRequest, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def signalWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def startWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, StartWorkflowExecutionResult, Unit]): Unit = js.native
  def terminateWorkflowExecution(params: js.Any, callback: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}