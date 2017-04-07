package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait RespondDecisionTaskCompletedRequest extends js.Object {
  var taskToken: String = js.native
  var decisions: js.Array[Decision] = js.native
  var executionContext: String = js.native
}