package com.definitelyscala.awssdk.sts

import scala.scalajs.js

@js.native
trait AssumeRoleWithSAMLParams extends js.Object {
  var PrincipalArn: String = js.native
  var RoleArn: String = js.native
  var SAMLAssertion: String = js.native
  var DurationSeconds: Double = js.native
  var Policy: String = js.native
}