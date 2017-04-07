package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait StartWorkflowExecutionRequest extends js.Object {
  var domain: String = js.native
  var workflowId: String = js.native
  var workflowType: WorkflowType = js.native
  var taskList: TaskList = js.native
  var input: String = js.native
  var executionStartToCloseTimeout: String = js.native
  var tagList: js.Array[String] = js.native
  var taskStartToCloseTimeout: String = js.native
  var childPolicy: String = js.native
}