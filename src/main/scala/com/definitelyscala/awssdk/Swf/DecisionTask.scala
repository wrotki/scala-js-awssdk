package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait DecisionTask extends js.Object {
  var taskToken: String = js.native
  var startedEventId: Double = js.native
  var workflowExecution: WorkflowExecution = js.native
  var workflowType: WorkflowType = js.native
  var events: js.Array[HistoryEvent] = js.native
  var nextPageToken: String = js.native
  var previousStartedEventId: Double = js.native
}