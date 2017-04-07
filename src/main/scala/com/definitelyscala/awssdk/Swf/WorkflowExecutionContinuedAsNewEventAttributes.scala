package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
  var input: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
  var newExecutionRunId: String = js.native
  var executionStartToCloseTimeout: String = js.native
  var taskList: TaskList = js.native
  var taskStartToCloseTimeout: String = js.native
  var childPolicy: String = js.native
  var tagList: js.Array[String] = js.native
  var workflowType: WorkflowType = js.native
}