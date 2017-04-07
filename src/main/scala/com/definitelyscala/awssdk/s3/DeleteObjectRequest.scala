package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait DeleteObjectRequest extends js.Object {
  var Bucket: String = js.native
  var Key: String = js.native
  var MFA: String = js.native
  var RequestPayer: String = js.native
  var VersionId: String = js.native
}