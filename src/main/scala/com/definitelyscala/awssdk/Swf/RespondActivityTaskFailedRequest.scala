package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait RespondActivityTaskFailedRequest extends js.Object {
  var taskToken: String = js.native
  var reason: String = js.native
  var details: String = js.native
}