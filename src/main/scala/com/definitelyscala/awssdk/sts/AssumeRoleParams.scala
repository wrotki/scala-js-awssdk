package com.definitelyscala.awssdk.sts

import scala.scalajs.js

@js.native
trait AssumeRoleParams extends js.Object {
  var RoleArn: String = js.native
  var RoleSessionName: String = js.native
  var DurationSeconds: Double = js.native
  var ExternalId: String = js.native
  var Policy: String = js.native
  var SerialNumber: String = js.native
  var TokenCode: String = js.native
}