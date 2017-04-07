package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait PollForActivityTaskRequest extends js.Object {
  var domain: String = js.native
  var taskList: TaskList = js.native
  var identity: String = js.native
}