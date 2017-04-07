package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
  var workflowId: String = js.native
  var workflowType: WorkflowType = js.native
  var control: String = js.native
  var input: String = js.native
  var executionStartToCloseTimeout: String = js.native
  var taskList: TaskList = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var childPolicy: String = js.native
  var taskStartToCloseTimeout: String = js.native
  var tagList: js.Array[String] = js.native
}