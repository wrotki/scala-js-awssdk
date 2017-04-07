package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait WorkflowExecutionStartedEventAttributes extends js.Object {
  var input: String = js.native
  var executionStartToCloseTimeout: String = js.native
  var taskStartToCloseTimeout: String = js.native
  var childPolicy: String = js.native
  var taskList: TaskList = js.native
  var workflowType: WorkflowType = js.native
  var tagList: js.Array[String] = js.native
  var continuedExecutionRunId: String = js.native
  var parentWorkflowExecution: WorkflowExecution = js.native
  var parentInitiatedEventId: Double = js.native
}