package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
  var workflowType: WorkflowType = js.native
  var workflowId: String = js.native
  var control: String = js.native
  var input: String = js.native
  var executionStartToCloseTimeout: String = js.native
  var taskList: TaskList = js.native
  var taskStartToCloseTimeout: String = js.native
  var childPolicy: String = js.native
  var tagList: js.Array[String] = js.native
}