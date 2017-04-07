package com.definitelyscala.awssdk.s3

import scala.scalajs.js

@js.native
trait ListObjectResponseBase extends js.Object {
  var IsTruncated: Boolean = js.native
  var Contents: js.Array[ListObjectContent] = js.native
  var Name: String = js.native
  var Prefix: String = js.native
  var Delimiter: String = js.native
  var MaxKeys: Double = js.native
  var CommonPrefixes: js.Array[ObjectKeyPrefix] = js.native
  var EncodingType: String = js.native
}