package com.definitelyscala.awssdk.sts

import scala.scalajs.js
import com.definitelyscala.awssdk._
import scala.scalajs.js.Date

@js.native
trait TemporaryCredentials extends js.Object {
  var AccessKeyId: String = js.native
  var SecretAccessKey: String = js.native
  var SessionToken: String = js.native
  var Expiration: Date = js.native
}