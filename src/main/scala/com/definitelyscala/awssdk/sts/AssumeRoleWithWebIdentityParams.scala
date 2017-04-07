package com.definitelyscala.awssdk.sts

import scala.scalajs.js

@js.native
trait AssumeRoleWithWebIdentityParams extends js.Object {
  var RoleArn: String = js.native
  var RoleSessionName: String = js.native
  var WebIdentityToken: String = js.native
  var DurationSeconds: Double = js.native
  var Policy: String = js.native
  var ProviderId: String = js.native
}