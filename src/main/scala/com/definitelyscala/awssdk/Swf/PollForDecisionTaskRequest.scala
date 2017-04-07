package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait PollForDecisionTaskRequest extends js.Object {
  var domain: String = js.native
  var taskList: TaskList = js.native
  var identity: String = js.native
  var nextPageToken: String = js.native
  var maximumPageSize: Double = js.native
  var reverseOrder: Boolean = js.native
}