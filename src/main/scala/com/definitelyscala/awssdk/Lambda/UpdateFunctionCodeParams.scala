package com.definitelyscala.awssdk.Lambda

import scala.scalajs.js

@js.native
trait UpdateFunctionCodeParams extends js.Object {
  var FunctionName: String = js.native
  var Publish: Boolean = js.native
  var S3Bucket: String = js.native
  var S3Key: String = js.native
  var S3ObjectVersion: String = js.native
  var ZipFile: js.Any = js.native
}