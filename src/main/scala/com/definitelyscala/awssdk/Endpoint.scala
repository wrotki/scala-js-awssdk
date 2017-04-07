package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("Endpoint")
class Endpoint protected () extends js.Object {
  def this(endpoint: String) = this()
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
}