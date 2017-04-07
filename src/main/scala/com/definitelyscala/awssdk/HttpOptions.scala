package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
trait HttpOptions extends js.Object {
  var proxy: String = js.native
  var agent: js.Any = js.native
  var timeout: Double = js.native
  var xhrAsync: Boolean = js.native
  var xhrWithCredentials: Boolean = js.native
}