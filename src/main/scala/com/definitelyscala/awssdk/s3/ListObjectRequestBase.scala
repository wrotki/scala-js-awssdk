package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait ListObjectRequestBase extends js.Object {
  var Bucket: String = js.native
  var Delimiter: String = js.native
  var EncodingType: String = js.native
  var MaxKeys: Double = js.native
  var Prefix: String = js.native
}