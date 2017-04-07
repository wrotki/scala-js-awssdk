package com.definitelyscala.awssdk.sts

import scala.scalajs.js
import com.definitelyscala.awssdk._

@js.native
trait AssumeRoleCallbackData extends js.Object {
  var Credentials: TemporaryCredentials = js.native
  var AssumedRoleUser: AssumedRoleUser = js.native
  var PackedPolicySize: Double = js.native
}