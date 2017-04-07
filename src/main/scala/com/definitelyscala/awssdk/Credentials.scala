package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("Credentials")
class Credentials protected () extends js.Object {
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: String = js.native) = this()
  var accessKeyId: String = js.native
}