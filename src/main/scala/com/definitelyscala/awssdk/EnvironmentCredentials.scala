package com.definitelyscala.awssdk

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("EnvironmentCredentials")
class EnvironmentCredentials protected () extends Credentials {
  def this(profile: String) = this()
}